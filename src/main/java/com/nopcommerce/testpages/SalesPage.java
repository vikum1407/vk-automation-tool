package com.nopcommerce.testpages;

import com.nopcommerce.testbase.TestBase;
import com.nopcommerce.util.CommonMethods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesPage extends TestBase {

    CommonMethods common=new CommonMethods();

    @FindBy(xpath = "//p[normalize-space()='Sales']")
    WebElement salesBtn;

    @FindBy(xpath = "//a[@href='/Admin/Order/List']")
    WebElement ordersTab;

    @FindBy(xpath = "//a[@href='/Admin/Order/ShipmentList']")
    WebElement shipmentTab;

    @FindBy(xpath = "//a[@href='/Admin/ReturnRequest/List']")
    WebElement returnRequestTab;

    @FindBy(xpath = "//a[@href='/Admin/RecurringPayment/List']")
    WebElement recurringPaymentTab;

    @FindBy(xpath = "//a[@href='/Admin/GiftCard/List']")
    WebElement giftcardTab;

    @FindBy(xpath = "//p[normalize-space()='Shopping carts and wishlists']")
    WebElement shoppingCartsTab;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    WebElement exportBtn;

    @FindBy(xpath = "//h1[normalize-space()='Orders']")
    WebElement orderTitle;

    @FindBy(xpath = "//span[@aria-controls='StartDate_dateview']")
    WebElement startDate;

    @FindBy(xpath = "//span[@aria-controls='EndDate_dateview']")
    WebElement endDate;

    @FindBy(xpath = "//span[@class='k-icon k-i-arrow-60-left']")
    WebElement next;

    @FindBy(xpath = "//div[@id='f90382cd-c283-445e-8072-5a4893d71450']//table[@class='k-content k-month']//td")
    List<WebElement> startDateCalender;

    @FindBy(xpath = "//div[@id='4d5675fc-5bc2-4899-9541-51f1bf8def98']//table[@class='k-content k-month']//td")
    List<WebElement> endDateCalender;

    //xpath = "//a[normalize-space()='April 2022']"
    @FindBy(css = ".k-link.k-nav-fast")
    WebElement dateBar;

    @FindBy(xpath = "//input[@id='search-product-name']")
    WebElement orderProduct;

    @FindBy(xpath = "//ul[@id='OrderStatusIds_listbox']//li[@role='option']")
    WebElement orderStatusList;

    @FindBy(xpath = "//ul[@id='PaymentStatusIds_listbox']//li[@role='option']")
    WebElement paymentStatusList;

    @FindBy(xpath = "//ul[@id='ShippingStatusIds_listbox']//li[@role='option']")
    WebElement shippingStatusList;

    @FindBy(xpath = "//select[@id='VendorId']")
    WebElement vendorList;

    @FindBy(xpath = "//select[@id='BillingCountryId']")
    WebElement countryList;

    @FindBy(xpath = "//select[@id='PaymentMethodSystemName']")
    WebElement paymentMethodList;

    @FindBy(xpath = "//select[@id='WarehouseId']")
    WebElement warehouseList;



    public SalesPage(WebDriver driver){
        PageFactory.initElements(TestBase.driver,this);
    }

    public void clickOrderTab() throws InterruptedException {
        salesBtn.click();
        Thread.sleep(2000);
        ordersTab.click();
    }

    public void clickShipmentTab(){
        shipmentTab.click();
    }

    public void clickReturnRequestTab(){
        returnRequestTab.click();
    }

    public void clickRecurringPaymentTab(){
        returnRequestTab.click();
    }

    public void clickGiftcardTab(){
        giftcardTab.click();
    }

    public void clickShoppingCartTab(){
        shoppingCartsTab.click();
    }

    public void startDate() throws InterruptedException {
        startDate.click();
        Thread.sleep(2000);
        common.selectCalenderDate(prop.getProperty("styear"), prop.getProperty("stmonth"), prop.getProperty("stdate"), dateBar, next, startDateCalender);
    }

    public void endDate() throws InterruptedException {
        endDate.click();
        Thread.sleep(2000);
        common.selectCalenderDate(prop.getProperty("enyear"), prop.getProperty("enmonth"), prop.getProperty("endate"), dateBar, next, endDateCalender);
    }

    public void validateOrderTitle(){
        common.validateIconsPresents(orderTitle);
    }
}
