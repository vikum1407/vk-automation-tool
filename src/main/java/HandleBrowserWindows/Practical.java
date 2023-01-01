package HandleBrowserWindows;

import io.cucumber.java.hu.Ha;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practical {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com");

        String windStr = driver.getWindowHandle();
        System.out.println(windStr);

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        Set<String> winIDs = driver.getWindowHandles();



        List<String> winds = new ArrayList<>(winIDs);
        String winStr1 = winds.get(0);
        String winStr2 = winds.get(1);

        driver.switchTo().window(winStr1);
        System.out.println("Page Title1: "+driver.getTitle());

        driver.switchTo().window(winStr2);
        System.out.println("Page Title2: "+driver.getTitle());

        driver.quit();
    }
}
