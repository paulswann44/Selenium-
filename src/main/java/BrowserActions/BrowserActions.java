package BrowserActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions {
    public static void main(String[] args) {
        // **Set up the Chrome driver**
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // **Navigate to the Google website using 'get'**
        driver.get("https://www.google.com");

        // **Navigate to Java Code Geeks website using 'navigate' method**
        driver.navigate().to("https://www.javacodegeeks.com/selenium-tutorials");

        //**Gets the current URL**
        System.out.println("the current URL: " +driver.getCurrentUrl());
        driver.getCurrentUrl();

        //**Gets Title**
        driver.getTitle();
        System.out.println("The current Title: "+driver.getTitle());

        //**Navigate within the browser: refresh, back, forward**
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().back();


        //**Switching Windows**
        String originalWindow = driver.getWindowHandle();
        driver.switchTo().window(originalWindow);

        //**Open new WINDOW**
        driver.switchTo().newWindow(WindowType.WINDOW);

        //**Open a new TAB**
        driver.switchTo().newWindow(WindowType.TAB);

        //**Find an element by a link text, such as a link with the phrase "home"**
        driver.navigate().to("https://thinkcans.net/aluminium/10-aluminium-facts");
        driver.findElement(By.linkText("home")).click();

        //**Browser Size Management**
        //Height
        driver.manage().window().getSize().getWidth();
        //Width
        driver.manage().window().getSize().getHeight();

        // **ALTERNATIVE**
        Dimension size = driver.manage().window().getSize();
        System.out.println("Height" + size.getHeight());
        System.out.println("Width" + size.getWidth());

        // **Set Size**
        driver.manage().window().setSize(new Dimension(800,600));

        // **Get Position in terms of X and Y*
        driver.manage().window().getPosition().getX();
        driver.manage().window().getPosition().getY();

        //Have to use Point to find the position in the terminal
        Point position =driver.manage().window().getPosition();
        System.out.println("Your X-coordinate is: " + position.getX());
        System.out.println("Your Y-coordinate is: " + position.getY());

        driver.manage().window().setPosition(new Point(500,200));








        // Close the browser
        driver.quit();
    }
}
