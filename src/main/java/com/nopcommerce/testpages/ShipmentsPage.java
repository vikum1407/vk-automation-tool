package com.nopcommerce.testpages;

import com.nopcommerce.testbase.TestBase;
import com.nopcommerce.util.CommonMethods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.awt.windows.WBufferStrategy;

public class ShipmentsPage extends TestBase {

    CommonMethods commonMethods = new CommonMethods();

    @FindBy(xpath = "//p[normalize-space()='Shipments']")
    WebElement shipmentTab;


    @FindBy(xpath = "//button[@class='btn btn-info']")
    WebElement printPackageslipBtn;

    @FindBy(xpath = "//button[@id='ship-selected']")
    WebElement shipSelectedBtn;

    @FindBy(xpath = "//button[@id='ready-for-pickup-selected']")
    WebElement readyForPickipBtn;

    @FindBy(xpath = "//button[@id='deliver-selected']")
    WebElement deliveryBtn;

    @FindBy(xpath = "//h1[normalize-space()='Shipments']")
    WebElement shipmentHeader;

    @FindBy(xpath = "//span[@aria-controls='StartDate_dateview']")
    WebElement startDateCal;

    @FindBy(xpath = "//span[@aria-controls='EndDate_dateview']")
    WebElement endDateCal;

    @FindBy(xpath = "//input[@id='TrackingNumber']")
    WebElement trackingNo;

    @FindBy(xpath = "//select[@id='WarehouseId']")
    WebElement warehouseDrp;

    @FindBy(xpath = "//select[@id='CountryId']")
    WebElement countryDrp;

    @FindBy(xpath = "//select[@id='StateProvinceId']")
    WebElement provinceDrp;

    @FindBy(xpath = "//input[@id='County']")
    WebElement county;

    @FindBy(xpath = "//input[@id='City']")
    WebElement city;

    @FindBy(xpath = "//input[@id='LoadNotDelivered']")
    WebElement loadNotDeli;

    @FindBy(xpath = "//input[@id='LoadNotShipped']")
    WebElement loadNotShip;

    @FindBy(xpath = "//input[@id='LoadNotReadyForPickup']")
    WebElement loadNotReadyPick;

    @FindBy(xpath = "//button[@id='search-shipments']")
    WebElement searcShipBtn;

    @FindBy(xpath = "//p[normalize-space()='Sales']")
    WebElement salesBtn;


    public ShipmentsPage(WebDriver driver){
        PageFactory.initElements(TestBase.driver,this);
    }

    public String validateHeader(){
        String headerText=shipmentHeader.getText();
        return headerText;
    }

    public ShipmentsPage clickShipmentTab(){
        salesBtn.click();
        shipmentTab.click();
        return new ShipmentsPage(driver);
    }

    public void startCalMethod(){

    }

}
