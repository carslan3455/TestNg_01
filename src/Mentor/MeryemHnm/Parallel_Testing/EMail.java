package Mentor.MeryemHnm.Parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EMail {

    private WebDriver driver;

    @BeforeClass
    public void BeforeClass(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com/");
        WebElement continueBtn = driver.findElement(By.xpath("//button[text()='Ich stimme zu.']"));
        continueBtn.click();

    }

    @Test
    public void eMail(){

        WebElement email = driver.findElement(By.xpath("//*[text()='Mail']"));
        email.click();

    }


}
