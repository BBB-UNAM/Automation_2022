package AutomationExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.time.Duration;

public class ExplicitWaitExample {

    public static void main(String args[]) throws InterruptedException {
        File rootPath = new File("src/main/resources/ExplorerDrivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", rootPath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //http://demowebshop.tricentis.com/
        driver.get("http://demowebshop.tricentis.com/");
        //Thread.sleep(500);

        driver.findElement(By.id("small-searchterms")).sendKeys("Youtube luisito comunica");
        Thread.sleep(1000);
        driver.quit();
        driver.close();
    }
}
