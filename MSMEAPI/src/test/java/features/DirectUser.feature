@DirectUser
Feature: Validating DirectUserAPI

  @DirectUserLogin
  Scenario: Verify valid Direct User login
    Given user calls "directUserloginAPI" with "Post" http request for "directOrder"
    Then validate that the "directUserloginAPI"  call response is success with status code "200"
    And validate the "directUserloginAPI" response time is less than "8500" ms
    And validate the "directUserloginAPI" payload structure has "jwtToken"

  @MyRequirements
  Scenario: Verify valid MyRequirements
    Given user calls "directUserloginAPI" with "Post" http request for "directOrder"
    Then validate that the "directUserloginAPI"  call response is success with status code "200"
    And validate the "directUserloginAPI" response time is less than "8500" ms
    And validate the "directUserloginAPI" payload structure has "jwtToken"
    And extract the jwtToken
    And user calls "myrequirementsAPI" with "Get" http request for "myrequirements"
    Then validate that the "myrequirementsAPI"  call response is success with status code "200"
    And validate the "myrequirementsAPI" response time is less than "4000" ms
    And validate the "myrequirementsAPI" payload structure has "requirementId"
