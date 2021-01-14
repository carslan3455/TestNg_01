package Gun10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _02_WishListElements {

    public _02_WishListElements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    // todo FindAll -> FindBy buldugu elemanlarin hepsini al
    @FindAll(
            {
                    @FindBy(css = "div[class='caption']>h4")
                   // ,@FindBy(css = "div[class='caption']>h4")
                    // ihtiyac halinde
                    // birden fazla locator ile bulunan elemanlar
                    // bu sekilde birlestirilebilir
            }
    )
    public List<WebElement> productList;

    @FindAll(
            {
                    @FindBy(css = "button[data-original-title='Add to Wish List']")

            }
    )
    public List<WebElement> searchResultWishList;

    @FindBy(id = "wishlist-total")
    public WebElement wishListLink;

    @FindAll(
            {
                    @FindBy(xpath = "//table[@class='table table-bordered table-hover']//tbody//td[2]")

            }
    )
    public List<WebElement> tableNames;


}