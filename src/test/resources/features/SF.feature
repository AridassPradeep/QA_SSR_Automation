Feature: Verify SF

  @CreateOpportunity
  Scenario: Verify Opportunity
    Given user login to SF
    And user navigates to AccountPage
    And click on Quick Opportunity
    And fill SKURequirement Details
