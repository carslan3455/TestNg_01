package Gun09;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MethodWebDriver;

import java.util.List;

/*
            Senaryo :
         1- Siteyi açınız.
         2- Sitede "ipod" kelimesini aratınız
         3- Çıkan sonulardan ilkini sepete atınız.
         4- Shopping Chart a tıklatınız.
         5- Checkout yapınız.
         6- Continue butonalarına tıklatıp bilgileri giriniz.
         7- En confirm ile siparişi verdiğinizi doğrulayınız.
            doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.

        */
public class _02_PlaceOrder extends MethodWebDriver {

    @Test
    public void ProceedToCheckout(){
        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement searchInput = driver.findElement(By.cssSelector("input[name='search']"));
        searchInput.sendKeys("ipod");

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> itemAddList = driver.findElements(By.xpath("//span[text()='Add to Cart']"));
        itemAddList.get(0).click();

        WebElement shoppingCart = driver.findElement(By.cssSelector("a[title='Shopping Cart']"));
        shoppingCart.click();

        WebElement checkOut = driver.findElement(By.cssSelector("a[class='btn btn-primary']"));
        checkOut.click();

        WebElement continueBtn1 = driver.findElement(By.id("button-payment-address"));
        continueBtn1.click();

        WebElement continueBtn2 = driver.findElement(By.id("button-shipping-address"));
        continueBtn2.click();

        WebElement continueBtn3 = driver.findElement(By.id("button-shipping-method"));
        continueBtn3.click();

        WebElement checkBox = driver.findElement(By.cssSelector("input[value='1']"));
        checkBox.click();

        WebElement continueBtn4 = driver.findElement(By.id("button-payment-method"));
        continueBtn4.click();

        WebElement confirm = driver.findElement(By.id("button-confirm"));
        confirm.click();

        wait.until(ExpectedConditions.urlContains("success"));

        String message = driver.findElement(By.cssSelector("div[id='content']>h1")).getText();
        Assert.assertEquals(message,"Your order has been placed!");


    }

}
/*  todo wait eklenmis hali
        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement continu1 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-payment-address")));
        continu1.click();

        WebElement continu2 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-shipping-address")));
        continu2.click();

        WebElement continu3 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("collapse-shipping-address")));
        continu3.click();

        WebElement contunie4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-shipping-method")));
        contunie4.click();

        WebElement checkBox =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
        checkBox.click();

        WebElement continue5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-payment-method")));
        continue5.click();

        WebElement confirmButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-confirm")));
        confirmButton.click();
 */
