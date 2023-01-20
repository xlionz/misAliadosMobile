package co.com.sura.misaliadosmobile.certificacion.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.HomoPage.BTN_EXIT;
import static co.com.sura.misaliadosmobile.certificacion.userinterfaces.HomoPage.BTN_PROFILE;

@AllArgsConstructor
public class GoToProfile implements Task {

    public static GoToProfile independent() {
        return Tasks.instrumented(GoToProfile.class);
    }

    @Step("{0} goes to the profile.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_EXIT)
        );

        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos((long) 2 * 1000));

        actor.attemptsTo(
                Click.on(BTN_PROFILE)
        );
    }
}
