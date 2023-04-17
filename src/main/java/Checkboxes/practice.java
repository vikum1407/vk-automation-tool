package Checkboxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class practice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        List<WebElement> dayList = driver.findElements(By.xpath("//*[contains(@id,'day')]"));
        for (WebElement list:dayList){
            String attribute=list.getAttribute("id");
            if (attribute.equals("thursday")){
                list.click();
            }
        }
    }
}
