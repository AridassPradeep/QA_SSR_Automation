@DiscountCoupon
Feature: Product Detail Page with discount

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "demoqa2@yopmail.com" and  "Admin@123"
    And user clicks on signin
    Then user homepage is displayed

  Scenario Outline: Check for coupon code can be  entered manually and can be removed also in coupons overlay
    When cart is empty or not
    When user clicks HR from Steel Navigation Menu
    # Then HR Products are displayed
    When user selects Steel product
    Given user is on product detail page of Steel item
    When user click on Buy Now
    And user click on apply coupon
    Then List of coupons to be displayed
    And user enters the "<coupon>" manually and click on apply
    Then coupon is applied and price gets updated
    And remove button is displayed
    And user click on remove button
    And user closes coupon overlay
    And price gets updated
    And user click on proceed to pay on cart detail page

    Examples: 
      | coupon   |
      | STEEL250 |

  #Scenario: Check Discount coupons view on PDP page and able to view more about coupon description by clicking know more
  #  When cart is empty or not
  # When user clicks HR from Steel Navigation Menu
  # Then HR Products are displayed
  #When user selects Steel product
  #Given user is on product detail page of Steel item
  #And user clicks on See more
  #Then list of other coupons also displayed
  
  Scenario Outline: Check for old price is strikethrough and new price amount is displayed in both Price section and cart line
    When cart is empty or not
    When user clicks HR from Steel Navigation Menu
    # Then HR Products are displayed
    When user selects Steel product
    Given user is on product detail page of Steel item
    When user click on Buy Now
    And user click on apply coupon
    Then List of coupons to be displayed
    And user enters the "<coupon>" manually and click on apply
    Then coupon is applied and price gets updated
    And user closes coupon overlay
    And price gets updated
    And old price is strikethrough and new price amount is displayed in both Price section and cart line

    Examples: 
      | coupon   |
      | STEEL250 |

  Scenario Outline: Verify In my order page, the applied coupons are able to view after the order placed
   When cart is empty or not
    When user clicks HR from Steel Navigation Menu
    # Then HR Products are displayed
    When user selects Steel product
    Given user is on product detail page of Steel item
    When user click on Buy Now
    And user click on apply coupon
    Then List of coupons to be displayed
    And user enters the "<coupon>" manually and click on apply
    Then coupon is applied and price gets updated
    And user closes coupon overlay
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on success button
    Then verify after successful payment page navigates to ORDER summary page
    Then order sucessfully placed message should be displayed
    And user clicks on view coupons in order page then applied coupon to be displayed

    Examples: 
      | coupon   |
      | STEEL250 |

  @RetainOfferwithsamecoupon
  Scenario: Verify the applied coupon is still available in cart
   When cart is empty or not
    When user clicks HR from Steel Navigation Menu
    # Then HR Products are displayed
    When user selects Steel product
    Given user is on product detail page of Steel item
    When user clicks on Add To Cart button available in the right side of the webpage
    When user clicks HR from Steel Navigation Menu
    When user selects Steel product
    When user is on second product detail page of Steel item
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
    And user is able to select Wire rods from Steel Menu
    Then user select wire rod product in PLP page
    Then user select the dimensions of selected wire rod product
    When user clicks on Add To Cart button available in the right side of the webpage
    When user is on cart page
    And user click on apply coupon
    Then List of coupons to be displayed
    And user is able to apply STEEL250 coupon code
    Then coupon is applied and price gets updated
    When user is removed HR products from cart line
    Then User shall see modified pricing of the cart
    And Applied coupons remain active after removed if applicable to the modified cart context
    And Count of applied coupons remains the same

#  @RetainOfferwithupdatecoupons
#  Scenario: Verify remove product in cart line and price will be update
#    When user is on cart page
#    And user click on apply coupon
#    Then List of coupons to be displayed
#    And user is able to apply STEEL250 coupon code
#    Then coupon is applied and price gets updated
#    When user is removed products from cart line
#    Then User shall see modified pricing of the cart
#    And Applied coupons remain in active if applicable to the modified cart context

  @RetainOfferwithupdatecoupon
  Scenario: Verify the applied coupon is removed in cart
     When cart is empty or not
    When user clicks HR from Steel Navigation Menu
    # Then HR Products are displayed
    When user selects Steel product
    Given user is on product detail page of Steel item
    When user clicks on Add To Cart button available in the right side of the webpage
    And user is able to select Wire rods from Steel Menu
    Then user select wire rod product in PLP page
    Then user select the dimensions of selected wire rod product
    When user clicks on Add To Cart button available in the right side of the webpage
    When user is on cart page
    And user click on apply coupon
    Then List of coupons to be displayed
    And user is able to apply STEEL250 coupon code
    Then coupon is applied and price gets updated
    When user is removed Steel products from cart line
    Then User shall see modified pricing of the cart
    And Applied coupons remain in active if applicable to the modified cart context
