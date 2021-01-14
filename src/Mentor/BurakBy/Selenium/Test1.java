package Mentor.BurakBy.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BaseDriver {

    @Test
    public void Test1() {
        String name = "Linda Anderson";

        WebElement director = driver.findElement(By.xpath("//b[text()='Directory']"));
        director.click();

        WebElement searchName = driver.findElement(By.id("searchDirectory_emp_name_empName"));
        searchName.sendKeys(name);

        WebElement searchBtn = driver.findElement(By.id("searchBtn"));
        searchBtn.click();

        String nameControl = driver.findElement(By.xpath("//b[contains(text(),'Linda Anderson')]")).getText();

        Assert.assertTrue(nameControl.contains(name));

    }

}
