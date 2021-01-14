package Mentor.BurakBy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends BaseDriver {

    @Test
    public void Test1() {



        WebElement director = driver.findElement(By.xpath("//b[text()='Time']"));
        director.click();

        WebElement employeeName = driver.findElement(By.id("employee"));
        employeeName.click();
        employeeName.sendKeys("Linda Anderson");

        WebElement viewBtn = driver.findElement(By.id("btnView"));
        viewBtn.click();

        String message = driver.findElement(By.cssSelector("div[class='message warning']")).getText();

        Assert.assertTrue(message.contains("No Timesheets Found"));
    }


}
