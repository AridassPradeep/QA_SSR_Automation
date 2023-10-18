@OMS
Feature: Verify Dashboard

  @Dashboard
  Scenario: Verify User has log in to ERP
    Given user login to ERP
    Then validate 8 tabs User should see 8 tabs Dashboard,Order Details,Incoming Payments, Ledger,User Management,Finance Payout,Credit Limit,Credit Order
