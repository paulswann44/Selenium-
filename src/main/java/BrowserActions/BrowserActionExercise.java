package BrowserActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActionExercise {

    private WebDriver driver;
    private int time = 2000;

    public BrowserActionExercise() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void navigateToGoogle() {
        driver.get("https://www.google.com");
    }

    public void navigateToJavaCodeGeeks() {
        driver.navigate().to("https://www.javacodegeeks.com/selenium-tutorials");
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void refresh() {
        driver.navigate().refresh();
    }

    public void goBack() {
        driver.navigate().back();
    }

    public void goForward() {
        driver.navigate().forward();
    }

    public void close() {
        driver.quit();
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}
