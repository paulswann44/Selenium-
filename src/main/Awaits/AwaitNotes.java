import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AwaitNotes {

    public static void main(String[] args) {
        
    // There is a speed that differs between the automation runs vs when the browser loads.
    //Might get errors such as 'no such element'
    //Might not be syncronous at all times


    //.1 Implicit Waits
    //Useful when there are some gap in loading time of the webpage and the webpage elements
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String google = "https://www.google.com";


        driver.get(google);

        driver.findElement(By.name("q")).sendKeys("automation step by step" + Keys.ENTER);

        //Explicit Wait
        WebDriver wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step")));
        link.click();

        //Fluent Wait
        Wait <WebDriver> fluenWait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(10))
        .pollingEvery(Duration.ofSeconds(1))
        .ignoring(NoSuchElementException);

        fluenWait.unit(ExcpectedConditions.elementToBeSelected(By.xpath(null)));

        driver.close();
        driver.quit();
    }   
}
