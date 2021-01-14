package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class Tools {

    public static void compareToList(List<WebElement> menuActualList, List<String> menuExpectedList) {

        // todo ExpectedMenu ve ActualMenu kiyaslandi

        int i = 0;
        for (WebElement elmnt : menuActualList) {

            Assert.assertEquals(elmnt.getText(), menuExpectedList.get(i++));

//            if (elmnt.getText() != menuExpectedList.get(i++))
//                System.out.println("Menu bulunamadi");
        }
    }

    public static void ListContainsString(List<WebElement> menuActualList, String expectedString) {

        boolean bulundu = false;
        for (WebElement elmnt : menuActualList) {

            if (elmnt.getText().contains(expectedString)){
                bulundu = true;
            break;}
        }

        Assert.assertTrue(bulundu, "Aranan eleman bulunamadi!!!");
    }

    public static void successMessageValidation(WebDriver driver) {

        // todo Islemin dogrulugu cikan mesajdan kontrol edildi

        String successMessage = driver.findElement(By.cssSelector("div[class='alert alert-success']")).getText();
        Assert.assertTrue(successMessage.contains("uccess"));
    }

    public static void selectByIndex(WebElement dropDawnName) {

        Select _select = new Select(dropDawnName);
        _select.selectByIndex(RandomNumberGenerator(_select.getOptions().size()));

    }

    public static int RandomNumberGenerator(int max) {
        Random random = new Random();

        int randomNumber = random.nextInt(max - 1) + 1;

        /*
        random.nextInt(10);     ->  0 dan 10 kadar sifir dahil 10 dahil degil (0...9)

        random.nextInt(10-1)+1; ->  // 1 den 1 a kadar yapmis oluyor bu sekilde 0 dahil etmemis olduk  (1...9)

        0 ve 10-1 =9   0...8
        tekrar +1 yapinca 1...9 oluyor...

         */
        return randomNumber;
    }

}
