package com.nopCommerce.stepDefs;

import com.nopcommerce.testbase.TestBase;
import com.nopcommerce.testpages.CatalogPage;
import com.nopcommerce.testpages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDef extends TestBase {


    @Given("I am in nopCommerce login page")
    public void iAmInNopCommerceLoginPage() {
        initialization();
        driver.get(prop.getProperty("url"));
    }

    @When("I enter login credentials")
    public void iEnterLoginCredentials() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUSandPW(prop.getProperty("email"),prop.getProperty("password"));
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
    }

    @Then("I should see nopCommerce dashboard")
    public void iShouldSeeNopCommerceDashboard() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(loginPage.checkDashboard(),"Dashboard");
        System.out.println("========================"+loginPage.checkDashboard());
    }

    @And("I should see the nopCommerce logo")
    public void iShouldSeeTheNopCommerceLogo() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.checkNopCommerceLogo(), String.valueOf(true));
    }

    //==========================================

 /*   @And("I click the products tab under catalog")
    public void iClickTheProductsTabUnderCatalog() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickProductBtn();
    }

    @Then("I should see the products title")
    public void iShouldSeeTheProductsTitle() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.isDisplayDataTable();
    }

    @And("I should pass product name")
    public void iShouldPassProductName() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.productNameSend(prop.getProperty("productName"));
    }

    @Then("I click search button")
    public void iClickSearchButton() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickSearchBtn();
    }
*/

}
