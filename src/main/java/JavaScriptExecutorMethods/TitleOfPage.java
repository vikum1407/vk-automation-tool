package JavaScriptExecutorMethods;

import UtilPackage.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfPage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.twoplugs.com");

        driver.manage().window().maximize();

        //drawing a boarder and capture a screenshot
        WebElement joinFreeBtn = driver.findElement(By.xpath("(//a[@class='btn green'])[1]"));
        System.out.println("Title Of The Page: "+JavaScriptUtil.getTitleByJS(driver));
    }
}
