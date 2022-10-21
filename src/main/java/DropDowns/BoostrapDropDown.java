package DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BoostrapDropDown {
    public static void main(String args[]) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hdfcbank.com");

        driver.manage().window().maximize();

        /*
        * When boostrap web, there you should click first to select the list down option
        *
        * */

        driver.findElement(By.xpath("//div[@class='drp']//div[@class='dropdown']")).click();

        //Capture the all option which are listed down
        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='dropdown-1']//li"));
        allOptions.size(); //find how many options

        for(WebElement options:allOptions){
            if (options.getText().equals("Account")){
                options.click();
                break;
            }
        }



    }
}
