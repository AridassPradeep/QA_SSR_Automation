Feature: Verify SF

  @CreateOpportunity
  Scenario: Verify Opportunity
    Given user login to SF
    And user navigates to AccountPage
    And click on Quick Opportunity
    And fill SKURequirement Details and process Opportunity
    And create order and extract orderno from SF
    And user login to OMS
    And user navigates to OMS OrderDetailsPage
   
