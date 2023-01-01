package com.nopCommerce.stepDefs;

import com.nopcommerce.testbase.TestBase;
import com.nopcommerce.testpages.ShipmentsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ShipmentsStepDef extends TestBase {

    @Given("I am login to the shipment portal")
    public void iAmLoginToTheShipmentPortal() {
        initialization();
        driver.get(prop.getProperty("url"));
    }

    @And("I should click shipment tab")
    public void iShouldClickShipmentTab() {
        ShipmentsPage shipmentsPage = new ShipmentsPage(driver);
        shipmentsPage.clickShipmentTab();

    }

    @And("I should see the shipments header")
    public void iShouldSeeTheShipmentsHeader() {
        ShipmentsPage shipmentsPage = new ShipmentsPage(driver);
        Assert.assertEquals(shipmentsPage.validateHeader(),"Shipments");
    }



}
