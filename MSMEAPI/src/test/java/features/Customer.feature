@customer
Feature: Validating CustomerAPI

  @Login
  Scenario: Verify valid login
    When user calls "loginAPI" with "Post" http request
    Then the API call response is success with status code 200
    And validate the payload structure has "Bearer"
    And validate the login response time is less than "5000" ms

  @registration
  Scenario: Validate registration Verification
    Given user calls "registerAPI" with "Post" http request for registration
    Then the API call response is success with status code 200
   # And validate the payload structure has "customerId"
    And validate the login response time is less than "15000" ms

    