package KeyboardActions;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardNotes {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //We use sendKeys()
        
        String google = "https://www.google.com";

        driver.get(google);
        driver.findElement(By.name("q")).sendKeys("selenium" +  Keys.ENTER);

        Thread.sleep(2000);

        //Keydown Control + "a"
        Actions actionProvider = new Actions(driver);

       Actions keydown =  actionProvider
       .keyDown(Keys.CONTROL)
       .sendKeys("a");

        keydown.build().perform();


        driver.quit();

    }
    
}
