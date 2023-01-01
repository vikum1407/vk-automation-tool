package iFrameAndiFrameHandle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iFrameHandle {

    public static void main(String[] args) {
        /*
        * If there is an iFrame, we can't access directly the link or any icon
        *
        * */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

        //If I try to access directly
   //     driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click(); //Exception return

        // need to go inside the iframe  - switchTo().frame() method
        /*
        * Here iframe access have 3 ways:-
        *   - driver.switchTo().frame(name of the frame/ id of the page)
        *   - driver.switchTo().frame(WebElement)
        *   - driver.switchTo().frame(Index)
        * */
        driver.switchTo().frame("packageListFrame"); // name of the iframe
        // then u can click the link u wont
        driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();

        /*
        * If there are multiple iframe and u need to access elements from inside the iframe, from here u need to
        * go out from the first iframe when accessing the first element from first iframe befor access the second
        * element from second iframe
        * */
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Access multiple element from multiple iframes
        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
        driver.switchTo().defaultContent(); // go out from the iframe or go the main content of the page

        driver.switchTo().frame("packageFrame");
        driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
    }
}
