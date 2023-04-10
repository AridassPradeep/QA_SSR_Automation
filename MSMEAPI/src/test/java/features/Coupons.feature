@Coupons
Feature: Validating CouponAPI

 @validateCoupon
  Scenario Outline: Validate coupon
   # Given user calls "addToCartAPI" with "Post" http request for "addToCart"
   # Then validate that the "addToCartAPI"  call response is success with status code "200"
   # And validate the "addToCartAPI" response time is less than "8000" ms
   # And validate the "addToCartAPI" payload structure has "orderCartSummary"
    Given user calls "validateCouponAPI" with "Post" http request with queryParam "<Coupon>" and "<value>"
    Then validate that the "validateCouponAPI"  call response is success and with status code "200"
    And validate that the "validateCouponAPI" response time is less than "8000" ms
    And validate that the "validateCouponAPI" payload structure has "pendingPaymentOrders"
    
        Examples: 
      | Coupon    | value |
      | discountCode  |CEMENT5 |
      

    