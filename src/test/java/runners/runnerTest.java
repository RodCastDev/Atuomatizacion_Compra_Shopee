package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"stepDefinitions","hooks"},
        features = "src/test/resources/Features/Compra.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false
)
public class runnerTest {
}
