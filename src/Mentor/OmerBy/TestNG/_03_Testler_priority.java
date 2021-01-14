package Mentor.OmerBy.TestNG;

import org.testng.annotations.Test;

public class _03_Testler_priority {

    /*
    TestNG testlerinde , testler konsola alfabetik sira ile yazdirilir
    siralama sifirdan baslar... yazilmayan manuel sifirdir
     */


    @Test(priority = 3000)
    public void b(){

        System.out.println("----------- b --------------");
    }

    @Test(priority = 2001,enabled = false)
    public void a(){

        System.out.println("----------- a --------------");
    }


    @Test(priority = 2000)
    public void c(){

        System.out.println("----------- c --------------");
    }


}
