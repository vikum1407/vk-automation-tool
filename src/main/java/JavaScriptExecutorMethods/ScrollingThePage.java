package JavaScriptExecutorMethods;

import UtilPackage.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingThePage {
    public static void main(String[] args) {

        /*
         * Scrolling -
         *   1. Scrolling down to serturn an element
         *   2. Scrolling down to end of the page
         * */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.twoplugs.com");

        driver.manage().window().maximize();

    /*    //1. Scrolling down to serturn an element
        WebElement img = driver.findElement(By.xpath("img[@src='/newlayout/images/screen.png']"));
        JavaScriptUtil.scrollingIntoView(img, driver);
    */

        //2. Scrolling down to end of the page
        JavaScriptUtil.scrollPageDown(driver);
    }
}
