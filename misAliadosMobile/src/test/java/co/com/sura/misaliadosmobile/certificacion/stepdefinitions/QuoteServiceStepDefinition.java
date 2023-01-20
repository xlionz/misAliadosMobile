package co.com.sura.misaliadosmobile.certificacion.stepdefinitions;

import co.com.sura.misaliadosmobile.certificacion.tasks.QuoteService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class QuoteServiceStepDefinition {

    @When("searches the services calling {string} and quote the service")
    public void searchesTheServicesCallingAndQuoteTheService(String service) {
        theActorInTheSpotlight().attemptsTo(
                QuoteService.ofAContractor(service)
        );
    }

    @Then("shoulds see a text indicanting that services was quoted")
    public void shouldsSeeATextIndicantingThatServicesWasQuoted() {
        //No finished beacuse use it the same logic of accept_request.feature
    }
}
