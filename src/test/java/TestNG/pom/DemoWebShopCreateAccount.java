package TestNG.pom;

import com.pageObjects.pom.*;
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

    @Test(priority = 1)
    public void createUser() throws InterruptedException {
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

    @Test(priority = 2)
    public void loginUser() throws InterruptedException {
        //Declaramos el objeto de la clase que contiene los pasos
        pageObjectsDemoWenShopLoginSession execution = new pageObjectsDemoWenShopLoginSession(this.driver);

        execution.clickOnLogInLink();
        Thread.sleep(500);

        execution.writeEmailandPass();
        Thread.sleep(500);

        execution.clickonLogInButton();
        Thread.sleep(500);

        execution.validateAppearWebElements();
        Thread.sleep(500);

        execution.logoutSession();
        Thread.sleep(500);

        execution.valideLogoutElements();
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
