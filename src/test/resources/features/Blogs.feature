@blogs
Feature: Blog feature

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "pradeep.mani99@gmail.com" and  "Admin@123"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: Verify user is able to navigate to blog page through homepage
    When user clicks on Blogs in header menu
    Then user is able to navigate to blog page through homepage

  Scenario: Verify header section and pagination in blogs
    When user clicks on Blogs in header menu
    Then user is able to navigate to blog page through homepage
    And user is able to see All, Business,Sustainaibilty,Technology,News,Product in header
    And pagination is displayed in blogs

  Scenario: Verify recent blogs section
    When user clicks on Blogs in header menu
    Then user is able to navigate to blog page through homepage
    And user click on a section like product
    Then recent blogs is displayed
