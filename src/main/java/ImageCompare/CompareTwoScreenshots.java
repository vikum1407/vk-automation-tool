package ImageCompare;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CompareTwoScreenshots {

    public static void main(String[] args) throws IOException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();


        BufferedImage expectedImage = ImageIO.read(new File("src\\main\\java\\ImageCompare\\screenshots\\OrangeHRMlogo.png"));

        WebElement logoImageElement = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']"));
        Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImageElement);

        BufferedImage actualImage = logoImageScreenshot.getImage();

        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);

        if (diff.hasDiff()==true){
            System.out.println("Images are Not same");
        }else {
            System.out.println("Images are same");
        }

        driver.quit();
    }
}
