@creditCards
  Feature: Test credit cards Page
    @smoke @regression
    Scenario: Verify credit cards page title and button name
      Given User opens home page
      When User navigates to "credit cards"
      When User sees credit card "Manage Account*"
      Then Verifies  Credit Card title is "Best Buy Credit Card: Rewards & Financing"