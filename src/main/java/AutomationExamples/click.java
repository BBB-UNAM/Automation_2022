package AutomationExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class click {

    public String xpathRegister = "//a[@href='/register']";
    public String xpathLogin = "//a[@href='/login']";
    public String xpathShoppingCart = "//a[@href='/cart']";
    public String xpathWishList = "//a[@href='/wishlist']";

    public static void main(String args[]) throws InterruptedException {
        File rootPath = new File("src/main/resources/ExplorerDrivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", rootPath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //http://demowebshop.tricentis.com/
        driver.get("http://demowebshop.tricentis.com/");
        Thread.sleep(500);

        driver.manage().window().maximize();

        click xpath = new click();

        driver.findElement(By.xpath(xpath.xpathShoppingCart)).getText();
        driver.findElement(By.xpath(xpath.xpathWishList)).click();
        driver.findElement(By.xpath(xpath.xpathRegister)).click();
        driver.findElement(By.xpath(xpath.xpathLogin)).click();


        Thread.sleep(1000);

        driver.quit();
        driver.close();


    }
}
