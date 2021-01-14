package Gun06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MethodWebDriver;

import java.util.List;

    /*
        Senaryo
        1- Siteye gidiniz
        2- Specials tiklayiniz
        3- Cikan urun sayisi ile indirimli urun sayisi ayni mi dogrulayiniz

     */

public class _02_Specials extends MethodWebDriver {

    @Test
    public void specials(){

        WebElement specialsLink = driver.findElement(By.linkText("Specials"));
        specialsLink.click();

        List<WebElement> oldAmount = driver.findElements(By.cssSelector("span[class='price-old']"));
        List<WebElement> items = driver.findElements(By.cssSelector("div[class='product-thumb']"));

        Assert.assertTrue(oldAmount.size()==items.size());


    }
}
