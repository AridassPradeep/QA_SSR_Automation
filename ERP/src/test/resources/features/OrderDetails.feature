@OMS @OrderDetailsOMS
Feature: Verify Order Details

  @OrderDetails1
  Scenario: Verify full payment status and CashAndCarry Payment Type
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramyatestuserssr@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed
    When cart is empty or not
    Then user navigate to Home page
    When user is on Steel Menu on header section
    And user is able to select Wire rods from Steel Menu
    And user click on product name of Wire product displayed on the page
    And user is on Wire Product page
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
    And user navigates to OMS OrderPage
    Then verify payment status is "Full"
    And verify Payment type is "Cash & Carry"

  @OrderDetails2
  Scenario: Verify Pending status and Cash & Carry
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramyatestuserssr@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed
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
    And extract orderno from paymentPage
    And user login to OMS
    And user navigates to OMS OrderPage
    Then verify payment status is "Pending"
    And verify Payment type is "Cash & Carry"

  @OrderDetails3
  Scenario: Verify Pending status and Cash & Carry - Advance Payment Type
    Given user login to SF
    When user navigates to AccountPage
    And click on Quick Opportunity
    And fill SKURequirement Details and process Opportunity
    And create order and extract orderno from SF
    And user login to OMS
    And user navigates to OMS OrderDetailsPage
    Then verify PaymentStaus is "Pending" in OMS
    And verify Advance Amount in OMS
    And verify buyer cashback
    And user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramyatestuserssr@gmail.com" and  "Ramya@678"
    And user clicks on signin
    And user navigates to SF order in CCP
    Then verify Advance Payment Msg "Your order is awaiting advance payment "

  @OrderDetails4
  Scenario: Verify PI/PO and order confirmed status
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramyatestuserssr@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed
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
    And user navigates to OMS OrderPage
    And click verify PI/PO
    Then verify order status value is "Confirmed"
    
    
      @OrderDetails5
  Scenario: Verify Ordered value in footer
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramyatestuserssr@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed
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
    And user navigates to OMS OrderPage
    And extract order value from ERPV2API
    And validate the ERPV2API contract
    And verify Ordered value matches with ordersummary value
     
