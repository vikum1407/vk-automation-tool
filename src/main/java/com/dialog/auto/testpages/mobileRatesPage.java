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
    //PostpaidPlan1200
    //PostpaidPlan1950

    List<WebElement> allMobilePlans = driver.findElements(By.xpath("section[@class='pp-valued-plans']//div[@class='container container-sm container-full']//div[2]"));
    //#popplans > div > div
    ////section[@class='pp-valued-plans']//div[@class='container container-sm container-full']//div[2]

    public mobileRatesPage(){
        PageFactory.initElements(driver,this);
    }


    public void commonPlanSelection(List<WebElement> options, String value){
        for (WebElement allPlans:options){
            if (allPlans.getText().equals(value)){
        /*        //allPlans.click();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                plan2280.click();*/
                break;
            }
        }
    }

    public connectionTypePage clickSelectedMobileRatePlan(){

        Actions action = new Actions(driver);
        action.moveToElement(plans);
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        action.perform();

        commonPlanSelection(allMobilePlans,"Rs. 2280 Plan");
        //Assert.assertEquals("Rs. 2280 Plan","Rs. 2280 Plan");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        plan2280.click();

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click();",commonPlanSelection(plan2280,"Rs. 2280 Plan"));
        return new connectionTypePage();

    }

}
