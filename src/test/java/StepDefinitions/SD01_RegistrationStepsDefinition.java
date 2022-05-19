package StepDefinitions;

import Pages.RegistrationPage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SD01_RegistrationStepsDefinition {

    WebDriver driver;
    RegistrationPage registerPage;
    LoginPage login;
/*
    @Given("user open Chrome browser")
    public void user_open_browser() throws InterruptedException {
        String chromepath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromepath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(3000);

    }

 */
    @Given("navigate to Register URL")
    public void navigate_register_page() throws InterruptedException {
        registerPage = new RegistrationPage();
       // login= new LoginPage(driver);
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
        Thread.sleep(3000);
    }


    @When("^user enter \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
public void Register_Data(String gender,String fN,String lN,String day,String month,String year,String email,String pass,String passConf)
    {
        registerPage.registerSteps(gender,fN,lN,day,month,year,email,pass,passConf);
    }

    @And("enter on Register button")
    public void register_button()throws InterruptedException
    {
        Hooks.driver.findElement(registerPage.registerButton()).click();
        Thread.sleep(3000);

    }

    @Then("user could Register successfully")
    public void register_confirmation()
    {
        String actualResult = Hooks.driver.findElement(registerPage.registerMessage()).getText();
        System.out.println(actualResult);
        String expectedResult=   "Your registration completed";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(true,actualResult.contains(expectedResult));
        System.out.println("The confirmation message displayed Successfully");
        String actualColor= Hooks.driver.findElement(registerPage.registerMessage()).getCssValue("color");
        String expectedColor= "rgba(76, 177, 124, 1)";
        Assert.assertEquals(true,actualColor.equals(expectedColor));

        System.out.println("the actual color is "+ actualColor);
        System.out.println("the expected color is "+ expectedColor);

    }
    @And("user click on Continue button")
    public void click_continue_button()
    {
        Hooks.driver.findElement(registerPage.continueButton()).click();
    }
//@And("user click on Log out Link")
  //  public void logoutLink()
//{
  //  driver.findElement(registerPage.log_out_link()).click();
//}
}