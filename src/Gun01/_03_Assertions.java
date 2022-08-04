package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    // Yeşil tik : test de hata yok
    // Sarı çarpi : test de hata var
    // Beyaz  : test çalıştırılmadı.skip

    @Test
    void EqualOrnek(){
        String s1="Merhaba";
        String s2="İyi akşamlar";
        //oluşan, Beklenen "hata başlığı"
        Assert.assertEquals(s1,s2,"Karşılaştırma Sonucu");
        //Actual : olan
        // Expected : Beklenen
    }
    @Test
    void NotEqualOrnek(){
        String s1="Merhaba";
        String s2="İyi akşamlar";
        Assert.assertNotEquals(s1,s2,"Karşılaştırma sonucu");
    }

    @Test
    void TrueOrnek(){
        int s1=55;
        int s2=55;
        Assert.assertTrue(s1==s2,"Karşılaştırma sonucu");
    }

    @Test
    void BooleanOrnek(){
        String s1= null;
        Assert.assertNull(s1,"Karşılaştırma Sonucu");
    }

    @Test
    void directFail(){
        Assert.fail();
    }
}
