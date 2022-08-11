package Gun07;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {

    @Test
    void hardAssert(){
        String s1="Merhaba";

        System.out.println("Hard assert öncesi");
        Assert.assertEquals("Merhaba 123",s1,"HardAssert Sonucu");
        System.out.println("Hard assert Sonrası"); //hard assert hata verdiğinde sonrası çalışmaz
    }

    @Test
    void softAssert(){
        String strHomePage="www.facebook.com/homepage";
        String strCardPage="www.facebook.com/cardpage";
        String strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert _softAssert=new SoftAssert();
        _softAssert.assertEquals("www.facebook.com/homepage",strHomePage);//true
        System.out.println("Assert 1");

        _softAssert.assertEquals("www.facebook.com/profile",strCardPage);// fail
        System.out.println("Assert 2");

        _softAssert.assertEquals("www.facebook.com/settings",strEditAccount);// fail
        System.out.println("assert 3");

        _softAssert.assertAll();// bütün assert sonuçlarını işleme koyuyor
        System.out.println("Aktiflik Sonrası");// bu bölüm assertAll dan sonra olduğu için yazılmadı

    }
}
