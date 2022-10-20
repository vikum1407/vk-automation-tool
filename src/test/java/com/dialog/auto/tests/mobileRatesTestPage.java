package com.dialog.auto.tests;

import com.dialog.auto.testbase.TestBase;
import com.dialog.auto.testpages.dialogHomePage;
import com.dialog.auto.testpages.mobileProductAndServicePage;
import com.dialog.auto.testpages.mobileRatesPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mobileRatesTestPage extends TestBase {

    dialogHomePage dialogHomePage;
    mobileRatesPage mobileRatesPage;
    mobileProductAndServicePage mobileProductAndServicePage;

    public mobileRatesTestPage(){
        super();
    }

    @BeforeMethod
    public void setUpMethod(){
        initialization();
        dialogHomePage = new dialogHomePage();
        //dialogHomeTestPage = new dialogHomeTestPage();
        mobileProductAndServicePage = dialogHomePage.clickMobileBtn();
        mobileRatesPage = mobileProductAndServicePage.clickMobileRatePlans();

    }

    @Test
    public void clickSelectedMobileRatePlan(){
        mobileRatesPage.clickSelectedMobileRatePlan();
    }




    @AfterMethod
    public void tierDownMethod(){
        driver.quit();
    }
}
