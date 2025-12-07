package TestNGClassRoom;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTests {

    @Description("")

    @Test
    void startCar(){
        System.out.println("car started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void drivingCar(){
        System.out.println("driving car");
    }

    @Test(dependsOnMethods = {"drivingCar"})
    void  stopCar(){
        System.out.println("Stop car");
    }

    @Test(dependsOnMethods = {"startCar", "drivingCar"}, alwaysRun = true)
    /**
     * this test method will fail, because dependancy method 'startCar' is failed.
     * If I added the 'alwaysRun' annotation, it mean how ever this method should run it means forcefully run ignoring the
     * dependancies
     */
    void parkCar(){
        System.out.println("Park car");
    }
}
