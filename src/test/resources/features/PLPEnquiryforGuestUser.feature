@PLPEnquirya
Feature: Product Landing Page feature for Guest User

  Background: User opens website
    Given user is on home page
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    Then Breadcrump should display Steel by categories>Hot Rolled(HR)
    When user scroll down till enquiry button

  Scenario: An enquiry form should be there for guest user on PLP page
    Then Enquiry form should be displayed in PLP page for guest user
    And Below message should be displyed on enquiry form banner "Can’t find what you are looking for?  "“Can’t find what you are looking for? Tell us your specific requirements. Your query will be sent to JSW plant for the right price and we will get back to you"

  Scenario: Verify an enquiry banner on PLP page when not signed in
    Then Verify Enquiry banner is displayed only once after 3 products if more than 3 products are displayed
    Then Verify text displayed on enquiry banner
    Then Verify "Enquire Now" button is displayed

  Scenario: Verify enquiry form pop up is displayed to fill information
    When user click on enquiry button
    Then Pop-up should be displayed to fill user's information

  Scenario: Verify banner after searched keyword is not found
    When user enter "ice cream" in search bar
    Then verify search result is not found
    Then verify enquiry banner is displayed

  Scenario: Verify enquiry form pop up is displayed
    When user clicks on "Enquire Now" button on enquiry banner
    Then Verify enquiry form pop up is displayed

  Scenario: Verify user is redirected to login form
    When user clicks on "Enquire Now" button on enquiry banner
    Then verify user is on enquiry form pop up
    Then verify login button is displayed on pop up
    When user clicks on login button in enquiry screen
    Then user is redirected to login form

  Scenario: Verify user is redirected to registration form
    When user clicks on "Enquire Now" button on enquiry banner
    Then verify user is on enquiry form pop up
    Then verify login button is displayed on pop up
    When user clicks on registration button in enquiry screen
    Then user is redirected to registration form

  Scenario: Verify Product popup with all subcategories
    When user clicks on "Enquire Now" button on enquiry banner
    When user enter name , mobileno and emailid on Enquiry form
    And user click on Proceed button
    Then verify product details pop up open with all subcategories

  Scenario: Verify successful enquiry submission message
    When user clicks on "Enquire Now" button on enquiry banner
    When user enter name , mobileno and emailid on Enquiry form
    And user click on Proceed button
    Then verify product details pop up open with all subcategories
    When user fill in enquiry form details related to requirement , grade ,thickness ,length etc
    And user clicks on Send Enquiry button
    Then verify message is displayed as Below message should be displayed "Thank you for showing interest! Your query has been submitted. One of the JSWone representative will contact you within 24 hours Query Id : XXXX"
    And verify query id got generated for guest user

  @ignore
  Scenario: Verify unsuccessful enquiry submission message
    Given user is on product detail pop up
    When user fill in enquiry form details related to requirement , grade ,thickness ,length etc
    And user clicks on Send Enquiry button
    Then verify message is displayed as Below message should be displayed "We are facing technical issues, kindly refresh or try after some time"

  @ignore @defect
  Scenario: Validate email on enquiry form
    When user clicks on "Enquire Now" button on enquiry banner
    When user is on enquiry form
    When user enter invalid emailid on Enquiry form
    Then verify user not to click on Proceed button

  @ignore @defect
  Scenario: Validate name on enquiry form
    When user clicks on "Enquire Now" button on enquiry banner
    When user is on enquiry form
    When user enter invalid name like numbers on Enquiry form
    Then verify user not to allowed to enter numbers

  Scenario: Validate phone on enquiry form
    When user clicks on "Enquire Now" button on enquiry banner
    When user is on enquiry form
    When user enter invalid phone number like alphabets on Enquiry form
    Then verify user not to allowed to enter alphabets

  Scenario: Validate mandatory field
    When user clicks on "Enquire Now" button on enquiry banner
    And user is on enquiry form
    And user does not enter values in name, phone number in enquiry form
    Then verify proceed button is disabled
