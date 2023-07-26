package TestNGClassRoom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestNG {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    public void setup(String browser, String url){

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","D:\\Vikum\\SDET\\Python\\Python-Selenium\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firfox")){
            System.setProperty("webdriver.firfox.driver","D:\\Vikum\\SDET\\Python\\Python-Selenium\\chromedriver_win32\\chromedriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get(url);
    }

    /**
     * Then trying to pass the 'browser' and 'url' two parameters from xml file. please see the 'Parameterizedtestng.xml' file.
     *
     * In xml level there are following levels
     *      - Suite
     *      - Test
     *      - Classes
     *      - Methods
     * * Parameter passing can do from 'Suite' level, 'Test' level and 'Class' level
     */

    @Test(priority = 1)
    void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page");
    }

    @Test(priority = 2)
    void pageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Title different from difine");
    }

    @AfterClass
    void tierDown(){
        driver.quit();
    }
}
