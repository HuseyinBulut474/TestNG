package Proje;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Senaryo1_Elements {


    public Senaryo1_Elements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy (linkText = "Log in")
    public WebElement logIn;

    @FindBy (id = "Email")
    public WebElement emailBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy (css = "input[type='submit'][value='Log in']")
    public WebElement logInBtn;

    @FindBy (linkText = "grup22@gmail.com")
    public WebElement userNameVerify;

    @FindBy (css = "[class='validation-summary-errors']>span")
    public WebElement userNameInvalid;

    @FindBy (css = "[onclick*='31']")
    public WebElement addproduct1;

    @FindBy (linkText = "shopping cart")
    public WebElement shoppingCart;

    @FindBy (id = "termsofservice")
    public WebElement aggreeBtn;

    @FindBy (css = "[class='button-1 checkout-button']")
    public WebElement checkOutBtn;

    @FindBy (css = "[onclick='Billing.save()']")
    public WebElement ctnBtn;

    @FindBy (id = "PickUpInStore")
    public WebElement checkBox;

    @FindBy (css = "[onclick='Shipping.save()']")
    public WebElement ctnBtn2;

    @FindBy (id = "paymentmethod_1")
    public WebElement paymentMethod2;

    @FindBy (css = "[onclick='PaymentMethod.save()']")
    public WebElement ctnBtn3;

    @FindBy (css = "[onclick='PaymentInfo.save()']")
    public WebElement ctnBtn4;

    @FindBy (css = "[onclick='ConfirmOrder.save()']")
    public WebElement ctnBtn5;



}
