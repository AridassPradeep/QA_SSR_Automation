@PDPDiscountAndPayment
Feature: Payment and Cart Scenarios for single and multiple product

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    And user enters logins with username with "ramya1347@gmail.com" and  "Ramya@678"
    And user clicks on signin

  
  Scenario: Single Product-Verify Payment is sucessfull
    When cart is empty or not
    When user enter "Colour coated" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity as 3MT
    Then verify price would be displayed
    When user add an item to cart
    Then verify Cart icon would appear with 1
    When user click on Buy Now
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on success button
    Then verify after successful payment page navigates to ORDER summary page
    Then order sucessfully placed message should be displayed

 
  Scenario: Multiple Product  Product-Verify Payemnt is sucessfull
    When cart is empty or not
    When user enter "Colour coated" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity as 3MT
    Then verify price would be displayed
    When user add an item to cart
    Then verify Cart icon would appear with 1
    When user enter "Colour coated" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity and dimensions
    Then verify price would be displayed
    When user click on Buy Now
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
   And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on success button
    Then verify after successful payment page navigates to ORDER summary page
    Then order sucessfully placed message should be displayed


  Scenario: Verify error message should be displayed on unsuccessful payment
    When cart is empty or not
    When user enter "Colour coated" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity as 3MT
    Then verify price would be displayed
    When user add an item to cart
    Then verify Cart icon would appear with 1
    When user enter "Colour coated" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity and dimensions
    Then verify price would be displayed
    When user click on Buy Now
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on failure button
    Then verify error message should be displayed on unsuccessful payment

  Scenario: Verify after successful payment page is navigating to order summary page
    When cart is empty or not
    When user enter "Colour coated" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity as 3MT
    Then verify price would be displayed
    When user add an item to cart
    Then verify Cart icon would appear with 1
    When user enter "Colour coated" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity and dimensions
    Then verify price would be displayed
    When user click on Buy Now
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on success button
    Then verify after successful payment page navigates to ORDER summary page
    Then order sucessfully placed message should be displayed
