package iFrameAndiFrameHandle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InneriFrame {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Frames.html");

        //driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

        WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerFrame); // here passing iframe as webelement

        WebElement innerIframe = driver.findElement(By.xpath("iframe[src='SingleFrame.html']"));
        driver.switchTo().frame(innerIframe); // here passing iframe as webelement

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vikum");

    }
}
