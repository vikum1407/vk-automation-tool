package Checkboxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class selectCheckBox {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().window().maximize();

        //01. Select specific checkbox
        //driver.findElement(By.xpath("//input[@id='monday']")).click();

        //02. Select all the checkboxes
        List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

        for (int i=0; i<allCheckboxes.size(); i++){
            allCheckboxes.get(i).click();
        }

        //by using for each loop
        for(WebElement option:allCheckboxes){
            option.click();
        }

        //03. By choice randamly select checkboxes (select monday and sunday only)

        for (WebElement op:allCheckboxes){
                String checkboxName = op.getAttribute("id");
                if (checkboxName.equals("monday") || checkboxName.equals("sunday")){
                    op.click();
                }
        }

        //04. I wont to select last two checkboxes

        for (int i=allCheckboxes.size()-2; i<allCheckboxes.size(); i++){
            allCheckboxes.get(i).click();
        }

        //04. I wont to select first two checkboxes

        for (int i=0; i<allCheckboxes.size(); i++){
            if (i<3) {
                allCheckboxes.get(i).click();
            }
        }

    }
}
