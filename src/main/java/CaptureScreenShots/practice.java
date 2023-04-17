package CaptureScreenShots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class practice {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com");

        driver.manage().window().maximize();

        TakesScreenshot take = (TakesScreenshot) driver;
        File src = take.getScreenshotAs(OutputType.FILE); //create file object
        File trg = new File(".\\screenshots\\homepage.png"); //create own location to save the screenshot
    }
}
