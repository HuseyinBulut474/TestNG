package Gun05;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimeini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız
     */

public class _03_SearchFunctionality extends GenelWebDriver {

    @Parameters("arananKelime")
    @Test
    void SearchFunction(String txtSearch) {

        WebElement search= driver.findElement(By.name("search"));
        search.sendKeys(txtSearch);

        WebElement btn= driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        btn.click();

        List<WebElement> elements=driver.findElements(By.linkText("h4>a"));

        for (WebElement e:elements)
            Assert.assertTrue(e.getText().toLowerCase().contains(txtSearch));
    }
}
