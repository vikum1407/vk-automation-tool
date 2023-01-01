package com.nopcommerce.testpages;

import com.nopcommerce.testbase.TestBase;
import com.nopcommerce.util.CommonMethods.CommonMethods;
import io.cucumber.java.bs.A;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashoardsPage extends TestBase {

    CommonMethods common=new CommonMethods();

    @FindBy(xpath = "//div[@id='orders-grid_wrapper']//div[@class='row']")
    WebElement orderTBView;

    @FindBy(xpath = "//a[@href='/Admin/Order/List'][normalize-space()='More info']")
    WebElement orderMore;

    @FindBy(xpath = "//table[@id='orders-grid']")
    WebElement orderTable;

    @FindBy(xpath = "//*[@id=\"orders-grid\"]/tbody/tr[1]/td[5]/a")
    WebElement VictoriaTercesView;

    @FindBy(xpath = "//td[contains(text(),'Victoria Terces (victoria_victoria@nopCommerce.com')]")
    WebElement VictoriaTercesCustomer;

    @FindBy(xpath = "//span[@class='grid-report-item green']")
    WebElement VictoriaCompleteStatus;

    @FindBy(xpath = "//td[normalize-space()='Brenda Lindgren (brenda_lindgren@nopCommerce.com)']")
    WebElement BrendaCustomer;

    @FindBy(xpath = "//tr[@class='even']//span[@class='grid-report-item blue'][normalize-space()='Processing']")
    WebElement BrendaCustomerStatus;

    @FindBy(xpath = "//*[@id=\"orders-grid\"]/tbody/tr[5]/td[5]/a")
    WebElement BrendaCustomerView;

    @FindBy(xpath = "//tr[@class='odd']//span[@class='grid-report-item yellow'][normalize-space()='Pending']")
    WebElement JamesPanStatus;

    @FindBy(xpath = "//td[normalize-space()='James Pan (james_pan@nopCommerce.com)']")
    WebElement JamesPanCustomer;

    @FindBy(xpath = "(//a[contains(text(),'View')])[3]")
    WebElement JamesPanView;

    @FindBy(xpath = "(//td[contains(text(),'03/13/2017 4:20:09 AM')])[2]")
    WebElement JamesPanCreatedDate;

    @FindBy(xpath = "//a[normalize-space()='Invoice (PDF)']")
    WebElement InvoicePDF;

    @FindBy(xpath = "(//table)[1]")
    WebElement billingAndShippingTB;

    @FindBy(xpath = "//td[normalize-space()='Brenda Lindgren']")
    WebElement fullNameBrenda;

    @FindBy(xpath = "//td[normalize-space()='James Pan']")
    WebElement fullnameJames;

    @FindBy(xpath = "//td[normalize-space()='james_pan@nopCommerce.com']")
    WebElement jamesEmail;

    @FindBy(xpath = "//td[normalize-space()='369258147']")
    WebElement jamesNo;

    @FindBy(xpath = "//td[normalize-space()='brenda_lindgren@nopCommerce.com']")
    WebElement emailBrenda;

    @FindBy(xpath = "//td[normalize-space()='14785236']")
    WebElement phoneNoBrenda;

    @FindBy(xpath = "//div[contains(text(),'Shipped')]")
    WebElement shippingStatus;

    @FindBy(xpath = "//a[normalize-space()='If You Wait (donation)']")
    WebElement donationBtn;

    @FindBy(xpath = "//h1[@class='float-left']")
    WebElement editProductionDetails;

    @FindBy(xpath = "//button[@id='product-editor-settings']")
    WebElement settingBtn;

    @FindBy(xpath = "//p[normalize-space()='Shipments']")
    WebElement shipmentTab;

    public DashoardsPage(WebDriver driver){
        PageFactory.initElements(TestBase.driver,this);
    }

    public String validateVictorisCustomer(){
       // JavascriptExecutor js= (JavascriptExecutor) driver;
       // js.executeScript(String.valueOf(orderTBView));

        Actions actions = new Actions(driver);
        actions.moveToElement(orderTBView);
        actions.perform();

        String VTText = VictoriaTercesCustomer.getText();

        System.out.println("-------------------------------"+VTText);

        return VTText;
    }

    public String validateBrendaCustomer(){
        Actions actions = new Actions(driver);
        actions.moveToElement(orderTBView);
        actions.perform();

        String BDText = BrendaCustomer.getText();

        return BDText;
    }

    public String validateJamesCustomer(){
        Actions actions = new Actions(driver);
        actions.moveToElement(orderTBView);
        actions.perform();

        String JMText = JamesPanCustomer.getText();

        return JMText;
    }

    public String validateVictoriaCustomerStatus(){
        Actions actions = new Actions(driver);
        actions.moveToElement(orderTBView);
        actions.perform();

        String status = VictoriaCompleteStatus.getText();

        return status;
    }

    public void clickVictoriaViewButton(){
        VictoriaTercesView.click();
    }

    public boolean checkInvoicePDFBtn(){
        return InvoicePDF.isDisplayed();
    }

    public String validateBrendaLindgrenStatus(){
        Actions actions=new Actions(driver);
        actions.moveToElement(orderTBView);
        actions.perform();

         return BrendaCustomerStatus.getText();

    }

    public void clickBrendaLindViewBtn(){
        BrendaCustomerView.click();
    }

    public void clickJamesViewBtn(){
        JamesPanView.click();
    }

    public boolean validateFullName(String fullname){
        Actions actions = new Actions(driver);
        actions.moveToElement(billingAndShippingTB);
        actions.perform();

        boolean st = common.validateText(fullNameBrenda,fullname);

        return st;
    }

    public boolean validateEmail(String email){
        Actions actions = new Actions(driver);
        actions.moveToElement(billingAndShippingTB);
        actions.perform();

        boolean st = common.validateText(emailBrenda,email);

        return st;
    }

    public boolean validateNumber(String email){
        Actions actions = new Actions(driver);
        actions.moveToElement(billingAndShippingTB);
        actions.perform();

        boolean st = common.validateText(phoneNoBrenda,email);

        return st;
    }

    public boolean validateFullNameJames(String fullname){
        Actions actions = new Actions(driver);
        actions.moveToElement(billingAndShippingTB);
        actions.perform();

        boolean st = common.validateText(fullnameJames,fullname);

        return st;
    }

    public boolean validateEmailJames(String email){
        Actions actions = new Actions(driver);
        actions.moveToElement(billingAndShippingTB);
        actions.perform();

        boolean st = common.validateText(jamesEmail,email);

        return st;
    }

    public boolean validateNumberJames(String email){
        Actions actions = new Actions(driver);
        actions.moveToElement(billingAndShippingTB);
        actions.perform();

        boolean st = common.validateText(jamesNo,email);

        return st;
    }

    public void clickDonationBtn(){
        Actions actions = new Actions(driver);
        actions.moveToElement(donationBtn);
        actions.perform();

        donationBtn.click();
    }

    public boolean validateEditProductDetails(){
        return editProductionDetails.isDisplayed();
    }

    public boolean validateSettingBtn(){
        return settingBtn.isDisplayed();
    }




}
