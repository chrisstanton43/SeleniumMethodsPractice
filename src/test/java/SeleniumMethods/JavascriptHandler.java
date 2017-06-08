package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptHandler {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.get("http://www.rediff.com/");

        driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
        Thread.sleep(2000L);

        driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
        Thread.sleep(2000L);

        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());

        alert.accept();
    }
}
