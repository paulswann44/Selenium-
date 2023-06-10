package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsNotes {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String clickAndHold = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
        String dragAndDrop = "https://selenium08.blogspot.com/2020/01/drag-drop.html";
        String letterApath = "//li[text()='A']";
        String letterDpath = "//li[text()='D']";
        String locator1 = "draggable";
        String locator2 = "droppable";


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // driver.get(clickAndHold);

        //WHAT IS WebElement
        // WebElement boxA = driver.findElement(By.xpath(letterApath));
        // WebElement boxD = driver.findElement(By.xpath(letterDpath));

        Actions action = new Actions(driver);

    
        // action.moveToElement(boxA);
        // action.clickAndHold();
        // action.moveToElement(boxD);

        //Right click:
        // action.contextClick(boxD);

        //Double Click:
        // action.doubleClick(boxD);   

        //Drag and Drop
        driver.get(dragAndDrop);
        WebElement element1 = driver.findElement(By.id(locator1));
        WebElement element2 = driver.findElement(By.id(locator2));
        action.dragAndDrop(element1, element2 );
        action.release().build().perform();
        driver.quit();

        Thread.sleep(3000);
        System.out.println("( ◑‿◑)ɔ┏🍟--🍔┑٩(^◡^ )");






        
    }
    
}
