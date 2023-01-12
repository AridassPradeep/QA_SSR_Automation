Feature: Validating Notification

  @msme
  Scenario Outline: Verify notfication sms
  
    When user calls "notificationRegistrationsmsAPI" with "Post" http request with "<PhoneNo>"
    Then the API call is success with status code 200
    And validate the payload structure
    And validate the response time is less than 500 ms

    Examples: 
      | PhoneNo    |
      | 8095424663 |
      | 9090909090 |


  
 