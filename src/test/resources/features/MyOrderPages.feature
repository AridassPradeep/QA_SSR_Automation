@MyOrder
Feature: MyOrder page feature

Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "pradeep.mani99@gmail.com" and  "Admin@123"
    And user clicks on signin
    Then user homepage is displayed

  @ViewDetails
  Scenario: verify user view the view details button
    When user is able to click my order button
    And user is able to click view details button
    And user is able to click view price breakup button to view detailed cost list of the ordered product
    Then user is again click the  view price breakup button to close

  @NeedHelp
  Scenario: Verify user view need help button
    When user is able to click my order
    And user is able click need help button
    Then user is able to navigate to need help page

  @BuyAgain
  Scenario: Verify user Buyagain the product
    When user is able to click my order in home page
    And user is able to scroll down and click buy again which was shown in the ordered product
    And user is able to choose requirement details and select
    And user is able to click add to cart
    And user is able to click ok button in the pop of the add to cart button
    And user is able to click cart icon
    And user is able to scroll down and click proceed to pay button
    And user is able to choose bank in the list
    And user is able to click pay now button
    Then user navigate to RayzorPay page
    And User is able to click on success button
    Then verify after successful payment navigates to ORDER summary page
    Then user verify your order is confirmed message

  @CancelOrder
  Scenario: Verify user able to cancel the order
 When cart is empty or not
    When user clicks HR from Steel Navigation Menu
    # Then HR Products are displayed
    When user selects Steel product
    Given user is on product detail page of Steel item
    When user click on Buy Now
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on success button
    Then verify after successful payment page navigates to ORDER summary page
    Then order sucessfully placed message should be displayed
    And user is able to click canel order button
    And user is able to click My order button on home page
    And user is able to click cancel button in my order page
    And user is able to write remark
    And user is able to click cancelorder button
    Then user is able to view cancelled message
