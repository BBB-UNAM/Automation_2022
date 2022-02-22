package TestNG.pom;

import com.pageObjects.pom.*;
import com.wrappers.pom.baseDemoWebShop;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import Factory.WebDriverFactory;

public class DemoWebShopCreateAccount {
    WebDriver driver;

    @BeforeSuite
    public void configureWebDriver(){
        //instanciamos el objeto que contruye el factory.
        WebDriverFactory factory = new WebDriverFactory();

        //llamamos al metodo que cotruye nuestro driver
        this.driver = factory.configureEnvironment("chrome");
    }

    @BeforeMethod
    public void beforeMethod(){
        //metodo
        pageObjectsDemoWenShopInitialSteps execution = new pageObjectsDemoWenShopInitialSteps(this.driver);

        //Definimos explicit wat of 10 seconds
        execution.explictWait(10);

        //Abrimos la pagina de demo web shop
        execution.openDemoWebShopPage();

        //Maximizamos ventana
        execution.miximizeWindow();
    }

    @Test
    public void test() throws InterruptedException {
        pageObjectsDemoWenShopRegister execution = new pageObjectsDemoWenShopRegister(this.driver);

        //damos click on regisyter link
        execution.clickOnRegisterLink();
        Thread.sleep(500);

        //Completamos el formulario
        execution.completeForm();
        Thread.sleep(500);

        //click on register button
        execution.clickOnRegisterButton();
        Thread.sleep(500);

        //Validar mensaje de confirmacion
        execution.verifyRegisteredtext();
        Thread.sleep(500);

        //click on contnue button
        execution.clickOnContineButton();
        Thread.sleep(500);
    }

    @AfterMethod
    public void afterTest(){
        //System.out.println("adios");
        //crar onjeto base con nuestro driver
        pageObjectsDemoWenShopFinalSteps execution = new pageObjectsDemoWenShopFinalSteps(this.driver);

        //cerramos el hilo de ejecucion y el explorador.
        execution.closeCase();
    }
}
