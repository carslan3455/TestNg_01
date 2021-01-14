package Gun08;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_Intro_DataProvider {

    @Test(dataProvider = "getData2")
    public void UsernameTest2(String username, String password) {

        System.out.println(username + " " + password);

    }

    /**  **************    todo 2 Boyutlu      * *************  */

    @DataProvider
    public Object[][] getData2() {
        Object[][] data = {
                {"ahmet", "abc"},
                {"ayse", "xyz"},
                {"mehmet", "bcd"}
        };

        return data;
    }
}
