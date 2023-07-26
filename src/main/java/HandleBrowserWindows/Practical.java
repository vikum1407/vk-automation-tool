package HandleBrowserWindows;

import io.cucumber.java.hu.Ha;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;
import java.util.*;

public class Practical {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions option = new ChromeOptions();
        option.setHeadless(true);

        driver.get("https://opensource-demo.orangehrmlive.com");

        String windStr = driver.getWindowHandle();
        System.out.println(windStr);

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parent = it.next();

        for (String ele:windows){
            String windowName = driver.switchTo().window(parent).getTitle();
        }
    }
}
