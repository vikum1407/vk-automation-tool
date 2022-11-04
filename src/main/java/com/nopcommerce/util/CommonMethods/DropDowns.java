package com.nopcommerce.util.CommonMethods;

import com.nopcommerce.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDowns {

    public static void commonDropDown(WebElement dropdown, String value){
        Select options = new Select(dropdown);
        List<WebElement> allOptions = options.getOptions();

        for (WebElement op:allOptions){
            String ops = op.getText();
            if(ops.equals(value)){
                op.click();
                break;
            }
        }
    }
}
