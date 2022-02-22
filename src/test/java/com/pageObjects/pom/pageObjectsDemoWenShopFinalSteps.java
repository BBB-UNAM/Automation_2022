package com.pageObjects.pom;

import com.wrappers.pom.baseDemoWebShop;
import org.openqa.selenium.WebDriver;

public class pageObjectsDemoWenShopFinalSteps extends baseDemoWebShop {

    public pageObjectsDemoWenShopFinalSteps(WebDriver driver) {
        super(driver);
    }

    public void closeThredAndExplorer(){
        closeCase();
    }
}
