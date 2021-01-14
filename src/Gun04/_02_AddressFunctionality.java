package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.MethodWebDriver;
import utils.Tools;

import javax.tools.Tool;
import java.util.List;

/*
    Senaryo
    1- Siteyi aciniz
    2- Adres ekleyiniz
    3- En son eklenen adresi Edit yaparak ad ve soyadi degistirip kaydediniz
    4- En son eklenen adresi siliniz

 */
public class _02_AddressFunctionality extends MethodWebDriver {

    @Test
    void AddAddress() throws InterruptedException {
        WebElement adressBookBtn = driver.findElement(By.linkText("Address Book"));
        adressBookBtn.click();

        WebElement newAdressBtn = driver.findElement(By.linkText("New Address"));
        newAdressBtn.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Techno");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Study");

        WebElement company = driver.findElement(By.id("input-company"));
        company.sendKeys("Techno Study");


        WebElement adress1 = driver.findElement(By.id("input-address-1"));
        adress1.sendKeys("Germany");

        WebElement adress2 = driver.findElement(By.id("input-address-2"));
        adress2.sendKeys("NRW");

        WebElement city = driver.findElement(By.id("input-city"));
        city.sendKeys("Lvrksn");

        WebElement postCode = driver.findElement(By.id("input-postcode"));
        postCode.sendKeys("51385");

        WebElement country =driver.findElement(By.id("input-country"));
        Tools.selectByIndex(country);

        WebDriverWait wait = new WebDriverWait(driver,5);
        By stateOption = By.cssSelector("select[id='input-zone']>option");

        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(stateOption,1));
        // todo verilen Locator deki elemanlarin yuklenmesi icin option dolmasi kontrol ediliyor.
        //  Onun icin 1 den fazla olana kadar bekle dedik

        Thread.sleep(1000);

        WebElement state = driver.findElement(By.id("input-zone"));
        Tools.selectByIndex(state);

        WebElement continueBtn = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueBtn.click();

        Tools.successMessageValidation(driver);

    }

    @Test(dependsOnMethods = {"AddAddress"})
    void EditAddress(){

        WebElement addressBook = driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        // Butun Edit butonlari aldik
        List<WebElement> editBtns = driver.findElements(By.xpath("//a[text()='Edit']"));
        editBtns.get(0).click();   // Sonuncunun edit tikladik

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys("Techno");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys("Study");

        WebElement continueBtn = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueBtn.click();

        Tools.successMessageValidation(driver);


    }

    @Test(dependsOnMethods = {"EditAddress"})
    void DeleteAddress(){

        WebElement addressBook = driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        // Butun Delete butonlari aldik
        List<WebElement> deleteBtns = driver.findElements(By.xpath("//a[text()='Delete']"));
        deleteBtns.get(0).click();  // Sonuncunun Delete tikladik

        Tools.successMessageValidation(driver);


    }

    @Test
    void deleteAll() {
        WebElement addressBook = driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> deleteBtns = driver.findElements(By.xpath("//a[text()='Delete']"));

//        for (WebElement w: deleteBtns) {
//            w.click();
//        }
//
        for (int i = 0; i < deleteBtns.size(); i++) {
            deleteBtns.get(i).click();
        }



    }

}
