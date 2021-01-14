package Gun11_Proje3.TestNg;

import Gun11_Proje3.TestNg.LoginClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Proje3_Task_2 extends LoginClass {

    @Test
    public void Task2() {

        WebElement apparelShoesLinks = driver.findElement(By.cssSelector("a[href='/apparel-shoes']"));  //(By.xpath("(//li[@class='inactive']/a)[4]"));
        apparelShoesLinks.click();

        WebElement blueGreen = driver.findElement(By.xpath("(//div[@class='details']/h2/a)[2]"));
        String blueGreenText = blueGreen.getText();
        blueGreen.click();
        System.out.println(blueGreenText);

        WebElement addWishlistBG = driver.findElement(By.id("add-to-wishlist-button-28"));
        addWishlistBG.click();

        driver.navigate().back();

        WebElement rockabilly = driver.findElement(By.xpath("(//div[@class='details']/h2/a)[1]"));
        String rockabillyText = rockabilly.getText();
        rockabilly.click();
        System.out.println(rockabillyText);

        WebElement addWishlistR = driver.findElement(By.id("add-to-wishlist-button-5"));
        addWishlistR.click();

        WebElement wishListLink = driver.findElement(By.xpath("(//span[@class='cart-label'])[2]"));
        wishListLink.click();

        List<WebElement> wishList = driver.findElements(By.xpath("(//td[@class='product']/a)"));

        int sayac = 0;
        for (WebElement w: wishList) {

            if (w.getText().contains(blueGreenText)){
                sayac++;
            }else if (w.getText().contains(rockabillyText)) {
                sayac++;
            }
        }

        Assert.assertEquals(sayac,2);

    }
}
