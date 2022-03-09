Feature: Payment and Cart Scenarios for single and multiple product

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramya1347@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed

  @Payment
  Scenario: Single Product-User navigate to payment page
    When cart is empty or not
    When user selects Hot Rolled products
    Given user is on product detail page of hotrolled item
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
    When user clicks on OK cart
    Then verify Cart icon would appear with 1
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow

  # Then User navigates to RazorPay Page
  # And User click on success button
  # Then verify after successful payment page navigates to ORDER summary page
  # Then order sucessfully placed message should be displayed
  Scenario: Multiple Product  Product-User navigate to payment page
    When cart is empty or not
    When user enter "Colour" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity as 3MT
    Then verify price would be displayed
    When user add an item to cart
    Then verify Cart icon would appear with 1
    When user enter "Colour" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity and dimensions
    Then verify price would be displayed
    When user click on Buy Now
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow

  @check
  Scenario: verify utr validation for product that is added to cart
    When cart is empty or not
    When user enter "Colour" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity and dimensions
    Then verify price would be displayed
    When user click on Buy Now
    And user click on proceed to pay on cart detail page
    And user enter UTR and validate UTR
      | UTR              | Error Message                      |
      | A123!!!          | Enter a valid UTR number.          |
      | 1234567890123456 | Special characters are not allowed |
      | AAASSSDDDFFFGGGH | Special characters are not allowed |
      | ASD232342        | Enter a valid UTR number.          |
    And user click on confirm payment

  @check
  Scenario: Successful NEFT Payment for product that is added to cart
    When cart is empty or not
    When user enter "Colour" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity and dimensions
    Then verify price would be displayed
    When user click on Buy Now
    And user click on proceed to pay on cart detail page
    Then verify netbanking is disabled
    When user enter UTR and validate it
      | A12345678901234556 |
    And user click on confirm payment
    Then verify payment success message is displayed

  @check
  Scenario: Bank Payment for product that is added to cart
    When cart is empty or not
    When user enter "Colour" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity and dimensions as 3MT
    Then verify price would be displayed
    When user click on Buy Now
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down
    Then verify bank is selected
    Then click on Proceed to Pay on payment page
