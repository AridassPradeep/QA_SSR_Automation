@order
Feature: MyOrder page feature
  Background: User opens website
    Given user is on home page
    When user clicks on login button
    When user enters logins with username with "v_pradeep.aridass@jsw.in" and  "Admin@123"
    And user clicks on signin
    Then user homepage is displayed
 
 @ViewDetails  
  Scenario: verify user view the view details button
    When user is able to click my order button
    And user is able to click view details button
    And user is able to click view price breakup button to view detailed cost list of the ordered product
    Then user is again click the  view price breakup button to close
 
 @NeedHelp   
   Scenario: Verify user view need help button
   	When user is able to click my order
	And user is able click need help button
	Then user is able to navigate to need help page
	
 @CancelOrder	
   Scenario: Verify user able to cancel the order	
	When user is able to click cart icon in home page
	And user is able to scroll down to view proceed to pay button
	And user is able to click proceed to pay button
	And user is able to choose bank list for payment option
	And user is able to click paynow button
	Then user is able to navigate to payment page
	And user is able to click success button on page
	Then user is able to view payment successful message on page
	And user is able to view orde suucess message on page
	Then user is able to click again my order button
	And user is able to click cancel order option for the ordered product
	And user is able to send remarks and click cancel order button
	Then user is able to view cancelled message

 @BuyAgain	
   Scenario: Verify user Buyagain the product
	When user is able to click my order in home page
	And user is able to scroll down and click buy again which was shown in the ordered product
	And user is able to choose requirement details and select
	And user is able to click add to cart
	And user is able to click ok button in the pop of the add to cart button
	And user is able to click cart icon
	And user is able to scroll down and click proceed to pay button
	And user is able to choose bank in the list
	And user is able to click pay now button
	Then user navigate to RayzorPay page
	And User is able to click on success button
    Then verify after successful payment navigates to ORDER summary page
	Then user verify your order is confirmed message
	And user is able to click again my order option
	
