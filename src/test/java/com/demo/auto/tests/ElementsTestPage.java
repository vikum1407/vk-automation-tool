package com.demo.auto.tests;

import com.demo.auto.Elements_MainPage;
import com.demo.auto.Elements_TextBoxPage;
import com.dialog.auto.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsTestPage extends TestBase {

    Elements_MainPage elements_mainPage;
    Elements_TextBoxPage elements_textBoxPage;

    public ElementsTestPage(){
        super();
    }

    @BeforeMethod
    public void setupMethod(){
        initialization();
        elements_mainPage = new Elements_MainPage();
        elements_textBoxPage = new Elements_TextBoxPage();
    }

    @Test
    public void clickElementBtn(){
        elements_mainPage.clickElementBtn();
    }

    @Test
    public void validateElementsHeader(){
        //elements_mainPage.validateElementsHeader();
        Assert.assertEquals(elements_mainPage.validateElementsHeader(),"Elements");
    }


    @AfterMethod
    public void tierDownMethod(){
        driver.quit();
    }
}
