Feature: Guest User feature

  Background: User opens website
    Given user is on home page

  Scenario: Verify different elements in homepage
  Then Verify the Login button is displaying in the Home Page Header
    Then Verify the action of Login button
    Then Verify the Register Button is displaying in Home Page header.
    Then Verify the action of Register button
    Then Verify the address not displaying for the guest user
    Then Verify that the Enquiry section available in the JSW Home Page for Guest User
    Then Verify the Enquiry Headings, and labels in Enquiry Section for guest user.
    Then Verify the mandatory fields in Enquiry Section for Guest Users
    Then Verify Query id is generated once query is submitted by the guest user.
    Then Verify the UI of Enquiry form for guest user
