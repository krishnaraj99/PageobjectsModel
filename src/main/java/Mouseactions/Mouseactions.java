package Mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;

public class Mouseactions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement checkout_here= driver.findElement(By.xpath("//button[normalize-space()='Checkout here']"));

        Actions action = new Actions(driver);

        action.moveToElement(checkout_here);


            }
        }

