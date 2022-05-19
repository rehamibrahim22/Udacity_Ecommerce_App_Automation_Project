package StepDefinitions;

import Pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SD09_Add_products_ShoppingCart_StepDefinition {

    WebDriver driver;
    ShoppingCartPage shop= new ShoppingCartPage();

    @When("Add products to shopping cart")
    public void add_products_ShoppingCart() throws InterruptedException {
        int listSize = shop.list_AddToCart_Buttons_in_Grid().size();
        System.out.println("List display " + listSize + " items");
        if (listSize > 0) {

            shop.list_AddToCart_Buttons_in_Grid().get(1).click();
            Thread.sleep(3000);
            shop.list_AddToCart_Buttons_in_Grid().get(2).click();
            Thread.sleep(3000);
        } else
            System.out.println("No item display in the Result");

    }

    @Then("Add to cart confirmation message displayed")
    public void successfulMessageDisplayed() {
        String actualResult = shop.addToCartConfirmationMessage().getText();
        String expectedResult = "The product has been added to your ";
        Assert.assertEquals(true, actualResult.contains(expectedResult));
    }
    @And("get quantity of products in shopping cart link in header")
    public void retrieve_Quantity_of_products() {
        String stringQuantity = shop.quantity_of_ShoppingCart().getText();
        String[] quantity_Parts1 = stringQuantity.split("\\(");
        String[] quantity_Part2 = quantity_Parts1[1].split("\\)");
        String QuantityStr = quantity_Part2[0];
        System.out.println("Quantity of product(s) is/are " + QuantityStr);
        int quantityInt = Integer.parseInt(QuantityStr);

        Assert.assertTrue(quantityInt > 0);
        System.out.println("quantity of products are more than 0 ");
    }

}
