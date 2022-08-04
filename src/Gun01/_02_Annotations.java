package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {
    /*
        @BeforeClass --> Her class çalışıyorken önce burası çalışır
        @BeforeMethod --> Her method dan(test method) önce çalışır
           @Test
           @Test
        @AfterMethod --> Her metoddan(test method) sonra çalışır
        @AfterClass --> Her class çalışıyorken sonra burası çalışır
     */
    @BeforeClass
    void beforeClass(){
        System.out.println("Her classtan önce çalışacak : Before Class");}

    @BeforeMethod
    void BeforeMethod(){
        System.out.println("Her test method dan önce çalışacak : Before Method");}

    @AfterMethod
    void afterMethod(){
        System.out.println("Her test method dan sonra çalışacak : After Method");}

    @AfterClass
    void afterClass(){
        System.out.println("Her classdan sonra çalışacak : After Class");}

    @Test
    void test1(){System.out.println("Test 1 Çalıştı");}
    @Test
    void test2(){System.out.println("Test 2 Çalıştı");}

}
