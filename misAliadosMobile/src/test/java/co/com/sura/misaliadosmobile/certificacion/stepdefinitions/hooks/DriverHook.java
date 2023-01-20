package co.com.sura.misaliadosmobile.certificacion.stepdefinitions.hooks;

import co.com.sura.misaliadosmobile.certificacion.utils.DriverManager;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class DriverHook {

    @BeforeAll
    public static void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(DriverManager.start())));
        OnStage.theActorCalled("Automation");
    }

    @AfterAll
    public static void close(){
        DriverManager.stop();
    }
}
