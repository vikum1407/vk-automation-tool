package UtilPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

    public static void flash(WebElement element, WebDriver driver){
        String bgcolor = element.getCssValue("backgroundColor");

        for (int i=0; i<500; i++){
            changeColor("#000000", element, driver);
            changeColor(bgcolor, element, driver);
        }
    }

    public static void drawBorder(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border = '3px solid red'", element);
    }

    //Capturing title of the page
    public static String getTitleByJS(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String title = js.executeScript("return document.title;").toString();

        return title;
    }

    //Click a button
    public static void clickElementByJS(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", element);
    }

    //Generate an alert
    public static void generateAlert(WebDriver driver, String message){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("alert('"+message+"')");
    }

    //Refresh the page
    public static void refreshBrowserByJS(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("history.go(0)");
    }

    /*
    * Scrolling -
    *   1. Scrolling down to serturn an element
    *   2. Scrolling down to end of the page
    * */

    // 1. Scrolling down to serturn an element
    public static void scrollingIntoView(WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollingIntoView(true);", element);
    }

    // 2. Scrolling down to end of the page
    public static void scrollPageDown(WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public static void changeColor(String color, WebElement element, WebDriver driver){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'",element);

        try {
            Thread.sleep(20);
        }catch (InterruptedException e){

        }
    }
}
