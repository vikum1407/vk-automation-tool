package com.dialog.auto.tests;

import com.dialog.auto.testbase.TestBase;
import com.dialog.auto.testpages.dialogHomePage;
import com.dialog.auto.testpages.mobileProductAndServicePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mobileProductAServiceTestPage extends TestBase {
    dialogHomePage dialogHomePage;
    dialogHomeTestPage dialogHomeTestPage;
    mobileProductAndServicePage mobileProductAndServicePage;

    public mobileProductAServiceTestPage(){
        super();
    }

    @BeforeMethod
    public void setUpMethod(){
        initialization();
        dialogHomePage = new dialogHomePage();
        //dialogHomeTestPage = new dialogHomeTestPage();
        mobileProductAndServicePage = dialogHomePage.clickMobileBtn();
    }

    @Test
    public void validateServicePage(){
        boolean mobileImg = mobileProductAndServicePage.validateServicePage();
        Assert.assertTrue(mobileImg);
    }

    @Test
    public void clickMobileRatePlans(){
        mobileProductAndServicePage.clickMobileRatePlans();
    }

    @AfterMethod
    public void tierDown(){
        driver.quit();
    }
}
