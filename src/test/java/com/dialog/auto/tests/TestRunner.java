package com.dialog.auto.tests;

import com.ExtentReportListner.ExtentReportListener;
import org.testng.TestNG;

public class TestRunner {

    static TestNG testNG; // I put static here, because I need to use this in my main method

    public static void main(String[] args) {

        ExtentReportListener ext = new ExtentReportListener();

        testNG = new TestNG();

        testNG.setTestClasses(new Class[] {}); //here u can give ur test classes eg:- dialogHomeTestPage, purchaseASimTestPage
        testNG.addListener(ext);
        testNG.run();

    }
}
