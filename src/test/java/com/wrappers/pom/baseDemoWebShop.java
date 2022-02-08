package com.wrappers.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class baseDemoWebShop {

    private WebDriver driver; // Create driver

    //Constructor de la clase..
    public baseDemoWebShop(WebDriver driver){
        this.driver = driver;
    }

    //**********************Metodos para encontrar los elementos (tecnicas mas utilizadas )*********************
    public WebElement findXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement findID(String id){
        return driver.findElement(By.id(id));
    }

    public WebElement findCssSelector(String cssSelector){
        return driver.findElement(By.cssSelector(cssSelector));
    }

    public WebElement findName(String name){
        return  driver.findElement(By.name(name));
    }
    //*********************************************************************************************************

    //***********************MEtodos para realizar acciones****************************************************

    //Open some URL
    public void openURL(String url){
        driver.get(url);
    }

    //define the explicitWaits
    public void explictWait(int timeSeconds){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeSeconds));
    }

    //Click en algun web element
    public void click(WebElement findElement){
        findElement.click();
    }

    //obtener texto de algun web element
    public  void getText(WebElement findelement){
        findelement.getText();
    }

    //escribir detro de un campo de texto
    public void sendtext(WebElement findelement, String text){
        findelement.sendKeys(text);
    }

    //verificar si un elemento es visible en pantalla o no
    public boolean displayed(WebElement findelement){
        try {
            return findelement.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e){
            System.out.println("Button ");
            return false;
        }
    }

    //extraer el texto de un webelement
    public String getSomeText(WebElement findelement){
        return findelement.getText();
    }

    //cerrar explorador e hilo de ejecucion
    public void closeCase(){
        this.driver.close();
        this.driver.quit();
    }

    //maximizamos la ventana del explorador.
    public void miximizeWindow(){
        this.driver.manage().window().maximize();
    }
    //*********************************************************************************************************
}
