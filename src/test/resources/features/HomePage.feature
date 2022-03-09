@functional @HomePage
Feature: Home page feature

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramya1347@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed


  Scenario: Verify different elements in homepage
    Then Verify the JSW logo is appearing in the Header Section
    Then Verify Search Bar is displayed with search icon
    Then Verify Language Indicator is displayed
    Then Verify the Cart Icon displayed
    Then Verify "Steel by Categories" section available in the Header
    Then Verify that "Connect with Us" is available on the header section
    Then Verify that Header Section is displayed for Registered User
    Then Verify the JSW logo is appearing in the Header Section
    Then Verify the My Profile section link is appearing with users first name
    Then Verify that the My Profile section Link is displaying ^ icon when the drop down is clicked
    Then Verify the action of Logout Link in My Profile drop down
    Then Verify the banners are displayed on the JSW Home Page
    Then Verify the banners displaying in the home Page for Registered User.
    Then Verify all the header available in the footer section
    Then Verify all the header available in the footer section after user logs in to the application
    Then Verify for sub links are available under General category
    Then Verify all the social media logos are available
    Then Verify for help line number is present in footer section
   

  Scenario: Verify enquiry form
    Then Verify the mandatory fields in Enquiry Section for Registered Users
    Then Verify the submit button is enabled only once all the mandatory fields entered
    Then Verify the action on wrong data entered
    Then Verify the validation of the fields
    Then Verify the Enquiry Headings, and labels in Enquiry Section for Registered user.
    Then Verify For logged in user on Enquiry form Name, mobile number and email id should be pre-populated.
    Then Verify that the Enquiry section available in the JSW Home Page for Registered User
    Then Verify the Enquiry form banner displayed on the Home Page
    Then Verify the Enquiry form banner displayed on the Home Page for registered User
    Then Verify that "Thanks Popup" is displaying based on the successful submission of enquiry form
    Then Verify Query id is generated once query is submitted by the registered user.
  
