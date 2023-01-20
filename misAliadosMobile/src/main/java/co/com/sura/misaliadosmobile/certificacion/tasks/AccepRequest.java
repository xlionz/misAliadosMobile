package co.com.sura.misaliadosmobile.certificacion.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.ServicesPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class AccepRequest implements Task {

    private String service;

    public static AccepRequest ofService(String service){
        return Tasks.instrumented(AccepRequest.class, service);
    }

    @Step("{0} goes to the request to accept.")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(VIEW_LIST_SERVICES, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(VIEW_NEW_SERVICE.of(service)),
                Click.on(BTN_NEW_REQUEST),
                Click.on(VIEW_WAITING_REQUEST.of(service))
        );

        actor.attemptsTo(
                WaitUntil.the(VIEW_INFO_SERVICE.of(service), isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_ACCEPT_REQUEST)
        );
    }
}
