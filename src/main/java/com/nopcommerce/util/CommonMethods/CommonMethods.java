package com.nopcommerce.util.CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CommonMethods {

    public boolean state;

    public static void validateIconsPresents(WebElement element){
        element.isDisplayed();
    }

    public static void selectCalenderDate(String year, String month, String date, WebElement value, WebElement next, List<WebElement> element){

        String valueStr = value.getText();

        while (true) //Month and Year selection
        {
            //we need to get and check those two data individually
            String arr[] = valueStr.split(" ");
            String mon = arr[0];
            String yr = arr[1];

            if (mon.equalsIgnoreCase(month) && yr.equals(year)) //equalIgnoreCase using, if there is any case sensitvity(single statement)
                break;
            else
                next.click();
        }

        //Date Selection

   //     List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));

        for (WebElement dates:element)
        {
            String dt = dates.getText();
            if (dt.equals(date)){
                dates.click();
            }
        }

    }

    public boolean validateText(WebElement element, String text){
        if (element.getText().equals(text)){
            state=true;
        }
        return state;
    }


}
