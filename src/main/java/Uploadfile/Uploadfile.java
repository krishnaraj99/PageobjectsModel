package Uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.Date;

public class Uploadfile {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement fileupload = driver.findElement(By.xpath("//input[@id='file-upload']"));

        fileupload.sendKeys("C:\\Users\\DELL\\Desktop\\Something\\src\\main\\java\\Uploading.java");

        driver.get("https://www.markcalculate.com/calculators/date-of-birth-calculator");

        WebElement Select = driver.findElement(By.xpath("//div[@class='clac-period border-bottom pb-3 mb-0']//select[@id='birthMonth']"));

       Select.sendKeys("DECEMBER");

       WebElement SelectDate = driver.findElement(By.xpath("//div[@class='clac-period border-bottom pb-3 mb-0']//select[@id='birthDay']"));

       SelectDate.sendKeys("10");

       WebElement EnterYear = driver.findElement(By.xpath("//div[@class='clac-period border-bottom pb-3 mb-0']//input[@id='birthYear']"));

       EnterYear.sendKeys("1992");
    }
}
