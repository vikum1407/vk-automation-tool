package JavaScriptExecutorMethods;

import UtilPackage.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class DrawingBorderAnElement {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.twoplugs.com");

        driver.manage().window().maximize();

        //drawing a boarder and capture a screenshot
        WebElement joinFreeBtn = driver.findElement(By.xpath("(//a[@class='btn green'])[1]"));
        JavaScriptUtil.drawBorder(joinFreeBtn,driver);

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File trg = new File("src\\main\\java\\JavaScriptExecutorMethods\\screenshots\\twoplugins.png");
        FileUtils.copyFile(src, trg);
    }
}
