package BrowserActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserActions {
    public static void main(String[] args) {
        // Set up the Chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        // Navigate to the Google website using 'get'
        driver.get("https://www.google.com");

        // Navigate to Java Code Geeks website using 'navigate' method
        driver.navigate().to("https://www.javacodegeeks.com/selenium-tutorials");

        //Gets the current URL
        System.out.println("the current URL: " +driver.getCurrentUrl());
        driver.getCurrentUrl();

        //Gets Title
        driver.getTitle();
        System.out.println("The current Title: "+driver.getTitle());

        //Navigate within the browser: refresh, back, forward
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().back();

        // Close the browser
        driver.quit();
    }
}
