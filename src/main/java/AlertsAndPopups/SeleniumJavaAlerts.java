package AlertsAndPopups;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SeleniumJavaAlerts {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        /**
         * Alert handling by sending text and accepting
         */

        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alertConfirm = driver.switchTo().alert();
        alertConfirm.sendKeys("Hi Vikum");
        alertConfirm.accept();

        WebElement alertConfirmation = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertEquals(alertConfirmation, "Hi Vikum");

        driver.quit();
    }
}
