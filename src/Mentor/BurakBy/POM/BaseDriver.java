package Mentor.BurakBy.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseDriver {

    protected WebDriver driver;

    @BeforeMethod
    public void beforMethod(){

        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://eu.jotform.com/build/202614868523054#preview");

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(1000);
//        driver.quit();
    }
}
