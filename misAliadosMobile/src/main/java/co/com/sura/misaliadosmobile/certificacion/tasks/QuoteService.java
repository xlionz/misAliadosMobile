package co.com.sura.misaliadosmobile.certificacion.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.ServicesPage.BTN_ALL_QUOTE_PROCESS_SERVICES;
import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.ServicesPage.VIEW_QUOTE_PROCESS_SERVICE;
import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.ServicesPage.VIEW_ACCEPT_SERVICE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class QuoteService implements Task {

    private String service;

    public static QuoteService ofAContractor(String service){
        return Tasks.instrumented(QuoteService.class, service);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(VIEW_QUOTE_PROCESS_SERVICE.of(service), isVisible()).forNoMoreThan(10).seconds(),
                Click.on(VIEW_QUOTE_PROCESS_SERVICE.of(service)),
                Click.on(BTN_ALL_QUOTE_PROCESS_SERVICES),
                Click.on(VIEW_ACCEPT_SERVICE.of(service))
        );
    }
}
