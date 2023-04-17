package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
    /*
    * SoftAssertions meant -
    *       If some test got fail, main suite will not stop untill finish the execution
    *
    *       SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(condition);
            softAssert.assertAll();

       Soft Assertions Appications:-
       * Checking multiple elements
       * Non-critical checks
       * Dynamic content
       * Conditional checks
    *
    * */

    SoftAssert softAssert = new SoftAssert();

    @Test
    void softAssert(){
        softAssert.assertTrue(true);
        softAssert.assertEquals("Welcome","Welcome");
        softAssert.assertEquals("Selenium","selenium");
        System.out.println("Good...!!!");
        softAssert.assertAll();
    }

    /*
    * Here we can face big issue, that is -
    *   When accessing same object for two test obviuosl both will get same results
    * */

    @Test
    void softAssertion1(){
        softAssert.assertEquals("welcome","wel");
        softAssert.assertAll();
    }

    @Test
    void softAssertion2(){
        softAssert.assertEquals("welcome","welcome");
        softAssert.assertAll();
    }

    //here both are fail - because we access same object
    // to overcome this, we need to create two separated softassert object

}
