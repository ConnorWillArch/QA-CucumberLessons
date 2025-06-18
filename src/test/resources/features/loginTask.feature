@regression
Feature: Login Task

  Background:
    Given The user is on the login page
  @smoke @regression @wip
  Scenario: Successful login
    When The user enters valid login details
    And The user clicks the login button
    Then The user should login successfully
  @regression
  Scenario: Invalid login
    When  The user enters invalid login details
    And The user clicks the login button
    Then The user should get an invalid login details error message
    @wip @smoke
    Scenario Outline: Login with invalid credentials
      When  The user enters "<username>" and "<password>"
      And The user clicks the login button
      Then The user should get an invalid login details error message

      Examples:
        | username  | password      |
        | TestUser1 | TestPassword1 |
        | TestUser2 | TestPassword2 |
        | TestUser3 | TestPassword3 |

