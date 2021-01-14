package Gun08;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_Intro_DataProvider {

    /**
     * Aşağıdaki ikli ile Dataproviderın içindeki bütün veriler tek tek test e gönderilerek
     * data sayısı kadar test çalıştırılı, dataların olduğu yere DataProvider annottion ı konur.
     * çalıştırılacak teste ise dataProvider = "getData"  bölümü eklenir.
     */

    @Test(dataProvider = "getData")  // bu test in dataProvider i getData methodu
    public void UsernameTest(String username) {

        System.out.println(username);

    }

    /**
     * Data provider must return Object[][] /Object[] or Iterator<Object[]>/Iterator<Object>
     */
    @DataProvider  // todo bu methoda dataprovider gorevi verildi
    public Object[] getData() {      // todo Dataprovider olarak kullanilacak methodun tipi Object olmak zorunda
        Object[] data = {
                "ahmet",
                "ayse",
                "mehmet",
                "fatma"
        };

        return data;
    }


    /***************************************************     */

    @Test(dataProvider = "UsersDataProvider")           // method adi yada DataProvider name yazilabilir
    public void UsernameTest2(String username) {

        System.out.println(username);

    }

    @DataProvider(name = "UsersDataProvider")   // todo DataProvider isim verdik
    public Object[] getData2() {
        Object[] data = {
                "ahmet2",
                "ayse2",
                "mehmet2",
                "fatma2"
        };

        return data;
    }

}
