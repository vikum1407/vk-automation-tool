package com.nopcommerce.testpages;

import com.nopcommerce.testbase.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @FindBy(xpath = "//h1[normalize-space()='Admin area demo']")
    WebElement pageHeader;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginBtn;

    @FindBy(xpath = "//img[@class='brand-image-xl logo-xl']")
    WebElement logo;

    @FindBy(xpath = "//h1[normalize-space()='Dashboard']")
    WebElement dashboardHeader;

    //==========================
    @FindBy(xpath = "//p[normalize-space()='Catalog']")
    WebElement catalogBtn;

    @FindBy(xpath = "(//li[@class='nav-item'])[7]")
    WebElement productTab;

    @FindBy(xpath = "//h1[normalize-space()='Products']")
    WebElement pageHeader2;

    @FindBy(xpath = "//input[@id='SearchProductName']")
    WebElement productName;

    @FindBy(xpath = "//button[@id='search-products']")
    WebElement searchBtn;

    @FindBy(xpath = "//div[@id='products-grid_wrapper']//div[@class='row']")
    WebElement searchBox;

    @FindBy(xpath = "//div[@id='products-grid_wrapper']//div[@class='row']//div//div//td")
    WebElement tableData;

    //========================

    public LoginPage(WebDriver driver){
        PageFactory.initElements(TestBase.driver,this);
    }

    public String headerName(){
        String headerName = pageHeader.getText();
        headerName.equals("Admin area demo");
        return headerName();
    }

    public void enterUSandPW(String username, String passowrd) throws InterruptedException {
            email.clear();
            password.clear();
            Thread.sleep(2000);
            email.sendKeys(username);
            password.sendKeys(passowrd);

    }

    public DashoardsPage clickLoginButton(){
        try {
            loginBtn.click();
        }catch (Exception e){
            System.out.println("Error occured when login button");
        }

        return new DashoardsPage(driver);
    }

    public boolean checkNopCommerceLogo(){

        return logo.isDisplayed();
    }

    public String checkDashboard(){

        return dashboardHeader.getText();
    }

   /* //===========================

    public void clickProductBtn() throws InterruptedException {
        catalogBtn.click();
        Thread.sleep(1000);
        productTab.click();
    }

    public boolean isDisplayHeader(){
        return pageHeader2.isDisplayed();
    }

    public CatalogPage clickSearchBtn(){
        searchBtn.click();

        return new CatalogPage();
    }

    public void productNameSend(String proName){
        productName.sendKeys(proName);
    }

    public boolean isDisplayDataTable(){
        return searchBox.isDisplayed();
    }*/

}
