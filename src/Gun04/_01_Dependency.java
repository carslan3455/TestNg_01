package Gun04;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {       // todo  Dependency -> bagli-bagimli

    @Test
    void startCar(){

        System.out.println("Car startCar");
      //  Assert.fail();                      // todo direk Hata olusturur
    }

    @Test(dependsOnMethods = {"startCar"})      // todo bu testin calismasi startCar in hatasiz calismasina bagli
    void driveCar(){

        System.out.println("Car driveCar");
    }

    @Test(dependsOnMethods = {"driveCar"})      // todo bu testin calismasi driveCar in hatasiz calismasina bagli
    void stopCar(){

        System.out.println("Car stopCar");
    }

    @Test(dependsOnMethods = {"stopCar","driveCar"},alwaysRun = true)  // todo alwaysRun = true ==> Bagimliliklari var ama hata ciksada calistir
    void parkCar(){

        System.out.println("Car parkCar");
    }
}
