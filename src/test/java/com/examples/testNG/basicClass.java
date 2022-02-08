package com.examples.testNG;
import org.testng.annotations.*;

public class basicClass {

    @BeforeTest
    public void inicio(){
        System.out.println("This is agthertest");
    }

    @Test
    public void testsMain(){
        System.out.println("This is a test");
    }

    @AfterTest
    public void fin(){
        System.out.println("This is before test");
    }
}
