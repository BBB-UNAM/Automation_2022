package com.examples.testNG;
import org.testng.annotations.*;

public class ExampleUseAnotations {
    @BeforeTest
    public void test1(){System.out.println("Before test");}

    @BeforeMethod
    public void test2(){System.out.println("Before Method");}

    @BeforeClass
    public void test3(){System.out.println("BeforeClass");}

    @Test(priority = 3)
    public void test4(){System.out.println("test4");}

    @Test(priority = 1)
    public void test5(){System.out.println("test5");}

    @Test(priority = 2)
    public void test6(){System.out.println("test6");}

    @Test(priority = 0)
    public void test7(){System.out.println("test7");}

}
