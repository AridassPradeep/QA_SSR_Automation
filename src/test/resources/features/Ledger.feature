@Ledger
Feature: Ledger Information validation

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "pradeep.mani99@gmail.com" and  "Admin@123"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: Verify ledger information in ledger page
    When user navigates to ledger page
    Then validating ledger statement
    Then validating ledger balance
    Then validate time format
    Then validate ledger statement balance and last statement balance to be same
    Then validate user is able to download ledger statement
    Then validate view more button
    Then validate datetime, transaction details,ortderid ,transaction id ,amount and balance
    And validate refresh button is working and time is updated
