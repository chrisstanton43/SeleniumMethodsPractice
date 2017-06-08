package SeleniumMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAjaxMouse {

    public static void main(String[] args) {

        WebDriver driver =new FirefoxDriver();

        driver.get("https://www.amazon.co.uk/");

        Actions abc = new Actions(driver);
        WebElement element=driver.findElement(By.cssSelector("#nav-link-yourAccount"));
        abc.moveToElement(element).build().perform();
        WebElement xyz=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        abc.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("smallletters").build().perform();
        abc.contextClick(xyz).build().perform();
//        abc.doubleClick(xyz).build().perform();

    }
}
