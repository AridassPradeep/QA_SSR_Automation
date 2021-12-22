@MyProfile
Feature: Profile page feature

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user enters logins with username with "ramya1347@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed

  @SmokeTest
  Scenario: Verify the user able to save profile details
    When user click on the profile menu
    Then Dropdown should be lsited
    When user click on the profile submmenu
    Then Profile page  should be lsited
    When user clicks on text box  clear the data and add the new designation
    Then Profile should be added with new designation
    When user clicks on text box  clear the data and add the new Udyam Number
    Then Profile should be added with new Udyam Number
    When user select the industrial sector
    Then Profile should be display the interest absed on industrial sector
    When user select the industrial sector
    Then interest area should be selected
    When user click the Save button
    Then Profile details should be saved
