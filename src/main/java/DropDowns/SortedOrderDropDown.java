package DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedOrderDropDown {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hdfcbank.com");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
        WebElement drpElement = driver.findElement(By.name("category_id"));

        Select drpSelect = new Select(drpElement);

        List<WebElement> allOptions = drpSelect.getOptions();

        /*
         *Here we need to create one Original list and another one for Temporary list
         *
         * */

        ArrayList originalList = new ArrayList(); // need to get and save relavent valus from 'allOptions' to the originalList
        ArrayList tempList = new ArrayList(); // need to get and save relavent valus from 'allOptions' to the tempList

        for (WebElement options:allOptions)
        {
            originalList.add(options.getText());
            tempList.add(options.getText()); // up to this level both are have same values
        }

        System.out.println("Original List: "+originalList);
        System.out.println("Original List: "+tempList);

        Collections.sort(tempList); //sorting of the temp list

        System.out.println("Original List: "+originalList);
        System.out.println("Original After List: "+tempList);

        //compare sorting tem list against the original list
        if (originalList.equals(tempList))
        {
            System.out.println("DropDown Sorted...");
        }else {
            System.out.println("DropDown not Sorted...");
        }

    }
}
