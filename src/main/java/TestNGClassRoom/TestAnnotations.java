package TestNGClassRoom;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestAnnotations {

    @BeforeClass
    public void tc1(){
        System.out.println("TestNG beforeclass");
        Assert.assertEquals("facebook", "facebook");
    }

    @AfterClass
    public void tc2(){
        System.out.println("TestNG afterclass");
        Assert.assertEquals("wow", "wow");
    }

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
        System.out.println("TestNG sample test 5");
        Assert.assertEquals("kalutara", "kalutara");
    }
}
