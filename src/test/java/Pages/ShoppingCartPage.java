package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCartPage {
    public WebDriver driver;



    public List<WebElement> list_AddToCart_Buttons_in_Grid()
    {
        List<WebElement> AddToCart_Buttons  =  Hooks.driver.findElements(By.className("product-box-add-to-cart-button"));
        //driver.findElement(By.className("item-grid")).findElements(By.className("item-box"));
        return AddToCart_Buttons;
    }

    public WebElement addToCartConfirmationMessage()
    {
        By confirmationMessage= By.xpath("//*[@id=\"bar-notification\"]/div");
        //By confirmationMessage= By.cssSelector("div[id=\"bar-notification\"][class=\"bar-notification\"]");
        return Hooks.driver.findElement(confirmationMessage);
    }

    public WebElement quantity_of_ShoppingCart()
    {
        By qtyShoppingCart= By.cssSelector("a>span[class=\"cart-qty\"]");
        return Hooks.driver.findElement(qtyShoppingCart);
    }
}
