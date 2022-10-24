package com.demo.auto;

import com.dialog.auto.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Elements_MainPage extends TestBase {

    @FindBy(xpath = "(//div[@class='category-cards'])[1]")
    WebElement elementsBtn;

    @FindBy(xpath = "//div[@class='main-header']")
    WebElement elementsHeader;

    public Elements_MainPage(){
        PageFactory.initElements(driver,this);
    }

    public Elements_TextBoxPage clickElementBtn(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementsBtn.click();

        return new Elements_TextBoxPage();
    }

    public String validateElementsHeader(){
        String header = elementsHeader.getText();
        return header;
    }
}
