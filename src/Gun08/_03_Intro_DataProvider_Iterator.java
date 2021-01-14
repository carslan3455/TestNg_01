package Gun08;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_Intro_DataProvider_Iterator {

    @Test(dataProvider = "getData")
    public void UsernameTest(String username) {

        System.out.println(username );

    }


    @DataProvider
    public Iterator<Object> getData() {
        List<Object> data = new ArrayList<>();
        data.add("Ahmet");
        data.add("Ayse");
        data.add("Ali");
        data.add("Fatma");

        return data.iterator();
    }
}
