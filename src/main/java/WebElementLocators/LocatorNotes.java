package WebElementLocators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorNotes {
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String google = "https://www.google.com";
        String tryTestingThis = "https://trytestingthis.netlify.app/";
        String opensource = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        // Setting timeouts
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().timeouts().setScriptTimeout(Duration.ofMinutes(1));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get(google);

        WebElement element = driver.findElement(By.name("q"));
        Thread.sleep(3000);

        // Sending keys and hitting enter
        element.sendKeys("facebook", Keys.ENTER);

        driver.navigate().to(tryTestingThis);
        List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));

        for (WebElement elementOne : options) {
            System.out.println(elementOne.getText());
        }

        driver.findElement(By.cssSelector("#fname")).sendKeys("Paul");
        
        driver.navigate().to(opensource);

        WebElement loginButton = driver.findElement(By.id("loginButton"));
        WebElement inputElement = driver.findElement(RelativeLocator.with(By.tagName("input"))
                .above(loginButton));
        inputElement.sendKeys("ABCD");

          

        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
