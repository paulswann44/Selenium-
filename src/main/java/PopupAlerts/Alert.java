package PopupAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String path = "https://the-internet.herokuapp.com/javascript_alerts";
        String success = "You successfully clicked an alert";

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(path);

        //This is JS Alert
        driver.findElement(By.xpath("//button[@onclick = 'jsAlert()']")).click();
        Alert alert1 = driver.switchTo().alert();

        //Todo: add explicit wait later for the alert
    

        System.out.println(alert1.getText());
        alert1.accept();

        if(driver.getPageSource().contains(success)){
            System.out.println(success);
            System.out.println("============================");
        }

        driver.close();
        driver.quit();
        
        
    }
    


}