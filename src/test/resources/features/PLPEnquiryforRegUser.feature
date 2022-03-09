@PLPEnquiryReg
Feature: Product Landing Page feature for RegUser

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramya1347@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed
    When user selects Hot Rolled products
    When user scroll down till enquiry button

  Scenario: Verify message on enquiry banner
    And Below message should be displyed on enquiry form banner "Can’t find what you are looking for?  "“Can’t find what you are looking for? Tell us your specific requirements. Your query will be sent to JSW plant for the right price and we will get back to you"

  # Scenario: Verify banner after searched keyword is not found for logged in user
    When user enter "ice cream" in search bar
    Then verify search result is not found
    Then verify enquiry banner is displayed


   # Scenario: Verify enquiry form from category navigation for logged in user
    When user select category from "Steel By categories"
    Then verify enquiry banner is displayed

  Scenario: Verify successful enquiry submission message
    When user clicks on "Enquire Now" button on enquiry banner
    Then Verify enquiry form pop up is displayed
    Then verify product details pop up open with all subcategories
    When user fill in enquiry form details related to requirement , grade ,thickness ,length etc
    And user clicks on Send Enquiry button
    Then verify message is displayed as Below message should be displayed "Thank you for showing interest! Your query has been submitted. One of the JSWone representative will contact you within 24 hours Query Id : XXXX"
    And verify query id got generated
