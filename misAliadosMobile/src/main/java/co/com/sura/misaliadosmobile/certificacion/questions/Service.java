package co.com.sura.misaliadosmobile.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.ServicesPage.VIEW_ACCEPTED_SERVICE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Service implements Question<Boolean> {

    public static Service wasAccepted(){
        return new  Service();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(VIEW_ACCEPTED_SERVICE, isVisible()).forNoMoreThan(10).seconds()
        );

        return true;
    }
}
