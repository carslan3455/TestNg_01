package Gun11_Proje3.POM;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Proje3_Task2_POM extends Proje3_Driver {
    @Test
    @Parameters({"username", "password"})
    public void addToWishList(String username, String password) {

        Proje3_Elements proje3_Element = new Proje3_Elements(driver);

        proje3_Element.loginLink.click();
        proje3_Element.email.sendKeys(username);
        proje3_Element.password.sendKeys(password);
        proje3_Element.loginBtn.click();


        proje3_Element.apparelShoesLinks.click();
        String item1 = proje3_Element.blueGreen.getText();
        proje3_Element.blueGreen.click();
        proje3_Element.addWishlistBG.click();
        driver.navigate().back();
        String item2 = proje3_Element.rockabilly.getText();
        proje3_Element.rockabilly.click();
        proje3_Element.addWishlistR.click();
        proje3_Element.wishListLink.click();

        List<String> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        for (WebElement w: proje3_Element.wishList ) {
            Assert.assertTrue(items.contains(w.getText()));

        }



    }
}
