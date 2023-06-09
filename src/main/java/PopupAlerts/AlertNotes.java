package PopupAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertNotes {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://the-internet.herokuapp.com/javascript_alerts";
        String successMessage = "You successfully clicked an alert";
        String buttonXPath = "//button[text()='Click for JS Alert']";
        String confirmXPath = "//button[onclick='jsconfirm()']";
        String cxld = "You clicked: Cancel";
        String promptXPath = "//button[onclick='jspropmt()']";
        String keys = "hello world";
        String promptMessage = "You are finished with prompts";


        driver.get(url);
        driver.findElement(By.xpath(buttonXPath)).click();

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        Thread.sleep(5000);
        alert.accept();

        if (driver.getPageSource().contains(successMessage)) {
            System.out.println(successMessage);
            System.out.println("============================");
        }

        //js comfirm
        driver.findElement(By.xpath(confirmXPath)).click();

        Alert alert2 =driver.switchTo().alert();
        System.out.println(alert2.getText());
        Thread.sleep(5000);
        alert2.dismiss();
        if (driver.getPageSource().contains(cxld)) {
            System.out.println(cxld);
            System.out.println("============================");
        }

        //js prompt
        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());
        alert3.sendKeys(keys);
        alert3.accept();
        Thread.sleep(3000);
        if (driver.getPageSource().contains(promptMessage)) {
            System.out.println(promptMessage);
            System.out.println("============================");
        }


        driver.close();
        driver.quit();
    }
}
