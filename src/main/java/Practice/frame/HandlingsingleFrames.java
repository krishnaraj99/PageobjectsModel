package Practice.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class HandlingsingleFrames {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/iframe");

       WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
               driver.switchTo().frame(iframe);

               driver.findElement(By.cssSelector("body p")).sendKeys("Krishna");
               driver.switchTo().defaultContent();

              // driver.quit();


    }
}
