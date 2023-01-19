Feature: Validating CustomerAPI

  @customer @Login
  Scenario Outline: Verify valid login
    When user calls "loginAPI" with "Post" http request
    Then the API call is success with status code 200
    And validate the payload structure has "access_token"
    And validate the response time is less than 500 ms

@registration
  Scenario: Validate registration Verification
    When user calls "registerAPI" with "Post" http request
    Then the API call is success with status code 200
    And validate the payload structure
    And validate the login response time is less than 500 ms
    
    
