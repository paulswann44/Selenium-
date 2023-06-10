package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownList {
public static void main(String[] args) {
    String demoSite = "https://trytestingthis.netlify.app/";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(demoSite);

        WebElement dropdown = driver.findElement(By.id("option"));

        Select selectObject = new Select(dropdown);
    

        List<WebElement> allAvilableOptions = selectObject.getOptions();

        for(WebElement option:allAvilableOptions){
            System.out.println(option.getText());
        }

        driver.close();
        driver.quit();
        System.out.println("≧◠ᴥ◠≦✊... Testing Pro!");

    }

    
}
