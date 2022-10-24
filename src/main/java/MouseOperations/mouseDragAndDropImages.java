package MouseOperations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseDragAndDropImages {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        /*
        * If all images have in a iframe, you should go inside to the iframe
        *
        * */

        driver.switchTo().frame(driver.findElement(By.xpath("iframe_xpath")));

        WebElement img1 = driver.findElement(By.xpath("images1_xpath")); //source element
        WebElement img2 = driver.findElement(By.xpath("images1_xpath")); //source element

        WebElement trash = driver.findElement(By.xpath("trash_xpath")); //target element

        Actions actions = new Actions(driver);
        actions.dragAndDrop(img1,trash).perform();
        actions.dragAndDrop(img2,trash).perform();
    }
}
