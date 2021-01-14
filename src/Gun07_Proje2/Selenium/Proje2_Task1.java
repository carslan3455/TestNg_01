package Gun07_Proje2.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Proje2_Task1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://demowebshop.tricentis.com/");

        WebElement loginLink = driver.findElement(By.cssSelector("a[class='ico-login']"));
        loginLink.click();

        WebElement email = driver.findElement(By.cssSelector("input[id='Email']"));
        email.sendKeys("carslan3049@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[id='Password']"));
        password.sendKeys("arslan.123");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[value='Log in']"));
        loginBtn.click();

        String homePageID = driver.getWindowHandle();

        WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
        facebook.click();

        Set<String> windowAllWindow = driver.getWindowHandles();

        for (String window : windowAllWindow) {

            driver.switchTo().window(window);

        }

        String facebookUrl = driver.getCurrentUrl();

        Assert.assertTrue(facebookUrl.contains("facebook"));
        driver.close();

        driver.switchTo().window(homePageID);

        WebElement contactUsLink = driver.findElement(By.xpath("//a[text()='Contact us']"));
        contactUsLink.click();

        WebElement enquiry = driver.findElement(By.id("Enquiry"));
        enquiry.sendKeys("Buraya kadar guzel geldin ...");

        WebElement submitBtn = driver.findElement(By.cssSelector("input[value='Submit']"));
        submitBtn.click();

        String contactUsMesssage = driver.findElement(By.cssSelector("div[class='result']")).getText();

        Assert.assertTrue(contactUsMesssage.contains("enquiry"));


    }
}
