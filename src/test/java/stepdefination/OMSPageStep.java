package stepdefination;

import java.awt.AWTException;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OMSPage;
import pages.OrderSummaryPage;
import pages.PDPRegisteredUserPage;
import pages.Paymentpage;

public class OMSPageStep {
	OMSPage omspage = new OMSPage(DriverFactory.getDriver());
	OrderSummaryPage order = new OrderSummaryPage(DriverFactory.getDriver());

	@When("user login to OMS")
	public void user_login_to_OMS() throws InterruptedException {
		omspage.goToOMS();
	}

	@Then("user navigates to OMS ShipmentsPage")
	public void user_navigates_to_oms_shipments_page() throws InterruptedException, AWTException {
		omspage.goToOMSShipmentPage();
	}

	@Then("user navigates to OMS ShipmentsPage with SFOrder")
	public void user_navigates_to_oms_shipments_pageSFOrder() throws InterruptedException, AWTException {
		omspage.goToOMSShipmentPageSFOrder();
	}

	@Then("user navigates to OMS OrderDetailsPage")
	public void user_navigates_to_oms_OrderDetails_pageCreatedFromSF() throws InterruptedException, AWTException {
		omspage.goToOMSOrderDetailsPageCreatedFromSF();
	}

	@When("user creates a completed shipment in OMS with invoiceQty {string}")
	public void user_creates_a_completed_shipment_in_oms_with_invoice_qty(String InvoiceQty)
			throws InterruptedException, AWTException {
		omspage.createCompletedShipment(InvoiceQty);
	}

	@Then("user creates multiple shipment in OMS")
	public void user_creates_multiple_shipment() throws InterruptedException, AWTException {
		omspage.createMultiShipment();
	}

	@Then("user navigates to ShipmentDetails Page in CCP")
	public void user_navigates_to_shipments_page() throws InterruptedException, AWTException {
		omspage.navigateToshipMentsPageCCP();
	}

	@Then("user clicks on viewDocuments")
	public void user_clicks_on_view_documents() throws InterruptedException {
		omspage.navigateToViewDocuments();
	}

	@Given("user navigates to shipment detailsPage")
	public void user_navigates_to_shipment_details_page() throws InterruptedException {
		omspage.navigateToshipmentDetailsPage();
	}

	@Given("user navigates to Delivered shipment detailsPage")
	public void user_navigates_to_Deliveredshipment_details_page() throws InterruptedException {
		omspage.navigateToDeliveredshipmentDetailsPage();
	}

	@Given("user navigates to invoiced shipment detailsPage")
	public void user_navigates_to_invoicedshipment_details_page() throws InterruptedException {
		omspage.navigateToinvoicedshipmentDetailsPage();
	}

	@Given("uploads multi invoices")
	public void uploads_multi_invoices() throws InterruptedException, AWTException {
		omspage.uploadsMultiinvoices();
	}

	@Given("delete all invoices uploaded")
	public void can_delete_all_invoices_uploaded() throws InterruptedException {
		omspage.deleteAllInvoicesUploaded();
	}

	@Given("delete invoices in Invoiced Shipment")
	public void delete_invoices_InvoicedShipment() throws InterruptedException {
		omspage.deleteInvoicesinInvoicedShipment();
	}

	@Given("clickon PartialHold Details and Update")
	public void clickon_partial_hold_details_and_update() throws InterruptedException, AWTException {
		omspage.updatePartialHold();
	}

	@Given("navigate to Payouts Tab")
	public void navigate_to_payouts_tab() throws InterruptedException {
		omspage.navigateToPayouts();

	}
	
	@Given("navigate to Shipment Tab")
	public void navigate_to_Shipment_tab() throws InterruptedException {
		omspage.navigateToShipmentsTab();

	}

	@Then("Validate QualityIssues should be same as entered partial amount value")
	public void validate_quality_issues_should_be_same_as_entered_partial_amount_value() {
		omspage.qualitiesIssuesForPartialPayout();
	}

	@Then("intiate payout is enabled")
	public void intiate_payout_is_enabled() {
		Assert.assertTrue(omspage.intiatePayout());
	}

	@Given("clickon FullHold Details and Update")
	public void clickon_full_hold_details_and_update() throws InterruptedException, AWTException {
		omspage.updateFullHold();
	}

	@Then("intiate payout is disabled")
	public void intiate_payout_is_disabled() {
		Assert.assertFalse(omspage.intiatePayout());

	}
	
	@Then("click on InitiatePayout")
	public void click_on_initiate_payout() {
		omspage.clickInitiatePayout();
	 
	}
	@Then("confirm Payout")
	public void confirm_payout() throws InterruptedException {
		omspage.clickInitiatePayoutConfirmBtn();
	   
	}

	@Given("clickon Release Payout and Update")
	public void clickon_release_payout_and_update() throws InterruptedException, AWTException {
		omspage.updateRelease();
	}

	@Then("Validate QualityIssues should be same as Total invoiced amount")
	public void validate_quality_issues_should_be_same_as_total_invoiced_amount() {

	}

	@Then("Validate QualityIssues should be {string}")
	public void validate_quality_issues_should_be(String string) {

	}

	@Then("{string} message  to be displayed")
	public void message_to_be_displayed(String ErrorMSG) {
		String errorMsg = omspage.validateDeleteMSG(ErrorMSG);
		Assert.assertTrue(errorMsg.contains(ErrorMSG));
	}

	@Then("verify Advance Amount in OMS")
	public void verify_advance_amount_in_oms() {
		omspage.verifyAdvanceAmount();

		String AdavanceAmount = omspage.verifyAdvanceAmount();
		Assert.assertTrue(AdavanceAmount.contains("₹15,000.00"));
	}

	@Then("verify Advance Payment Msg {string}")
	public void verify_advance_payment_msg(String string) {
		String AdvancePaymentNotificationText = order.verifyAdvancePaymentNotificationText();
		Assert.assertTrue(AdvancePaymentNotificationText.contains("Your order is awaiting advance payment of"));
	}

	@Then("verify PaymentStaus is {string} in OMS")
	public void verify_payment_staus_is_in_oms(String paymntStatus) {
		String PaymentStatus = omspage.verifyPaymentStatus();
		Assert.assertTrue(PaymentStatus.contains(paymntStatus));

	}

	@Then("verify Full Payment Msg {string}")
	public void verify_full_payment_msg(String PayfullAmountMsg) {
		String FullPaymentRequestMsg = omspage.verifyFullPaymentRequestMsg();
		Assert.assertTrue(FullPaymentRequestMsg.contains(PayfullAmountMsg));
	}

	@Then("navigates to PaymentTab")
	public void navigates_to_payment_tab() {
		omspage.navigatePaymentTab();
	}

	@Then("select PaymentRequest as {string} and send request")
	public void select_payment_request_as_and_send_request(String paymentRequestType) throws InterruptedException {
		omspage.selectPaymentType(paymentRequestType);
	}

	@Then("verify Positive tolerance amount")
	public void verify_positive_tolerance_amount() {
		omspage.verifyPositiveTolerance();
	}

	@Then("user clicks on Reconsillation Tab")
	public void user_clicks_on_reconsillation_tab() {
		omspage.clickReconciliation();

	}

	@Then("click on Initiate Refund and verify Refund initiated successfully msg")
	public void click_on_initiate_refund() {
		omspage.refund();
	}

}
