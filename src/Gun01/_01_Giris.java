package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {
    //todo Eger test method larina herhangi bir siralama verilmezse alfabetik sirasina gore gidiyor


    // @ ile baslayanlara annotation deniyor
@Test(priority = 1)            // (priority : oncelik sirasi)

    void webSitesiAc(){

        System.out.println("Driver tanimlandi ve web sitesi acildi...");
    }

@Test(priority = 2)
    void loginTest(){

        System.out.println("Login Test islemleri yapildi...");
    }

@Test(priority = 3)
    void driverKapat(){

        System.out.println("Driver kapatildi ve cikildi...");
    }
}
