Feature: User Registration
  As a new user
  I want to register for an account
  So that I can log in and access members only features

  Scenario: Successful registration
    Given I am on the registration page
    When I fill in the form with the following details:
      | field            | value            |
      | First Name       | Alice            |
      | Last Name        | Wonderland       |
      | Email            | test@example.com |
      | Password         | 12345            |
      | Confirm Password | 12345            |
    And I accept the terms and conditions
    And I click the register button
    Then I should see a confirmation message
    And I should be redirected to my user dashboard
    And My username should be displayed in the dashboard