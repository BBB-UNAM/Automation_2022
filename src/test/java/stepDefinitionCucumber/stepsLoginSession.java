package stepDefinitionCucumber;
import Factory.WebDriverFactory;
import com.pageObjects.pom.pageObjectsDemoWenShopRegister;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.PendingException;
import org.openqa.selenium.WebDriver;

public class stepsLoginSession {
    WebDriver driver;
    pageObjectsDemoWenShopRegister execution;

    @Given("the user opens demo web shop webpage")
    public void openURL(){
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

    @When("the user complete the register form")
    public void text() throws InterruptedException{
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

    @Then("the registered message is displayed")
    public void closeBrowser(){
        //System.out.println("adios");
        //crar onjeto base con nuestro driver
        this.execution.closeCase();
    }
}
