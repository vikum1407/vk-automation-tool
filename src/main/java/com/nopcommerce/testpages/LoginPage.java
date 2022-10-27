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

        return new DashoardsPage();
    }

    public boolean checkNopCommerceLogo(){

        return logo.isDisplayed();
    }

    public String checkDashboard(){

        return dashboardHeader.getText();
    }
}
