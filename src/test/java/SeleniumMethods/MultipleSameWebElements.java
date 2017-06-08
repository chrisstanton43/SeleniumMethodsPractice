package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class MultipleSameWebElements
{
    public static void main(String args[])
    {

        WebDriver driver =new FirefoxDriver();

        driver.get("http://book.goindigo.in");

        List<WebElement> abc=driver.findElements(By.xpath(".//*[@id='bookingflightTab']/div[2]/div[1]/ul[1]/li[2]/a")); //when we select one way then we get alert pop up

        abc.get(1).click();


    }
}