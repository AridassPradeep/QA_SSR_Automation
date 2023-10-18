@OMS @OMSPayout
Feature: Verify Payout scenarios

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramyatestuserssr@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed

  @PartialHold
  Scenario: Verify PartialHold
    Given user login to OMS
    And user navigates to invoiced shipment detailsPage
    And clickon PartialHold Details and Update
    And navigate to Payouts Tab
    Then Validate QualityIssues should be same as entered partial amount value
    And intiate payout is enabled

  @FullHold
  Scenario: Verify FullHold
    Given user login to OMS
    And user navigates to invoiced shipment detailsPage
    And clickon FullHold Details and Update
    And navigate to Payouts Tab
    Then Validate QualityIssues should be same as Total invoiced amount
    And intiate payout is disabled

  @ReleasePayout
  Scenario: Verify Release and confirm Payout
    When cart is empty or not
    Then user navigate to Home page
    When user is on Welding consumables Menu on header section
    And user is able to select WeldingFluxes from Welding consumables Menu
    And user click on product name of WeldingFlux product displayed on the page
    And user is on WeldingFlux Product page
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
    When user click on Cart icon on homepage
    When user click on pickup checkbox
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on success button
    Then order sucessfully placed message should be displayed
    And user login to OMS
    And user navigates to OMS ShipmentsPage
    And user creates a completed shipment in OMS with invoiceQty "7"
    And navigate to Shipment Tab
    And clickon Release Payout and Update
    And navigate to Payouts Tab
    Then Validate QualityIssues should be "₹0.00"
    And intiate payout is enabled
    And click on InitiatePayout
    And confirm Payout
