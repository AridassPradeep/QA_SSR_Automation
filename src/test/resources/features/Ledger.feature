@Ledger
Feature: Ledger Information validation

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "aakash.pra323sad@jsw.in" and  "Aakash@123"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: Verify ledger information in ledger page
    When user navigates to ledger page
    Then user request date for specific period
    Then validate Ledger request sent message is displayed
    And validate previous statement is displayed
    And validate companyname and GSTNo

  Scenario: Verify Ledger Net Balance from ERP
    And user navigates to ledger page
    And user checks the Net balance in CCP
    When user login to ERP
    Then user navigate to ledger page of ERP
    Then user clicks on search button in ERP ledger
    Then user click search and stores the ledger balance
    And user matches the net balance

  Scenario: Verify Ledger Balance from ERP
    And user navigates to ledger page
    And user checks the balance in CCP
    When user login to ERP
    Then user navigate to ledger page of ERP
    Then user navigate to BuyerMIS in ERP
    Then user clicks on search button in ERP ledger
    Then user click search and stores the ledger balance
    And user matches the balance

  Scenario: Verify Usable credit limit
    And user navigates to ledger page
    And user checks the limit in CCP
    When user login to ERP
    And user checks limit in ERP
    Then user matches both limits


  Scenario: Verify ledger page is accesible from myorders page
    Given user is able to view Myorders CTA
    When user is able to click the Myorders CTA
    And user is navigate to MyOrder page
    And user clicks on view ledger
    Then verify user navigates to ledger page

  Scenario: Verify user can navigate to to ledger page from profile
    When user click on the profile menu
    Then Dropdown should be lsited
    When user click on the ledger submmenu
    And switch to ledger window
    Then user request date for specific period
    Then validate Ledger request sent message is displayed

  Scenario: Verify Blocked AmountInfo
    When user navigates to ledger page
    And user click on View details in ledgerPage
    Then user can see blocked amount info

  Scenario: Verify Email for ledger is sent sucessfully
    When user navigates to ledger page
    And user click on email in ledgerPage and sent email
    Then user can see email sent sucessfully message
