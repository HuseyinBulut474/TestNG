package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {



    @Test(dataProvider = "getData")
    void UsurnameTest(String usurname, String password){// buraya her iki datayı tanımlaman lazım

        System.out.println("usurname = " + usurname+ " password " + password);
    }


    @DataProvider
    public Object[][] getData(){// iki bpyutlu yaparak usurname password gönderebiliyoruz

        Object[][] data={{"Nurhayat","12345"},{"Zehra","18545"},{"Gülcan","258543"},{"Zeynep","467245"}};
        return data;
    }
}
