package HeadlessBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessBrowser {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        //options.addArguments("--headless"); this is also correct
        driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //Alert window with single OK button
        WebElement alertBtn = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        alertBtn.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();


        //Alert window with two button
        WebElement alertOkBtn = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        alertOkBtn.click();
        Thread.sleep(3000);
        //driver.switchTo().alert().accept();     //Close alert by clicking OK button
        driver.switchTo().alert().dismiss();    //Close alert by clicking Cancle button

        //Alert window with input box
        WebElement inputBoxBtn = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        inputBoxBtn.click();
        Thread.sleep(3000);

        //1. get the whole alert window
        Alert alertWindow = driver.switchTo().alert();
        System.out.println("Message Printing: "+alertWindow.getText());

        alertWindow.sendKeys("Hero Vikum");
        Thread.sleep(3000);
        alertWindow.accept();

                System.out.println("Web Title: "+driver.getTitle());

        driver.quit();
    }
}
