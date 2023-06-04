package WebElementLocators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        String tryTestingThis = "https://trytestingthis.netlify.app/";
        String google = "https://www.google.com";
        String originalWindow = driver.getWindowHandle();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().timeouts().setScriptTimeout(Duration.ofMinutes(1));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));


        driver.get(tryTestingThis);

        List<WebElement> options = driver.findElements(By.id("owc"));

        for (WebElement elementTwo : options){
            System.out.println(elementTwo.getText());
        }

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to(google);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(tryTestingThis);
        Thread.sleep(2000);
        driver.close();


        driver.switchTo().window(originalWindow);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Slow scroll down
        for (int i = 0; i < 20; i++) {
            js.executeScript("window.scrollBy(0, 50);");
            Thread.sleep(200);
        }

        Thread.sleep(2000);

        // Slow scroll up
        for (int i = 0; i < 20; i++) {
            js.executeScript("window.scrollBy(0, -50);");
            Thread.sleep(200);
        }

        Thread.sleep(4000);
        driver.quit();
        
    }

}
