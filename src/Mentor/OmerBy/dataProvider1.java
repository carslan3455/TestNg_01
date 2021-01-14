package Mentor.OmerBy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider1 {

    @Test(dataProvider = "dataProviderMethod")
    public void testMethod1(String username,String password) {

        System.out.println("1.Yöntem : 2 datali Method calisiyor");
        System.out.println( username+" " + password);


    }

    @Test(dataProvider = "dataProviderMethod2")
    public void testMethod2(String username,String password) {

        System.out.println("2.Yöntem : 2 datali Method calisiyor");
        System.out.println( username+" " + password);


    }

    @Test(dataProvider = "myData")
    public void testMethod2(String username) {

        System.out.println("Bir datali Method calisiyor" + username);

    }


    @DataProvider
    public Object[][] dataProviderMethod() {
        Object[][] data = {
                {"data1", "pass1"},
                {"data2", "pass2"}
        };
        return data;
    }
    @DataProvider
    public Object[][] dataProviderMethod2() {
        Object[][] data = new Object[3][2];
        data[0][0] = "omer12";
        data[0][1] = "password1";
        data[1][0] = "cigdem12";
        data[1][1] = "password2";
        data[2][0] = "huseyin12";
        data[2][1] = "password3";
        return data;
    }

    @DataProvider(name="myData")
    public Object[] data1() {
        Object[] data =  {"data1","data2","data3"};

        return data;
    }


}
