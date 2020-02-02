@passportPage
Feature: Passport Renewal

  Scenario: Apply for U.S. Passport
    Given User opens home page
    When User navigates Passports page
    Then Verifies title is U.S. Passports
    Then User selects United States
    Then User enters DOB
    Then User selects passport history
    Then User selects yes passport possession
    Then User selects yes replacing passport
    Then User selects domestic option
    Then User selects valid more than a year
    Then user selects passport limited no
    Then User enters issuance date
    Then User click Next
    Then User slects Passport Book
    Then User selects Standard method
    Then User selects Standard Delivery
    Then User clicks the Calculate button
    Then user verifies total
    Then user clicks next


