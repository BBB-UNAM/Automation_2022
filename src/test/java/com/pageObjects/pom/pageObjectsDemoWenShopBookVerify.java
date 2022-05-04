package com.pageObjects.pom;

import com.WebElementsIdentifers.DemoWebShopBookElements;
import com.WebElementsIdentifers.DemoWebShopProductBar;
import com.wrappers.pom.baseDemoWebShop;
import org.openqa.selenium.WebDriver;

public class pageObjectsDemoWenShopBookVerify extends baseDemoWebShop {

    //contructor of class
    public pageObjectsDemoWenShopBookVerify (WebDriver driver){
        super(driver);
    }

    public void clickOnBooks(){
        click(findXpath(DemoWebShopProductBar.xpathBooks));
    }

    public void selectShortByPriceHighToLow(){
        dropDownSelect(findID(DemoWebShopBookElements.idSortBy),"Price: High to Low");
    }

    public void selectViewAsList(){
        dropDownSelect(findID(DemoWebShopBookElements.idViewAs),1);
    }

    public void selectdisplay(){
        dropDownSelect(findID(DemoWebShopBookElements.idDisplay),"12");
    }
}
