package AlertsAndPopups;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class practice {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

       WebDriverManager.chromedriver().setup();
       driver = new FirefoxDriver();

       driver.get("https://cosmocode.io/automation-practice-webtable/");
       driver.manage().window().maximize();

       List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
       WebElement country = driver.findElement(By.xpath("//tbody/tr[14]/td[2]"));

        System.out.println(rows.size());

        for (int i=0; i<rows.size(); i++){
            WebElement baharen = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]"));

        }



    }
}
