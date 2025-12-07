package com.nopcommerce.testpages;

import com.nopcommerce.testbase.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LowStockPage extends TestBase {

    @FindBy(xpath = "//select[@id='SearchPublishedId']")
    WebElement publishedDrp;

    @FindBy(xpath = "//div[@class='search-text']")
    WebElement searchTxt;

    @FindBy(xpath = "//h1[normalize-space()='Low stock']")
    WebElement headerName;

    @FindBy(xpath = "//button[@id='search-products']")
    WebElement searchBtn;

    @FindBy(xpath = "//table[@id='products-grid']")
    WebElement reportsTB;

    public LowStockPage(WebDriver driver){
        PageFactory.initElements(TestBase.driver,this);
    }

    public String validatepageHeader(){
        String headerNametxt = headerName.getText();
        return headerNametxt;
    }

    public String validateSearchtxt(){
        String searchtxt = searchTxt.getText();
        return searchtxt;
    }


}
