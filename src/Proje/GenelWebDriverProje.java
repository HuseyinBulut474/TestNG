package Proje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GenelWebDriverProje {

    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public void BaslangicIslemleri(){
        System.out.println("Driver start ....");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "/Users/metinhasal/Desktop/Selenium/ChromeDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // max
        driver.manage().deleteAllCookies();  //

        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // bütün webElement için geçerli

        driver.get("http://demowebshop.tricentis.com/");

        //LoginTest();
    }

    @AfterClass
    public void BitisIslemleri() {
        System.out.println("Driver stop ....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    @Test
    void LoginTest(){

        WebElement signIn = driver.findElement(By.className("login"));
        signIn.click();

        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("grup22@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("passwd"));
        inputPassword.sendKeys("12345622g");

        WebElement loginGiris = driver.findElement(By.cssSelector("[class^='icon-lock']"));
        loginGiris.click();

    }
}