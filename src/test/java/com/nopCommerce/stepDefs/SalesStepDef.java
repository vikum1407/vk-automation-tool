package com.nopCommerce.stepDefs;

import com.nopcommerce.testbase.TestBase;
import com.nopcommerce.testpages.SalesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SalesStepDef extends TestBase {
    @Given("I am in the sales portal")
    public void iAmInTheSalesPortal() {
        initialization();
        driver.get(prop.getProperty("url"));
    }

    @And("I click the orders tab under catalog")
    public void iClickTheOrdersTabUnderCatalog() throws InterruptedException {
        SalesPage sales = new SalesPage(driver);
        sales.clickOrderTab();
    }

    @Then("I should see the order title")
    public void iShouldSeeTheOrderTitle() {
        SalesPage sales = new SalesPage(driver);
        sales.validateOrderTitle();
    }

    @And("I should select the start date")
    public void iShouldSelectTheStartDate() throws InterruptedException {
        SalesPage sales = new SalesPage(driver);
        sales.startDate();
    }

    @And("I click select the end date")
    public void iClickSelectTheEndDate() throws InterruptedException {
        SalesPage sales = new SalesPage(driver);
        sales.endDate();
    }
}
