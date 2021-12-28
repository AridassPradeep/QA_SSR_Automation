@DirectOrderPDP
Feature: Direct Order PDP feature for registered user

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
    
   
