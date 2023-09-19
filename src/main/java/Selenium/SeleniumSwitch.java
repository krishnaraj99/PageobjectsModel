package Selenium;

public class SeleniumSwitch {
    public static void main(String[] args) {

        //opening browser
       String browser = "Chrome";

       // open different browsers in switch case
         switch (browser.toLowerCase()) {
            case "chrome":

                System.out.println("Opening chrome browser....");
                // code to open chrome browser goes here
                break;

             case "firefox":
                 System.out.println("Opening chrome firefox....");
                 // code to open firefox browser goes here
                 break;

             case "edge":
                 System.out.println("Opening Microsoft Edge browser....");
                 // code to open Edge browser goes here
                 break;



             default:

                 System.out.println("Unsupported browser.");

        }

        //driver.quite();

       // driver.quit();
    }
}

