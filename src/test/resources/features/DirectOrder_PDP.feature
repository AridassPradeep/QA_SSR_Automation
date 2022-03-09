@DirectOrderPDP
Feature: Direct Order for PDP feature for registered user

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user enters logins with username with "pradeep.mani99@gmail.com" and  "Admin@123"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: Verify Buy from verified sellers is displayed on rightside of the page
    Given user is on home page
    Then Buy from verified sellers is displayed
    When user click on Buy from verified sellers
    Then verify Buy directly from JSWsteel is displayed
    When user click on Buy directly from JSWsteel
    Then verify My requirements are displayed on top

  Scenario: Verify Request for Price is submitted successfully
    When Buy from verified sellers is displayed
    When user enter "Colour" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter dimension for product
    Then verify Request Price is displayed on rightside
    When user click Request Price
    Then verify View requirements list is displayed
    When user click View requirements list
    Then verify Request for price is displayed
    Then verify Requirement list is displayed
    When user click on Request for price
    Then verify Message "Your Pricing request has been submitted. Our support team will reach out to you within 24hrs." is displayed.

  Scenario: Delivery 30-45 days is displayed
    When Buy from verified sellers is displayed
    When user click on cart on top and then Requirements tab
    When Requirement is present then remove it
    Then verify no product in requirement list
    When user enter "Colour" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter dimension for product
    Then verify Request Price is displayed on rightside
    When user click Request Price
    Then verify View requirements list is displayed
    When user click View requirements list
    Then verify Request for price is displayed
    Then verify Requirement list is displayed
    Then verify delivery date is displayed from 30-45 days

  Scenario: Verify multiple products added before Request for price
    When Buy from verified sellers is displayed
    When user enter "Colour" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter dimension for product
    Then verify Request Price is displayed on rightside
    When user click Request Price
    Then verify View requirements list is displayed
    When user enter "Colour" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity and dimensions for the product
    Then verify Request Price is displayed on rightside
    When user click Request Price
    Then verify View requirements list is displayed
    When user click View requirements list
    Then verify Request for price is displayed
    Then verify Requirement list is displayed
    When user click on Request for price
    Then verify Message "Your Pricing request has been submitted. Our support team will reach out to you within 24hrs." is displayed.

  Scenario: Verify product is added to cart
    When cart is empty or not
    When Buy from verified sellers is displayed
    When user enter "Colour" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter quantity and dimensions for the product
    When user click on Buy from verified sellers
    Then verify Buy directly from JSWsteel is displayed
    Then verify price would be displayed
    When user add an item to cart
    Then verify Cart icon would appear with 1

  Scenario: Verify product is removed from requirements list
    When Buy from verified sellers is displayed
    When user click on cart on top and then Requirements tab
    When Requirement is present then remove it
    Then verify no product in requirement list
    When user enter "Colour" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter dimension for product
    Then verify Request Price is displayed on rightside
    When user click Request Price
    Then verify View requirements list is displayed
    When user click View requirements list
    Then verify Request for price is displayed
    Then verify Requirement list is displayed
    When user click on remove button on the product
    Then verify no product in requirement list

  Scenario Outline: Verify multiple products from different seller added before Request for price
    When Buy from verified sellers is displayed
    When user click on cart on top and then Requirements tab
    When Requirement is present then remove it
    When user enter "Colour" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter dimension for product
    Then verify Request Price is displayed on rightside
    When user click Request Price
    Then verify View requirements list is displayed
    When user enter "<search>" in search bar
    And user click on search button
    Given user is on product detail page
    When user enter dimension and quantity
    Then verify Request Price is displayed on rightside
    When user click Request Price
    Then verify View requirements list is displayed
    When user click View requirements list
    Then verify Request for price is displayed
    Then verify Requirement list is displayed
    When user click on Request for price
    Then verify Message "Your Pricing request has been submitted. Our support team will reach out to you within 24hrs." is displayed.

    Examples: 
      | search    |
      | HR sheets |

  Scenario Outline: Verify Confirm payment is made successfully
    When Buy from verified sellers is displayed
    When user enter "Colour" in search bar
    And user click on search button
    When user is on product detail page of colored product
    When user enter dimension for product
    Then verify Request Price is displayed on rightside
    When user click Request Price
    Then verify View requirements list is displayed
    When user click View requirements list
    Then verify Request for price is displayed
    Then verify Requirement list is displayed
    When user click on Request for price
    Then verify Message "Your Pricing request has been submitted. Our support team will reach out to you within 24hrs." is displayed.
    When user login to google cloud
    And login to google cloud with gmail "<Gmail>"
    And login to google cloud with password "<Password>"
    And click gmail next button
    And user click on upload files
    When user is on home page
    When homepage refreshes
    Then verify Proceed to Pay is displayed on top
    When user click on Proceed to Pay and Mycart on top
    When user click on confirm payment
    When user click on make payment and confirms payment successful

    Examples: 
      | Email             | Password   | Gmail             |
      | qatestuser@jsw.in | Admin@123$ | qatestuser@jsw.in |

  @Advance
  Scenario Outline: Verify Payment status to be changed to "Advance recieved"
    When Buy from verified sellers is displayed
    When check cart is empty
    When user login to google cloud
    And login to google cloud with gmail "<Gmail>"
    And login to google cloud with password "<Password>"
    And click gmail next button
    And user click on upload files
    And user is on home page
    And homepage refreshes
    And user click on cart on top
    And user click on Mycart and then Proceed to pay
    And user click on confirm payment
    And user clicks on My order and select order details like orderid
    And user login to merchant centre username with "v_laxminarayan.jena@jsw.in" and  "123Tmnas$"
    And user click on order and search orderno
    And capture paymentid from payment tab in order
    And paste paymentid in Transaction Excel
    And login to Transaction URL
     And user upload transaction file
    And paste paymentid and orderid in payment Excel
    And Login to Payment URL
    And user upload payment file
    And user is on home page
    And homepage refreshes
    And user clicks on My order and select order details
    Then Verify Payment status 

    Examples: 
      | Email             | Password   | Gmail             |
      | qatestuser@jsw.in | Admin@123$ | qatestuser@jsw.in |
