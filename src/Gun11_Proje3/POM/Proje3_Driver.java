package Gun11_Proje3.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class Proje3_Driver {

    public  WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void beforeClass(String browser) {


        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.navigate().to("http://demowebshop.tricentis.com/");


        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
            System.setProperty("webdriver.gecko.driver", "C:/Users/arslan/Selenium/Driver/geckodriver.exe");
            driver = new FirefoxDriver();

        }

    }


    @AfterClass
    public void quit() throws InterruptedException {

        Thread.sleep(2000);
      //  driver.quit();

    }
}