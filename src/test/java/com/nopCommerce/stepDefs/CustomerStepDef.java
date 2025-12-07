package com.nopCommerce.stepDefs;

import com.nopcommerce.testbase.TestBase;
import com.nopcommerce.testpages.CustomerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;

import static com.nopcommerce.testbase.TestBase.initialization;

public class CustomerStepDef extends TestBase {

    @Given("I am in the customer portal")
    public void iAmInTheCustomerPortal() {
        initialization();
        driver.get(prop.getProperty("url"));
    }

    @And("I click the customers tab under customers")
    public void iClickTheCustomersTabUnderCustomers() {
        CustomerPage customerPage=new CustomerPage(driver);

    }

    @Then("I should see the customers title")
    public void iShouldSeeTheCustomersTitle() {
        CustomerPage customerPage=new CustomerPage(driver);
        Assert.assertEquals(customerPage.validateTitle(),"Customers");
    }

    @And("I should enter the {string} email")
    public void iShouldEnterTheEmail(String email) {
        CustomerPage customerPage=new CustomerPage(driver);
        customerPage.enterEmailAddress(email);
    }

    @And("I should enter fname as {string}")
    public void iShouldEnterFnameAs(String fname) {
        CustomerPage customerPage=new CustomerPage(driver);
        customerPage.enterFname(fname);
    }

    @And("I should enter lname as {string}")
    public void iShouldEnterLnameAs(String lname) {
        CustomerPage customerPage=new CustomerPage(driver);
        customerPage.enterLname(lname);
    }

    @Then("I should click search button")
    public void iShouldClickSearchButton() {
        CustomerPage customerPage=new CustomerPage(driver);
        customerPage.clickSearchBtn();
    }


}
