package Gun06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.MethodWebDriver;

import java.util.List;

    /*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimesini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.

     */

public class _03_SearchFunctionality extends MethodWebDriver {

    @Test
    @Parameters("arananKelime")
    public void searchFunction(String searchText) {

        // String searchText ="mac";

        WebElement searchInput = driver.findElement(By.cssSelector("input[name='search']"));
        searchInput.sendKeys(searchText);

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> itemNameList = driver.findElements(By.cssSelector("h4>a"));

        for (WebElement itemName : itemNameList) {

            System.out.println(itemName.getText());
            Assert.assertTrue(itemName.getText().toLowerCase().contains(searchText));
        }


    }

}
