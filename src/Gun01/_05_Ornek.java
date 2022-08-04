package Gun01;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _05_Ornek extends GenelWebDriver {
    /*
   Senaryo ;
     1- http://opencart.abstracta.us/index.php?route=account/login  sitesini açınız.
     2- bulut@gmail.com  ve bulut4747   bilgileri ile login olan test metodunu yazınız.
     3- Login olup olmadığınızı assert ile kontrol ediniz.
   bulut@gmail.com
   bulut4747
 */
    @Test
    void LoginTest(){

        WebElement inputEmail= driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("bulut@gmail.com");

        WebElement inputPassword= driver.findElement(By.id("input-password"));
        inputPassword.sendKeys("bulut4747");

        WebElement loginBtn= driver.findElement(By.cssSelector("input[value='Login']"));
        loginBtn.click();

    }
}
