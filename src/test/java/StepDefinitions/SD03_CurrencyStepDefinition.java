package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SD03_CurrencyStepDefinition {

    WebDriver driver;
    HomePage home= new HomePage();

    @Given("Click on currency dropdown")
    public void selectCurrency()
    {
        Hooks.driver.findElement(home.CurrencyDropdown()).click();
    }
    @Then("select Euro from currency")
    public void changeCurrency() throws InterruptedException {
        Select currencySelect= new Select(Hooks.driver.findElement(home.CurrencyDropdown()));
        currencySelect.selectByVisibleText("Euro");
        Thread.sleep(3000);
        System.out.println("EURO currency selected successfully");
    }
}
