package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProvider_Iterator {


    @Test(dataProvider = "getData")
    void UsurnameTest(String usurname){

        System.out.println("usurname = " + usurname);
    }


    @DataProvider
    public Iterator<Object> getData(){

        List<Object> data=new ArrayList<>();
        data.add("Nurhayat");
        data.add("Zehra");
        data.add("Gülcan");
        data.add("Zeynep");

        return data.iterator();
    }

    @Test(dataProvider = "getData2")
    void UsurnameTest2(String usurname, String password){

        System.out.println("usurname = " + usurname + "  password= "+ password);
    }


    @DataProvider
    public Iterator<Object[]> getData2(){

        List<Object[]> data=new ArrayList<>();
        data.add(new Object[]{"Nurhayat","563425"});
        data.add(new Object[]{"Zehra","24356"});
        data.add(new Object[]{"Gülcan","1829378"});
        data.add(new Object[]{"Zeynep","98267"});

        return data.iterator();
    }
}
