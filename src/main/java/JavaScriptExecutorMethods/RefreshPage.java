package JavaScriptExecutorMethods;

import UtilPackage.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.twoplugs.com");

        driver.manage().window().maximize();

        WebElement loginBtn = driver.findElement(By.xpath("(//a[@class='btn border'])[1]"));
        JavaScriptUtil.clickElementByJS(loginBtn, driver);

        JavaScriptUtil.refreshBrowserByJS(driver);

    }
}
