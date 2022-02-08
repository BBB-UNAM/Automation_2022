package AutomationExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class MaximizeExplorerWindow {
    public static void main(String args[]) throws InterruptedException {
        File rootPath = new File("src/main/resources/ExplorerDrivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", rootPath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.get("Https://www.google.com");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1500);

        driver.quit();
        driver.close();

    }
}
