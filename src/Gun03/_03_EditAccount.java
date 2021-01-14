package Gun03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MethodWebDriver;
import utils.Tools;

/*
        Senaryo
        1- Siteyi aciniz
        2- Edit account a tiklatiniz
        3- Yeni isim ve soyisim gondererek Continue yapiniz
        4- Islem sonucunu kontrol ediniz

     */
public class _03_EditAccount extends MethodWebDriver {


    @Test
    void EditAccount(){

        AccountEdit("Techno" ,"Study");
        AccountEdit("ismet" ,"Yilmaz");

    }

    public void AccountEdit(String first, String last){
        WebElement editAccount = driver.findElement(By.xpath("//a[text()='Edit Account']"));
        editAccount.click();

        WebElement firstname = driver.findElement(By.cssSelector("input[id='input-firstname']"));
        firstname.clear();
        firstname.sendKeys(first);

        WebElement lastname = driver.findElement(By.cssSelector("input[id='input-lastname']"));
        lastname.clear();
        lastname.sendKeys(last);

        WebElement continueBtn = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        continueBtn.click();

        Tools.successMessageValidation(driver);

    }


}
