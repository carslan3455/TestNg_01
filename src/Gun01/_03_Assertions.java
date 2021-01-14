package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {


    @Test
    void EqualOrnek(){

        String s1 = "Mehmet";
        String s2 = "Ahmet";

        Assert.assertEquals(s1,s2);

    }

    @Test
    void trueOrnek(){

        int sayi1 = 5;
        int sayi2 = 7;

        Assert.assertTrue(sayi1==sayi2);

    }

    String s;

    @Test
    void nullOrnek(){

      //  String s ;

        Assert.assertNull(s);

    }
}
