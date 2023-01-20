package co.com.sura.misaliadosmobile.certificacion.interactions;

import co.com.sura.misaliadosmobile.certificacion.utils.DriverManager;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

@AllArgsConstructor
public class Close implements Interaction {

    public static Close keyBoard() {
        return Tasks.instrumented(Close.class);
    }

    @Step("{0} closes the keyboard.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        DriverManager.getDriver().hideKeyboard();
    }
}