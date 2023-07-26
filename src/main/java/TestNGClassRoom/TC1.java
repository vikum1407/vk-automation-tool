package TestNGClassRoom;

import org.testng.Assert;
import org.testng.annotations.*;

public class TC1 {

    @BeforeMethod
    public void tc3(){
        System.out.println("TestNG beforemethod");
        Assert.assertEquals("mankada", "mankada");
    }

    @AfterMethod
    public void tc4(){
        System.out.println("TestNG aftermethod");
        Assert.assertEquals("bombuwala", "bombuwala");
    }

    @Test
    public void tc5(){
        System.out.println("TestNG sample tc1");
        Assert.assertEquals("kalutara", "kalutara");
    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("TestNG sample tc2");
        Assert.assertEquals("kalutara", "kalutara");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("TestNG sample tc2");
        Assert.assertEquals("kalutara", "kalutara");
    }
}
