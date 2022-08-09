package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {

    /**
     * Aşağıdaki ikli ile Dataproviderın içindeki bütün veriler tek tek test e gönderilerek
     * data sayısı kadar test çalıştırılı, dataların olduğu yere DataProvider annottion ı konur.
     * çalıştırılacak teste ise dataProvider = "getData"  bölümü eklenir.
     */

    //burda eşleştirme getData ismile oluyor
    @Test(dataProvider = "getData")
    void UsurnameTest(String usurname){

        System.out.println("usurname = " + usurname);
    }


    @DataProvider
    public Object[] getData(){

        Object[] data={"Nurhayat","Zehra","Gülcan","Zeynep"};

        return data;
    }



    //burda userlar diye isim ekledik öyle eşleştirme yaptık
    @Test(dataProvider = "userlar")
    void UsurnameTest2(String usurname){

        System.out.println("usurname = " + usurname);
    }


    @DataProvider(name="userlar")
    public Object[] getData2(){

        Object[] data={"Nurhayat","Zehra","Gülcan","Zeynep"};

        return data;
    }
}
