package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePage {
    public WebDriver driver;



    public WebElement computersmainmenu()
    {
        By computersmainmenu = By.cssSelector("a[href=\"/computers\"]");
        return Hooks.driver.findElement(computersmainmenu);

        //return By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a");
    }
    public WebElement computers_Sub_desktops()
    {
        //By computers_Sub_desktops =By.cssSelector("a[href=\"/desktops\"]");
        By computers_Sub_desktops =By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]");
        return Hooks.driver.findElement(computers_Sub_desktops);

        //return By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a");
    }
    public By header_Title()
    {
     return By.xpath("//div[@class=\"page-title\"]/h1");

    }
    public By CurrencyDropdown()
    {
        return By.id("customerCurrency");
    }

    public WebElement searchTextBox()
    {
        By searchTextBx= By.id("small-searchterms");
        return Hooks.driver.findElement(searchTextBx);
    }
    public List<WebElement> list_Items_in_Grid()
    {
   List<WebElement> list_Items  =  Hooks.driver.findElement(By.className("item-grid")).findElements(By.className("item-box"));
          return list_Items;
    }

    public WebElement Slider(String SliderNumber)
    {
       //return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child("+SliderNumber+")"));
        return Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a["+SliderNumber+"]"));
    }


    public List<WebElement> list_WishList_Buttons_in_Grid()
    {
        List<WebElement> WishList_Buttons  =  Hooks.driver.findElements(By.cssSelector("button[title=\"Add to wishlist\"]"));
                //driver.findElement(By.className("item-grid")).findElements(By.className("item-box"));
        return WishList_Buttons;
    }


    public WebElement wishListConfirmationMessage()
    {
       // By confirmationMessage= By.xpath("//*[@id=\"bar-notification\"]/div");
        By confirmationMessage= By.cssSelector("div[class=\"bar-notification success\"]");
        return Hooks.driver.findElement(confirmationMessage);
    }

    public WebElement faceBook_Link()
    {
        By fBLink= By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]");
        return  Hooks.driver.findElement(fBLink);

    }

    public WebElement youtube_Link()
    {
        By youtube= By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]");
        return  Hooks.driver.findElement(youtube);

    }
    public WebElement twitter_Link()
    {
        By twitter= By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]");
        return  Hooks.driver.findElement(twitter);

    }
    public WebElement RSS_Link()
    {
        By RSS= By.cssSelector("a[href=\"/news/rss/1\"]");
        return  Hooks.driver.findElement(RSS);

    }


    public WebElement wishList_Link()
    {
        By wishlist= By.className("ico-wishlist");
        return Hooks.driver.findElement(wishlist);
    }
    public WebElement quantity_of_WishList()
    {
        By qtyWishList= By.cssSelector("a>span[class=\"wishlist-qty\"]");
        return Hooks.driver.findElement(qtyWishList);
    }

}
