package Gun11_Proje3.POM;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Proje3_Task1_POM extends Proje3_Driver {
    @Test
    @Parameters({"username","password","message"})
    public void addToWishList(String username,String password,String message ) {

        Proje3_Elements proje3_Element = new Proje3_Elements(driver);

        proje3_Element.loginLink.click();
        proje3_Element.email.sendKeys(username);
        proje3_Element.password.sendKeys(password);
        proje3_Element.loginBtn.click();

        proje3_Element.contactUsLink.click();
        proje3_Element.enquiryMessage.sendKeys(message);
        proje3_Element.submitBtn.click();

        Assert.assertTrue(proje3_Element.contactUsMessage.getText().contains("successfully"));



    }
}
