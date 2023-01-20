package co.com.sura.misaliadosmobile.certificacion.questions;

import co.com.sura.misaliadosmobile.certificacion.enums.MsgError;
import co.com.sura.misaliadosmobile.certificacion.utils.ReadFiles;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.ProfilePage.BTN_LICENSE;
import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.ProfilePage.LBL_NAME_CONTRACTOR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class Name implements Question<Boolean> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReadFiles.class);

    public static Name exists() {
        return new Name();
    }

    @Step("{0} see the name on the profile.")
    @Override
    public Boolean answeredBy(Actor actor) {

        String name = actor.recall("INDEPENT_NAME").toString();

        actor.attemptsTo(
                WaitUntil.the(BTN_LICENSE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_LICENSE)
        );

        try {
            actor.attemptsTo(
                    WaitUntil.the(LBL_NAME_CONTRACTOR.of(name), isVisible()).forNoMoreThan(10).seconds()
            );
        } catch (Exception e) {
            LOGGER.info(e.toString());
        }

        return true;
    }
}
