package Gun09;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MethodWebDriver;

public class _04_PlaceOrderPOM extends MethodWebDriver {
    /*
        todo POM (Page Object Model) avantajlari
        1- Butun sayfalarda isimleri ayni elemanlar icin 1 tanimlama yeterli oluyor
            Boylece tanimlanan elemanlar tekrar kullanilabilir yani Reusable oluyor.
        2- Kodun icerisinden HTML kodlari ayrildigindan kod okunabilirligi artiyor.
        3- Developer locatorlarda bir degisiklik yaptigi zaman, asil kodla hic bir sekilde
           ugrasmak zorunda kalmiyoruz, sadece gidip locator degistiriyoruz.
     */

    @Test
    public void ProceedToCheckout() {

        _03_PlacerOrderElements placerOderElements = new _03_PlacerOrderElements(driver);
        placerOderElements.searchInput.sendKeys("ipod");
        placerOderElements.searchButton.click();
        placerOderElements.item1.click();
        placerOderElements.shoppingCart.click();
        placerOderElements.checkOut.click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(placerOderElements.continueBtn1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placerOderElements.continueBtn2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placerOderElements.continueBtn3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placerOderElements.checkBox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placerOderElements.continueBtn4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placerOderElements.confirm)).click();

        wait.until(ExpectedConditions.urlContains("success"));

        Assert.assertEquals(placerOderElements.message.getText(),"Your order has been placed!");




    }
}
