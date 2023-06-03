package OtherFolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class MySeleniumTest {

    public static void main(String[] args) {

        // Download and setup chromedriver
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to Google
        driver.get("https://www.google.com/");

        // Find the search box element and enter a search query
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("OpenAI");

        // Submit the search query
        searchBox.submit();

        // Wait for the search results to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(webDriver -> webDriver.getTitle().startsWith("Pink Pretty Ponies"));

        // Print the page title
        System.out.println("Page title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
