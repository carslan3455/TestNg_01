package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class MethodWebDriver {
    public static WebDriver driver;


    @BeforeClass
    public void beforeClass() {

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        WebElement mail = driver.findElement(By.cssSelector("input[id='input-email']"));
        mail.sendKeys("asd@gmail.com");

        WebElement pass = driver.findElement(By.cssSelector("input[id='input-password']"));
        pass.sendKeys("123qweasd");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        loginBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button[id='details-button']")));

        WebElement sitedonusBtn = driver.findElement(By.cssSelector("button[id='details-button']"));
        sitedonusBtn.click();

        //   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[id='proceed-link']")));

        WebElement sitedonusLink = driver.findElement(By.cssSelector("a[id='proceed-link']"));
        sitedonusLink.click();

    }

    @AfterClass
    public void afterClass() throws InterruptedException {

        Thread.sleep(10000);
//        driver.quit();
    }
}
