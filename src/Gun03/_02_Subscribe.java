package Gun03;

/*
  Senaryo
  1- Siteyi aciniz
  2- Newslatter Subscribe  islemlerini ayri ayri Testlerde yapiniz
  3- Newslatter  üyelik islemini, üye ise uyelikten cikma,
          degilse üye olma islemini yapiniz

   */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MethodWebDriver;
import utils.Tools;

public class _02_Subscribe extends MethodWebDriver {




    @Test(enabled = false)
    void subscribeFunctionYes() {

        WebElement news = driver.findElement(By.xpath("//a[text()='Subscribe / unsubscribe to newsletter']"));
        news.click();

        WebElement yesBtn = driver.findElement(By.cssSelector("input[value='1']"));
        yesBtn.click();

        WebElement continueBtn = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        continueBtn.click();

        Tools.successMessageValidation(driver);


    }

    @Test
    void subscribeFunctionNo() {
        WebElement news = driver.findElement(By.xpath("//a[text()='Subscribe / unsubscribe to newsletter']"));
        news.click();

        WebElement noBtn = driver.findElement(By.cssSelector("input[value='0']"));
        noBtn.click();

        WebElement continueBtn = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        continueBtn.click();

        Tools.successMessageValidation(driver);

    }

    @Test(priority = 1)
    void subscribeFunctionForBoth() {
        WebElement news = driver.findElement(By.xpath("//a[text()='Subscribe / unsubscribe to newsletter']"));
        news.click();

        WebElement yesBtn = driver.findElement(By.cssSelector("input[value='1']"));
        WebElement noBtn = driver.findElement(By.cssSelector("input[value='0']"));


        if (yesBtn.isSelected()){
            noBtn.click();
        }else yesBtn.click();

        WebElement continueBtn = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        continueBtn.click();

        Tools.successMessageValidation(driver);

    }

}
