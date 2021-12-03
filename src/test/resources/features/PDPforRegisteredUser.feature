@PDP
Feature: Product Detail Page feature for Registered User

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user enters logins with username with "ramya1347@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: verify product quantity should be updated in the cart icon.
    When user enter "colour" in search bar
    And user click on search button
    Given user is on product detail page
    When user clicks on Add To Cart button available in the right side of the webpage
    Then verify that the product should be added in the cart
   

  Scenario: verify the product dimension should be diameter for wire rod
    When user enter "wire rod" in search bar
    And user click on search button
    Given user is on product detail page
    Then verify the product dimension should be diameter

  Scenario: verify user can see the Price details inclusive of Taxes
   When user enter "colour" in search bar
    And user click on search button
    Given user is on product detail page
    When user selects the product attributes
    When user click on quantity button
    Then verify user can see the Price details inclusive of Taxes

    Scenario: For HR verify "Please select thickness and width before submitting error message"
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    Then Breadcrump should display Steel by categories>Hot Rolled(HR)
    Given user is on product detail page
    When user enters invalid Custom Length "8000" and  submits custom length
    Then Please select thickness and width before submitting error message to be displayed

  Scenario: For HRPO verify "Please select thickness and width before submitting error message"
    When user enter "HRPO sheets" in search bar
    And user click on search button
    Given user is on product detail page
    When user enters invalid Custom Length "8000" and  submits custom length
    Then Please select thickness and width before submitting error message to be displayed

  Scenario Outline: Verify invalid length error message value for custom length for HRPO is 249mm and maximum is 3601
    When user enter "<search>" in search bar
    And user click on search button
    Given user is on product detail page
    When user enters less than minimum  Custom Length "<customlength>" and  submits custom length
    Then invalid custom length error message to be displayed

    Examples: 
      | customlength | search      |
      |          249 | HRPO sheets |
      |         3601 | HRPO sheets |

  Scenario Outline: Verify valid length error message value for custom length for HRO sheets is 250mm and maximum is 3600
    When user enter "<search>" in search bar
    And user click on search button
    Given user is on product detail page
    When user enters less than minimum  Custom Length "<customlength>" and  submits custom length
    Then invalid custom length error message should not be displayed

    Examples: 
      | customlength | search     |
      |          250 | HRPO sheets  |
      |         3600 | HRPO sheets  |

  Scenario Outline: Verify invalid length error message value for custom length for HR is 249mm and maximum is 6301
    When user enter "<search>" in search bar
    And user click on search button
    Given user is on product detail page
    When user enters less than minimum  Custom Length "<customlength>" and  submits custom length
    Then invalid custom length error message to be displayed

    Examples: 
      | customlength | search    |
      |          249 | HR sheets |
      |         6301 | HR sheets |

  Scenario Outline: Verify valid length error message value for custom length for HR is 250mm and maximum is 6300
    When user enter "<search>" in search bar
    And user click on search button
    Given user is on product detail page
    When user enters less than minimum  Custom Length "<customlength>" and  submits custom length
    Then invalid custom length error message should not be displayed

    Examples: 
      | customlength | search    |
      |          252 | HR sheets |
      |         6300 | HR sheets |
    