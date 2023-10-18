package com.jswone.msme.oms.stepdefination;

import com.jswone.msme.oms.factory.DriverFactory;
import com.jswone.msme.oms.pages.DashboardPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Dashboard {
	private DashboardPage dashboardPage = new DashboardPage(DriverFactory.getDriver());

	@Given("user login to ERP")
	public void user_login_to_erp() throws InterruptedException {
		dashboardPage.goToOMS();
	}

	@Then("validate {int} tabs User should see {int} tabs Dashboard,Order Details,Incoming Payments, Ledger,User Management,Finance Payout,Credit Limit,Credit Order")
	public void validate_tabs_user_should_see_tabs_dashboard_order_details_incoming_payments_ledger_user_management_finance_payout_credit_limit_credit_order(
			Integer int1, Integer int2) {

	}

}
