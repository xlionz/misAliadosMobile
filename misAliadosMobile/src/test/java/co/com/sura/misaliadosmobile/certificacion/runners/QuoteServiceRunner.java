package co.com.sura.misaliadosmobile.certificacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/quote_service.feature",
        glue = "co.com.sura.misaliadosmobile.certificacion.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class QuoteServiceRunner {
}
