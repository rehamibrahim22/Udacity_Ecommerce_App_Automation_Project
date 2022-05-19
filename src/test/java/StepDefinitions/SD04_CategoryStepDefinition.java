package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SD04_CategoryStepDefinition {
    WebDriver driver;
    HomePage home= new HomePage();
String sub_Menu_Name;

    @Given("hover on Computers main menu and click on Desktops")
    public void hoverAndClickSubMenu() throws InterruptedException {

        WebElement ComputersMainMenu= home.computersmainmenu();
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(ComputersMainMenu);

        WebElement desktops_sub_Menu= home.computers_Sub_desktops();
        actions.moveToElement(desktops_sub_Menu).perform();
        Thread.sleep(3000);

        sub_Menu_Name = home.computers_Sub_desktops().getText().toLowerCase().trim();
        System.out.println("sub menu Name = " +sub_Menu_Name);
        actions.click().build().perform();
        Thread.sleep(3000);
    }
    @Then("confirm that header title contain text Desktops")
    public void confirmHeaderDesktopsdisplayed()
    {
        String actual_Header= Hooks.driver.findElement(home.header_Title()).getText().toLowerCase();
        //String actual_Header= home.driver.findElement(home.header_Title()).getCssValue("h1").toString();
        System.out.println(actual_Header);
        String expected_Header= sub_Menu_Name;
        Assert.assertEquals(expected_Header,actual_Header);
    }
}
