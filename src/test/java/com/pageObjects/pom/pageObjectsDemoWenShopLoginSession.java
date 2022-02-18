package com.pageObjects.pom;

import com.wrappers.pom.baseDemoWebShop;
import org.openqa.selenium.WebDriver;
import com.WebElementsIdentifers.*;
import org.testng.Assert;

public class pageObjectsDemoWenShopLoginSession extends baseDemoWebShop {

    WebDriver driver;

    public pageObjectsDemoWenShopLoginSession(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // click on login link
    public void clickOnLogInLink(){
        click(findXpath(DemoWebShopMainPage.xpathLogin));
    }

    public void writeEmailandPass(){
        sendtext(findID(DemoWebShopLoginPage.idEmail), "jfgbgfb@mail.com");
        sendtext(findID(DemoWebShopLoginPage.idPassword),"Sgae3081");
    }

    public void clickonLogInButton(){
        click(findXpath(DemoWebShopLoginPage.xpathLoginButton));
    }

    public void validateAppearWebElements(){
        Assert.assertEquals(displayed(findXpath(DemoWebShopMainPage.xpathUser1)),true,"The user was loged successfull");
    }

    public void logoutSession(){
        click(findXpath(DemoWebShopMainPage.spathLogOutLink));
    }

    public void valideLogoutElements(){
        Assert.assertEquals(displayed(findXpath(DemoWebShopMainPage.xpathLogin)),true,"The logout process are been successfully done");
    }
}
