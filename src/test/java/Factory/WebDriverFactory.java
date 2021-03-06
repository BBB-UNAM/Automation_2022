package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class WebDriverFactory {

    public WebDriver configureEnvironment(String browser){
        //obtenemos el nombre del sistema operativo en el que estamos trabajando
        //String os = System.getProperty("os.name");
        if(browser.equals("chrome")){
            //when we use wedriver file
            /*File rootPath = new File("src/main/resources/ExplorerDrivers/chromedriver");
            System.setProperty("webdriver.chrome.driver", rootPath.getPath());*/
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if(browser.equals("edge")){
            //when we use edge driver plugin
            /*File rootPath = new File("src/main/resources/ExplorerDrivers/msedgedriver");
            System.setProperty("webdriver.edge.driver", rootPath.getPath());*/
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        } else if(browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            return null;
        }
    }
}
