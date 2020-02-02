@homePage
Feature: Home page Testing
  Scenario: Verify title of Home Page
    Given User opens home page
    Then Verifies title is "Best Buy | Official Online Store | Shop Now & Save"
    When User sees "Today's popular picks"

  @scenarioOutline
  Scenario Outline: Takes screenshot main menu
    Given User opens home page
    Then User navigates to "<link>"
    And Takes screenshot
    Examples:
      | link              |
      | Credit Cards      |
      | Top Deals         |
      | Gift Cards        |
      | Gift Ideas        |
      | For Your Business |

