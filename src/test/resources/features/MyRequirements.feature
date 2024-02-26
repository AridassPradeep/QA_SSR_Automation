@MyRequirements @FailedRunner1
Feature: My Requirements validation

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email

  Scenario: Verify myrequirement section for direct order
    When user enters logins with username with "jswtestqa03@yopmail.com" and  "Admin@2024"
    And user clicks on signin
    Then user homepage is displayed
    And user clicks on myrequirement tab
    Then verify Requirements ID is getting displayed
    And validate product details
    And validate Total quantity
