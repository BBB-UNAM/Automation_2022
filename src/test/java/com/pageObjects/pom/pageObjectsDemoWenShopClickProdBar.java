package com.pageObjects.pom;

import com.wrappers.pom.baseDemoWebShop;
import org.openqa.selenium.WebDriver;
import com.WebElementsIdentifers.*;

public class pageObjectsDemoWenShopClickProdBar extends baseDemoWebShop {

    //Constrictor de la clase- envia el driver a la clase padre
    public pageObjectsDemoWenShopClickProdBar(WebDriver driver) {
        super(driver);
    }

    public void clickOnBooks(){
        click(findXpath(DemoWebShopProductBar.xpathBooks));
    }

    public void clickOnComputers(){
        click(findXpath(DemoWebShopProductBar.xpathComputers));
    }

    public void clickOnElectronics(){
        click(findXpath(DemoWebShopProductBar.xpathElectronics));
    }

    public void clickOnApparelAndShoes(){
        click(findXpath(DemoWebShopProductBar.xpathApparealShoes));
    }

}
