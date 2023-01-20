package co.com.sura.misaliadosmobile.certificacion.tasks;

import co.com.sura.misaliadosmobile.certificacion.interactions.Close;
import co.com.sura.misaliadosmobile.certificacion.models.Independent;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.LoginPage.*;

@AllArgsConstructor
public class LogIn implements Task {

    private Independent independent;

    public static LogIn misAliadosApp(Independent independent) {
        return Tasks.instrumented(LogIn.class, independent);
    }

    @Step("{0} fills the text box with credentials.")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(INPUT_EMAIL),
                Enter.theValue(independent.getEmail()).into(INPUT_EMAIL),
                Close.keyBoard(), Click.on(INPUT_PASSWORD),
                Enter.theValue(independent.getPassword()).into(INPUT_PASSWORD),
                Close.keyBoard(), Click.on(BTN_LOGIN)
        );

        actor.remember("INDEPENT_NAME", independent.getName());
    }
}
