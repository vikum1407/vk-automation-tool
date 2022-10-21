package DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class NormalDropDown {

    public static void main(String args[]){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.opencart.com");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@class='btn btn-black navbar-btn']")).click();
    //    String headers = driver.findElement(By.xpath("(//h3[normalize-space()='Register for OpenCart account'])[1]")).getText();
    //    Assert.assertEquals(headers,"Register for OpenCart account");

        WebElement countryDrp = driver.findElement(By.xpath("(//select[@id='input-country'])[1]"));

        Select options = new Select(countryDrp);
        List<WebElement> allOptions = options.getOptions();

        for (WebElement drp:allOptions){
            if (drp.getText().equals("Sri Lanka")){
                drp.click();
                break;
            }
        }
    }
}
