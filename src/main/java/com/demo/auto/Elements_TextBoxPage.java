package com.demo.auto;

import com.dialog.auto.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Elements_TextBoxPage extends TestBase {



    public Elements_TextBoxPage(){
        PageFactory.initElements(driver,this);
    }


}
