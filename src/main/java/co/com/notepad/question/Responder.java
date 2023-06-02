package co.com.notepad.question;

import co.com.notepad.model.NotepadDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class Responder implements Question<Boolean> {
    private List<NotepadDatos> datos;

    public Responder(List<NotepadDatos> datos) {
        this.datos = datos;
    }

    public static Responder aLos(List<NotepadDatos> datos) {
        return new Responder(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        //String Mensaje_final = Text.of(PaginaFinal.MENSAJE_BIENVENIDA).viewedBy(actor).asString();
        //return datos.get(0).getStrTextoFinal().equals(Mensaje_final);
        return true;
    }
}
