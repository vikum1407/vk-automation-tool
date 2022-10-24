package sliderActionAndPerformAndBuild;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderUI {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        //59*721
        //885*174
        WebElement mini_Element = driver.findElement(By.xpath("//span[1]"));
        System.out.println("Location of the Min: "+mini_Element.getLocation()); // 59, 250
        System.out.println("Get the hight and wide"+mini_Element.getSize()); // 21, 21

        WebElement max_Element = driver.findElement(By.xpath("//span[2]"));
        System.out.println("Location of the Max: "+max_Element.getLocation()); // 412, 250
        System.out.println("Get the hight and wide"+max_Element.getSize()); // 21, 21

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(mini_Element,300,0).perform();
        actions.dragAndDropBy(max_Element,-40,0).perform();
    }
}
