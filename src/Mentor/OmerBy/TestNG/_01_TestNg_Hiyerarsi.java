package Mentor.OmerBy.TestNG;

import org.testng.annotations.*;

public class _01_TestNg_Hiyerarsi {


    @BeforeSuite
    public void beforeSuit(){

        System.out.println("BEFORE SUİTE --     Testi başlatan, ilk çalışan methoddur.");
    }

    @BeforeTest
    public void beforTest(){

        System.out.println("BEFORE TEST --   Suitten sonra teste geçiş anlamında çalışan methoddur.");
    }


    @BeforeClass
    public void beforeClass(){

        System.out.println("BEFORE CLASS  --    Class başında ve before testten sonra çalışır");
    }

    @BeforeMethod
    public void beforeMethod(){

        System.out.println("BEFORE METHOD  --- Her test methodundan önce çalışır...");
    }

    @Test
    public void Test1(){

        System.out.println("TEST 1 -------------------------");
    }

    @Test
    public void Test2(){

        System.out.println("TEST 2 -------------------------");
    }

    @AfterMethod
    public void afterMethod(){

        System.out.println("AFTER  METHOD ---  Her test methodundan sonra çalışır...");
    }

    @AfterClass
    public void afterClass(){

        System.out.println("AFTER CLASS --> Classtaki test islemi tamalandiginda calisir");
    }

    @AfterTest
    public void AfterTest(){

        System.out.println("AFTER TEST --    After classtan sonra çalışır.");
    }

    @AfterSuite
    public void aftersuit(){

        System.out.println("AFTER SUİTE -- En son çalışır. Suite'i kapatır..");
    }
}
