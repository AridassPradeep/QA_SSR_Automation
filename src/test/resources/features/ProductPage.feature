Feature: Product page feature

 Scenario Outline: Validate Add product to Cart
Given user is on home page
When user clicks on loginButton
And user enters valid username "<username>" and password "<password>"
And user clicks on signinbutton
Then user navigates to homepage
And user click on hot rolled sheet
And user click on product from listing page

Examples:
		| username | password |
		| ramya101@gmail.com | Ramya@678 |

