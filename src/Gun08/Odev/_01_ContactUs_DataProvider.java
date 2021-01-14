package Gun08.Odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.MethodWebDriver;
    /*
        Senaryo
        1- Siteye gidiniz
        2- ContactUs tiklayiniz
        3- enquiry Mesaj yollayiniz
        4- Submit btn tiklayiniz
        5- Mesaji dogrulayiniz

     */

public class _01_ContactUs_DataProvider extends MethodWebDriver {

    @Test (dataProvider = "getMessage")
    public void contactUs(String enquiry){

        WebElement contactLink = driver.findElement(By.linkText("Contact Us"));
        contactLink.click();

        WebElement enquiryInput = driver.findElement(By.id("input-enquiry"));
        enquiryInput.clear();
        enquiryInput.sendKeys(enquiry);

        WebElement submitButtun = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        submitButtun.click();

        String successMessage = driver.findElement(By.cssSelector("#content>p")).getText();

        Assert.assertTrue(successMessage.toLowerCase().contains("successfully"));

    }

    @DataProvider
    public Object[] getMessage(){

        Object[] messages = {
                "Hello World",
                "Merhaba Dünya",
                "Software Developer in Test",
                "Techno Study",
        };

        return messages;
    }
}
