@PLP
Feature: Product Landing Page feature

  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user enters logins with username with "ramya1347@gmail.com" and  "Ramya@678"
    And user clicks on signin
    Then user homepage is displayed

  Scenario: Display BreadCrumb for HR
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    Then Breadcrump should display Steel by categories>Hot Rolled(HR)

  Scenario: Display  BreadCrumb for CR
    When user enter "Cold Rolled Sheet" in search bar
    And user click on search button
    Then Breadcrump should display Steel by categories>cold Rolled(CR)

  Scenario: As a registered user check for Breadcrumb for HR
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    Then Breadcrump should display Steel by categories>Hot Rolled(HR)

  Scenario: Check BreadCrumb hyperlink is working fine
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    Then Breadcrump should display Steel by categories>Hot Rolled(HR)
    When user  click on home hyper link in breadcrumb"
    Then product page should navigate to home page"

  Scenario: Check for Categories tabs are available for HR
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    Then Catgories Tabs should be available with Hot Rolled,Cold Rolled,Wire Rod,TMT(Not for R1),Coated,Colour coated,Alloy Steel(Not for R1)"

  Scenario: Check default selection of Filters
    When user enter "Hot Rolled Sheet E250A" in search bar
    And user click on search button
    Then Reset link should be available above the filters section

  Scenario: Products are displaying After filters removed
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    Then Breadcrump should display Steel by categories>Hot Rolled(HR)
    When user  click on HR 2062-2011
    When user  click on Reset Hyper link"

  Scenario: check pagination icon is present on the page
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    Then products should display in grid view product count should per page is 10

  Scenario: Check for Default pagination
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button

  Scenario: Check Item List for Grid view and the item count
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    When user  click on list view icon
    Then check "showing count(*) total product number results for search string"

  Scenario: Check for Total product count is displaying for the search string
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    Then Reset Link should be present above the filters section

  Scenario: Check for Reset Hyperlink availability on page
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    And user Select E250A at Filters section in Grades and subGrades
    When user  click on Reset Hyper link"
    Then All the filters should be removed All the products should display and no filters has to be selected"

  Scenario: Check applied Filters are shown above the products
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    And user Select E250A at Filters section in Grades and subGrades
    Then Filters applied should be shown above the Products display applied filters should display with cross button"

  Scenario: Check for clear all hyper link availability if filters applied more than 2 filters
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    And user Select E250A at Filters section in Grades and subGrades
    And user Select E350A at Filters section in Grades and subGrades
    Then Filters applied should be shown above the Products display
    Then all the applied filters should display
    Then clear all hyper link must be available after selection of more than 2 filters

  Scenario: Check Clear all hyper link is clickable and clears the applied filters
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    And user Select E250A at Filters section in Grades and subGrades
    And user Select E350A at Filters section in Grades and subGrades
    And click on clear all hyper link
    And all the applied filters should be removed
    And all the products should display"

  Scenario: Remove atlest one applied filter and check displayed products
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    And user Select E250A at Filters section in Grades and subGrades
    And user Select E350A at Filters section in Grades and subGrades
    And user click on E350A filter cross button
    Then Filters applied should be shown above the Products display
    And After removing filter E350A remaining filters products should display

  Scenario: cancel/close all filters shown above the prodcts
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    And user Select E250A at Filters section in Grades and subGrades
    And user Select E350A at Filters section in Grades and subGrades
    Then Filters applied should be shown above the Products display
    And user click on cross mark for all filters shown"
    And all the applied filters should be removed
    And all the products should display"


  Scenario: Filter Section for HR Category
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    Then Filter sections are Forms ,Grades and Sub Grades,Application sector,Thickness,Width and Length


  Scenario: Filter Section for CR Category
    When user enter "Cold Rolled Sheet" in search bar
    And user click on search button
    Then Filter sections are Forms ,Grades and Sub Grades,Application sector,Thickness,Width and Length
@sanity
  Scenario: Filter Section for WR Category
    When user enter "Wired Rod" in search bar
    And user click on search button
    Then Filter sections are Grade,Sub grade, Thickness, sub Application Sector,Forms,Diameter

  Scenario: Filer Section for coated Category
    When user enter "coated" in search bar
    And user click on search button
    Then Filter sections are Filter sections are Sub Category,Grade,sub Grade,Thickness,width,coating Grade,Spangle type ,Application Sector,sub Application Sector

  Scenario: Filer Section for Colour Coated Category
    When user enter "colour coated" in search bar
    And user click on search button
    Then Filter sections are Sub Category,Grade,sub Grade,Thickness,width,coating Grade,colour,Application Sector,sub Application Sector

  Scenario: Products Display for Category HR
    When user enter "Hot Rolled coil" in search bar
    And user click on search button
    Then Hot Rolled coil Related products will display

  Scenario: Check product name format should be "category[Grade]-subgrade-material form
    When user enter "Hot Rolled Sheet" in search bar
    And user click on search button
    Then Hot Rolled coil Related products will display
    And product name should be for Hot Rolled Sheet is ""Hot Rolled sheets[2062:2011]-E250A-HR CTLF

  Scenario: check Product name is clickable and page navigates to PDP page
    When user enter "cold Rolled Sheet" in search bar
    And user click on search button
    And user click on product name displayed on the page
    Then page navigates to PDP page

  Scenario: Check for product measurements are displayed for each product
    When user enter "Cold Rolled Sheet" in search bar
    And user click on search button
    Then product measurements should be display Thickness 1.6 mm, width 1250 mm and  Length

  Scenario: Check price range is shown for each product
    When user enter "Cold Rolled Sheet" in search bar
    And user click on search button
    Then product price range should be display
    And Rupee symbol should be display at before every price

  Scenario: Check for Delivery is mentioned with estimated days
    When user enter "cold Rolled Sheet" in search bar
    And user click on search button
    Then Delivery in should display with days range ie Delivery in 2-5 days



  Scenario: Sorry page is displayed for non product search
    When user enter "Parachute" in search bar
    And user click on search button
    Then Sorry page should display with "sorry, but nothing could be found with the keywork ""parachute"" can call us on 1800 340 1234 or watsapp at ""Watsapp number""

 
  Scenario: check for Grade and sub grade section in filters are displayed as search string with Hot rolled
    When user enter "Hot Rolled" in search bar
    And user click on search button
    Then Grade and sub grade for Hot Rolled are dispalyed 2062_2011,E250_A, E250BR, E350A
 
  Scenario: check for Grade and sub grade section in filters are displayed as search string with cold rolled
    When user enter "Cold Rolled" in search bar
    And user click on search button
    Then Grade and sub grade for cold Rolled are displayed -513_part1_2006 ,CR1,E250A


  Scenario: Check for Coating grade products are displayed after filters applied
    When user enter "Coated" in search bar
    And user click on search button
    Then Filter with Coating Grade to be displayed


  Scenario: Check for selected color products are displayed after filters applied
    When user enter "Colour coated" in search bar
    And user click on search button
    Then Filter with Color to be displayed


  Scenario: Check for selected Diameter products are displayed after filters applied
    When user enter "Rod" in search bar
    And user click on search button
    Then Filter with Diameter to be displayed


  Scenario: Check for Filters working proper if Grades are selected for color coated
    When user enter "Color coated" in search bar
    And user click on search button
    And user click on 277_2018 in grades and subgrades filter
    


  Scenario: Check for Filter applied and cancelled tags are working properly
    When user enter "Hot Rolled" in search bar
    And user click on search button
    And user click on 2062_2011 in filter
    And click on cancel grade from tags
    Then After cancelling the cancelled tag should be eliminated from the tags and products should display accordingly
