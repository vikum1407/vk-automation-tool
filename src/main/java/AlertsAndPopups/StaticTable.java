package AlertsAndPopups;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable {

    private static int colCount;


    public static void main(String args[]){



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cosmocode.io/automation-practice-webtable/");

        driver.manage().window().maximize();

        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
        int rowCount = tableRows.size();
        System.out.println("Rows Count: "+rowCount);

        String countryName = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[2]/td[2]")).getText();
        System.out.println("Country Value: "+countryName);

        //Retrieve all data from the table

        //List<WebElement> allTBData = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td"));

        /*
        //get the all data
        for (int r=0; r<rowCount; r++){
            for (int c=0; c<colCount; c++){
                String allData = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+r+"]/td["+c+"]")).getText();
                System.out.println("All Data: "+allData);
            }
        }
            */
        //Find conditional country wit two condition

        for (int r=0; r<rowCount; r++){ // below see how to parameterize a xpath with row ["+r+"]

            String country = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+r+"]/td[2]")).getText();

            if(country.equals("Sri Lanka")){

                String capital = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+r+"]/td[3]")).getText();
                String currency = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+r+"]/td[4]")).getText();
                System.out.println(country+"   "+capital+"   "+currency);
            }
        }





        driver.quit();

    }
}
