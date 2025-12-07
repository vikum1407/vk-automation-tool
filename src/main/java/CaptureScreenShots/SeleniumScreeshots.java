package CaptureScreenShots;

import io.cucumber.java.sk.Tak;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class SeleniumScreeshots {

    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();

        /**
         * Take screenshot from selection section or element
         */

        WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File src = section.getScreenshotAs(OutputType.FILE);
        File saveFile = new File(".\\screenshots\\sectionScreenshot.png");
        FileUtils.copyFile(src, saveFile);
    }
}


