package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by subbu on 17/02/2017.
 */
public class DropDown {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.goindigo.in/");

        WebElement address= driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/ul[1]/li[1]/input[1]"));

//        Alert al=driver.switchTo().alert();
//        al.dismiss();

        Select ab= new Select(address);

        ab.selectByValue("JAI");


    }
}
