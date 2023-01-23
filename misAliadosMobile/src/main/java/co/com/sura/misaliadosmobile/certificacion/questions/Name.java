package co.com.sura.misaliadosmobile.certificacion.questions;

import co.com.sura.misaliadosmobile.certificacion.enums.MsgError;
import co.com.sura.misaliadosmobile.certificacion.utils.ReadFiles;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    public  Boolean answeredBy(Actor actor) {
        String name = actor.recall("INDEPENT_NAME").toString();

        actor.attemptsTo(
                WaitUntil.the(BTN_LICENSE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_LICENSE)
        );

        actor.attemptsTo(
                Ensure.that(LBL_NAME_CONTRACTOR.of(name).resolveFor(actor).getAttribute("content-desc"))
                        .contains(name)
        );

        return true;
    }

    public static String nameIsNotEquals(Actor actor){
        String name = actor.recall("INDEPENT_NAME").toString();

        return String.format(MsgError.MSG_ERROR_TEXT.getMsg(), name, LBL_NAME_CONTRACTOR.of(name)
                .resolveFor(actor).getAttribute("content-desc"));
    }
}
