@E2E
Feature: Validating E2e

  Scenario: Verify EndToEndScenario
    Given user calls "addToCartAPI" with "Post" http request for "addToCart"
    Then validate that the "addToCartAPI"  call response is success with status code "200"
    And validate the "addToCartAPI" response time is less than "8000" ms
    And validate the "addToCartAPI" payload structure has "orderCartSummary"
    And user calls "cartSizeAPI" with "Get" http request for "addToCart"
    Then validate that the "cartSizeAPI"  call response is success with status code "200"
    And validate the "cartSizeAPI" response time is less than "4000" ms
    And validate the "cartSizeAPI" payload structure has "lineItemCount"
    And user calls "createOrderAPI" with "Post" http request for "createOrder"
    And validate the "createOrderAPI" payload structure has "paymentLink"

  