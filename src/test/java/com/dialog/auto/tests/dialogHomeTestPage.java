package com.dialog.auto.tests;

import com.dialog.auto.testbase.TestBase;
import com.dialog.auto.testpages.dialogHomePage;
import com.dialog.auto.testpages.mobileProductAndServicePage;
import org.junit.Before;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class dialogHomeTestPage extends TestBase {

    dialogHomePage dialogHomePage;
    mobileProductAndServicePage mobileProductAServicePage;

    public dialogHomeTestPage(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        dialogHomePage = new dialogHomePage();
        mobileProductAServicePage = new mobileProductAndServicePage();
    }

    @Test
    public void verifyDialogIcon(){
        boolean img = dialogHomePage.verifyDialogIcon();
        Assert.assertTrue(img);
    }

    @Test
    public void clickMobileBtn(){
        mobileProductAServicePage = dialogHomePage.clickMobileBtn();

    }



    @AfterMethod
    public void tierDown(){
        driver.quit();
    }
}
