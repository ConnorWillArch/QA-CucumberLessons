package runner

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features   = Array("src/test/resources/features"),            // src/test/resources/features
  glue       = Array("stepdefs", "support"),
  tags = "@regression and not @wip",
  plugin     = Array("pretty",
    "html:target/regression/cucumber-report.html"),
  monochrome = true
)
class RegressionTestRunner // an empty class body is OK