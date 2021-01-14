package Mentor.TahirBy.crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class verifyTitle {

    public  WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void beforeClass(String browser) {

        if (browser.equalsIgnoreCase("chrome")){
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        driver = new ChromeDriver();}

        else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
            System.setProperty("webdriver.gecko.driver", "C:/Users/arslan/Selenium/Driver/geckodriver.exe");
            driver = new FirefoxDriver();
        }  else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","C:/Users/arslan/Selenium/Driver/msedgedriver.exe");
            driver=new EdgeDriver();
        }


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://learn-automation.com/");
    }

    @Test
    public void title(){


        System.out.println(driver.getTitle());

    }
}
