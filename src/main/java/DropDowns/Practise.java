package DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Practise {
    public static WebDriver driver;
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.opencart.com/index.php?route=account/register");
        driver.manage().window().maximize();

        WebElement drp = driver.findElement(By.xpath("//select[@id='input-country']"));

        Select allOptions = new Select(drp);
        List<WebElement> list = allOptions.getOptions();

        for (WebElement alList:list){
            if (alList.getText().equals("vikum")){
                alList.click();
                break;
            }
        }

    }


}
