@ForgetPassword
Feature: Forgotpassword  feature

  Background: User opens website
    Given user is on home page
    When user clicks on login button

  Scenario: verify the forgot password link is properly working
    And user clicks on forgotpassword
  @smokeTest
  Scenario Outline: validate user got password reset link sent successfully message
    When user clicks on forgotpassword
    And user clicks on proceed
    And user enters email id with Email "<Email>"
    And user clicks on submit
    Then verify the confirmation message

    Examples: 
      | Email                          |
      | v_sreenivas.gundlapalli@jsw.in |

  @smokeTest
  Scenario Outline: validate user should get the error message that  email id is not registered
    When user clicks on forgotpassword
    And user clicks on proceed
    And user enters email id with Email "<Email>"
    And user clicks on submit
    Then verify the Error message

    Examples: 
      | Email                  |
      | mshirisha038@gmail.com |

  @smokeTest
  Scenario Outline: If user enters wrong email format then error message should be triggered
    When user clicks on forgotpassword
    And user clicks on proceed
    And user enters email id with Email "<Email>"
    Then verify wrong email error

    Examples: 
      | Email     |
      | test@test |
      
      @DebugTest
      Scenario Outline: Change the password with Reset link 
      When user clicks on forgotpassword
      And user clicks on proceed
      And user enters email id with Email "<Email>"
      And login to gmail with gmail "<Gmail>"
      And login to gmail with password "<Password>"
      And click gmail next
      And User Enters new password "<NewPassword>"
      And User Enters confirm password "<ConfirmPassword>"
      And user clicks on clicksubmit
      Then verify the password got changed "You have successfully reset your password"
      
      Examples:
      | Email | NewPassword |ConfirmPassword | Gmail|Password|
      |qatestuser@jsw.in| Admin@123$ | Admin@123$ | qatestuser@jsw.in| Admin@123$|
      
      
