@MyOrder
Feature: MyOrder page feature

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "distramyatest@gmail.com" and  "Ramya@123"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: Verify the message displayed in Order History page
    Given user is able to view Myorders CTA
    When user is able to click the Myorders CTA
    And user is navigate to MyOrder page
    Then user is able to view Orders awaiting payment header
    And user is able to view All orders header

  #Then user is able to verify the message displayed on the Filter icon
  @ViewDetails
  Scenario: verify user view the view details button
    When user is able to click my order button
    And user is able to click view details button
    And user is able to click view price breakup button to view detailed cost list of the ordered product
    Then user is again click the  view price breakup button to close

  @ViewCoupons
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
