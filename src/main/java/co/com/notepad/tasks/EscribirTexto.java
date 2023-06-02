package co.com.notepad.tasks;

import co.com.notepad.model.NotepadDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static co.com.notepad.userinterface.PaginaExcribirTexto.*;

public class EscribirTexto implements Task {

    private List<NotepadDatos> datos;

    public EscribirTexto(List<NotepadDatos> datos) {
        this.datos = datos;
    }

    public static EscribirTexto laPagina(List<NotepadDatos> datos) {
        return Tasks.instrumented(EscribirTexto.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_TEXTO_ENRRIQUESIDO),
                Enter.theValue(datos.get(0).getStrNombreNota()).into(NOMBRE_NOTA),
                Enter.theValue(datos.get(0).getStrNota()).into(NOTA)
                );
    }
}
