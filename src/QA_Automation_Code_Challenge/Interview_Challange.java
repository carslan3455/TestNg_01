package QA_Automation_Code_Challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 *
 */
public class Interview_Challange {

    protected WebDriver driver;

    @BeforeMethod
    public void SiteyeGit() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver92.107.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.autotrader.com/");


    }

    @Test(priority = 1)
    public void Links() {
        driver.manage().deleteAllCookies();
        WebElement byMake = driver.findElement(By.cssSelector("button[title='Browse by Make']"));
        Assert.assertTrue(byMake.isEnabled());

        WebElement byStyle = driver.findElement(By.cssSelector("button[title='Browse by Style']"));
        Assert.assertTrue(byStyle.isEnabled());

        WebElement advancedSearch = driver.findElement(By.cssSelector("a[data-qaid='adv_srch']"));
        Assert.assertTrue(advancedSearch.isEnabled());

        WebElement searchBtn = driver.findElement(By.cssSelector("#search"));
        Assert.assertTrue(searchBtn.isEnabled());

        WebElement makeDropDown = driver.findElement(By.cssSelector("#makeCode"));
        Assert.assertTrue(makeDropDown.isEnabled());

        String modelDropDown = driver.findElement(By.cssSelector("#ModelCode")).getText();
        Assert.assertTrue(modelDropDown.contains("Any Model"));

        driver.quit();

    }

    @Test(priority = 2)
    public void AdvancedSearch() {
        driver.manage().deleteAllCookies();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement advancedSearch = driver.findElement(By.cssSelector("a[data-qaid='adv_srch']"));
        advancedSearch.click();
      //  driver.manage().deleteAllCookies();

        WebElement zipCode = driver.findElement(By.cssSelector("#zip"));
        zipCode.sendKeys("30004");

        WebElement certified = driver.findElement(By.xpath("//div[text()='Certified']"));
        certified.click();

        WebElement convertible = driver.findElement(By.xpath("//div[text()='Convertible']"));
        js.executeScript("arguments[0].scrollIntoView();", convertible);
        convertible.click();
        driver.manage().deleteAllCookies();

        WebElement yearFrom = driver.findElement(By.cssSelector("select[id='4101482096']"));
        Select _select = new Select(yearFrom);
        _select.selectByValue("2017");

        WebElement yearTo = driver.findElement(By.cssSelector("select[id='258002540']"));
        _select = new Select(yearTo);
        _select.selectByValue("2020");

        WebElement mMT = driver.findElement(By.cssSelector("select[id='1970425032']"));
        js.executeScript("arguments[0].scrollIntoView();", mMT);
        driver.manage().deleteAllCookies();

        _select = new Select(mMT);
        _select.selectByValue("BMW");

        WebElement searchBtn = driver.findElement(By.cssSelector("button[data-qaid='btn-search']"));
        searchBtn.click();

        List<WebElement> searchList = driver.findElements(By.cssSelector("h2[data-cmp='subheading']"));

        for (WebElement w : searchList) {
            Assert.assertTrue(w.getText().contains("BMW"));
        }

        System.out.println("The total number of cars: " + searchList.size());

        driver.quit();

    }

}
