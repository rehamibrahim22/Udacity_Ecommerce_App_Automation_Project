package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    public WebDriver driver;

    /*
    public RegistrationPage() {
      //  this.driver = Hooks.driver;

    }

    */
    public By RegisterLink() {
        return By.cssSelector("a[href=\"/register?returnUrl=%2F\"]");

    }

    public WebElement Gender_radio(String gender_Type)
    {
        WebElement gender= null;

        if (gender_Type.contains("female"))
        {
            gender= Hooks.driver.findElement(By.id("gender-female"));

        }
        else
        {
            gender= Hooks.driver.findElement(By.id("gender-male"));
        }
           return gender;
    }



    public By firstName()
    {
        return By.id("FirstName");
    }
    public By lastName()
    {
        return By.id("LastName");
    }

    public By DateOfBirthDay()
    {
        return By.name("DateOfBirthDay");
    }

    public By DateOfBirthMonth()
    {
        return By.name("DateOfBirthMonth");
    }

    public By DateOfBirthYear()
    {
        return By.name("DateOfBirthYear");
    }
    public By email()
    {
        return By.id("Email");
    }
    public By companyName()
    {
        return By.id("Company");
    }

    public By password()
    {
        return By.id("Password");
    }
    public By confirmPassword()
    {
        return By.id("ConfirmPassword");
    }
    public By registerButton()
    {
        return By.id("register-button");
    }
    public By registerMessage()
    {
        return By.className("result");
    }

    public By continueButton()
    {
        return By.cssSelector("a[href='/']");
    }
    public By log_out_link()
    {
        return By.className("ico-logout");
    }

    public void registerSteps(String gender,String fN,String lN,String day,String month,String year,String email, String pass,String confirmPass)
    {
        Gender_radio(gender).click();

        Hooks.driver.findElement(firstName()).sendKeys(fN);
        Hooks.driver.findElement(lastName()).sendKeys(lN);

        Select daySelect= new Select(Hooks.driver.findElement(DateOfBirthDay()));
        daySelect.selectByValue(day);
        Select monthSelect= new Select(Hooks.driver.findElement(DateOfBirthMonth()));
        monthSelect.selectByValue(month);
        Select yearSelect= new Select(Hooks.driver.findElement(DateOfBirthYear()));
        yearSelect.selectByValue(year);

        Hooks.driver.findElement(email()).sendKeys(email);
Hooks.driver.findElement(companyName()).sendKeys("New Company");
        Hooks.driver.findElement(password()).sendKeys(pass);
        Hooks.driver.findElement(confirmPassword()).sendKeys(confirmPass);

    }

}




