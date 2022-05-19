package StepDefinitions;

import Pages.ProductDetailsPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SD08_Add_product_WishList_StepDefinition {

    WebDriver driver;
    ProductDetailsPage productDetails = new ProductDetailsPage();
    HomePage home = new HomePage();

    @Given("^select \"(.*)\" size$")
    public void selectSize(String size) throws InterruptedException {

        Select sizeSelect = new Select(productDetails.sizeDropDown());
        sizeSelect.selectByVisibleText(size);
        Thread.sleep(3000);

    }
    @When("Add products to WishList")
    public void AddItemsInList_ToWishList()throws InterruptedException
    {
        int listSize = home.list_WishList_Buttons_in_Grid().size();
        System.out.println("List display " + listSize + " items");
        if (listSize > 0) {

            home.list_WishList_Buttons_in_Grid().get(1).click();
            Thread.sleep(3000);
            home.list_WishList_Buttons_in_Grid().get(2).click();
            Thread.sleep(3000);
        } else
            System.out.println("No item display in the Result");

    }

    @Then("Success message displayed")
    public void successfulMessageDisplayed() {
        Assert.assertTrue(home.wishListConfirmationMessage().isDisplayed());
        String actualResult = home.wishListConfirmationMessage().getText();
        String expectedResult = "The product has been added to your ";
        Assert.assertEquals(true, actualResult.contains(expectedResult));
    }

    @And("go to wishlist page")
    public void open_WishList_Page() throws InterruptedException {
        home.wishList_Link().click();
        Thread.sleep(3000);
    }

    @And("Confirm quantity of products in the wishlist link in header more than zero")
    public void retrieve_Quantity_of_products() {
        String stringQuantity = home.quantity_of_WishList().getText();
        String[] quantity_Parts1 = stringQuantity.split("\\(");
        String[] quantity_part2 = quantity_Parts1[1].split("\\)");
        String QuantityStr = quantity_part2[0];
        System.out.println("Quantity of product(s) is " + QuantityStr);
        int quantityInt = Integer.parseInt(QuantityStr);

        Assert.assertTrue(quantityInt > 0);
        System.out.println("quantity of products more than 0 ");
    }
}

