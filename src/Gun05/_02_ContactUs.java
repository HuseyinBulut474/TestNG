package Gun05;

import Utils.GenelWebDriver;
import Utils.ParametreWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */
public class _02_ContactUs extends GenelWebDriver {

    @Test
    @Parameters("mesaj")
    void Contact(String gelenMesaj){

        driver.findElement(By.linkText("Contact Us")).click();

        driver.findElement(By.id("input-enquiry")).sendKeys(gelenMesaj);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, document.documentElement.scrollHeight)");

        driver.findElement(By.xpath("//*[contains(@class,'buttons')]/div/input")).click();

        WebElement cntuslabl = driver.findElement(By.cssSelector("[id='content']>h1"));

        System.out.println(cntuslabl.getText());

        Assert.assertEquals("Contact Us",cntuslabl.getText(),"Karşılaştırma sonucu : ");

    }

}
