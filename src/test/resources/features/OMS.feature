Feature: Verify OMS

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramyatestuserssr@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed

  @OMS
  Scenario: Verify Shipment in OMS
    When cart is empty or not
    Then user navigate to Home page
    When user clicks HR from Steel Navigation Menu
    When user selects Steel product
    Given user is on product detail page of Steel item
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
    And user creates a completed shipment in OMS
    And user navigates to ShipmentDetails Page in CCP
    And user clicks on viewDocuments

  @MultiShipment
  Scenario: Verify Multi Shipment in OMS
    When cart is empty or not
    Then user navigate to Home page
    When user clicks HR from Steel Navigation Menu
    When user selects Steel product
    Given user is on product detail page of Steel item
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
    And user creates multiple shipment in OMS

  @MultiInvoiceUploadAndDelete
  Scenario: Verify Multi file upload and delete
    Given user login to OMS
    And user navigates to Delivered shipment detailsPage
    And uploads multi invoices
    And delete all invoices uploaded

  @InvoiceErrror
  Scenario: Verify InvoiceDeleteErrorMessage
    Given user login to OMS
    And user navigates to invoiced shipment detailsPage
    And delete invoices in Invoiced Shipment
    Then "Shipment invoice can not be deleted in invoiced or completed status" message  to be displayed

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
    Then Validate QualityIssues should be same as entered partial amount value
    And intiate payout is disabled

  @ReleasePayout
  Scenario: Verify Release Payout
    Given user login to OMS
    And user navigates to invoiced shipment detailsPage
    And clickon Release Payout and Update
    And navigate to Payouts Tab
    Then Validate QualityIssues should be same as entered partial amount value
    And intiate payout is disabled
    
    
   
