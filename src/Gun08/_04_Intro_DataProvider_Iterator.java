package Gun08;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _04_Intro_DataProvider_Iterator {

    @Test(dataProvider = "getData2")
    public void UsernameTest2(String username, String password) {

        System.out.println(username+" "+password);

    }

    /**  **************    todo 2 Boyutlu      * *************  */

    @DataProvider
    public Iterator<Object[]> getData2() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"Ali","xyz"});        //todo List in her bir elemani Object dizisi oldugu icin Object dizisi eklendi
        data.add(new Object[]{"Mehmet","abc"});
        data.add(new Object[]{"Ayse","bcd"});



        return data.iterator();
    }
}
