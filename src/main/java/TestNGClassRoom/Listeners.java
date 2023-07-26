package TestNGClassRoom;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {

    public void onTestStart(ITestResult tr){ //this is kind of method overloading from parent class of 'TestListenerAdapter'
        System.out.println("Test Started");
    }

    public void onTestSuccess(ITestResult tr){
        System.out.println("Test Passed");
    }

    public void onTestFailured(ITestResult tr){
        System.out.println("Test failed");
    }

    public void onTestSkipped(ITestResult tr){
        System.out.println("Test Skipped");
    }
}
