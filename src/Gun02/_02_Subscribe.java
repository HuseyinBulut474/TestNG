package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _02_Subscribe extends GenelWebDriver {
/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayı testlerde yapınız.
 */
    By link=By.linkText("Newsletter");
    By yes=By.cssSelector("input[value='1']");
    By no=By.cssSelector("input[value='0']");
    By cnt=By.cssSelector("input[value='Continue']");


    @Test(priority = 1)
    void subscribe(){

        WebElement newsletter= driver.findElement(link);
        newsletter.click();

        WebElement accept=driver.findElement(yes);
        accept.click();

        WebElement continu=driver.findElement(cnt);
        continu.click();

        Tools.successMessageValidation();
    }

    @Test(priority = 2)
    void nosubscribe(){

        WebElement newsletter= driver.findElement(link);
        newsletter.click();

        WebElement nobtn=driver.findElement(no);
        nobtn.click();

        WebElement continu=driver.findElement(cnt);
        continu.click();

        Tools.successMessageValidation();
    }

    @Test(priority = 3)
    void changesubscribe(){

        WebElement newsletter= driver.findElement(link);
        newsletter.click();

        WebElement yesbtn=driver.findElement(yes);
        WebElement nobtn=driver.findElement(no);
        if (yesbtn.isSelected())
            nobtn.click();
        else
            yesbtn.click();

        WebElement continu=driver.findElement(cnt);
        continu.click();

        Tools.successMessageValidation();
    }
}
