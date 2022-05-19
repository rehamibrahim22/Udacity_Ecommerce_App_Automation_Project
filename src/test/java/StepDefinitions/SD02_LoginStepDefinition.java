package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class SD02_LoginStepDefinition {

    WebDriver driver;
   LoginPage login= new LoginPage();
    //RegistrationPage registerPage;

    @Given("navigate to login URL")
    public void navigate_login_Page()
    {
       // login= new LoginPage();
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @When("^enter \"(.*)\" and \"(.*)\"$")
    public void Enter_valid_Data(String email,String pass)
    {
        login.loginSteps(email,pass);

    }

   @Then("user could login successfully")
    public void login_successfully()
    {
        SoftAssert soft= new SoftAssert();
        soft.assertTrue(Hooks.driver.findElement(login.logoutLink()).isDisplayed());
        soft.assertTrue(Hooks.driver.findElement(login.myAccountLink()).isDisplayed());
        soft.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"),true);
        soft.assertAll();

    }
    @And("user go to home page")
    public void go_homepage()
    {
        Assert.assertEquals("https://demo.nopcommerce.com/",Hooks.driver.getCurrentUrl());

    }
@And("user click on Log out Link")
        public void Logout_Link()
{
    Hooks.driver.findElement(login.logoutLink()).click();
}

}
