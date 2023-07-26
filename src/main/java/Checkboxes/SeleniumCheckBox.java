package Checkboxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;

public class SeleniumCheckBox {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().window().maximize();

        /**
         * Select conditional checkboxe/s
         */
        List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

        for (WebElement options:allCheckboxes){
            String day = options.getAttribute("id");
            if (day.equals("monday") || day.equals("wednesday")){
                options.click();
            }
        }
    }
}

