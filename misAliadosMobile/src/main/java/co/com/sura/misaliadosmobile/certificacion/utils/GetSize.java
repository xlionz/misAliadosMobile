package co.com.sura.misaliadosmobile.certificacion.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class GetSize {

    public static int ofElement(Actor actor, Target target){

        List<WebElementFacade> index = target.resolveAllFor(actor);

        return index.size();
    }
}
