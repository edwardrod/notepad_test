package co.com.notepad.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaExcribirTexto {

    public static final Target BOTON_TEXTO_ENRRIQUESIDO = Target.the("BOTON_TEXTO_ENRRIQUESIDO")
            .located(By.id("richtextnote-tab"));
    public static final Target NOMBRE_NOTA = Target.the("NOMBRE_NOTA")
            .located(By.id("editNoteName"));
    public static final Target NOTA = Target.the("NOTA")
            .located(By.xpath("//*[@id=\"editor\"]"));

}
