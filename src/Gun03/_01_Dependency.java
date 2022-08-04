package Gun03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency{
    /*
   interviewlarda sorulan bir konu : testlere öncelikleri nasıl verirsin ?
   priority, dependecy;   Nasıl kullanırsın ?
   1- priority =1 gibi sıralı rakamlar vererek bununla çalışma sırasını belirtirim.
   2- dependOnMethods : bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.
      bir metodu direkt çalıştırdığınızda kendinden önce bağımlı 1  metod var ise ototmaitk onları
      önce çağırıp sonra kendisi çalışır. Fakat 2 veya daha fazla tane var ise bağımlı olduğu metod ozaman çalışamaz.
 */

    @Test
    void startCar(){
        System.out.println("Car Start");
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("car drive");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar","driveCar"})
    void parkCar(){
        System.out.println("car parked");
    }

    @Test(dependsOnMethods = {"parkCar"}, alwaysRun = true)
    void stopCar(){
        System.out.println("Car stop");
    }

}
