package co.com.sura.misaliadosmobile.certificacion.stepdefinitions;

import co.com.sura.misaliadosmobile.certificacion.enums.MsgError;
import co.com.sura.misaliadosmobile.certificacion.exceptions.ExceptionError;
import co.com.sura.misaliadosmobile.certificacion.questions.Name;
import co.com.sura.misaliadosmobile.certificacion.tasks.LogIn;
import co.com.sura.misaliadosmobile.certificacion.tasks.GoToProfile;
import co.com.sura.misaliadosmobile.certificacion.utils.ReadFiles;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.core.IsEqual;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {

    @Given("{string} logs with credentials")
    public void logsWithCredentials(String independent) {
        theActorInTheSpotlight().attemptsTo(
                LogIn.misAliadosApp(ReadFiles.readIndependent(independent))
        );
    }

    @When("goes to the profile to see the license")
    public void goesToTheProfile() {
        theActorInTheSpotlight().attemptsTo(
                GoToProfile.independent()
        );
    }

    @Then("shoulds see the name in the profile page")
    public void shouldsSeeTheNameInTheProfilePage() {
        theActorInTheSpotlight().should(seeThat(Name.exists())
                .orComplainWith(ExceptionError.class,
                        Name.nameIsNotEquals(theActorInTheSpotlight())));
    }
}
