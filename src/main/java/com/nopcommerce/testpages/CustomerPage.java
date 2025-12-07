package com.nopcommerce.testpages;

import com.nopcommerce.testbase.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class CustomerPage extends TestBase {

    @FindBy(xpath = "//input[@id='SearchEmail']")
    WebElement email;

    @FindBy(xpath = "//input[@id='SearchFirstName']")
    WebElement fname;

    @FindBy(xpath = "//input[@id='SearchLastName']")
    WebElement lname;

    @FindBy(xpath = "//button[@id='search-customers']")
    WebElement searchBtn;

    @FindBy(xpath = "//h1[normalize-space()='Customers']")
    WebElement customerTitile;

    @FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
    WebElement customerMainTab;

    @FindBy(xpath = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
    WebElement customerSubTab;

    public CustomerPage(WebDriver driver){
        PageFactory.initElements(TestBase.driver,this);
    }

    public void enterEmailAddress(String fname){
        email.sendKeys(fname);
    }

    public void enterFname(String ftname){
        fname.sendKeys(ftname);
    }

    public void enterLname(String ltname){
        lname.sendKeys(ltname);
    }

    public void clickSearchBtn(){
        searchBtn.click();
    }

    public String validateTitle(){
        String title = customerTitile.getText();
        return title;
    }
}
