@customer
Feature: Validating CustomerAPI

  @Login
  Scenario: Verify valid login
    Given user calls "loginAPI" with "Post" http request for "login"
    Then validate that the "loginAPI"  call response is success with status code "200"
    And validate the "loginAPI" response time is less than "5000" ms
    And validate the "loginAPI" payload structure has "jwtToken"

  @validateGst
  Scenario: Validate GST
    Given user calls "validateGSTAPI" with "Post" http request for "validateGST"
    Then validate that the "validateGSTAPI"  call response is success with status code "200"
    And validate the "validateGSTAPI" response time is less than "8000" ms
    And validate the "validateGSTAPI" payload structure has "companyName"

  @validatePhoneNo
  Scenario Outline: Valid PhoneNo
    Given user calls "validatePhoneAPI" with "Get" http request with queryParam "<Param>" and "<phoneNo>"
    Then validate that the "validatePhoneAPI"  call response is success with status code "404"
    And validate the "validatePhoneAPI" response time is less than "2000" ms

    Examples: 
      | Param       | phoneNo    | ValidationMsg |
      | phoneNumber | 8187654333 | false         |

  @registration
  Scenario: Validate registration Verification
    Given user calls "registerAPI" with "Post" http request for "registration"
    Then validate that the "registerAPI"  call response is success with status code "200"
    And validate the "registerAPI" response time is less than "15000" ms
    And validate the "registerAPI" payload structure has "customerId"
