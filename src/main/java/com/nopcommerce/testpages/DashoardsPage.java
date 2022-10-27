package com.nopcommerce.testpages;

import com.nopcommerce.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;

public class DashoardsPage extends TestBase {

    public DashoardsPage(){
        PageFactory.initElements(driver,this);
    }
}
