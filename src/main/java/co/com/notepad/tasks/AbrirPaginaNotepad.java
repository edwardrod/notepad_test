package co.com.notepad.tasks;

import co.com.notepad.userinterface.PaginaNotePad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaNotepad implements Task {

    private PaginaNotePad PaginaNotePad;

    public static AbrirPaginaNotepad laPagina() {
        return Tasks.instrumented(AbrirPaginaNotepad.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(PaginaNotePad));
    }
}
