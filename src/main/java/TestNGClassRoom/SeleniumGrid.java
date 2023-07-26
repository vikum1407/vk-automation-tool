package TestNGClassRoom;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumGrid {
    WebDriver driver;

    @BeforeClass
    public void setup(){

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WIN10);

        System.setProperty("webdriver.chrome.driver","D:\\Vikum\\SDET\\Python\\Python-Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

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
