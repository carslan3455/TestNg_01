package Gun10;
       /*  todo bu senaryo xml den calistiriliyor
    Senaryo:
    1-Siteye gidiniz.
    2-ipod urununu aratiniz.
    3-cikan elemanlardan random Add Wish butonuna tiklayiniz.
    4-Daha sonra WishList e tiklatiniz.
    5-Burada cikan urunle ilk tiklanan urunun isminin ayni olup olmadigini dogrulayiniz.


    2.Test
    1-WishList i bosaltiniz.
    */


import Gun06._04_SearchFunctionality;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.MethodWebDriver;
import utils.Tools;

import javax.tools.Tool;
import java.util.List;


public class _01_WishList extends MethodWebDriver {  // 2.Yöntem ile ParameterWebDriver kullaniliyor

    @Test
    @Parameters("itemName")
    public void addToWishList(String itemName) {

        // 1.Yöntem
        WebElement searchInput = driver.findElement(By.cssSelector("input[name='search']"));
        searchInput.sendKeys(itemName);

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

//
//        // 2.Yöntem
//
//        Gun06._04_SearchFunctionality searchTest = new _04_SearchFunctionality();
//        searchTest.searchFunction(itemName);

        // Arama sonucu ekrana cikan urunlerin isim listesi alindi
        List<WebElement> productList = driver.findElements(By.cssSelector("div[class='caption']>h4"));
        int randomNumber = Tools.RandomNumberGenerator(productList.size());

        String wishItemName = productList.get(randomNumber).getText();
        // Random bir urun secildi ve ismi alindi

        // AddWish lerin List aldik
        List<WebElement> searchResultWishList = driver.findElements(By.cssSelector("button[data-original-title='Add to Wish List']"));
        searchResultWishList.get(randomNumber).click();   // aldigimiz ayni no daki urunun wishList secildi


        WebElement wishListLink = driver.findElement(By.id("wishlist-total"));
        wishListLink.click();

        // WishList alindi
        List<WebElement> tableNames = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//td[2]"));
        Tools.ListContainsString(tableNames, wishItemName);


        WebDriverWait wait = new WebDriverWait(driver,10);
        List<WebElement> removeBtns = driver.findElements(By.cssSelector("a[class='btn btn-danger']"));

        for (WebElement w : removeBtns) {
            wait.until(ExpectedConditions.elementToBeClickable(w));
            w.click();

        }

      Tools.successMessageValidation(driver);
    }
}
