@Ledger
Feature: Ledger Information validation

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "qatestuser@jsw.in" and  "Admin@123$"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: Verify ledger information in ledger page
    When user navigates to ledger page
    Then user request date for specific period
    Then validate Ledger request sent message is displayed

  # And validate previous statement is displayed
  #And validate user is able to download ledger statement
  Scenario: Verify user can navigate to to ledger page from myorder
    Given user is able to view Myorders CTA
    When user is able to click the Myorders CTA
    And user is navigate to MyOrder page
    And user clicks on ledger
    Then user request date for specific period
    Then validate Ledger request sent message is displayed

  Scenario: Verify user can navigate to to ledger page from profile
    When user click on the profile menu
    Then Dropdown should be lsited
    When user click on the ledger submmenu
    And switch to ledger window
    Then user request date for specific period
    Then validate Ledger request sent message is displayed
