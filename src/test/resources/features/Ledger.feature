@Ledger @TestAakash
Feature: Ledger Information validation

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "aakash.pra323sad@jsw.in" and  "Aakash@123"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: Verify ledger information in ledger page at bottom
    When user navigates to ledger page
    Then user request date for specific period
    Then validate Ledger request sent message is displayed

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

  Scenario: User is searching using filters in statement
    When user navigates to ledger page
    Then user select the date from in statement
    And user select payment type in filter
    Then statement is displayed

  Scenario: Check if STO is created and did payment via netbanking
    When cart is empty or not
    Then user navigate to Home page
    When user click Cement Menu on header section
    And user click on product name of Cement product displayed on the page
    And user is on Cement Product page
    When user click on Buy Now
    And user click on proceed to pay on cart detail page
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on success button
    Then user navigates to ledger page after payment
    And user checks the entry for STO netbanking

  Scenario: Check Ledger Field in enabled in CT
    And user login to merchant centre username with "v_laxminarayan.jena@jsw.in" and  "123Tmnas$"
    Then user navigates to customer list custom field
    Then user verifies is Ledger Enabled in ct
