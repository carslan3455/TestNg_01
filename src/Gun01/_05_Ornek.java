package Gun01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MethodWebDriver;

/*
    Senaryo
    1- http://opencart.abstracta.us/index.php?route=account/login  sitesini aciniz.
    2- asd@gmail.com  ve 123qweasd  bilgileri ile login olan test methodunu yaziniz
    3- Login olup olmadiginizi assert ile kontrol ediniz
    4- Bir utils klasoru aciniz ve buraya beforeClass ve afterClass methodlarini yazarak
        genel kullanim icin MethodWebDriver isimli tets class tanimlayiniz...
     */
public class _05_Ornek extends MethodWebDriver{

    @Test
    void loginOl(){
        WebElement mail = driver.findElement(By.cssSelector("input[id='input-email']"));
        mail.sendKeys("asd@gmail.com");

        WebElement pass = driver.findElement(By.cssSelector("input[id='input-password']"));
        pass.sendKeys("123qweasd");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        loginBtn.click();


        String loginMesaj = driver.getTitle();
        Assert.assertEquals("My Account",loginMesaj);

        System.out.println("Login adiniz = "+loginMesaj);

    }






}
