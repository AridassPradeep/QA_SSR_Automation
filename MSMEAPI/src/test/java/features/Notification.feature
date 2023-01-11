Feature: Validating Notification

  @epoch
  Scenario Outline: Verify if epoch api functionality for correct unixtimestamp is working
    Given user calls "getUnixTimeStampAPI" with "Get" http request with unixtimeStamp as "<unixtimeStamp>"
    Then the API call is sucess with status code 200
    And "dateValue" in response body is "Datetime"

    Examples: 
      | unixtimeStamp |
      |           100 |
      |         00105 |
      |           -21 |

  @epoch
  Scenario Outline: Verify if epoch api functionality for incorrect unixtimestamp is working and giving proper error messages
    Given user calls "getUnixTimeStampAPI" with "Get" http request with unixtimeStamp as "<unixtimeStamp>"
    Then the API call is sucess with errormsg and status code 400
    And errorMsg in response body is "<error>"

    Examples: 
      | unixtimeStamp | error                                                                                                                        |
      | a100          | UnixTimeService.RESTHost.fromunixtimestamp.TryCatch.Try.UnixTimeStamp: Input string was not in a correct format.             |
      | 105^%         | UnixTimeService.RESTHost.fromunixtimestamp.TryCatch.Try.UnixTimeStamp: Input string was not in a correct format.             |
      |               | UnixTimeService.RESTHost.fromunixtimestamp.TryCatch.Try.UnixTimeStamp: Value cannot be null. (Parameter 's') (Parameter 's') |
      |          10.5 | UnixTimeService.RESTHost.fromunixtimestamp.TryCatch.Try.UnixTimeStamp: Input string was not in a correct format.             |

      
  Scenario Outline: Verify notfication sms
  When user calls "Verify notfication sms" with "Post" http request with "<phone no>"
  Then the API call is sucess with status code 200
  And "status" in response body has "Request accepted"
  And validate the payload structure
  And validate the response time is less than 500 ms
  
  Examples:
  | phone no | 
  |807898778 |
  | 8909gaha |