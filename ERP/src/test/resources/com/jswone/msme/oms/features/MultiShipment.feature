@OMS @MultiShipmentOMS
Feature: Verify Multishipment Details

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramyatestuserssr@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed
    
   @MultiShipmentOMS
  Scenario: Verify Ordered value in footer
      When cart is empty or not
    Then user navigate to Home page
    When user is on Welding consumables Menu on header section
    And user is able to select WeldingFluxes from Welding consumables Menu
    And user click on product name of WeldingFlux product displayed on the page
    And user is on WeldingFlux Product page
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
    # When user is on Steel Menu on header section
   
   
    When user clicks HR from Steel Navigation Menu
    When user selects Steel product
    Given user is on product detail page of Steel item
    #Then verify seller name
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
    Then verify after successful payment page navigates to ORDER summary page
    Then order sucessfully placed message should be displayed
    And user login to OMS
    And user navigates to OMS OrderPage
    And extract order value from ERPV2API
    And validate the ERPV2API contract
    And verify Ordered value matches with ordersummary value
     
