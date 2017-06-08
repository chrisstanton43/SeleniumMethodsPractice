package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PagePopUps {
    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://book.goindigo.in");

        driver.findElement(By.xpath(".//*[@id='bookingflightTab']/div[2]/div[1]/ul[1]/li[2]/a")).click(); //when we select one way then we get alert pop up

        if(driver.switchTo().alert() != null)
        {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            alert.dismiss(); // alert.accept();

        }

//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
                    Alert al = driver.switchTo().alert();
                    al.getText(); // it's give the text in the alert
                    System.out.println(al.getText());

                    al.accept(); //OK
//		al.dismiss(); //Cancel




        }
    }

