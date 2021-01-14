package Mentor.BurakBy.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pomElements extends BaseDriver{

    public pomElements(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//input[@id='first_3']")
    public WebElement isim;

    @FindBy (xpath = "//input[@id='last_3']")
    public WebElement soyIsim;

    @FindBy (xpath = "//input[@id='input_10']")
    public WebElement mail;

    @FindBy (xpath = "//input[@id='input_12_area']")
    public WebElement alanKodu;

    @FindBy (xpath = "//input[@id='input_12_phone']")
    public WebElement telNo;


    @FindBy (xpath = "//input[@id='input_11_1']")
    public WebElement hangisi;


    @FindBy (xpath = "//input[@id='input_13_addr_line1']")
    public WebElement adres1;


    @FindBy (xpath = "//input[@id='input_13_addr_line2']")
    public WebElement adres2;


    @FindBy (xpath = "//input[@id='input_13_city']")
    public WebElement sehir;

    @FindBy (xpath = "//input[@id='input_13_state']")
    public WebElement eyalet;

    @FindBy (xpath = "//input[@id='input_13_postal']")
    public WebElement postaKodu;


}
