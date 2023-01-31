@cart
Feature: Validating CartAPI

@AddToCart
  Scenario: Verify ADD to cart api is working for TMT product
    Given user calls "addToCartAPI" with "Post" http request for "addToCart"
    Then validate the "addToCartAPI"  call response is success with status code 200
    And validate the "addToCartAPI" response time is less than "8000" ms
    And validate the "addToCartAPI" payload structure has "orderCartSummary"

    @CartSize
  Scenario: Verify cartSize api is working for TMT product
    Given user calls "addToCartAPI" with "Post" http request for "addToCart"
    Then validate the "addToCartAPI"  call response is success with status code 200
    And validate the "addToCartAPI" response time is less than "8000" ms
    And validate the "addToCartAPI" payload structure has "orderCartSummary"
    And user calls "cartSizeAPI" with "Get" http request for "addToCart"
    