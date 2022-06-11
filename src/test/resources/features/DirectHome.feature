@DirectHome
Feature: Direct home page feature

 Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "Qasnnjsw@yopmail.com" and  "Test@123"
    And user clicks on signin
    Then user homepage is displayed


@DirectPage
	Scenario: Verify the user is navigate to distributor page and direct page
	When user is able to click Buy from verified sellers button below the cart
	And user is able to navigate to verified seller page
	And user is able to click Buy directly from JSW Steel button
	Then user is able to navigate to direct order page
	
@RequirementPage
	Scenario: Verify the user navigate to Requirement page
	When user is able to click My requirements header visible above the Buy from verified sellers
	Then user is able navigate to direct home page

@Categories	
	Scenario: User is verify the view categories section 
	When user is able to scroll down to categories section
	And user is able to view All Categories on home page
	When user is able to click view all button in All categories section
	And user is able to navigate to PLP page
	Then user is able to navigate to direct home page from PLP page
	And user is able to navigate PDP page by clicking Configure and request 
	And user is able to view request price button 
	And user is able to veify and validate Configure and request price on the All categories section

@Blogs	
	Scenario: Verify user is able navigate blog & article page
	When user is able to navigate blog by clicking Read now 
	And user is able to view blog & and article page
	Then user is able to naviage from Blog & article page to direct home page
	And user is able to click View all articles to navigate Blogs & article page
	Then user navigate from Blog page to Home page
	
@Enquiry	
	Scenario: Verify user is able to view enquiry window and work flow banner on the home page
	When user is able to view enquiry window below the articles
	When user is able to scroll down to view How it works page
	Then user is able to view changes in the How it works on home page
		