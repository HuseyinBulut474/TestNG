package Gun03;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class _02_AddressFunctionality extends GenelWebDriver {
    /*
           Senaryo;
           1- Siteyi açınız.
           2- Adress Ekleyiniz.
           3-En son eklenen adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
           4- En son eklenen adresi siliniz.

     */
    @Test
    void newAdress(){
        WebElement adress= driver.findElement(By.xpath("//*[text()='Address Book']"));
        adress.click();

        WebElement newadress= driver.findElement(By.xpath("//*[text()='New Address']"));
        newadress.click();

        WebElement name=driver.findElement(By.id("input-firstname"));
        name.sendKeys("Hüseyin");

        WebElement lastname=driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Bulut");

        WebElement company=driver.findElement(By.id("input-company"));
        company.sendKeys("TechnoStudy");

        WebElement adress1=driver.findElement(By.id("input-address-1"));
        adress1.sendKeys("Esenler mah.");

        WebElement adress2=driver.findElement(By.id("input-address-2"));
        adress2.sendKeys("bilinmez cadd. no:9");

        WebElement city=driver.findElement(By.id("input-city"));
        city.sendKeys("İstanbul");

        WebElement post=driver.findElement(By.id("input-postcode"));
        post.sendKeys("34000");

        WebElement country=driver.findElement(By.id("input-country"));
        Select menu=new Select(country);
        menu.selectByVisibleText("Turkey");

        WebElement zone=driver.findElement(By.id("input-zone"));
        Select menu1=new Select(zone);
        menu1.selectByVisibleText("İstanbul");

        WebElement suscribe=driver.findElement(By.cssSelector("input[value='0']"));
        suscribe.click();

        WebElement cnt=driver.findElement(By.cssSelector("input[value='Continue']"));
        cnt.click();

        Tools.successMessageValidation();

    }

    @Test(dependsOnMethods = {"newAdress"})
    void edtAdress(){

        WebElement edit= driver.findElement(By.xpath("//*[text()='Edit']"));
        edit.click();

        WebElement name=driver.findElement(By.id("input-firstname"));
        name.clear();
        name.sendKeys("Zeynep");

        WebElement lastname=driver.findElement(By.id("input-lastname"));
        lastname.clear();
        lastname.sendKeys("Yılmaz");

        WebElement cnt=driver.findElement(By.cssSelector("input[value='Continue']"));
        cnt.click();

        WebElement delete= driver.findElement(By.xpath("//*[text()='Delete']"));
        delete.click();


        Tools.successMessageValidation();

    }
}
 /*
       WebElement country=driver.findElement(By.id("input-country"));
       Select countryS=new Select(country);
       countryS.selectByIndex(10);

       WebElement State=driver.findElement(By.id("input-zone"));
       Select state=new Select(State);
       System.out.println("state.getOptions().size() 1 = " + state.getOptions().size());

       wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("[id='input-zone']>option"),
                   state.getOptions().size()));
       // option ların sayısı ilk halinden küçük olana kadar bekle : yeni durum gelene kadar bekle

       System.out.println("state.getOptions().size() 2 = " + state.getOptions().size());

       State=driver.findElement(By.id("input-zone"));
       state=new Select(State);

//       System.out.println("state.getOptions().size() = " + state.getOptions().size());
//       for(WebElement e: state.getOptions())
//           System.out.println(e.getText());

       state.selectByIndex(3);
       */