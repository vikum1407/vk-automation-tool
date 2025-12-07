package SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Practical {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofMillis(3000));

        WebElement element = driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("bvnf")));

    }

    public static WebElement explicityWait(WebDriver driver, int timeOut, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofMillis(timeOut));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));

        return driver.findElement(locator);
    }
}
