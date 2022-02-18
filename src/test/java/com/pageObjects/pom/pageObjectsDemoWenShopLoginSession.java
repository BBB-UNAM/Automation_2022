package com.pageObjects.pom;

import com.wrappers.pom.baseDemoWebShop;
import org.openqa.selenium.WebDriver;
import com.WebElementsIdentifers.*;

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

    public void writeEmailandPass(){}

    public void clickonLogInButton(){}

    public void validateAppearWebElements(){}

    public void logoutSession(){}

    public void valideLogoutElements(){}

}
