package co.com.sura.misaliadosmobile.certificacion.stepdefinitions;

import co.com.sura.misaliadosmobile.certificacion.exceptions.ExceptionError;
import co.com.sura.misaliadosmobile.certificacion.questions.Service;
import co.com.sura.misaliadosmobile.certificacion.tasks.AccepRequest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AcceptRequestStepDefinition {

    @When("searches the services calling {string} and accept the request")
    public void searchesTheServicesCalling(String service) {
        theActorInTheSpotlight().attemptsTo(
                AccepRequest.ofService(service)
        );
    }
    @Then("shoulds se a text indicanting that request was accepted")
    public void shouldsSeATextIndicantingThatRequestWasAccepted() {
        theActorInTheSpotlight().should(seeThat(Service.wasAccepted())
                .orComplainWith(ExceptionError.class));
    }
}
