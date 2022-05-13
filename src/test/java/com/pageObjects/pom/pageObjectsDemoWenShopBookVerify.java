package com.pageObjects.pom;
import java.util.List;
import com.WebElementsIdentifers.DemoWebShopBookElements;
import com.WebElementsIdentifers.DemoWebShopProductBar;
import com.wrappers.pom.baseDemoWebShop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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

    public void ValidateAddToCar() throws InterruptedException{
        List<WebElement> listOfElements = findMultipleElements("xpath",DemoWebShopBookElements.xpathsAddToCar);

        //forEach cicle to click on each ad to car button and verify that it is correctly clicked
        for(WebElement myWebElements : listOfElements){
            click(myWebElements);
            boolean flag = displayed(myWebElements);
            Assert.assertEquals(true, flag, "Notification was not displayed");
            Thread.sleep(5000);
        }
    }
}
