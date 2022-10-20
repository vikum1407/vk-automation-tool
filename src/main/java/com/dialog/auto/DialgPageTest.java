package com.dialog.auto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;

public class DialgPageTest {

    public static Properties prop;
    public static WebDriver driver;

    @FindBy(xpath = "Mobile = //a[@id='MobileSec']")
    WebElement mobileBtn;

    @FindBy(xpath = "//img[@alt='Dialog']")
    WebElement dialogIcon;


    public static void initialization() {
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.get("https://www.dialog.lk/");
    }

    Actions action = new Actions(driver);
    WebElement element = driver.findElement(By.linkText("Get started free"));





}
