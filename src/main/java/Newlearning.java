import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Newlearning {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement USERNAMEFIELD = driver.findElement(By.cssSelector("input[placeholder='Username']"));


        USERNAMEFIELD.sendKeys("Admin");

        WebElement passwordfield = driver.findElement(By.cssSelector("input[placeholder='Password']"));


        passwordfield.sendKeys("admin123");

        WebElement loginbuttonfield = driver.findElement(By.cssSelector("button[type='submit']"));

        loginbuttonfield.click();



    }
}
