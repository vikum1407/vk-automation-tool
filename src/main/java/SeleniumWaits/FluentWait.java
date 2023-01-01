package SeleniumWaits;

import com.google.common.base.Function;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class FluentWait {

    /* Also similar to WebDriverWait with more flexibility in polling time and ignoring exceptions
     * polling mean if there (30,6) in polling, 6 time visit within 30s to check the element
     *
     * Link - https://www.selenium.dev/documentation/webdriver/waits/
     *
     *   - Advantage:
     *          * Exceptions handling also there
     *   - Disadvantage
     *       * need to get the wait again and again for the element that u wont
     * */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.manage().window().maximize();

        // Waiting 30 seconds for an element to be present on the page, checking
        // for its presence once every 5 seconds.
        //Fluent wait deleration
        Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.xpath("q")).sendKeys(Keys.RETURN);


        //Fluent wait usage
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("foo"));
            }
        });

        element.click();
    }
}
