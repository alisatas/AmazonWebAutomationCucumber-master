@HomePageTestCases
Feature: Checking login page test cases

  Background:
    Given User controls link "https://www.amazon.nl/"
    And User accepts cookies
    Then user controls "amazon logo" at top left

  @userControlsSearchButton
  Scenario: Controlling search button
    Given user controls searching "product area" field
    Then user control "search button" in search area

  @userControlsLoginButton
  Scenario: Controlling login button
    When user hovers to login button
    Given user controls login Button "login button"
    Then user controls "Hallo Inloggen" text

  @userControlsRetorzendingen
  Scenario: Controlling Retourzendingen area
    Then user controls "Retorzendingen" area







