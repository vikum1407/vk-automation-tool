package SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {

        /*
        * Purpose of using Explicit Wait:
        *   - setup based on specific element
        *   - setup certain conditions till the condition match
        *   - WebDriverWait class
        *
        *   - Disadvantage
        *       * need to get the wait again and again for the element that u wont
        *       * Util element not found within the duration it'll throw exception and need additional try catch to handle that
        * */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.manage().window().maximize();

        WebDriverWait waitingTime = new WebDriverWait(driver, Duration.ofMillis(3000));

        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.xpath("q")).sendKeys(Keys.RETURN);

        WebElement element = waitingTime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium WebDriver']")));

        element.click();

        // How to use the Generic Explicit Wait method
        By locator = By.xpath("//[@class='ans'");
        waitForElementPresent(driver, locator, 10).click();

    }
    // Create Generic Method for ExplicityWait
    public static WebElement waitForElementPresent(WebDriver driver, By locator, int timout){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timout));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        return driver.findElement(locator);
    }
}
