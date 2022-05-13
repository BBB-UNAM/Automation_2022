package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class WebDriverFactory {

    public WebDriver configureEnvironment(String browser){
        //obtenemos el nombre del sistema operativo en el que estamos trabajando
        //String os = System.getProperty("os.name");
        if(browser.equals("chrome")){
            File rootPath = new File("src/main/resources/ExplorerDrivers/chromedriver");
            System.setProperty("webdriver.chrome.driver", rootPath.getPath());
            return new ChromeDriver();
        } else if(browser.equals("edge")){
            File rootPath = new File("src/main/resources/ExplorerDrivers/msedgedriver");
            System.setProperty("webdriver.edge.driver", rootPath.getPath());
            return new EdgeDriver();
        } else {
            return null;
        }
    }
}
