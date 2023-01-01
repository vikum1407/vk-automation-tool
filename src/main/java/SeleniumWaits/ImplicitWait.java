package SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {

        /*
        * Advantage: we can define once is a project, no need to define all the time it's needed
        * Disadvantage: static value should assign, it's become some error when page loading more than the define wait amount
        * * Util element not found within the duration it'll throw exception and need additional try catch to handle that
        * */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.xpath("q")).sendKeys(Keys.RETURN);

        driver.findElement(By.xpath("//h3[text()='Selenium WebDriver']")).click();

    }
}
