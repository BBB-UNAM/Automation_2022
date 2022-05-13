package com.wrappers.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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

    //using to find multiple elements with just one xpath.
    public List<WebElement> findMultipleElements (String option,String idenfier){
        List<WebElement> myLyst;

        if (option == "xpath"){
            myLyst = driver.findElements(By.xpath(idenfier));
        }else if (option == "id"){
            myLyst = driver.findElements(By.id(idenfier));
        }else if (option == "ccsSelector"){
            myLyst = driver.findElements(By.cssSelector(idenfier));
        }else {
            myLyst = null;
        }
        return myLyst;
    }

    //methos to get one webelement of a list.
    public WebElement returnWebElem(List<WebElement> myList,int index){
        return myList.get(index);
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
            System.out.println("The element isn't in the web explorer");
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
    }

    //cerrar el hilo de ejecucion del programa

    public void quitCase(){
        this.driver.quit();
    }

    //maximizamos la ventana del explorador.
    public void miximizeWindow(){
        this.driver.manage().window().maximize();
    }
    //*********************************************************************************************************

    //generar una cadena aleatoria de caracteres***************************************************************
    public String cadenaAleatoria(int Tamaño){

        String finalarray = "";
        String catalogo = "bcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        for(int i = 0; i < Tamaño; i++){
            int b  = ThreadLocalRandom.current().nextInt(0,62);
            char letra = catalogo.charAt(b);
            finalarray += letra;
        }

        return finalarray;
    }

    public void dropDownSelect(WebElement dropDown, String optionText){
        Select list = new Select(dropDown);
        list.selectByVisibleText(optionText);
    }

    public void dropDownSelect(WebElement dropDown, int numOption){
        Select list = new Select(dropDown);
        list.selectByIndex(numOption);
    }
}
