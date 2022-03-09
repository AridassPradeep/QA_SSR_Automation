@cart
Feature: Cart Detail Page feature

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramya1347@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: Verify terms and condition page is displayed
    When cart is empty or not
    When user selects Hot Rolled products
    Given user is on product detail page of hotrolled item
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
    When user clicks on OK cart
    Then verify Cart icon would appear with 1
    When user click on Cart icon on homepage
    And user click on Terms&condition on cart detail page
    Then Verify Terms&condition page is displayed with some text

  Scenario: Verify "Technical Specification" below proceed to pay button
    When cart is empty or not
    When user selects Hot Rolled products
    Given user is on product detail page of hotrolled item
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
    When user clicks on OK cart
    Then verify Cart icon would appear with 1
    When user click on Cart icon on homepage
    Then Verify "Technical Specification" is displayed below Proceed to pay button

  Scenario: Verify order placed successfully after pickup checkbox
    When cart is empty or not
    When user selects Hot Rolled products
    Given user is on product detail page of hotrolled item
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
    When user clicks on OK cart
    Then verify Cart icon would appear with 1
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

  Scenario: Verify Delivery by 2-5 days
    When cart is empty or not
    When user selects Hot Rolled products
    Given user is on product detail page of hotrolled item
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
    When user clicks on OK cart
    Then verify Cart icon would appear with 1
    When user click on Cart icon on homepage
    Then verify delivery is by 2-5 days
