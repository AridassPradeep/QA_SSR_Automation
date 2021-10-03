Feature: Login page feature

 Scenario Outline: Validate Login 
Given user is on home page
When user clicks on loginButton
And user enters valid username "<username>" and password "<password>"
And user clicks on signinbutton
Then user navigates to homepage

Examples:
		| username | password |
		| ramya101@gmail.com | Ramya@678 |

 Scenario Outline: Validate Registration
	Given user is on home page
	When user clicks on register button
	And user enters username with "<username>"
	And user enters mobile with "<mobileno>"
	And user enters gstno with "<GSTIN>"
	And user enters companymailid with "<companyemail>"
	And click on termsandcondition
	And click on next button
	And click on new password  "<password>"
	And click on confirm password "<password>"
	And click on create account
	Then Thankyou page is displayed
		
		Examples:
		| username | mobileno | GSTIN | companyemail | password |
		| ramya | 8006510002 |  33AHOPD1014A1ZB |ramya52@gmail.com | Ramya@678|
		