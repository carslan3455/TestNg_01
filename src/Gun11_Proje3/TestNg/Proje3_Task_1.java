package Gun11_Proje3.TestNg;

import Gun11_Proje3.TestNg.LoginClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Proje3_Task_1 extends LoginClass {

    @Test
    public void Task1() {

        WebElement contactUsLink = driver.findElement(By.xpath("//a[text()='Contact us']"));
        contactUsLink.click();

        WebElement enquiryMessage = driver.findElement(By.id("Enquiry"));
        enquiryMessage.sendKeys("Yine bir projede karsilastik...");

        WebElement submitBtn = driver.findElement(By.cssSelector("input[value='Submit']"));
        submitBtn.click();

        String contactUsMessage = driver.findElement(By.cssSelector("div[class='result']")).getText();

        Assert.assertTrue(contactUsMessage.contains("successfully"));


    }
}
