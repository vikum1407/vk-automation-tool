package MouseOperations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseDragAndDrop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        /*
        * Here you should get the "Source Element" and the "Target Element"
        * */

        WebElement sourceEle = driver.findElement(By.xpath("//abc"));
        WebElement targetEle = driver.findElement(By.xpath("//abc"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceEle,targetEle).perform();
    }
}
