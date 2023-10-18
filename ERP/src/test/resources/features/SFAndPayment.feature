  @OMS  @OMSPayment
Feature: Verify SF orders and Payment

  @CreateOrder
  Scenario: Verify Opportunity creation in SF
    Given user login to SF
    When user navigates to AccountPage
    And click on Quick Opportunity
    And fill SKURequirement Details and process Opportunity
    And create order and extract orderno from SF

  @ValidateAdvancePaymentOrder
  Scenario: Verify AdvancePaymentOrder
    Given user login to SF
    When user navigates to AccountPage
    And click on Quick Opportunity
    And fill SKURequirement Details and process Opportunity
    And create order and extract orderno from SF
    And user login to OMS
    And user navigates to OMS OrderDetailsPage
    Then verify PaymentStaus is "Pending" in OMS
    And verify Advance Amount in OMS
    And user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramyatestuserssr@gmail.com" and  "Ramya@678"
    And user clicks on signin
    And user navigates to SF order in CCP
    Then verify Advance Payment Msg "Your order is awaiting advance payment "

  @ValidatePartPayment
  Scenario: Verify PartPayment
    Given user login to SF
    When user navigates to AccountPage
    And click on Quick Opportunity
    And fill SKURequirement Details and process Opportunity
    And create order and extract orderno from SF
    And user login to OMS
    And user navigates to OMS OrderDetailsPage
    Then verify PaymentStaus is "Pending" in OMS
    And verify Advance Amount in OMS
    And user is on home page
    And close rest open tabs
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramyatestuserssr@gmail.com" and  "Ramya@678"
    And user clicks on signin
    And user navigates to SF order in CCP
    Then verify Advance Payment Msg "Your order is awaiting advance payment "
    And user clicks on netBanking
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on success button
    Then Advance order sucessfully placed message should be displayed
    And user navigates to OMS OrderDetailsPage
    Then verify PaymentStaus is "Partial" in OMS
    And navigates to PaymentTab
    And select PaymentRequest as "PART" and send request

  @ValidateFullPayment
  Scenario: Verify FullPayment
    Given user login to SF
    When user navigates to AccountPage
    And click on Quick Opportunity
    And fill SKURequirement Details and process Opportunity
    And create order and extract orderno from SF
    And user login to OMS
    And user navigates to OMS OrderDetailsPage
    Then verify PaymentStaus is "Pending" in OMS
    And verify Advance Amount in OMS
    And user is on home page
    And close rest open tabs
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramyatestuserssr@gmail.com" and  "Ramya@678"
    And user clicks on signin
    And user navigates to SF order in CCP
    Then verify Advance Payment Msg "Your order is awaiting advance payment "
    And user clicks on netBanking
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on success button
    Then Advance order sucessfully placed message should be displayed
    And user navigates to OMS OrderDetailsPage
    Then verify PaymentStaus is "Partial" in OMS
    And navigates to PaymentTab
    And select PaymentRequest as "FINAL" and send request
    And user is on home page
    And close rest open tabs
    And user navigates to SF order in CCP
    Then verify Full Payment Msg "Please pay the required amount as per the payment request"
    And user clicks on PayNow
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on success button
    Then Advance order sucessfully placed message should be displayed
    And user navigates to OMS OrderDetailsPage
    Then verify PaymentStaus is "Full" in OMS

  @PositiveTolerance
  Scenario: Verify PositiveTolerance
    Given user login to SF
    When user navigates to AccountPage
    And click on Quick Opportunity
    And fill SKURequirement Details and process Opportunity
    And create order and extract orderno from SF
    And user is on home page
    When user clicks on login button
    When user click  on login by email
    When user enters logins with username with "ramyatestuserssr@gmail.com" and  "Ramya@678"
    And user clicks on signin
    And user navigates to SF order in CCP
    Then verify Advance Payment Msg "Your order is awaiting advance payment "
    And user clicks on netBanking
    And user select bank name to transfer from the drop down on payment page
    Then verify bank is selected
    And User click on PayNow
    Then User navigates to RazorPay Page
    And User click on success button
    Then Advance order sucessfully placed message should be displayed
    And user login to OMS
    And user navigates to OMS ShipmentsPage with SFOrder
    And user creates a completed shipment in OMS with invoiceQty "700"
     #And user navigates to OMS OrderDetailsPage
     Then verify Positive tolerance amount
    


