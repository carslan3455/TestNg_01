package Mentor.BurakBy.POM;


import org.testng.annotations.Test;

public class pomSelenium extends BaseDriver {

    @Test
    public void kayit() {
        pomElements pom = new pomElements(driver);

        pom.isim.sendKeys("Techno");
        pom.soyIsim.sendKeys("Study");
        pom.mail.sendKeys("techno@study.com");
        pom.alanKodu.sendKeys("+49");
        pom.telNo.sendKeys("12123243215");
        pom.hangisi.click();
        pom.adres1.sendKeys("Langberg Str.");
        pom.adres2.sendKeys("12");
        pom.sehir.sendKeys("Rodenbach");
        pom.eyalet.sendKeys("Hessen");
        pom.postaKodu.sendKeys("63543");



    }
}
