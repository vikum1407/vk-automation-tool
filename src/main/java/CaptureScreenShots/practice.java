package CaptureScreenShots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class practice {

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com");

        driver.manage().window().maximize();

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File trg = new File("<location");

        FileUtils.copyFile(src, trg);

        WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));

        File srv = section.getScreenshotAs(OutputType.FILE);
        File trf = new File("<location>");

        FileUtils.copyFile(srv, trf);
    }
}
