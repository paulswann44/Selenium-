package BrowserActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class BrowserActionsNotes {
    public static void main(String[] args) throws IOException {
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


        //Screen sizes
        driver.manage().window().minimize();
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        //Take a screenshot
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //This will save the file
        FileUtils.copyFile(srcFile,new File("./image1.png"));

        //Copy an image of a class such as the Google logo
        WebElement element = driver.findElement(By.cssSelector("name of class"));
        File srcFile1 = (element.getScreenshotAs(OutputType.FILE));
        FileUtils.copyFile(srcFile1,new File("./image2.png"));

        // Create a new JavascriptExecutor instance with the driver
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Find the "btnI" button element by its name
        WebElement button = driver.findElement(By.name("btnI"));

        // Use the JavascriptExecutor to click on the button
        js.executeScript("arguments[0].click();", button);

        // Use the JavascriptExecutor to log a message to the console
        js.executeScript("console.log('Hello World')");




        // Close the browser
        driver.quit();
    }
}
