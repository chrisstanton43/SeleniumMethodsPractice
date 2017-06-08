package SeleniumMethods;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HandlingMultipleWindows {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.hdfcbank.com/");

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.switchTo().frame(1);

        driver.findElement(By.xpath(".//*[@id='ctaButtonDiv']/div[2]")).click();

        Actions  a= new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/ul/li[4]/div[1]/span"))).build().perform();
        Thread.sleep(5000L);
        a.moveToElement(driver.findElement(By.xpath("a[href*=goldloan"))).build().perform();
        Thread.sleep(2000l);
        driver.findElement(By.xpath("a[href*=goldloan]")).sendKeys(Keys.ENTER);
    }
}
