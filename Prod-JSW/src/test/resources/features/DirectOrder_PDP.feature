
Feature: Direct Order for PDP feature for registered user

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "directramyatest@gmail.com" and  "Ramya@123"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: Verify Buy from verified sellers is displayed on rightside of the page
    Given user is on home page
    Then Buy from verified sellers is displayed
    When user click on Buy from verified sellers
    Then verify Buy directly from JSWsteel is displayed
    When user click on Buy directly from JSWsteel
    Then Buy from verified sellers is displayed

  @sanityExe @DirectOrde
  Scenario: Verify Request for Price is submitted successfully
    When cart is empty or not
    Then user navigate to Home page
    When user click TMT Menu on header section
    Then user is able to view TMT Steel products on PLP page
    And user click on product name of TMT Steel product displayed on the page
    And user is on TMT Product page
    And user is able to view Add to requirement cart
    And user click on Add to requirement cart
    And user click on ViewRequirement
    Then verify Request Price is displayed on rightside
    When user click Request Price
    Then verify View requirements list is displayed
    When user click View requirements list
    Then verify Message "Your Pricing request has been submitted. Our support team will reach out to you within 24hrs." is displayed.

  Scenario: Delivery 30-45 days is displayed
    When Buy from verified sellers is displayed
    When user click TMT Menu on header section
    Then user is able to view TMT Steel products on PLP page
    And user click on product name of TMT Steel product displayed on the page
    And user is on TMT Product page
    Then verify Request Price is displayed on rightside
    When user click Request Price
    Then verify View requirements list is displayed
    When user click View requirements list
    Then verify Request for price is displayed
    Then verify delivery date is displayed from 30-45 days

  #Scenario: Verify multiple products added before Request for price
  #Then user navigate to Home page
  #When Buy from verified sellers is displayed
  #When user clicks HR from Steel Navigation Menu
  #When user selects Steel product
  #Given user is on product detail page of Steel item for DirectOrder
  #Then verify Request Price is displayed on rightside
  #When user click Request Price
  #Then verify View requirements list is displayed
  #And user is able to select Wire rods from Steel Menu
  #Then user select wire rod product in PLP page
  #Then user select the dimensions of selected wire rod product for directorder user
  #Then verify Request Price is displayed on rightside
  #When user click Request Price
  #Then verify View requirements list is displayed
  #When user click View requirements list
  #Then verify Request for price is displayed
  #Then verify Requirement list is displayed
  #When user click on Request for price
  #Then verify Message "Your Pricing request has been submitted. Our support team will reach out to you within 24hrs." is displayed.
  Scenario: Verify product is added to cart
    When cart is empty or not in directorder
    When Buy from verified sellers is displayed
    When user click TMT Menu on header section
    Then user is able to view TMT Steel products on PLP page
    And user click on product name of TMT Steel product displayed on the page
    And user is on TMT Product page
    Then verify Request Price is displayed on rightside
    When user click on Buy from verified sellers
    Then verify Buy directly from JSWsteel is displayed
    When user click Cement Menu on header section
    And user click on product name of Cement product displayed on the page
    And user is on Cement Product page
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart

  Scenario: Verify user is able to remove product from requirement
    When Buy from verified sellers is displayed
    When user click TMT Menu on header section
    Then user is able to view TMT Steel products on PLP page
    And user click on product name of TMT Steel product displayed on the page
    And user is on TMT Product page
    Then verify Request Price is displayed on rightside
    When user click Request Price
    Then verify View requirements list is displayed
    When user click View requirements list
    Then verify Request for price is displayed
    Then verify Requirement list is displayed
    When user click on remove button on the product
    Then verify no product in requirement list

  #@DirectneftPaymentMultiSeller
  #Scenario Outline: Verify multiple products from different seller added before Request for price
  #When Buy from verified sellers is displayed
  #When user clicks HR from Steel Navigation Menu
  #When user selects Steel product
  #Given user is on product detail page of Steel item for DirectOrder
  #Then verify seller name
  #Then verify Request Price is displayed on rightside
  #When user click Request Price
  #Then verify View requirements list is displayed
  #And user is able to select Wire rods from Steel Menu
  #Then user select wire rod product in PLP page
  #Then user select the dimensions of selected wire rod product for directorder user
  #Then verify seller name
  #Then verify Request Price is displayed on rightside
  #When user click Request Price
  #Then verify View requirements list is displayed
  #When user click View requirements list
  #Then verify Request for price is displayed
  #Then verify Requirement list is displayed
  #When user click on Request for price
  #Then verify Message "Your Pricing request has been submitted. Our support team will reach out to you within 24hrs." is displayed.
  @DirectPDP @Cloud
  Scenario Outline: Verify Confirm payment is made successfully
    When Buy from verified sellers is displayed
    When user click TMT Menu on header section
    Then user is able to view TMT Steel products on PLP page
    And user click on product name of TMT Steel product displayed on the page
    And user is on TMT Product page
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
    And user click on cart on top
    And user click on proceed to pay on cart detail page
    And user clicks on NEFTRTGS
    When user enter UTR and validate it
      | A12345678901234556 |
    And user click on confirm payment
    Then verify payment success message is displayed

    Examples: 
      | Gmail             | Password   |
      | qatestuser@jsw.in | Admin@123$ |

  @Advance
  Scenario Outline: Verify Payment status to be changed to "Advance recieved"
    When Buy from verified sellers is displayed
    Then user navigate to Home page
    When user login to google cloud
    And login to google cloud with gmail "<Gmail>"
    And login to google cloud with password "<Password>"
    And click gmail next button
    And user click on upload files
    When user is on home page
    And homepage refreshes
    And user click on cart on top
    And user click on proceed to pay on cart detail page
    And user clicks on NEFTRTGS
    When user enter UTR and validate it
      | A12345678901234556 |
    And user click on confirm payment
    And user wait for sometime
    # Then verify payment success message is displayed
    And user clicks on My order and select order details like orderid
    And user login to merchant centre username with "v_laxminarayan.jena@jsw.in" and  "123Tmnas$"
    And user changes the environment
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

  @DirectPaymentHistory
  Scenario: Verify payment history for Direct order
    When user is able to click my order button
    And user is able to click view details button for DO
    And user is able to view Order summary page
    Then user is able to view Payment received section
    When user is able to click Payment history dropdown CTA
    Then user is able to view Direct order payment status
