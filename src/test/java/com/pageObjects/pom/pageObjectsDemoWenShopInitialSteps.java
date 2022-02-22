package com.pageObjects.pom;

import com.wrappers.pom.baseDemoWebShop;
import org.openqa.selenium.WebDriver;

public class pageObjectsDemoWenShopInitialSteps extends baseDemoWebShop {

    private WebDriver driver;
    public pageObjectsDemoWenShopInitialSteps(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //abrir la url del portal de demo web shop
    public void openDemoWebShopPage(){
        openURL("http://demowebshop.tricentis.com/");
    }


}
