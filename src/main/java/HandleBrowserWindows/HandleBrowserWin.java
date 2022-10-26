package HandleBrowserWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HandleBrowserWin {
    public static void main(String[] args) {

        /*
        * When you need to change the browser window in between. you need to get the window ID
        * */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        driver.get("https://opensource-demo.orangehrmlive.com");
        //driver.manage().window().maximize();

        //getWindowHanle()
        String windowID = driver.getWindowHandle();
        System.out.println(windowID);

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click(); //open another window

        //getWindowHandles() here duplicate are not allow
        Set<String> windowIDs = driver.getWindowHandles(); //IDs of multiple browsers

        //First method - iterator()
        Iterator<String> it = windowIDs.iterator();

        String parentWindowID = it.next();
        String childWindowID = it.next();

        System.out.println("Parent Window ID: "+parentWindowID);
        System.out.println("Child Window ID: "+childWindowID);

        //Second method - using List/ArrayList
        List<String> windowIDsList = new ArrayList<>(windowIDs); //converting Set -> List
        String parentWindowID1 = windowIDsList.get(0);
        String childWindowID1 = windowIDsList.get(1);

        System.out.println("Parent Window ID: "+parentWindowID1);
        System.out.println("Child Window ID: "+childWindowID1);

        //How to switch the windows
        driver.switchTo().window(parentWindowID1);
        System.out.println("Parent window title: "+driver.getTitle());

        driver.switchTo().window(childWindowID1);
        System.out.println("Child window title: "+driver.getTitle());

        //For each loop
        for (String allwin:windowIDsList)
        {
            //System.out.println(allwin);
            String BrowserTitle = driver.switchTo().window(allwin).getTitle();
            System.out.println(BrowserTitle);
        }


        //How to close relavent browser window
        for (String allwin:windowIDsList)
        {
            String BrowserTitle = driver.switchTo().window(allwin).getTitle();
            if (BrowserTitle.equals("OrangeHRM")){
                driver.close();
            }
        }


    }
}
