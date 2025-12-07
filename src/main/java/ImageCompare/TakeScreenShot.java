package ImageCompare;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class TakeScreenShot {

    /*
    * Need followings plugins
    *   1. Ashot
    *   2. Gson
    *   3. Hamcreast-all
    *
    * */
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement logoImageElement = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']"));

        Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImageElement);
        ImageIO.write(logoImageScreenshot.getImage(),"png", new File("src\\main\\java\\ImageCompare\\screenshots\\OrangeHRMlogo.png"));

        File f = new File("src\\main\\java\\ImageCompare\\screenshots\\OrangeHRMlogo.png");

        if (f.exists()){
            System.out.println("Image File is existing");
        }else {
            System.out.println("Image is not existing");
        }


    }
}
