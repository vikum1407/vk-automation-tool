package DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MutipleDropDowns {
    public static void main(String args[]) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.orangehrm.com");

        driver.manage().window().maximize();

        //Normal way:-
    /*    Select option = new Select(driver.findElement(By.xpath("abc")));
        option.selectByVisibleText("Cuba");
        Select optio = new Select(driver.findElement(By.xpath("abc")));
        option.selectByVisibleText("ASD");
        Select opti = new Select(driver.findElement(By.xpath("abc")));
        option.selectByVisibleText("QAZ");
    */
        //Calling using common method
        WebElement abc = driver.findElement(By.xpath("asd"));
        commonDrpMethod(abc,"Sri Lanka");

        WebElement qwe = driver.findElement(By.xpath("asd"));
        commonDrpMethod(qwe, "13-34");

        WebElement wsx = driver.findElement(By.xpath("asd"));
        commonDrpMethod(wsx,"ert");

    }

    public static void commonDrpMethod(WebElement drp, String value){

    Select options = new Select(drp);
    List<WebElement> allOption = options.getOptions();

    for (WebElement AllOp:allOption){
        if (AllOp.getText().equals(value)){
            AllOp.click();
            break;
        }
    }
    }
}
