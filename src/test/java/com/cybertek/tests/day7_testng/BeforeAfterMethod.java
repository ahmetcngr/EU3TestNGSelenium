package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @BeforeClass
    public void setUpClass(){
        System.out.println("--- BEFORE CLASS ---");
        System.out.println("executed one time before class");
    }

    @Test
    public void test1(){
        System.out.println("First test case");
    }

    @Test
    public void test2(){
        System.out.println("Second test case");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("WebDriver opens browser");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Closing browser and quit");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("--- AFTER CLASS ---");
        System.out.println("Some Reporting code here");
    }

}
