package JavaExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class tryCatchExample {
    public static void main(String args[]) throws InterruptedException {
        File rootPath = new File("src/main/resources/ExplorerDrivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", rootPath.getPath());
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //http://demowebshop.tricentis.com/
        driver.get("http://demowebshop.tricentis.com/");
        Thread.sleep(500);
        driver.manage().window().maximize();

        //
        boolean isDisplayed1 = driver.findElement(By.xpath("//a[@href='/register']")).isDisplayed();

        try {
            boolean isDisplayed2 = driver.findElement(By.xpath("//span[@title='Close']gygygug")).isDisplayed();
            System.out.println(isDisplayed2);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            boolean isDisplayed2 = false;
            System.out.println(isDisplayed2);
        }

        System.out.println(isDisplayed1);


        Thread.sleep(500);

        driver.quit();
        driver.close();
    }
}
