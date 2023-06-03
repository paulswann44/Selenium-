package BrowserActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class BrowserRefresher {
    public static void main(String[] args) throws InterruptedException {

 
  

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String originalWindow = driver.getWindowHandle();
        String google = "https://www.google.com";    
        String youtube = "https://www.youtube.com/watch?v=0SwN6Tr8zDs";    
        String codeGeek = "https://www.javacodegeeks.com/selenium-tutorials";  


        driver.navigate().to(google);
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB).navigate().to(youtube);        
        Thread.sleep(2000);
 
        driver.navigate().to("https://thinkcans.net/aluminium/10-aluminium-facts");
        driver.findElement(By.linkText("home")).click();


    driver.quit();
    }

}


