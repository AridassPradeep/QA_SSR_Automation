@PDPDiscount
Feature: Product Detail Page with discount

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user enters logins with username with "ramya1347@gmail.com" and  "Ramya@678"
    And user clicks on signin

  Scenario: verify Flat 500 rs discount is applied
    When cart is empty or not
    When user enter "Colour coated" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity as 2MT
    Then verify price would be displayed
    When user add an item to cart
    Then verify Cart icon would appear with 1
    When user click on cart icon with 1
    And user click view offers on cart detail page
    And user enter the coupon code on apply coupon dialog
    And user click on apply
    Then verify coupon would be applied
    And verify the discounted price would be shown as "seller promotion" tag
    And verify product deleted from cart


  Scenario: Verify Flat 5% discount on order value 5L
    When cart is empty or not
    When user enter "Colour coated" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter dimension
    Then verify the cart value is more than 5L
    When user add the product to cart
    Then verify Cart icon would appear with 1
    When user click on cart icon with 1
    And user click view offers on cart detail page
    And user enter the coupon code on apply coupon dialog
    And user click on apply
    Then verify coupon would be applied
    # And verify discounted price would be shown as "platform promotion" tag
    And verfiy 25,000rs would be discounted from the total price
    And verify product deleted from cart


  Scenario: Verify an expired coupon is used then an error message should be displayed
    When cart is empty or not
    When user enter "Colour coated" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter dimension
    Then verify the cart value is more than 1L
    When user add the product to cart
    Then Cart icon would appear with 1
    When user click on cart icon with 1
    And user click view offers on cart detail page
    And user enter the expire coupon code on apply coupon dialog
    And user click on apply for expired coupon
    Then verify Error message should be displayed as "Coupon got expired"
    And verify product deleted from cart
    
    
   Scenario: Verify user should not avail the discount if limit is breached
    When cart is empty or not
    When user enter "Colour coated" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter dimension
    Then verify the cart value is more than 1L
    When user add the product to cart
    Then Cart icon would appear with 1
    When user click on cart icon with 1
    And user click view offers on cart detail page
    And user enter the limit breached coupon code on apply coupon dialog
    And user click on apply for limit breached coupon
    Then verify Error message should be displayed as "Max applications reached for this coupon"
    And verify product deleted from cart
    
    
  @check 
   Scenario: Verify Flat 2000 Value discount on order value more than 2 Lakh 
    When cart is empty or not
    When user enter "Colour coated" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity as 3MT
    Then verify the cart value is more than 1L
    When user add the product to cart
    Then Cart icon would appear with 1
    When user click on cart icon with 1
    And user click view offers on cart detail page
    And user enter the flat XValue2000 value coupon code on apply coupon dialog
     And user click on apply
    Then verify coupon would be applied
    And verify product deleted from cart
    
