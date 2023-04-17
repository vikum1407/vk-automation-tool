package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

    /*
    * Hard Assertion meant -
    *       Test will stop once got the fail test
    *
    * Hard Assertions -
    *   1. Assert.assertTrue()
    *   2. Assert.assertFalse()
    *   3. Assert.assertEquals()
    *
    * Where we can use Hard Assertions:-
    *   - Form validation
    *   - Navigation
    *   - Pop-ups and alerts
    *   - Data validation
    *   - Performance testing
     * */

    @Test
    void hardAssertions(){
        Assert.assertTrue(true); //pass
        Assert.assertEquals("welcome","welcome"); //pass
        Assert.assertEquals("selenium","Selenium"); //fail
        System.out.println("Success...!!!");
    }
}
