@PDPDiscount
Feature: OldCoupons-Product Detail Page with discount

  Background: User opens website
     Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "pradeep.mani99@gmail.com" and  "Admin@123"
    And user clicks on signin
    Then user homepage is displayed


  Scenario: verify Flat 500 rs discount is applied
  
   When cart is empty or not
    Then user navigate to Home page
    When user clicks HR Sheet series from Steel Categories Menu
    When user selects HR Stainless Steel product
    Given user is on product detail page of Stainless Steel item
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
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
    Then user navigate to Home page
    When user clicks HR Sheet series from Steel Categories Menu
    When user selects HR Stainless Steel product
    Given user is on product detail page of Stainless Steel item
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
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
    Then user navigate to Home page
    When user clicks HR Sheet series from Steel Categories Menu
    When user selects HR Stainless Steel product
    Given user is on product detail page of Stainless Steel item
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
    Then verify Cart icon would appear with 1
    When user click on cart icon with 1
    And user click view offers on cart detail page
    And user enter the expire coupon code on apply coupon dialog
    And user click on apply for expired coupon
    Then verify Error message should be displayed as "Coupon got expired"
    And verify product deleted from cart
    
    
   Scenario: Verify user should not avail the discount if limit is breached
   
   When cart is empty or not
    Then user navigate to Home page
    When user clicks HR Sheet series from Steel Categories Menu
    When user selects HR Stainless Steel product
    Given user is on product detail page of Stainless Steel item
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
    Then user navigate to Home page
    When user clicks HR Sheet series from Steel Categories Menu
    When user selects HR Stainless Steel product
    Given user is on product detail page of Stainless Steel item
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
    Then verify Cart icon would appear with 1
    When user click on cart icon with 1
    Then verify the cart value is more than 1L
    When user add the product to cart
    Then Cart icon would appear with 1
    When user click on cart icon with 1
    And user click view offers on cart detail page
    And user enter the flat XValue2000 value coupon code on apply coupon dialog
     And user click on apply
    Then verify coupon would be applied
    And verify product deleted from cart
    
