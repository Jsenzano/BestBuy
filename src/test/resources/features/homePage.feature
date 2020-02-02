@homePage
Feature: Home page Testing
  @verifytitle @smoke
  Scenario: Verify title of Home Page
    Given User opens home page
    When User sees TSG Banner
    Then Verifies title is U.S Department of State - Bureau of Consular Affairs
