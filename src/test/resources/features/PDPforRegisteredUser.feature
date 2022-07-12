@PDPRegisteredUser
Feature: Product Detail Page feature for Registered User

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "pradeep.mani99@gmail.com" and  "Admin@123"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: verify user able to view message on thickness section
    And user select any product example HR
    Then user is able to view the message in the thickness section

  @check1
  Scenario: verify product quantity should be updated in the cart icon.
    When cart is empty or not
    Then user navigate to Home page
    When user clicks HR Sheet series from Steel Categories Menu
    When user selects HR Stainless Steel product
    Given user is on product detail page of Stainless Steel item
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart

  #  Scenario: verify the product dimension should be diameter for wire rod
  #    When user enter "wire rod" in search bar
  #    And user click on search button
  #    Given user is on product detail page
  #    Then verify the product dimension should be diameter
  #
  #  Scenario: verify user can see the Price details inclusive of Taxes
  #    When user enter "colour" in search bar
  #    And user click on search button
  #    Given user is on product detail page of colored item
  #    When user selects the product attributes
  #    When user click on quantity button
  #    Then verify user can see the Price details inclusive of Taxes
  #@check
  #Scenario: For HR verify "Please select thickness and width before submitting error message"
  #When user enter "Hot Rolled Sheet" in search bar
  #And user click on search button
  #Then Breadcrump should display Steel by categories>Hot Rolled(HR)
  #Given user is on product detail page
  #When user enters invalid Custom Length "8000" and  submits custom length
  #Then Please select thickness and width before submitting error message to be displayed
  #
  #  Scenario: For HRPO verify "Please select thickness and width before submitting error message"
  #    When user enter "HRPO sheets" in search bar
  #    And user click on search button
  #    Given user is on product detail page
  #    When user enters invalid Custom Length "8000" and  submits custom length
  #    Then Please select thickness and width before submitting error message to be displayed
  #
  #  Scenario Outline: Verify invalid length error message value for custom length for HRPO is 249mm and maximum is 3601
  #    When user enter "<search>" in search bar
  #    And user click on search button
  #    Given user is on product detail page
  #    When user enters less than minimum  Custom Length "<customlength>" and  submits custom length
  #    Then invalid custom length error message to be displayed with length
  #
  #    Examples:
  #      | customlength | search      |
  #      |          249 | HRPO sheets |
  #      |         3601 | HRPO sheets |
  #
  #  Scenario Outline: Verify valid length error message value for custom length for HRO sheets is 250mm and maximum is 3600
  #    When user enter "<search>" in search bar
  #    And user click on search button
  #    Given user is on product detail page
  #    When user enters less than minimum  Custom Length "<customlength>" and  submits custom length
  #    Then invalid custom length error message should not be displayed
  #
  #    Examples:
  #      | customlength | search      |
  #      |          250 | HRPO sheets |
  #      |         3600 | HRPO sheets |
  #
  #  Scenario Outline: Verify invalid length error message value for custom length for HR is 249mm and maximum is 6301
  #    When user enter "<search>" in search bar
  #    And user click on search button
  #    Given user is on product detail page
  #    When user enters less than minimum  Custom Length "<customlength>" and  submits custom length for HR
  #    Then invalid custom length error message to be displayed with length
  #
  #    Examples:
  #      | customlength | search    |
  #      |          249 | HR sheets |
  #      |         6301 | HR sheets |
  #
  #  Scenario Outline: Verify valid length error message value for custom length for HR is 250mm and maximum is 6300
  #    When cart is empty or not
  #    When user enter "<search>" in search bar
  #    And user click on search button
  #    Given user is on product detail page
  #    When user enters less than minimum  Custom Length "<customlength>" and  submits custom length for HR
  #    Then invalid custom length error message should not be displayed
  #    When user clicks on Add To Cart button available
  #    Then verify that the product should be added in the cart
  #
  #    Examples:
  #      | customlength | search    |
  #      |          252 | HR sheets |
  #      |         6300 | HR sheets |
  #
  @dealpill
  Scenario: Verify dimensions are selected as per deal selected and viceversa
    When cart is empty or not
    When user clicks HR from Steel Navigation Menu
    When user selects Steel product
    Given user is on product detail page of Steel item
    And deal is visible
    When user click on deal
    Then verify lowest price seller is displayed
    Then verify best price is displayed on right side
    Then verify dimensions are selected
    When user select dimensions same as deal
    Then deal pill gets clicked

  @ctl
  Scenario Outline: Verify customer length watermark for all the products
    When cart is empty or not
    Then user navigate to Home page
    When user click Steel Menu on header section
    When user select hot/cold sheet products
    Then user select the dimension of the selected product
    When user click the customer length of the selected product
    Then validate the customer length example value in the input field

  @MOQ
  Scenario: Verify MOQ for Stainless Steel Product
    When cart is empty or not
    Then user navigate to Home page
    When user clicks HR Sheet series from Steel Categories Menu
    When user selects HR Stainless Steel product
    And user is on product detail page of Stainless Steel item and add dimensions
    And user add quantity and validate MOQ messages
      | quantity | MOQMessage                                                        |
      |        0 | Required quantity is below MoQ. Please add quantity above 100.0kg |
      |      999 | The maximum available quantity for your selection is 10000.0kg    |
      |   999999 | quantity more than 9999 kg                                        |
    And validate add to cart button is disabled

  @MOQSteel
  Scenario: Verify MOQ for  Steel Product
    When cart is empty or not
    Then user navigate to Home page
    When user clicks HR from Steel Navigation Menu
    When user selects Steel product
    Given user is on product detail page of Steel item and add dimensions
    And user add quantity and validate MOQ messages
      | quantity | MOQMessage                                                      |
      |        1 | Required quantity is below MoQ. Please add quantity above 2.0MT |
      |     1000 | The maximum available quantity for your selection is 12.5MT     |
      | 10000000 | quantity more than 9999 MT                                      |
    And validate add to cart button is disabled

  @ResetSelection
  Scenario: Check the Behaviour of ResetSelection button
    When cart is empty or not
    When user clicks HR from Steel Navigation Menu
    When user selects Steel product
    Given user is on product detail page of Steel item
    And click on ResetSelection button
    Then validate add to cart button is disabled

  @ctl
  Scenario Outline: Verify customer length watermark for all the products
    When cart is empty or not
    Then user navigate to Home page
    When user click Steel Menu on header section
    When user select hot/cold sheet products
    Then user select the dimension of the selected product
    When user click the customer length of the selected product
    Then validate the customer length example value in the input field

  @ctl1
  Scenario Outline: Verify invalid length error message value for custom length
    When cart is empty or not
    Then user navigate to Home page
    When user click Steel Menu on header section
    When user select hot/cold sheet products
    Then user select the dimension of the selected product
    When user click the customer length of the selected product
    When user enters invalid Custom Length "<customlength>" and  submits custom length for HR
    Then invalid custom length error message should not be displayed with entered length
    Then validate the customer length error message displayed

    Examples: 
      | customlength | search    |
      |          249 | HR sheets |
      |         6301 | HR sheets |
