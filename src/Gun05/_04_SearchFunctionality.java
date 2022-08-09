package Gun05;

import Utils.GenelWebDriver;
import Utils.ParametreWebDriver;
import org.omg.CORBA.ParameterMode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_SearchFunctionality extends ParametreWebDriver {

    @Parameters("arananKelime")
    @Test
    void SearchFunction(String txtSearch){

        WebElement searchInput = driver.findElement(By.cssSelector("[name='search']"));
        searchInput.sendKeys(txtSearch);

        WebElement searchButton = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> captions = driver.findElements(By.cssSelector("[class='product-thumb'] [class='caption'] a"));

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(txtSearch));
        }

    }
}
