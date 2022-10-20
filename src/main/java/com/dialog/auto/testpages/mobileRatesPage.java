package com.dialog.auto.testpages;

import com.dialog.auto.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class mobileRatesPage extends TestBase {

    @FindBy(xpath = "//ul[@class='slides']")
    WebElement plans;

    @FindBy(xpath = "//div[@class='pp-slider-block']//a[@id='PostpaidPlan1950']")
    WebElement plan2280;

    List<WebElement> allMobilePlans = driver.findElements(By.xpath("//div[@class='pp-slider-block']//h2"));


    public mobileRatesPage(){
        PageFactory.initElements(driver,this);
    }


    public void commonPlanSelection(List<WebElement> options, String value){
        for (WebElement allPlans:options){
            if (allPlans.getText().equals(value)){
                //allPlans.click();
                plan2280.click();
                break;
            }
        }
    }

    public connectionTypePage clickSelectedMobileRatePlan(){

        Actions action = new Actions(driver);
        action.moveToElement((WebElement) plans);
        action.perform();

        commonPlanSelection(allMobilePlans,"Rs. 2280 Plan");
        Assert.assertEquals("Rs. 2280 Plan","Rs. 2280 Plan");
        plan2280.click();

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click();",commonPlanSelection(plan2280,"Rs. 2280 Plan"));
        return new connectionTypePage();

    }

}
