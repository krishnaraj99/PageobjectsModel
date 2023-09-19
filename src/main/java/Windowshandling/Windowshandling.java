package Windowshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

public class Windowshandling {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        driver.get("https://selectorshub.com/xpath-practice-page/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.cssSelector("a[href='https://bit.ly/tr_practice_2023']")).click();

        try {
            Thread.sleep(2000);
        }catch (Exception e){}

        System.out.println(driver.getTitle());

        String current_window = driver.getWindowHandle();
        Set<String>  all_windows = driver.getWindowHandles();


        for (String window : all_windows) {

            System.out.println(window);
            if (!window.equalsIgnoreCase(current_window)) {
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
            }
        }



        }

    }

