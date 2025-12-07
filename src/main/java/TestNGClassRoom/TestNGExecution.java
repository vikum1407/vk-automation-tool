package TestNGClassRoom;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExecution {

    @Test(enabled = false) //if you need to ignor this method when executing this class
    void LoginByEmail(){
        System.out.println("Login using email");
        Assert.assertEquals("vikum", "vikum");
    }

    @Test
    void LoginbyFacebook(){
        System.out.println("Login to the facebook");
        Assert.assertEquals("vikum", "suga");
    }
}
