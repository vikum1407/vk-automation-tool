package MouseOperations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverAction {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();

        WebElement desktopMenu = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement desktopChoice1 = driver.findElement(By.xpath("//a[normalize-space()='PC (0)']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(desktopMenu).moveToElement(desktopChoice1).click().perform();


    }
}
