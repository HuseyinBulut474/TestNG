package Gun06;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _06_Task_3 extends GenelWebDriver {
/*
   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun sayisi ile indirimli urun sayisi ayni mi dogrulayiniz
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
*/

    @Test
    void specialValidation(){
        WebElement spc = driver.findElement(By.linkText("Specials"));
        spc.click();

        List<WebElement> oldPriceList = driver.findElements(By.className("price-old"));
        List<WebElement> productList = driver.findElements(By.className("product-thumb"));

        Assert.assertEquals(productList.size(),oldPriceList.size());

        List<WebElement> newPriceList=driver.findElements(By.cssSelector("span[class='price-new']"));

        for(int i=0;i< newPriceList.size() ; i++)
            Assert.assertTrue(Tools.WebElementToDouble(newPriceList.get(i)) <
                    Tools.WebElementToDouble(oldPriceList.get(i))  );

    }
}
