package com.nopCommerce.stepDefs;

import com.nopcommerce.testbase.TestBase;
import com.nopcommerce.testpages.DashoardsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.nopcommerce.testbase.TestBase.initialization;

public class DashboardStepDef extends TestBase {

    @Given("I am in the Dashboard portal")
    public void iAmInTheDashboardPortal() {
        if (driver == null) {
            initialization();
            driver.get(prop.getProperty("url"));
        }else {
            closeAllBrowsers();
            initialization();
            driver.get(prop.getProperty("url"));
        }

    }

    @And("I should see the Victoria customer")
    public void iShouldSeeTheVictoriaCustomer() {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        dashoardsPage.validateVictorisCustomer();
        Assert.assertEquals(dashoardsPage.validateVictorisCustomer(),"Victoria Terces (victoria_victoria@nopCommerce.com)");
    }

    @And("I should see the Complete status on Victoria customer")
    public void iShouldSeeTheCompleteStatusOnVictoriaCustomer() {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        Assert.assertEquals(dashoardsPage.validateVictoriaCustomerStatus(),"Complete");
    }

    @Then("I click view button")
    public void iClickViewButton() {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        dashoardsPage.clickVictoriaViewButton();
    }

    @And("I should see the Ivoice button")
    public void iShouldSeeTheIvoiceButton() {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        Assert.assertTrue(dashoardsPage.checkInvoicePDFBtn());
    }

    @And("I should see the Brenda Lindgren customer")
    public void iShouldSeeTheBrendaLindgrenCustomer() {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        Assert.assertEquals(dashoardsPage.validateBrendaCustomer(),"Brenda Lindgren (brenda_lindgren@nopCommerce.com)");
    }

    @And("I should see the Complete status on Brenda Lindgren customer")
    public void iShouldSeeTheCompleteStatusOnBrendaLindgrenCustomer() {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        Assert.assertEquals(dashoardsPage.validateBrendaLindgrenStatus(),"Processing");
    }

    @Then("I click Brenda Lindgren view button")
    public void iClickBrendaLindgrenViewButton() {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        dashoardsPage.clickBrendaLindViewBtn();
    }

    @Then("I should see the full name as {string}")
    public void iShouldSeeTheFullNameAs(String fullname) {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        Assert.assertTrue(dashoardsPage.validateFullName(fullname),"Brenda Lindgren");
    }

    @And("I should see the email address as {string}")
    public void iShouldSeeTheEmailAddressAs(String email) {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        Assert.assertTrue(dashoardsPage.validateEmail(email),"brenda_lindgren@nopCommerce.com");
    }

    @And("I should see the phone number as {string}")
    public void iShouldSeeThePhoneNumberAs(String number) {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        Assert.assertTrue(dashoardsPage.validateNumber(number),"14785236");
    }

    @Then("I should see the shipping status")
    public void iShouldSeeTheShippingStatus() {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
    }

    @Then("I click Brenda James Pan view button")
    public void iClickBrendaJamesPanViewButton() {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        dashoardsPage.clickDonationBtn();
    }

    @Then("I should click the product details to donation")
    public void iShouldClickTheProductDetailsToDonation() {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        dashoardsPage.clickDonationBtn();
    }

    @Then("I click James Pan view button")
    public void iClickJamesPanViewButton() {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        dashoardsPage.clickJamesViewBtn();
    }

    @Then("I should see the full name for james as {string}")
    public void iShouldSeeTheFullNameForJamesAs(String fullname) {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        dashoardsPage.validateFullNameJames(fullname);
    }

    @And("I should see the email address for james as {string}")
    public void iShouldSeeTheEmailAddressForJamesAs(String email) {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        dashoardsPage.validateEmailJames(email);
    }

    @And("I should see the phone number for james as {string}")
    public void iShouldSeeThePhoneNumberForJamesAs(String no) {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        dashoardsPage.validateNumberJames(no);
    }

    @Then("I should see the Edit Production details ui")
    public void iShouldSeeTheEditProductionDetailsUi() {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        Assert.assertTrue(dashoardsPage.validateEditProductDetails());
    }

    @And("I should see the setting button")
    public void iShouldSeeTheSettingButton() {
        DashoardsPage dashoardsPage = new DashoardsPage(driver);
        Assert.assertTrue(dashoardsPage.validateSettingBtn());
    }
}
