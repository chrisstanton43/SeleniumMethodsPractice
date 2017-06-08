package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CssSelectorsLocator {

    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();

        driver.get("http://login.salesforce.com/");

        //Syntax for Xpath = //tagname[@attribute='value']
        //Syntax for Css= tagname[attribute='value']
        //Here we no need to write the double slaces before the tagname and @ before the attribute
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("fewrew");
    }
}
