package com.dialog.auto.testpages;

import com.dialog.auto.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mobileProductAndServicePage extends TestBase {

    @FindBy(xpath = "//h2[normalize-space()='Mobile']")
    WebElement mobileImg;

    @FindBy(xpath = "//a[normalize-space()='Mobile Rate Plans']")
    WebElement mobileRatePlans;

    public mobileProductAndServicePage(){
        PageFactory.initElements(driver,this);
    }

    public boolean validateServicePage(){
        return mobileImg.isDisplayed();
    }

    public mobileRatesPage clickMobileRatePlans(){

        Actions action = new Actions(driver);
        action.moveToElement(mobileRatePlans);
        action.perform();
        mobileRatePlans.click();
        //action.click();

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click();",mobileRatePlans);

        //mobileRatePlans.click();
        return new mobileRatesPage();
    }
}
