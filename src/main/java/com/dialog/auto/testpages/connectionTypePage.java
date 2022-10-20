package com.dialog.auto.testpages;

import com.dialog.auto.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class connectionTypePage extends TestBase {


    @FindBy(xpath = "//div[@class='slick-track']")
    WebElement planTypes;

    //@FindBy(xpath = "(//h5[@class='mt-4'][contains(text(),'Rs.')])[6]")
    @FindBy(xpath = "//div[@class='card dtv-card level-2 text-center my-3 mx-2 mx-xl-3 slick-slide slick-active']//a[@class='btn btn-danger o2a-package-select--continue' and text()='Select']")
    WebElement type2280;

    List<WebElement> allPlanTypes = driver.findElements(By.xpath("//div[@class='slick-list draggable']"));

    public connectionTypePage(){
        PageFactory.initElements(driver,this);
    }

    public void planTypesMethod(List<WebElement> options, String value){
        for (WebElement allPlans:options){
            if (allPlans.getText().equals(value)){
                //allPlans.click();
                type2280.click();
                break;
            }
        }
    }

    public void clickSelectedMobileType(){

        Actions action = new Actions(driver);
        action.moveToElement((WebElement) planTypes);
        action.perform();

        planTypesMethod(allPlanTypes," Rs.   2280.00");
        Assert.assertEquals(" Rs.   2280.00"," Rs.   2280.00");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        type2280.click();

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click();",commonPlanSelection(plan2280,"Rs. 2280 Plan"));

    }
}
