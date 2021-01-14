package Mentor.BurakBy.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class normalSelenium extends BaseDriver{

    @Test
    public void normalSeleniumTesti() {


        WebElement isim = driver.findElement(By.xpath("//input[@id='first_3']"));
        isim.sendKeys("Burak");

        WebElement soyIsim = driver.findElement(By.xpath("//input[@id='last_3']"));
        soyIsim.sendKeys("Türkmen");

        WebElement mail = driver.findElement(By.xpath("//input[@id='input_10']"));
        mail.sendKeys("brk@brk.com");

        WebElement alanKodu = driver.findElement(By.xpath("//input[@id='input_12_area']"));
        alanKodu.sendKeys("+49");

        WebElement telNo = driver.findElement(By.xpath("//input[@id='input_12_phone']"));
        telNo.sendKeys("12123243215");

        WebElement hangisi = driver.findElement(By.xpath("//input[@id='input_11_1']"));
        hangisi.click();

        WebElement adres1 = driver.findElement(By.xpath("//input[@id='input_13_addr_line1']"));
        adres1.sendKeys("Langberg Str.");

        WebElement adres2 = driver.findElement(By.xpath("//input[@id='input_13_addr_line2']"));
        adres2.sendKeys("12");

        WebElement sehir = driver.findElement(By.xpath("//input[@id='input_13_city']"));
        sehir.sendKeys("Rodenbach");

        WebElement eyalet = driver.findElement(By.xpath("//input[@id='input_13_state']"));
        eyalet.sendKeys("Hessen");

        WebElement postaKodu = driver.findElement(By.xpath("//input[@id='input_13_postal']"));
        postaKodu.sendKeys("63543");
    }
}
