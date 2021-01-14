package Gun05;

import org.testng.annotations.Test;

public class _03_Groups {

    // todo Regression = Sistemin tumunu kontrol eden test e verilen isim
    @Test(groups = "Regression")
    public void Test1(){
        System.out.println("Test 1 Regression");
    }
    @Test(groups = "Regression")
    public void Test2(){
        System.out.println("Test 2 Regression");
    }

    @Test(groups = "Regression")
    public void Test7(){
        System.out.println("Test 7 Regression");
    }

    @Test(groups = "Regression")
    public void Test5(){
        System.out.println("Test 5 Regression");
    }

    // todo SmokeTest = Sistemin en genel haliyle calisirliginin testi
    @Test(groups = "SmokeTest")
    public void Test3(){
        System.out.println("Test 3 SmokeTest");
    }

    @Test(groups = "SmokeTest")
    public void Test4(){
        System.out.println("Test 4 SmokeTest");
    }

    @Test  // Grup olarak calistirdigimizda herhangi bir grubu olmayanlar calismayacak
    public void Test6(){
        System.out.println("Test 6");
    }


}
