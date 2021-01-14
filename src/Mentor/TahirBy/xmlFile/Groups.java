package Mentor.TahirBy.xmlFile;

import org.testng.annotations.Test;

public class Groups {

    @Test(groups = "Regressions")
    public void test1(){
        System.out.println("Test 1 working");
    }

    @Test(groups = "Smoke")
    public void test2(){
        System.out.println("Test 2 working");
    }

    @Test(groups = "Regressions")
    public void test3(){
        System.out.println("Test 3 working");
    }

    @Test(groups = "Smoke")
    public void test4(){
        System.out.println("Test 4 working");
    }

    @Test(groups = "Regressions")
    public void test5(){
        System.out.println("Test 1 working");
    }

    @Test(groups = "Smoke")
    public void test6(){
        System.out.println("Test 2 working");
    }

    @Test(groups = "Regressions")
    public void test7(){
        System.out.println("Test 3 working");
    }
}
