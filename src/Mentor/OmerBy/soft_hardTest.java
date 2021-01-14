package Mentor.OmerBy;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_hardTest {

    @Test
    public void Test1() {
        System.out.println("Open browser");
        System.out.println("enter username");
        System.out.println("enter password");
        System.out.println("Click on sign in button");

        //hard assert
        Assert.assertEquals(true, true);


        System.out.println("Click on contact us button");
        Assert.assertEquals(true, true);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(true, false, "Email Yanlis");

        System.out.println("type your email");

        System.out.println("type your message");
        System.out.println("Click on send button");


        softAssert.assertAll();

    }

    @Test
    public void Test2() {
        SoftAssert softAssert1 = new SoftAssert();
        System.out.println("logout");
        softAssert1.assertEquals(true, true);
        softAssert1.assertAll();

    }
}
