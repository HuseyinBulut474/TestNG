package Gun07;

import Utils.GenelWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_PlaceOrderPOM extends GenelWebDriver {

    @Test
    void ProceedToCheckout() {

        _03_PlaceOrderElements elements=new _03_PlaceOrderElements(driver);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        elements.searchBox.sendKeys("ipod");
        elements.searchButton.click();
        elements.addToCart.click();
        elements.shoppingCart.click();
        elements.checkOut.click();
        jse.executeScript("arguments[0].scrollIntoView()", elements.continue1);
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue1)).click();
        jse.executeScript("arguments[0].scrollIntoView()", elements.continue2);
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue2)).click();
        jse.executeScript("arguments[0].scrollIntoView()", elements.continue3);
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue3)).click();
        elements.agree.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue4)).click();
        elements.confirm.click();

        wait.until(ExpectedConditions.urlContains("success"));
        Assert.assertEquals(elements.confirmTxt.getText(),"Your order has been placed!","Karşılaştırma Sonucu : ");
    }
}
