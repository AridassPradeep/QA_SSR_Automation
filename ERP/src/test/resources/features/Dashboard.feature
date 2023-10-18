@OMS
Feature: Verify Dashboard

  @Dashboard
  Scenario: Verify User has log in to ERP
    Given user login to ERP
    Then validate 8 tabs User should see 8 tabs Dashboard,Order Details,Incoming Payments, Ledger,User Management,Finance Payout,Credit Limit,Credit Order

  Scenario: Verify seller filter in the dashboard
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user selects the "Seller" option from the filters at the top
    And the user types a partial seller name
    Then the seller name should auto-populate based on the input
    When the user clicks on submit
    Then all the displayed rows should correspond to the seller searched for

  Scenario: Verify  buyer filter in the dashboard
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user selects the "Delivery State" option from the filters at the top
    And the user types a partial delivery state
    Then the delivery state should auto-populate based on the input
    When the user clicks on submit
    Then all the displayed rows should correspond to the delivery state searched for

  Scenario: Verify  ops spoc filter in the dashboard
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user selects the "Ops Spoc" option from the filters at the top
    And the user selects an Ops Spoc from the checkbox options
    Then the selected Ops Spoc should auto-populate in the filter
    When the user clicks on submit
    Then all the displayed rows should correspond to the Ops Spoc searched for

  Scenario: Verify Reset Button for filters
    Given the user is logged in to the ERP with Admin/Dashboard Access
    And the user applies filters on seller, delivery state, and ops spoc and performs a search
    When the user clicks on the reset button
    Then the applied filters should be reset
    And the user should be able to see data from different seller, state, and ops spoc

  Scenario: Open Orders Today Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Open Orders Today" tab
    Then the orders that have an order creation date today should appear in today's bucket
    And the count should match with the pagination after clicking

  Scenario: Open Orders 1-3 Days Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Open Orders 1-3" tab
    Then the orders that have an order creation date from today up to 3 days previously should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Open Orders 4-7 Days Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Open Orders 4-7" tab
    Then the orders that have an order creation date from 4 to 7 days previously should appear in this bucket
    And the count should match with the pagination after clicking.

  Scenario: Open Orders 1 Week+ Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Open Orders 1week+" tab
    Then the orders that have an order creation date 1 week or more previously should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Shipment Due Today Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Shipment Due Today" tab
    Then the orders that have a planned dispatch date today should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Shipment Due 1-3 Days Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Shipment Due 1-3" tab
    Then the orders that have a planned dispatch date from today up to 3 days previously should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Shipment Due 4-7 Days Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Shipment Due 4-7" tab
    Then the orders that have a planned dispatch date from 4 to 7 days previously should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Shipment Due 1 Week+ Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Shipment Due 1week+" tab
    Then the orders that have a planned dispatch date 1 week or more previously should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Payout Due Today Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access.
    When the user goes to the dashboard and clicks on the "Payout Due Today" tab.
    Then the orders that have an invoice date today should appear in this bucket.
    And the count should match with the pagination after clicking.

  Scenario: Payout Due 1-3 Days Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Payout Due 1-3" tab
    Then the orders that have an invoice date from today up to 3 days previously should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Payout Due 4-7 Days Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Payout Due 4-7" tab
    Then the orders that have a planned invoice date from 4 to 7 days previously should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Payout Due 1 Week+ Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access.
    When the user goes to the dashboard and clicks on the "Payout Due 1week+" tab.
    Then the orders that have an invoice date 1 week or more previously should appear in this bucket.
    And the count should match with the pagination after clicking.

  Scenario: Confirmation Pending Today Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Confirmation Pending Today" tab
    Then the orders that have an Order Created Date today, current state being "Confirmation Pending," and not cancelled or closed should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Confirmation Pending 1-3 Days Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Confirmation Pending 1-3" tab
    Then the orders that have an Order Created Date within the past 1-3 days, current state being "Confirmation Pending," and not cancelled or closed should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Confirmation Pending 4-7 Days Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Confirmation Pending 4-7" tab
    Then the orders that have an Order Created Date within the past 4-7 days, current state being "Confirmation Pending," and not cancelled or closed should appear in this bucket
    And the count should match with the pagination after clicking.

  Scenario: Confirmation Pending 1 Week+ Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Confirmation Pending 1week+" tab
    Then the orders that have an invoice date 1 week or more previously, current state being "Confirmation Pending," and not cancelled or closed should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Follow Up Today Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Follow Up Today" tab
    Then the orders that have a nextActionDate today should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Follow Up 1-3 Days Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Follow Up 1-3" tab
    Then the orders that have a nextActionDate from today up to 3 days previously should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Follow Up 4-7 Days Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Follow Up 4-7" tab
    Then the orders that have a nextActionDate from 4 to 7 days previously should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Follow Up 1 Week+ Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Follow Up 1week+" tab
    Then the orders that have a nextActionDate 1 week or more previously should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Refund Today Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Refund Today" tab
    Then the orders that have a refund created date today should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Refund 1-3 Days Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Refund 1-3" tab
    Then the orders that have a refund created date from today up to 3 days previously should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Refund 4-7 Days Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Refund 4-7" tab
    Then the orders that have a refund created date from 4 to 7 days previously should appear in this bucket
    And the count should match with the pagination after clicking

  Scenario: Refund 1 Week+ Bucket Verification
    Given the user is logged in to the ERP with Admin/Dashboard Access
    When the user goes to the dashboard and clicks on the "Refund 1week+" tab
    Then the orders that have a refund created date 1 week or more previously should appear in this bucket
    And the count should match with the pagination after clicking
