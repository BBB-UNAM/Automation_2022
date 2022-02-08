package com.examples.testNG;
import org.testng.Assert;
import  org.testng.annotations.*;
import org.testng.asserts.Assertion;

public class testNgAssertsExamples {
    @Test
    public void test1(){
        System.out.println("Inicio test");
        Assert.assertEquals(10,10);
        System.out.println("Fin test");
    }

    @Test
    public void test2(){
        System.out.println("Inicio test");
        Assert.assertEquals("hola","mundo","La cadena de caracteres no coicide con el valos esperado");
        System.out.println("Fin test");
    }

    @Test
    public void test3(){
        System.out.println("Inicio test");
        Assert.assertEquals(10,30,"los numeros no son iguales");
        System.out.println("Fin test");

    }
}
