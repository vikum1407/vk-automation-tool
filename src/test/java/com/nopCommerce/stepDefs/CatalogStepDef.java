package com.nopCommerce.stepDefs;

import com.nopcommerce.testbase.TestBase;
import com.nopcommerce.testpages.CatalogPage;
import com.nopcommerce.util.CommonMethods.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;

public class CatalogStepDef extends TestBase {

    @Given("I am in the product portal")
    public void iAmInTheProductPortal() {
        initialization();
        driver.get(prop.getProperty("url"));

    }

   @And("I click the products tab under catalog")
    public void iClickTheProductsTabUnderCatalog() throws InterruptedException {
       CatalogPage catalogPage = new CatalogPage(driver);
       catalogPage.clickProductBtn();
    }

    @Then("I should see the products title")
    public void iShouldSeeTheProductsTitle() {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.isDisplayDataTable();
    }

    @And("I should pass product name")
    public void iShouldPassProductName() {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.productNameSend(prop.getProperty("productName"));
    }

    @Then("I click search button")
    public void iClickSearchButton() {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.clickSearchBtn();

    }

    @Then("I search the productname on below searched table")
    public void iSearchTheProductnameOnBelowSearchedTable() {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.searchFromProdTable();
    }

    @And("I click the categories tab under catalog")
    public void iClickTheCategoriesTabUnderCatalog() throws InterruptedException {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.clickCategoriesBtn();
    }

    @Then("I should see the Categories title")
    public void iShouldSeeTheCategoriesTitle() {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.validateCategoryHeader();
    }

    @And("I should pass category name")
    public void iShouldPassCategoryName() {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.sendCategoryName(prop.getProperty("CategoryName"));
    }

    @Then("I click search button on category ui")
    public void iClickSearchButtonOnCategoryUi() {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.clickCategorySearchBtn();
    }


    @Then("I should see the Add new button")
    public void iShouldSeeTheAddNewButton() {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.validateAddNewBtn();
    }

    @And("I should see the Export button")
    public void iShouldSeeTheExportButton() {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.validateExportBtn();
    }

    @And("I should see the Import button")
    public void iShouldSeeTheImportButton() {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.validateImportBtn();
    }

    @And("I should see the Delete button")
    public void iShouldSeeTheDeleteButton() {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.validateDeleteBtn();
    }

    @Then("I search the catagoryname on below searched table")
    public void iSearchTheCatagorynameOnBelowSearchedTable() {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.searchFromCatagoryTable();
    }
}
