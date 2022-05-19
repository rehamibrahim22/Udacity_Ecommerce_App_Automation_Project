package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class SD05_Search_productStepDefinition {

    WebDriver driver;
    HomePage home = new HomePage();
    SoftAssert soft= new SoftAssert();
    //public String product;


    @Given("^insert \"(.*)\" in search textbox$")
    public void insertProductNameOrSKU(String product) throws InterruptedException {
        home.searchTextBox().sendKeys(product);
        home.searchTextBox().sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        System.out.println(Hooks.driver.getCurrentUrl());
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(product));
    }

    @Then("^click on first item in the result if exist$")
    public void clickOnFirstItem() throws InterruptedException {

        int listSize = home.list_Items_in_Grid().size();
        soft.assertTrue(listSize > 0);

        System.out.println("List display " + listSize + " item(s)");
        home.list_Items_in_Grid().get(0).click();
        Thread.sleep(3000);
        soft.assertAll();

    }

   /* @Then("click on product in result")
    public void retriveProductbySKU() throws InterruptedException {
        int listSize = home.list_Items_in_Grid().size();
        if (listSize > 0) {
            System.out.println("List display " + listSize + " items");
            home.list_Items_in_Grid().get(0).click();
            Thread.sleep(3000);
        } else
            System.out.println("there is no item with this SKU");
    }*/
}