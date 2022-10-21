package DropDowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JQueryDropDown {
    public static void main(String args[]) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//input[@id='justAnInputBox'])[1]")).click();

        //driver.findElements(By.xpath("(//input[@id='justAnInputBox1'])[1]"));

        //driver.findElements(By.xpath("(//input[@id='justAnotherInputBox'])[1]"));

    //      There are 3 types of methods we can access with that
        //selectChoiceValues(driver, "choice 1");
        //selectChoiceValues(driver, "choice 1","choice 2","choice3","choice 4");
        selectChoiceValues(driver, "all");

    }

    /*
     * Normally above 3 types of list down access need to write 3 method.
     * But following method can access all above 3 listed downs
     * */
    public static void selectChoiceValues(WebDriver driver, String... value){ //this String... mean a array

        List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
        /*
        * need to write a if() to capture is selection is multi choices or single choice or all selection
        * */
        if (!value[0].equalsIgnoreCase("all")){ //!value[0] meant when passing single value or multi values[ehema nemei nm] this consider as all
            for (WebElement item:choiceList){
                String text = item.getText();

                for (String val:value){
                    if (text.equals(val)){
                        item.click();
                        break;
                    }
                }
            }
        }
        else {
            try {
                for (WebElement itrm: choiceList){
                    itrm.click();
                }
            }catch (Exception e){
            }
        }

    }
}
