@MyRequirements
Feature: My Requirements validation

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
     When user enters logins with username with "directramyatest@gmail.com" and  "Ramya@123"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: Verify myrequirement section
    And user clicks on myrequirement tab
    Then verify Requirements ID is getting displayed
    And validate product details
    And validate Total quantity
