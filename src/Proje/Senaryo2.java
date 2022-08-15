package Proje;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Senaryo2 extends GenelWebDriverProje {

    @Test
    void login() {

    Senaryo1_Elements elements = new Senaryo1_Elements(driver);

        elements.logIn.click();
        elements.emailBox.sendKeys("grup24deneme@gmail.com");
        elements.passwordBox.sendKeys("12345622g");

        elements.logInBtn.click();

        Assert.assertTrue(elements.userNameInvalid.getText().contains("unsuccessful"));
}
    }

