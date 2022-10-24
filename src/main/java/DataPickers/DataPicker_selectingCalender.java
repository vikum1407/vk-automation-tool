package DataPickers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DataPicker_selectingCalender {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://redbus.in");
        driver.manage().window().maximize();

        String year="2025";
        String month="Apr";
        String date = "14";

        driver.findElement(By.xpath("//input[@id='onward_cal']")).click(); //opens the date picker

        while (true) //Month and Year selection
        {
            String yearAndMonth = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText(); //date like "August 2021"

            //we need to get and check those two data individually
            String arr[] = yearAndMonth.split(" ");
            String mon = arr[0];
            String yr = arr[1];

            if (mon.equalsIgnoreCase(month) && yr.equals(year)) //equalIgnoreCase using, if there is any case sensitvity(single statement)
                 break;
            else
               driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
        }

        //Date Selection

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));

        for (WebElement dates:allDates)
        {
             String dt = dates.getText();
             if (dt.equals(date)){
                 dates.click();
             }
        }
    }
}
