package Gun11_Proje3.POM;

import Gun11_Proje3.POM.Proje3_Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class Proje3_Elements extends Proje3_Driver {

    public Proje3_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /********************************
     * Task_1 Elements
     */
    @FindBy(css = "a[class='ico-login']")
    public WebElement loginLink;

    @FindBy(css = "input[id='Email']")
    public WebElement email;

    @FindBy(css = "input[id='Password']")
    public WebElement password;

    @FindBy(css = "input[value='Log in']")
    public WebElement loginBtn;


    @FindBy(xpath = "//a[text()='Contact us']")
    public WebElement contactUsLink;

    @FindBy(id = "Enquiry")
    public WebElement enquiryMessage;

    @FindBy(css = "input[value='Submit']")
    public WebElement submitBtn;

    @FindBy(css = "div[class='result']")
    public WebElement contactUsMessage;

    /********************************
     * Task_2 Elements
     */

    @FindBy(css = "a[href='/apparel-shoes']")
    public WebElement apparelShoesLinks;

    @FindBy(xpath = "(//div[@class='details']/h2/a)[2]")
    public WebElement blueGreen;


    @FindBy(id = "add-to-wishlist-button-28")
    public WebElement addWishlistBG;


    @FindBy(xpath = "(//div[@class='details']/h2/a)[1]")
    public WebElement rockabilly;

    @FindBy(id = "add-to-wishlist-button-5")
    public WebElement addWishlistR;

    @FindBy(xpath = "(//span[@class='cart-label'])[2]")
    public WebElement wishListLink;

    @FindAll(
            {
                    @FindBy(xpath = "(//td[@class='product']/a)")
            }
    )
    public List<WebElement> wishList;
}
