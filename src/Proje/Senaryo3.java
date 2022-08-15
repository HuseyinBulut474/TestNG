package Proje;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Senaryo3 extends GenelWebDriverProje {


        @Test
        void PlaceAnOrder(){

        Senaryo1_Elements elements = new Senaryo1_Elements(driver);
        elements.logIn.click();
        elements.emailBox.sendKeys("grup22@gmail.com");
        elements.passwordBox.sendKeys("12345622g");
        elements.logInBtn.click();
        elements.addproduct1.click();
        elements.shoppingCart.click();
        elements.aggreeBtn.click();
        elements.checkOutBtn.click();
        elements.ctnBtn.click();
        elements.checkBox.click();
        elements.ctnBtn2.click();
        elements.paymentMethod2.click();
        elements.ctnBtn3.click();
        elements.ctnBtn4.click();
        elements.ctnBtn5.click();
        Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),' been succes')]")).getText().contains("success"));

    }
}
