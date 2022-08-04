package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {


    // Eğer test metodalarına sıralama vermezsen alfabetik sıraya göre çalışır...

    @Test(priority = 1) // annotation'lar denir
    void webSitesiniac(){
        System.out.println("Driver tanımlandı ve web sitesi açıldı");
    }


    @Test(priority = 2)
    void LoginTestIslemleriniYap(){
        System.out.println("Login test işlemleri yapıldı");
    }


    @Test(priority = 3)
    void driverKapat(){
        System.out.println("Driver kapatıldı ve çıkıldı");
        //yeşil tik hatalı assertion yok demek
    }

}
