package PageLoaders;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadingNotes {

    // PAGE LOADING STRATEGIES
    // NORMAL - waits for the page to be loaded.  This is the default strategy
    // Eager - waits for HTML elemnts to be loaded before CSS, images, and subframes.  Much Faster!

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        // chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        String google = "https://google.com";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        try{
            driver.get(google);
        } finally{
            driver.quit();
        }

        // Rest of your code...
    }
}
