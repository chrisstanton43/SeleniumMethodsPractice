package StepDefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by subbu on 15/02/2017.
 */
public class StepDefs {
    WebDriver driver;
    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.mandmdirect.com/");
    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {
        driver.findElement(By.id("myaccount")).click();
    }

    @When("^User enters Credentials to LogIn$")
    public void user_enters_testuser_and_Test(DataTable usercredentials) throws Throwable {

        //Write the code to handle Data Table
        for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
            driver.findElement(By.id("EmailAddress")).sendKeys(data.get("EmailAddress"));
            driver.findElement(By.id("Password")).sendKeys(data.get("Password"));
            driver.findElement(By.id("SignInContinue")).click();
        }

    }

       @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Login Successfully");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Then("^I should see \"(.*?)\" page$")
    public void i_should_see_page(String text) throws Throwable {
        assert( driver.findElement(By.xpath("html/body/div[2]/div/h1")).getText().contains(text));
    }
    @When("^I click on \"(.*?)\"$")
    public void i_click_on(String arg1) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='rightMandMContainer']/div[4]/input")).click();
    }
    @Then("^I should click on MandM logo$")
    public void iShouldClickOnMandMLogo() throws Throwable {
        driver.findElement(By.cssSelector("img.MandMGBP")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("^User LogOut from the Application$")
    public void user_LogOut_from_the_Application() throws Throwable {
        driver.findElement(By.linkText("Sign Out")).click();
    }
    @Then("^Message displayed LogOut Successfully$")
    public void message_displayed_LogOut_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
    }



}
