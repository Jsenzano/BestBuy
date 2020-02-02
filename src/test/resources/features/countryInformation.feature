@countryInformationPage
Feature: Passport Renewal

  Scenario: Apply for U.S. Passport
    Given User opens home page
    When User navigates to International Travel
    Then User navigates to Country Information
    And User verifies Country Info page
    Then User enters a country
    Then User verifies correct country info


