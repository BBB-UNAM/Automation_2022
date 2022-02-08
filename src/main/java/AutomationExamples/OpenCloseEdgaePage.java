package AutomationExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class OpenCloseEdgaePage {
    public static void main (String args[]) throws InterruptedException {

        //Crando una isntacia de webdriver.
        File rootPath = new File("src/main/resources/ExplorerDrivers/msedgedriver");
        System.setProperty("webdriver.edge.driver", rootPath.getPath());
        WebDriver driver = new EdgeDriver();

        driver.get("Https://www.google.com");

        Thread.sleep(1500);

        driver.quit();
        driver.close();

    }
}
