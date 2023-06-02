package co.com.notepad.stepdefinitions;

import co.com.notepad.model.NotepadDatos;
import co.com.notepad.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver elNavegador;

    @Before
    public void setStager(){
        OnStage.setTheStage(new OnlineCast());
        elNavegador.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @Given("^Eduar ingresa a notepad$")
    public void  EduarIngresaANotepad() throws Exception {
        theActorCalled("Eduar").attemptsTo(AbrirPaginaNotepad.laPagina());
    }


    @When("^El usuario ingresa la nota en negrita$")
    public void elUsuarioIngresaLaNotaEnNegrita(List<NotepadDatos> datos) throws Exception {
        theActorInTheSpotlight().attemptsTo(EscribirTexto.laPagina(datos)
        );
    }

    @Then("^Creacion completa de la nota$")
    public void creacionCompletaDeLaNota(List<NotepadDatos> datos) {
    }
}
