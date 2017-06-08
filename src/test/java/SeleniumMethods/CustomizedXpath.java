package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CustomizedXpath {

    public static void main(String[] args) {

        WebDriver driver= new FirefoxDriver();

        driver.get("http://facebook.com/");

        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("xxxx");
        driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("xxxx");
        // For example sometimes ID keep on changing by developers at that time we need to design our own xpath
        // The best example is whnever we try to click login button next username and password it's keep on changing every time
        // At that time we need to desgin the own Xpath ourself
        // tagname[@attribute='value']
        // <input id="u_0_s" type="submit" data-testid="royal_login_button" tabindex="4" value="Log In"/>
        // When I click on sign in button next time, it's changes like
        // <input id="u_0_q" type="submit" data-testid="royal_login_button" tabindex="4" value="Log In"/>
        // You can see the difference between the input id's
        // tagname[@attribute='value'] so input input[@value='Log In'] or input[@type='submit']
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}
