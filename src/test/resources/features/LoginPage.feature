@functional
Feature: Login page feature

  Background: User opens website
    Given user is on home page
    When user clicks on login button

  Scenario Outline: verify the user able to login with Email and password
    When user enters logins with username with "<email>" and  "<password>"
    And user clicks on signin
    Then user homepage is displayed

    Examples: 
      | email               | password  |
      | ramya1347@gmail.com | Ramya@678 |

  Scenario Outline: verify the user able to login with Phone Number and password
    When user enters logins with username with "<phoneno>" and  "<password>"
    And user clicks on signin
    Then user homepage is displayed

    Examples: 
      | phoneno    | password  |
      | 8238775234 | Ramya@678 |

  Scenario: verify the forget password link is properly working
    And user clicks on forgotpassword
    Then forgotpassword popup to be displayed

  Scenario Outline: verify the Register link is available and properly working
    When user clicks on register button from login screen
    Then user enters username with "<username>"

    Examples: 
      | username |
      | ramya    |

  Scenario Outline: verify the proper error message is displaying if the user enters non registered Phone Number
    When user enters logins with username with "<phoneno>" and  "<password>"
    And user clicks on signin
    Then proper alert message is displayed for login screen

    Examples: 
      | phoneno    | password  |
      | 9218775234 | Ramya@678 |

  Scenario Outline: verify the proper error message is displaying if the user enters registered phone number and wrong password
    When user enters logins with username with "<phoneno>" and  "<password>"
    And user clicks on signin
    Then proper alert message is displayed for login screen

    Examples: 
      | phoneno    | password |
      | 9218775234 | ururu34  |

  Scenario Outline: verify the Login button is disabled if the User-Id field is blank
    When user enters logins with username with "<phoneno>" and  "<password>"
    And user clicks on signin
    Then login button is disabled

    Examples: 
      | phoneno | password      |
      |         | 34858y956io56 |

  Scenario Outline: verify the Login button is disabled if the password field is blank
    When user enters logins with username with "<phoneno>" and  "<password>"
    And user clicks on signin
    Then login button is disabled

    Examples: 
      | phoneno    | password |
      | 9218775234 |          |

  Scenario Outline: verify the Registration Button does not display after user Login
    When user enters logins with username with "<email>" and  "<password>"
    And user clicks on signin
    Then the Registration button is not displayed after user Login

    Examples: 
      | email               | password  |
      | ramya1347@gmail.com | Ramya@678 |

  Scenario Outline: Verify error message for incorrect password
    When user enters logins with username with "<phoneno>" and  "<password>"
    And user clicks on signin
    Then proper alert message is displayed for login screen

    Examples: 
      | phoneno    | password  |
      | 9218775234 | cdjfdjf84 |

  @SmokeTest
  Scenario Outline: Validate User is prompted to log in screen instead of continuation of registration process for already registered in JSW One site members.
    When user closes the signin popup
    And user clicks on register button
    And user enters username with "<username>"
    And user enters mobile with "<mobileno>"
    And user enters companymailid with "<companyemail>"
    Then login popup is displayed

    Examples: 
      | username | mobileno   | companyemail        |
      | ramya    | 8238775234 | ramya1347@gmail.com |
