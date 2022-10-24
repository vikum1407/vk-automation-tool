package DataPickers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DataPicker_DropDown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//input[@id='dob']")).click(); //opens the date picker

        WebElement monthEle = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
        Select month_drp = new Select(monthEle);
        month_drp.selectByVisibleText("Apr");

        WebElement yearEle = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
        Select year_drp = new Select(yearEle);
        year_drp.selectByVisibleText("1991");


        //Select date
        String date = "14";

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        for (WebElement dates:allDates)
        {
            String dt = dates.getText();
            if (dt.equals(date)){
                dates.click();
                break;
            }
        }

    }
}
