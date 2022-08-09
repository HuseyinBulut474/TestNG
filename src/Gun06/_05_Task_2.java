package Gun06;

import Utils.ParametreWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _05_Task_2 extends ParametreWebDriver {
    /**
     * Bir önceki task da yapılan testi PARAMETERDRIVER ile yapınız
     * sonrasında fakrlı tarayıcılar ile çalıştırınız.
     * sonrasında paralel çalıştırınız.
     */

    @Test(dataProvider = "getData")
    void SearchFunction(String txtSearch){
        WebElement searchInput = driver.findElement(By.cssSelector("[name='search']"));
        searchInput.clear();
        searchInput.sendKeys(txtSearch);

        WebElement searchButton = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> captions = driver.findElements(By.cssSelector("[class='product-thumb'] [class='caption'] a"));

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(txtSearch));
        }
    }


    @DataProvider
    public Object[] getData(){

        Object[] data={"mac","samsung","ipod"};

        return data;
    }
}
