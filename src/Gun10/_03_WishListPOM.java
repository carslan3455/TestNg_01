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


import Gun09._03_PlacerOrderElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ParameterWebDriver;
import utils.Tools;

import java.util.List;


public class _03_WishListPOM extends ParameterWebDriver {  // 2.Yöntem ile ParameterWebDriver kullaniliyor

    @Test
    @Parameters("itemName")
    public void addToWishList(String itemName) {

        _03_PlacerOrderElements pacePlaceOrderElements = new _03_PlacerOrderElements(driver);
        _02_WishListElements wishListElements = new _02_WishListElements(driver);


        pacePlaceOrderElements.searchInput.sendKeys(itemName);
        pacePlaceOrderElements.searchButton.click();

        // Arama sonucu ekrana cikan urunlerin isim listesi alindi
        int randomNumber = Tools.RandomNumberGenerator(wishListElements.productList.size());
        // Random bir urun secildi ve ismi alindi
        String wishItemName = wishListElements.productList.get(randomNumber).getText();
        // AddWish lerin List aldik
        wishListElements.searchResultWishList.get(randomNumber).click();   // aldigimiz ayni no daki urunun wishList secildi
        wishListElements.wishListLink.click();
        Tools.ListContainsString(wishListElements.tableNames, wishItemName);


    }
}
