package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _03_EditAccount extends GenelWebDriver {
    /*
      1- Siteyi açınız.
      2- Edit Account a tıklatınız.
      3- Yeni isim ve soyisim göndererek Continue yapınız.
      4- İşlem sonucunu kontrol ediniz.
      5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
     */
    By link=By.linkText("Edit Account");
    By first=By.name("firstname");
    By last=By.name("lastname");
    By cnt=By.cssSelector("[type='submit']");


    @Test(priority = 1)
    void EditAccount(){
        WebElement newsletter= driver.findElement(link);
        newsletter.click();
        WebElement name=driver.findElement(first);
        name.clear();
        name.sendKeys("Zehra");
        WebElement surname=driver.findElement(last);
        surname.clear();
        surname.sendKeys("Yılmaz");
        WebElement continu=driver.findElement(cnt);
        continu.click();
        Tools.successMessageValidation();
    }

    @Test(priority = 2)
    void EditBackAccount(){
        WebElement newsletter= driver.findElement(link);
        newsletter.click();
        WebElement name=driver.findElement(first);
        name.clear();
        name.sendKeys("Hüseyin");
        WebElement surname=driver.findElement(last);
        surname.clear();
        surname.sendKeys("Bulut");
        WebElement continu=driver.findElement(cnt);
        continu.click();
        Tools.successMessageValidation();
    }
}
