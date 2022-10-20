package com.dialog.auto.testpages;

import com.dialog.auto.testbase.TestBase;
import org.apache.tools.ant.taskdefs.Recorder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class dialogHomePage extends TestBase {


    @FindBy(xpath = "//i[@class='MobileIcon']")
    WebElement mobileBtn;

    @FindBy(xpath = "//img[@alt='Dialog']")
    WebElement dialogIcon;


    public dialogHomePage(){
        PageFactory.initElements(driver,this);
    }

    public boolean verifyDialogIcon(){
        return dialogIcon.isDisplayed();
    }

    public mobileProductAndServicePage clickMobileBtn(){

        Actions action = new Actions(driver);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        action.moveToElement(mobileBtn);
        action.perform();
        mobileBtn.click();
        //action.click();

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click();",mobileBtn);


        return new mobileProductAndServicePage();

    }
}
