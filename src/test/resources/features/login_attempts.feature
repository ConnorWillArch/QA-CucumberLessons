Feature: Login Functionality
  In Order to prevent unauthorized access
  As a web app
  I want to display an error when users enter the wrong details

  Background:
    Given the user is on the login page

    Scenario Outline: User attempts to log in with invalid credentials
      When the user enters username "<username>" and password "<password>"
      And the user clicks the login button
      Then the system displays a login error message
      Examples:
        | username  | password
        | invalid1  | wrongPass
        | validUser | wrongPass
        | invalid2  | correctPass
