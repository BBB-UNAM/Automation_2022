package com.pageObjects.pom;
import com.wrappers.pom.baseDemoWebShop;
import org.openqa.selenium.WebDriver;
import com.WebElementsIdentifers.*;
import org.testng.Assert;

public class pageObjectsDemoWenShopRegister extends baseDemoWebShop{
    //contructor de nuestraclase. En esta clase asignamos
    // el objeto driver a el metodo contructor de nuestra clase padre

    private WebDriver driver; //declaramos nuestro webdriver

    //Declarate of the construct method.
    public pageObjectsDemoWenShopRegister(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    //abrir la url del portal de demo web shop
    public void openDemoWebShopPage(){
        openURL("http://demowebshop.tricentis.com/");
    }

    //click on register link
    public void clickOnRegisterLink(){
        click(findXpath(DemoWebShopMainPage.xpathRegister));
    }

    //Complete the form
    public void completeForm(){

        //click on male
        click(findID(DemoWebShopRegisterSection.idLisyBoxMale));

        //Write the first name
        sendtext(findID(DemoWebShopRegisterSection.idFirstName),"Jesus");

        //Write the last name
        sendtext(findID(DemoWebShopRegisterSection.idLastName),"Gonzalez");

        //Write the emsil
        sendtext(findXpath(DemoWebShopRegisterSection.xpathEmail),"jfgbgfb@mail.com");

        //Write the password
        sendtext(findID(DemoWebShopRegisterSection.idPassword),"Sgae3081");

        //Write the confirm password
        sendtext(findID(DemoWebShopRegisterSection.idConfirmPass),"Sgae3081");
    }

    //click on register button
    public void clickOnRegisterButton(){
        click(findID(DemoWebShopRegisterSection.idRegisterButton));
    }

    //validar que se muestra el mensaje de texto del registro completado
    public void verifyRegisteredtext(){
        Assert.assertEquals(displayed(findXpath(DemoWebShopRegisterSection.xpathRegisterMessage)),true,"el mensaje de registro completado no fuenmostrado");
    }

    //Clic on continue button
    public void clickOnContineButton(){
        click(findXpath(DemoWebShopRegisterSection.xpathContinueButton));
    };
}
