package Test.pom;
import com.pageObjects.pom.pageObjectsDemoWenShopRegister;
import com.wrappers.pom.baseDemoWebShop;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import Factory.WebDriverFactory;

public class DemoWebShopCreateAccount {
    WebDriver driver;
    pageObjectsDemoWenShopRegister execution;

    @BeforeTest
    public void beforeTest(){
        //instanciamos el objeto que contruye el factory.
        WebDriverFactory factory = new WebDriverFactory();

        //llamamos al metodo que cotruye nuestro driver
        this.driver = factory.configureEnvironment("chrome");

        //crar onjeto base con nuestro driver
        this.execution = new pageObjectsDemoWenShopRegister(this.driver);

        //Definimos los explicit wait a 10 segundos
        this.execution.explictWait(10);

        //abrirmos la url
        this.execution.openDemoWebShopPage();

        // maximizamos la ventana del explorador.
        this.execution.miximizeWindow();
    }

    @Test
    public void test() throws InterruptedException {
        //System.out.println("hola");
        Thread.sleep(1500);

        //damos click on regisyter link
        this.execution.clickOnRegisterLink();
        Thread.sleep(500);

        //Completamos el formulario
        this.execution.completeForm();
        Thread.sleep(500);

        //click on register button
        this.execution.clickOnRegisterButton();
        Thread.sleep(500);

        //Validar mensaje de confirmacion
        this.execution.verifyRegisteredtext();
        Thread.sleep(500);

        //click on contnue button
        this.execution.clickOnContineButton();
        Thread.sleep(500);
    }

    @AfterTest
    public void afterTest(){
        //System.out.println("adios");
        //crar onjeto base con nuestro driver
        this.execution.closeCase();
    }
}
