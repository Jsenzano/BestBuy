@bookingPage
Feature: Booking Pages Test
  @couponTest @smoke
  Scenario: Verify coupon code
#    Given User opens Admin home page
#    When User logsin with admin account
#    And User navigate to Coupons page
#    And Creates a new coupon
#    Then Verifies coupon is created
    Given User opens home page
    When User opens "last tour" featured tour
    And Clicks on "book" button
    And Clicks on "book now package" button
#    And Applies existing coupon code
#    Then Verifies positive message is displayed