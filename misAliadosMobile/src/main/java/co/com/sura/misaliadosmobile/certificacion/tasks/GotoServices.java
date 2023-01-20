package co.com.sura.misaliadosmobile.certificacion.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.HomoPage.BTN_EXIT;
import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.HomoPage.BTN_SERVICES;

@AllArgsConstructor
public class GotoServices implements Task {

    public static GotoServices ofIndependent() {
        return Tasks.instrumented(GotoServices.class);
    }

    @Step("{0} goes to the service and see the services")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_EXIT),
                Click.on(BTN_SERVICES)
        );
    }
}
