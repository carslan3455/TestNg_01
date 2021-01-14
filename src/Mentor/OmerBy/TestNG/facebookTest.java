package Mentor.OmerBy.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class facebookTest {

    WebDriver driver;

    @Test(dataProvider = "myData")
    public void Test1(String username, String password) {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://facebook.com/");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(username);

        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys(password);

    }

    @DataProvider
    public Object[][] myData() {
        //todo 3 kullanici icin 2 veri seklinde 2Darray oluyturduk
        Object[][] facebookData = {
                {"omer@gmail.com", "password1"},
                {"huseyin@gmail.com", "password2"},
                {"volkan@gmail.com", "password3"}
        };
        return facebookData;

        // todo 2.Yöntem
        /*
        //1. kullanıcı
    facebookData[0][0]="omer@gmail.com";
    facebookData[0][1]="password1";
        //2. kullanıcı
    facebookData[1][0]="huseyin@gmail.com";
    facebookData[1][1]="password2";

        //3. kullanıcı
    facebookData[2][0]="volkan@gmail.com";
    facebookData[2][1]="password3";
    return facebookData;
         */

    }


}
