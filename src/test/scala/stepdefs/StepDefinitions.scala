package stepdefs




import io.cucumber.scala.{EN, PendingException, ScalaDsl}
import junit.framework.TestCase.assertEquals
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver


import scala.jdk.CollectionConverters
import java.time.Duration

class StepDefinitions extends ScalaDsl with EN {

  val driver: WebDriver = new ChromeDriver()
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
  Given("""The user is on the login page""") { () =>

    driver.get("https://parabank.parasoft.com/parabank/index.html")

  }

  When("""The user enters valid login details""") { () =>
    val userName: WebElement = driver.findElement(By.name("username"))
    val password: WebElement = driver.findElement(By.name("password"))

    userName.sendKeys("john")
    password.sendKeys("demo")

  }
  And("""The user clicks the login button""") { () =>


    driver.findElement(By.cssSelector("input[type = \"submit\"]")).click()

  }
  Then("""The user should login successfully""") { () =>
    val actualHeader: String = driver.findElement(By.cssSelector("#showOverview > h1")).getText
    val expectedHeader: String = "Accounts Overview"
    assertEquals(expectedHeader,actualHeader)
    driver.quit()
  }

  When("""The user enters invalid login details""") { () =>
    throw new PendingException()

  }

  Then("""The user should get an invalid login details error message""") { () =>

    throw new PendingException()
  }

  When ("""The user enters "<username>" and "<password>""""){
    () =>

    throw new PendingException()
  }


}