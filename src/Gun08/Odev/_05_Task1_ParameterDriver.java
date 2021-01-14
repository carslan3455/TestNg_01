package Gun08.Odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.MethodWebDriver;
import utils.ParameterWebDriver;

import java.util.List;

public class _05_Task1_ParameterDriver extends ParameterWebDriver {
    /**
     *
     * Daha onceki derslerde yaptigimiz Search fonksiyonunu
     * mac ve samsung icin DataProvider ile yapiniz
     * Fonksiyonu aynen kopyalaya bilirsiniz
     *
     */

    @Test (dataProvider = "getData")
    public void searchFunction(WebDriver driver,String searchText) {


        WebElement searchInput = driver.findElement(By.cssSelector("input[name='search']"));
        searchInput.clear();
        searchInput.sendKeys(searchText);

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> itemNameList = driver.findElements(By.cssSelector("h4>a"));

        for (WebElement itemName : itemNameList) {

            System.out.println(itemName.getText());
            Assert.assertTrue(itemName.getText().toLowerCase().contains(searchText));
        }


    }

    @DataProvider
    public Object[][] getData(){

        Object[][] browserAndText = {
                {"chrome","mac"},
                {"firefox","samsung"}
        };

        return browserAndText;

    }
}
