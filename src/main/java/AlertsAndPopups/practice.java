package AlertsAndPopups;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class practice {

    public static void main(String[] args) throws InterruptedException {

       WebDriverManager.firefoxdriver().setup();
       WebDriver driver = new FirefoxDriver();

       driver.get("https://cosmocode.io/automation-practice-webtable/");
       driver.manage().window().maximize();

       WebElement table = driver.findElement(By.cssSelector("#countries > tbody"));
        Actions actions = new Actions(driver);
        actions.moveToElement(table).perform();

        Thread.sleep(2000);

        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
        int rowCount = tableRows.size();
        System.out.println("Rows Count: "+rowCount);

        String countryName = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[2]/td[2]")).getText();
        System.out.println("Country Value: "+countryName);

       //find 'Algeria' currency

        for (int i=0; i<rowCount; i++){

            String algoria = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td[2]")).getText();

            if (algoria.equals("Algeria")){

                String currency = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td[3]")).getText();
                System.out.println("Algeria Currency: "+currency);

            }
        }

    }
}
