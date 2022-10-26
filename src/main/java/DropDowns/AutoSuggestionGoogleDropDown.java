package DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestionGoogleDropDown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");

        List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]//span"));
        System.out.println("Count of Auto suggestion: "+list.size());

        for (WebElement allOption:list){
            if (allOption.getText().equals("selenium webdriver")){ //here instead of equals u can use contains too
                allOption.click();
                break;
            }
        }
    }
}
