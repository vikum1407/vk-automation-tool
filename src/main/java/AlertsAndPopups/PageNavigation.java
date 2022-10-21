package AlertsAndPopups;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNavigation {
    public static void main(String args[]){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdela.com");
        //driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.amazon.com"); //Both get() and navigate().to() methods as same

        /*
        * Both are doing same
        * Navigate() method also calling get() method internally
        * WebDriver creating those two mean, Navigate() nmethod implment several directional method like forward(), back() ...etc and also the to()
        * Navigate() method also support URL as a instance parameter
        * */

        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh(); //Refresh or reload the page
    }
}
