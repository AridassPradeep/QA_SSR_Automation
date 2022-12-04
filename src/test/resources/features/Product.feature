@Product
Feature: Product Detail Page feature for Registered User

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "pradeep.mani99@gmail.com" and  "Admin@123"
    And user clicks on signin
    Then user homepage is displayed

  @TMT @Test
  Scenario: Verify form section is visible for TMT products
    When cart is empty or not
    Then user navigate to Home page
    When user click TMT Menu on header section
    Then user is able to view TMT Steel products on PLP page
    And user click on product name of TMT Steel product displayed on the page
    And user is on TMT Product page
    And Straight, bent button is visible
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart

  @Cement @Test
  Scenario: Verify cement product can be added to cart
    When cart is empty or not
    Then user navigate to Home page
    When user click Cement Menu on header section
    And user click on product name of Cement product displayed on the page
    And user is on Cement Product page
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart

  @WireCoil
  Scenario: Verify WireRod product can be added to cart
    When cart is empty or not
    Then user navigate to Home page
    When user is on Steel Menu on header section 
	  And user is able to select Wire rods from Steel Menu 
    And user click on product name of Wire product displayed on the page
    And user is on Wire Product page
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
