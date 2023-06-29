@demo @sanityExe @MyProfile
Feature: Profile page feature

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "profiletesthyd@gmail.com" and  "Admin@123"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: Verify the user able to logout from profile section
    When user click on the profile menu
    Then Dropdown should be lsited
    #When user click on the profile submmenu
    Then Profile page  should be lsited
    And user can logout from profilePage
    Then Verify the Login button is displaying in the Home Page Header
    Then Verify the Register Button is displaying in Home Page header.

  Scenario: Verify the Customer shall not be able to access ‘Logout’ under the profile icon
    When user click on the profile menu
    Then Dropdown should be lsited
    When user click on the profile submmenu
    Then Profile page  should be lsited
    When user click on the profile menu
    Then LogoutDropdown should not be lsited

  Scenario: Verify the user able to save profile details
    When user click on the profile menu
    Then Dropdown should be lsited
    When user click on the profile submmenu
    Then Profile page  should be lsited
    When user  click the IFSC
    Then IFSC Copy icon is populated

  Scenario: Verify  existing billing address
    When user click on the profile menu
    Then Dropdown should be lsited
    When user click on the profile submmenu
    Then Profile page  should be lsited
    And user clicks on addresses
    And user view billing address

  Scenario: Verify the user able to add shipping and delete shipping address
    When user click on the profile menu
    Then Dropdown should be lsited
    When user click on the profile submmenu
    Then Profile page  should be lsited
    And user clicks on addresses
    When user adds a new adresses and fill all details and save it
    Then addrees is displayed in shipping address column
    And address is mentioned in manage address column
    And user can delete existing shipping addresses
