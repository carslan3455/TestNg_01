package Gun11_Proje3.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class LoginClass {

    public static WebDriver driver;

    @BeforeClass
    public void LoginOl() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("http://demowebshop.tricentis.com/");

        WebElement loginLink = driver.findElement(By.cssSelector("a[class='ico-login']"));
        loginLink.click();

        WebElement email = driver.findElement(By.cssSelector("input[id='Email']"));
        email.sendKeys("carslan3049@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[id='Password']"));
        password.sendKeys("arslan.123");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[value='Log in']"));
        loginBtn.click();

    }


    @AfterClass
    public void quit() throws InterruptedException {

        Thread.sleep(2000);
      //  driver.quit();

    }
}