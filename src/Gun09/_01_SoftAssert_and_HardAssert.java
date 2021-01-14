package Gun09;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

    /* todo
      Hard assert ve Soft assert
      Aralarındaki fark nedir?

      Hard assert fail olduğu anda çalışmayı durdurur.
      Soft assert ise devam eder.
     */

public class _01_SoftAssert_and_HardAssert {


    @Test
    public void hardAssert() {  // todo keskin bir sekilde net olarak prog durduruyor
        String s1 = "Merhaba";

        System.out.println("Hard assert öncesi");
        Assert.assertEquals("Merhaba123", s1);
        System.out.println("Kod bitti...");
    }

    @Test
    public void softAssert() {    // todo soft assert biriktirip hafizaya alip tamamlandiktan sonra assertAll kisminda aktiflestiriliyor.
                                // todo hatayi gordugunde prog durdurmuyor...

        String strHomePage = "www.facebook.com/homepage";
        String strCartPage = "www.facebook.com/cartpage";
        String strEditAccountPage = "www.facebook.com/editaccountpage";

        SoftAssert _softAssert = new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage", strHomePage);
        System.out.println("assert 1");

        _softAssert.assertEquals("www.facebook.com/profile", strCartPage);   // burda fail oluyor
        System.out.println("assert 2");

        _softAssert.assertEquals("www.facebook.com/settings", strEditAccountPage);   // burda tekrar fail oluyor
        System.out.println("assert 3");


        _softAssert.assertAll();        // todo butun assertleri aktif ediyor
        System.out.println("Kod bitisi");  // Bu bolüm assertAll dan sonra oldugu icin ve assertlerinde fail oldugundan yukarida program kesilir

    }

}
