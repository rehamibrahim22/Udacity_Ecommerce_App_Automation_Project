package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
   public  WebDriver driver;

    /*public LoginPage() {
        this.driver = Hooks.driver;


    }*/

    public WebElement email() {
        By email = By.id("Email");

        return Hooks.driver.findElement(email);

    }

    public WebElement password() {
        By password = By.id("Password");

        return Hooks.driver.findElement(password);

    }

    public WebElement loginButton() {
        By login = By.className("login-button");
        return Hooks.driver.findElement(login);

    }
    public By logoutLink() {
        return By.cssSelector("a[href=\"/logout\"]");

    }
public By myAccountLink()
{
    return By.cssSelector("a[href=\"/customer/info\"][class=\"ico-account\"]");
}
    public void loginSteps(String email, String password) {

        email().sendKeys(email);
        password().sendKeys(password);
        password().sendKeys(Keys.ENTER);


    }

}