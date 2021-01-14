package Mentor.BurakBy.TestNg;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_Ex {

    @Test
    public void telefonu_acmak(){

        System.out.println("Telefonu Aciyorum");
    }

    @Test(dependsOnMethods = {"telefonu_acmak"})
    public void birini_aramak(){

        System.out.println("Rehberden birini ariyorum");
    }

    @Test(dependsOnMethods = {"birini_aramak"})
    public void gorusmek(){

        System.out.println("Aradigim kisiyle gorusuyorum");

//        Assert.fail();                     // todo hata olusturduk
    }

    @Test(dependsOnMethods = {"gorusmek"})
    public void gorusmeyi_bitirmek(){

        System.out.println("Gorusmeyi bitiriyorum");
    }
}
