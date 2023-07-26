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

        List<WebElement> days = driver.findElements(By.xpath("//input[@class='form-check-input' and contains(@id, 'day')]"));
        for (WebElement day:days){
            String Monday = day.getAttribute("id");
            if (Monday.equals("Monday")){
                day.click();
            }
        }

        for (int i=0; i<days.size(); i++){
            String web = days.get(i).getAttribute("id");
            if (web.equals("Sunday")){
                days.get(i).click();
            }
        }


    }
}
