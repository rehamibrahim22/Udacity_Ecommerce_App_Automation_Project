package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class SD07_FollowUsStepDefinition {

    WebDriver driver;
    HomePage home= new HomePage();


    @Given("^Click on facebook link in follow us section$")
        public void click_on_FacebookLink() throws InterruptedException {

        //Store the ID of the original window
        String origWindow = Hooks.driver.getWindowHandle();

        //make sure we have only one windowhandle
        assert Hooks.driver.getWindowHandles().size() == 1;
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));
        //Click the link which opens in a new window
            home.faceBook_Link().click();

        //Wait for the new tab to open
        wait.until(numberOfWindowsToBe(2));

        //Loop through until a new window handle found
        for (String windowHandle : Hooks.driver.getWindowHandles()) {
            if(!origWindow.contentEquals(windowHandle)) {
                Hooks.driver.switchTo().window(windowHandle);
                break;
            }
        }

        }
        @Then("confirm URL contain facebook in new tab correctly")
    public void confirm_facebook_opened_New_Tab() {
            String currURL = Hooks.driver.getCurrentUrl();
            String expectedURL="https://www.facebook.com/nopCommerce";
            Assert.assertEquals(currURL,expectedURL);

        }
        @Given("Click on youtube link in follow us section")
    public void click_on_YoutubeLink()throws InterruptedException {
            //Store the ID of the original window
            String origWindow = Hooks.driver.getWindowHandle();

            //make sure we have only one windowhandle
            assert Hooks.driver.getWindowHandles().size() == 1;
            WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));
            //Click the link which opens in a new window
            home.youtube_Link().click();

            //Wait for the new tab to open
            wait.until(numberOfWindowsToBe(2));

            //Loop through until a new window handle found
            for (String windowHandle : Hooks.driver.getWindowHandles()) {
                if(!origWindow.contentEquals(windowHandle)) {
                    Hooks.driver.switchTo().window(windowHandle);
                    break;
                }
            }

        }
    @Given("Click on twitter link in follow us section")
    public void click_on_TwitterLink()throws InterruptedException {
        //Store the ID of the original window
        String origWindow = Hooks.driver.getWindowHandle();

        //make sure we have only one windowhandle
        assert Hooks.driver.getWindowHandles().size() == 1;
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));
        //Click the link which opens in a new window
        home.twitter_Link().click();

        //Wait for the new tab to open
        wait.until(numberOfWindowsToBe(2));

        //Loop through until a new window handle found
        for (String windowHandle : Hooks.driver.getWindowHandles()) {
            if(!origWindow.contentEquals(windowHandle)) {
                Hooks.driver.switchTo().window(windowHandle);
                break;
            }
        }

    }

    @Given("Click on RSS link in follow us section")
    public void click_on_RSSLink()throws InterruptedException {

        home.RSS_Link().click();

            }

    @Then("confirm URL contain youtube in new tab correctly")
    public void confirm_youtube_opened_New_Tab() {
        String currURL = Hooks.driver.getCurrentUrl();
        String expectedURL="https://www.youtube.com/user/nopCommerce";
        Assert.assertEquals(currURL,expectedURL);

    }
    @Then("confirm URL contain twitter in new tab correctly")
    public void confirm_twitter_opened_New_Tab() {
        String currURL = Hooks.driver.getCurrentUrl();
        String expectedURL = "https://twitter.com/nopCommerce";
        Assert.assertEquals(currURL, expectedURL);
    }

    @Then("confirm URL contain RSS")
    public void confirm_RSS_URL() {
        String currURL = Hooks.driver.getCurrentUrl();
        String expectedURL="https://demo.nopcommerce.com/news/rss/1";
        Assert.assertEquals(currURL,expectedURL);

    }

}
