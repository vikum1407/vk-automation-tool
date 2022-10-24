package com.dialog.auto.tests;

import com.dialog.auto.testbase.TestBase;
import com.dialog.auto.testpages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class purchaseASimTestPage extends TestBase {

    dialogHomePage dialogHomePage;
    mobileRatesPage mobileRatesPage;
    mobileProductAndServicePage mobileProductAndServicePage;
    connectionTypePage connectionTypePage;
    purchaseASim purchaseASim;

    public purchaseASimTestPage(){
        super();
    }

    @BeforeMethod
    public void setUpMethod(){
        initialization();
        dialogHomePage = new dialogHomePage();
        //dialogHomeTestPage = new dialogHomeTestPage();
        mobileProductAndServicePage = dialogHomePage.clickMobileBtn();
        mobileRatesPage = mobileProductAndServicePage.clickMobileRatePlans();
        connectionTypePage = mobileRatesPage.clickSelectedMobileRatePlan();

    }

    @Test
    public void validateHeadLine(){
        purchaseASim.validateHeadLine();

    }


    @AfterMethod
    public void tierDownMethod(){

        driver.quit();
    }
}
