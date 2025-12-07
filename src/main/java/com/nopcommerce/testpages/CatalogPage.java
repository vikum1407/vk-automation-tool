package com.nopcommerce.testpages;

import com.nopcommerce.testbase.TestBase;
import com.nopcommerce.util.CommonMethods.CommonMethods;
import com.nopcommerce.util.CommonMethods.DropDowns;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage extends TestBase {

    CommonMethods common=new CommonMethods();
    DropDowns drops = new DropDowns();

    @FindBy(xpath = "//p[normalize-space()='Catalog']")
    WebElement catalogBtn;

    @FindBy(xpath = "(//li[@class='nav-item'])[7]")
    WebElement productTab;

    @FindBy(xpath = "//h1[normalize-space()='Products']")
    WebElement pageHeader;

    @FindBy(xpath = "//input[@id='SearchProductName']")
    WebElement productName;

    @FindBy(xpath = "//button[@id='search-products']")
    WebElement searchBtn;

    @FindBy(xpath = "//div[@id='products-grid_wrapper']//div[@class='row']")
    WebElement searchBox;

    @FindBy(xpath = "//div[@id='products-grid_wrapper']//div[@class='row']//div//div//td")
    WebElement tableData;

    @FindBy(xpath = "(//li[@class='nav-item'])[8]")
    WebElement categories;

    @FindBy(xpath = "//h1[normalize-space()='Categories']")
    WebElement categoryTitle;

    @FindBy(xpath = "//input[@id='SearchCategoryName']")
    WebElement cateforyName;

    @FindBy(xpath = "//button[@id='search-categories']")
    WebElement categorySearchBtn;

    @FindBy(xpath = "//a[normalize-space()='Add new']")
    WebElement addNewBtn;

    @FindBy(xpath = "//button[normalize-space()='Export']")
    WebElement exportBtn;

    @FindBy(xpath = "//button[@name='importexcel']")
    WebElement importBtn;

    @FindBy(xpath = "//button[@id='delete-selected']")
     WebElement deleteBtn;

    @FindBy(xpath = "(//li[@class='nav-item'])[9]")
    WebElement Manufacturers;

    @FindBy(xpath = "(//li[@class='nav-item'])[10]")
    WebElement ProdReviews;

    @FindBy(xpath = "(//li[@class='nav-item'])[11]")
    WebElement ProdTags;



    public CatalogPage(WebDriver driver){
        PageFactory.initElements(TestBase.driver,this);

    }

    public void clickProductBtn() throws InterruptedException {
        catalogBtn.click();
        Thread.sleep(1000);
        productTab.click();
    }

    public boolean isDisplayHeader(){
        return pageHeader.isDisplayed();
    }

    public CatalogPage clickSearchBtn(){
        searchBtn.click();

        return new CatalogPage(driver);
    }

    public void productNameSend(String proName){
        productName.sendKeys(proName);
    }

    public boolean isDisplayDataTable(){
        return searchBox.isDisplayed();
    }

    public void clickCategoriesBtn() throws InterruptedException {
        catalogBtn.click();
        Thread.sleep(1000);
        categories.click();
    }

    public void clickManufacturerBtn() throws InterruptedException {
        catalogBtn.click();
        Thread.sleep(1000);
        Manufacturers.click();
    }

    public void clickProdReviewsBtn() throws InterruptedException {
        catalogBtn.click();
        Thread.sleep(1000);
        ProdReviews.click();
    }

    public void clickProdTagsBtn() throws InterruptedException {
        catalogBtn.click();
        Thread.sleep(1000);
        ProdTags.click();
    }

    public void searchFromProdTable(){
        drops.commonDropDown(tableData,prop.getProperty("productName"));
    }

    public boolean validateCategoryHeader(){
        return categoryTitle.isDisplayed();
    }

    public void sendCategoryName(String cate){
        cateforyName.sendKeys(cate);
    }

    public CatalogPage clickCategorySearchBtn(){
        categorySearchBtn.click();

        return new CatalogPage(driver);
    }

    public void validateAddNewBtn(){
        common.validateIconsPresents(addNewBtn);
    }

    public void validateExportBtn(){
        common.validateIconsPresents(exportBtn);
    }

    public void validateImportBtn(){
        common.validateIconsPresents(importBtn);
    }

    public void validateDeleteBtn(){
        common.validateIconsPresents(deleteBtn);
    }

    public void searchFromCatagoryTable(){
        drops.commonDropDown(tableData,prop.getProperty("CategoryName"));
    }




   /* public static void searchProduct(WebElement webtb, String value){
        Select options = new Select(webtb);
        List<WebElement> allOptions = options.getOptions();

        for (WebElement op:allOptions){
            String ops = op.getText();
            if(ops.equals(value)){
                op.click();
                break;
            }
        }

    }*/

}
