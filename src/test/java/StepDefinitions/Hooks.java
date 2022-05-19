package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver= null;

    @Before
    public static void openChromeBrowser() throws InterruptedException {

        //driver.manage().timeouts()
        String chromepath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromepath);

        driver= new ChromeDriver();
        //WebDriverManager.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com");
       // Thread.sleep(3000);

    }
    @After
    public static void closeChromeBrowser() throws InterruptedException {
    Thread.sleep(2000);
     driver.quit();
    }


}
