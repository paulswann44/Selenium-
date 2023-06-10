package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownNotes {
    

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();  

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String google = "https://www.google.com";
        String demoSite = "https://trytestingthis.netlify.app/";

        driver.get(demoSite);
        WebElement dropdown = driver.findElement(By.id("option"));

        //Have to use the Select Class
        Select selectObject = new Select(dropdown);

        //Selecting all of the options short way
        selectObject.selectByIndex(1);
        Thread.sleep(3000);
        selectObject.selectByValue("Option 2");
        Thread.sleep(3000);
        //This deselects
        selectObject.deselectByVisibleText("Option 3");
        


        Thread.sleep(3000);
        driver.close();
        driver.quit();
        System.out.println("ᕙ(`▿´)ᕗ");


    }
}
