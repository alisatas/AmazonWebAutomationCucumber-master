@HomePageTestCases
Feature: Checking login page test cases


  Background: Checking SignUp button
    Given User controls link "https://www.amazon.nl/"
    And User accepts cookies
    Then user controls "amazon logo" at top left
    Then user controls searching "product area" field
    Then user control "search button" in search area

  @ComparePricesAfterAddBasket
  Scenario: controlling first products price
    Given user searches for product "Jil sander parfum"
    When user clicks search button
    And user should see '"Jil sander parfum"' searched keyword
    And user controls price of the forth product
    And user clicks for the forth product on page
    Then user control prices if equals

  Scenario:










