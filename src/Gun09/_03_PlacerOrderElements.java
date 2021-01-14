package Gun09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_PlacerOrderElements {
    // Bu sayfadaki butun elemanlarin driver ile baglantisi gerekiyor
    // bunun icin asagidaki Constructor eklendi ve icine PageFactory ile
    // driver uzerinden bu(this) sayfadaki butun elemanlar iliskilendirildi
    // Böylece sayfadan nesne turetildigi zaman degil, kullanildigi
    // anda elemanlarin bulunmasi aktif oluyor. Bu yöntemle butun sayfalarda
    // ayni isimde elemanlar var ise buradaki tanimlama hepsi icin gecerli hale
    // gelmis oluyor. Bu yapiya Page Object Modeli (POM) adi verilir

    public _03_PlacerOrderElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name='search']")
    public WebElement searchInput;

    @FindBy(css = "button[class='btn btn-default btn-lg']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[text()='Add to Cart'][1]")
    public WebElement item1;

    @FindBy(css = "a[title='Shopping Cart']")
    public WebElement shoppingCart;

    @FindBy(css = "a[class='btn btn-primary']")
    public WebElement checkOut;

    @FindBy(id = "button-payment-address")
    public WebElement continueBtn1;

    @FindBy(id = "button-shipping-address")
    public WebElement continueBtn2;

    @FindBy(id = "button-shipping-method")
    public WebElement continueBtn3;

    @FindBy(css = "input[value='1']")
    public WebElement checkBox;

    @FindBy(id = "button-payment-method")
    public WebElement continueBtn4;

    @FindBy(id = "button-confirm")
    public WebElement confirm;

    @FindBy(css = "div[id='content']>h1")
    public WebElement message;


}
