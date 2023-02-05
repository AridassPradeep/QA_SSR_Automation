@OrderSummary
Feature: Order Summary page feature

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "distramyatest@gmail.com" and  "Ramya@123"
    And user clicks on signin
    Then user homepage is displayed
    When cart is empty or not
    When user clicks HR from Steel Navigation Menu
    When user selects Steel product
    Given user is on product detail page of Steel item
    When user click on Buy Now

  Scenario: Verifying order details Order number,Order total,Payment received,Delivery typedelivery,pickup,Pending payment
    And user click on proceed to pay on cart detail page and navigate to ordersummary page
    Then verify Order number,Order total,Payment received,Delivery type(delivery,pickup),Pending payment

  @OrderSummary
  Scenario: Verifying NEFT/RTGS ,Beneficiary name,Account Number,IFSC Code order is awaiting payment status
    And user click on proceed to pay on cart detail page and navigate to ordersummary page
    Then verify  NEFT/RTGS ,Beneficiary name,Account Number,IFSC Code
    And verify Your order is awaiting payment status

  @OrderSummary
  Scenario: Verifying minimisation of item details and billing adress
    And user click on proceed to pay on cart detail page and navigate to ordersummary page
    Then user can minimise  item details and billing adress

  @OrderSummary
  Scenario: Verifying netbanking is disabled for order more than 10 lakhs
    And user click on proceed to pay on cart detail page and navigate to ordersummary page
    Then verify netbanking is disabled

  @OrderSummary
  Scenario: Verifying coupons
    And user click on proceed to pay on cart detail page and navigate to ordersummary page
    When user click on view details
    Then user can see coupon got applied

  @OrderSummary
  Scenario: Verifying item details
    And user click on proceed to pay on cart detail page and navigate to ordersummary page
    Then Verifying item details

  @OrderSummary
  Scenario: Verifying delivery days
    And user click on proceed to pay on cart detail page and navigate to ordersummary page
    Then Verifying delivery days

  @OrderSummary
  Scenario: Verifying shipping and billing and delivery adresss
    And user click on proceed to pay on cart detail page and navigate to ordersummary page
    Then Verifying shipping and billing and delivery adresss

  @OrderSummary
  Scenario: order id to ordernum in url
    And user click on proceed to pay on cart detail page and navigate to ordersummary page
    Then user can see order number in url instead of order id

  @OrderSummary
  Scenario: Veifying user can make netbanking payment for amount less than ₹10,00,000
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page

  #@OrderSummary
  #Scenario: Verifying NEFT Payment
    #And user click on proceed to pay on cart detail page and navigate to ordersummary page
    #Then Verifying payment status as partial
    #And user logins to cloud scheduler
    #And run process customer balance batch query
    #Then navigate to orders and the order
    #And verify Your order payment is successful message
    #And payment status is full
