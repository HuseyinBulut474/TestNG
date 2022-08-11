package Gun08;

import Gun07._03_PlaceOrderElements;
import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
    Senaryo ;
    1- Siteye gidiniz..
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */
public class _01_WishList extends GenelWebDriver {

    @Parameters("itemName")
    @Test
    void addToWishList(String aranacakUrun) {
        Gun07._03_PlaceOrderElements poe=new _03_PlaceOrderElements(driver);
        poe.searchBox.sendKeys(aranacakUrun);
        poe.searchButton.click();

        _02_WishListWebElements wle = new _02_WishListWebElements(driver);
        int rndNumber= Tools.RandomGenerator(wle.searchResults.size());
        String rndUrunAd=wle.searchResults.get(rndNumber).getText();
        wle.wishBtnList.get(rndNumber).click();
        wle.btnWish.click();

        boolean bulundu=false;
        for (WebElement e :wle.tebleNames){
            if (e.getText().equals(rndUrunAd)){
                bulundu=true;
                break;
            }
        }
        Assert.assertTrue(bulundu);

    }
}
