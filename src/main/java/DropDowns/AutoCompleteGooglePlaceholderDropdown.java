package DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutoCompleteGooglePlaceholderDropdown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        driver.get("https://www.twoplugs.com");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();

        WebElement searchbox = driver.findElement(By.id("autocomplete"));
        searchbox.click();

        searchbox.sendKeys("Toronto"); //when u enter this of the field u can't get the listdown elements xpath

        //here we need to use down or upper arrow key

        String text;

        do {
            searchbox.sendKeys(Keys.ARROW_DOWN);
            text = searchbox.getAttribute("value");

            if (text.equals("Toronto, OH, USA")){
                searchbox.sendKeys(Keys.ENTER);
                break;
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (!text.isEmpty());



    }
}
