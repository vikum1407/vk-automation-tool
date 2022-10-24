package com.dialog.auto.testpages;

import com.dialog.auto.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class purchaseASim extends TestBase {

    @FindBy(xpath = "//*[@id=\"o2a-step-2\"]/div[3]/div/h6")
    WebElement headLine;

    @FindBy(xpath = "//*[@id=\"ends-with-checkbox\"][@value=2]")
    WebElement foreignerBtn;

    @FindBy(xpath = "//*[@id=\"o2a-step2-passport\"]")
    WebElement numberInert;

    @FindBy(xpath = "//*[@id=\"continue-button\"]")
    WebElement continueBtn;

    public purchaseASim(){
        PageFactory.initElements(driver,this);
    }

    public boolean validateHeadLine(){
        boolean header = headLine.isDisplayed();
        return header;
    }

    public void clickForeignerBtn(){
        foreignerBtn.click();
    }

    public void insertNumber(){
        numberInert.sendKeys("11112222333");
    }

    public void clickContinueBtn(){
        continueBtn.click();
    }
}
