package co.com.notepad.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.online-notepad.net/es/bloc-de-notas-online/")

public class PaginaNotePad extends PageObject {

    public static final Target JOIN = Target.the("Boton para iniciar proceso de registro")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
