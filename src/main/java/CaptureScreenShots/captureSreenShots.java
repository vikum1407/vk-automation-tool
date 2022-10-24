package CaptureScreenShots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class captureSreenShots {

    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com");

        driver.manage().window().maximize();

   /*     //01. Full page screenshot
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE); //create file object
        File trg = new File(".\\screenshots\\homepage.png"); //create won location to save the ss

        //copy the file to the location
        FileUtils.copyFile(src,trg);
    */
        //02. Capture screenshot of section/portion of the page
        //Here we don't wont to get the screenshot interface support because of WebElement by default has it

    /*    WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File src = section.getScreenshotAs(OutputType.FILE); //create file object
        File trg = new File(".\\screenshots\\FeatureProducts.png"); //create won location to save the ss

        //copy the file to the location
        FileUtils.copyFile(src,trg);
    */

        //03. Capture screenshot specific of the web element

        WebElement ele = driver.findElement(By.xpath("//img[@title='Show details for HTC One M8 Android L 5.0 Lollipop']"));
        File src = ele.getScreenshotAs(OutputType.FILE); //create file object
        File trg = new File(".\\screenshots\\HTCPhone.png"); //create won location to save the ss

        //copy the file to the location
        FileUtils.copyFile(src,trg);


        driver.quit();

    }
}
