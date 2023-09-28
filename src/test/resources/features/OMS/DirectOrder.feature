@OMS @DirestOrderDetailsOMS
Feature: Verify Direct Order Details

   @DirestOrderDetailsOMS
  Scenario: Verify Ordered value in footer
    Scenario: Verify Opportunity creation in SF
    Given user login to SF
    When user navigates to AccountPage
    And click on Quick Opportunity
    And fill SKURequirement Details and process Opportunity
    And create order and extract orderno from SF
    And user login to OMS
    And user navigates to OMS OrderPage using SFOrderNo
    And extract order value from ERPV2API
    And validate the ERPV2API contract
    And verify Ordered value matches with ordersummary value
     
