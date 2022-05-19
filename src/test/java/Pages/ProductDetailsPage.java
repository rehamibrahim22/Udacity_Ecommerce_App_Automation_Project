package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage {

    public WebDriver driver;


    public WebElement sizeDropDown()
    {
        By sizeDropDown= By.id("product_attribute_11");
        return Hooks.driver.findElement(sizeDropDown);
    }
    public WebElement wishListButton()
    {
        By wishListButton= By.id("add-to-wishlist-button-27");
        return Hooks.driver.findElement(wishListButton);
    }



}
