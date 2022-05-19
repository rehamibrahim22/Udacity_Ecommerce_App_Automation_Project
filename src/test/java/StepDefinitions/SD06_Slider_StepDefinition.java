package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SD06_Slider_StepDefinition {
    WebDriver driver;
    WebDriverWait wait;
    HomePage home = new HomePage();

    @Given("click on first slider in home page")
    public void Click_iphone_slider()  {
        home.Slider("1").click();

    }
    @Then("confirm the slider redirect to iphone product page")
    public void first_slider_detailed_page_displayed() throws InterruptedException {
        Thread.sleep(3000);
        String expectedURL= "https://demo.nopcommerce.com/Ipone_s6";
        String actualURL = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(expectedURL,actualURL);
    }
@Given("click on second slider in home page")
public void Click_Nokia_slider() throws InterruptedException {
        Thread.sleep(2000);

    //home.Slider("1").click();
    //wait= new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));
    //wait.until(ExpectedConditions.visibilityOf(home.Slider("2")));
    //Hooks.driver.findElement(home.Slider("2")).click();
    home.Slider("2").click();

}
@Then("confirm the slider redirect to nokia page")
public void second_slider_detailed_page_displayed() throws InterruptedException {
    Thread.sleep(3000);
    String expectedURL= "https://demo.nopcommerce.com/nokia-lumia-1020";
    String actualURL = Hooks.driver.getCurrentUrl();

    Assert.assertEquals(expectedURL,actualURL);
}

}
