package co.com.sura.misaliadosmobile.certificacion.stepdefinitions;

import co.com.sura.misaliadosmobile.certificacion.exceptions.ExceptionError;
import co.com.sura.misaliadosmobile.certificacion.questions.Services;
import co.com.sura.misaliadosmobile.certificacion.tasks.GotoServices;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeeNewServicesStepDefinition {

    @When("goes to the list of services")
    public void goesToTheServices() {
        theActorInTheSpotlight().attemptsTo(
                GotoServices.ofIndependent()
        );
    }

    @Then("shoulds see all services on page")
    public void shouldsSeeAllServicesOnPage() {
        theActorInTheSpotlight().should(seeThat(Services.exist())
                .orComplainWith(ExceptionError.class));
    }
}
