package co.com.sura.misaliadosmobile.certificacion.questions;

import co.com.sura.misaliadosmobile.certificacion.utils.GetSize;
import co.com.sura.misaliadosmobile.certificacion.utils.ReadFiles;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.ServicesPage.VIEW_LIST_SERVICES;
import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.ServicesPage.VIEW_SERVICES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


@AllArgsConstructor
public class Services implements Question<Boolean> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReadFiles.class);

    public static Services exist() {
        return new Services();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        LOGGER.info("Se validan los nuevos servicios que tenga asociado: " + actor.recall("INDEPENT_NAME"));

        for (int i = 0; i < GetSize.ofElement(actor, VIEW_LIST_SERVICES); i++) {

            actor.attemptsTo(
                    WaitUntil.the(VIEW_SERVICES.of(Integer.toString(i + 1)),
                            isVisible()).forNoMoreThan(10).seconds()
            );
        }
        return true;
    }
}
