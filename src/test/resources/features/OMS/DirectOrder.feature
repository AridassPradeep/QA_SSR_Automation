@OMS @DirestOrderDetailsOMS
Feature: Verify Direct Order Details

   @DirestOrderDetailsOMS
  Scenario: Verify Ordered value in footer
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "hari5465@yopmail.com" and  "Hari5465#"
    And user clicks on signin
    Then user homepage is displayed
    When cart is empty or not
    Then user navigate to Home page
    When cart is empty or not
    Then user navigate to Home page
    When user is on Steel Menu on header section
    And user is able to select Wire rods from Steel Menu
    And user click on product name of Wire product displayed on the page
    And user is on Wire Product page forDirectOrder
    And user is able to click Add to requirement cart
    And user is able to click View requirement cart
    Then verify View requirements list is displayed
    When user click Request Price
    Then verify Message "Your Pricing request has been submitted. Our support team will reach out to you within 24hrs." is displayed.
    And user login to OMS
    And user navigates to OMS OrderPage
    And extract order value from ERPV2API
    And validate the ERPV2API contract
    And verify Ordered value matches with ordersummary value
     
