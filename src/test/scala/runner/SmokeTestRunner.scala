package runner

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features   = Array("src/test/resources/features"),            // src/test/resources/features
  glue       = Array("stepdefs", "support"),
  tags = "@smoke",
  plugin     = Array("pretty",
    "html:target/smoke/cucumber-report.html"),
  monochrome = true
)
class SmokeTestRunner // an empty class body is OK