package Gun03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MethodWebDriver;
import utils.Tools;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class _01_ValidateMenu extends MethodWebDriver {

    /*
        Senaryo
        1- Siteyi aciniz
        2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.


     */

    @Test
    void meuValidation() {

        List<String> menuExpectedList = new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");

        By menu = By.cssSelector("ul[class='nav navbar-nav']>li");  // todo Degisken tipi By
        List<WebElement> menuActualList = driver.findElements(menu);

        Tools.compareToList(menuActualList,menuExpectedList);


    }


}
