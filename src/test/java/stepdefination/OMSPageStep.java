package stepdefination;

import java.awt.AWTException;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OMSPage;
import pages.PDPRegisteredUserPage;
import pages.Paymentpage;

public class OMSPageStep {
	OMSPage  omspage  = new OMSPage(DriverFactory.getDriver());

	
	@When("user login to OMS")
	public void user_login_to_OMS() throws InterruptedException {
		omspage.goToOMS();
	}
	
	@Then("user navigates to OMS ShipmentsPage")
	public void user_navigates_to_oms_shipments_page() throws InterruptedException, AWTException {
		omspage.goToOMSShipmentPage();
	}
	
	@Then("user creates a completed shipment in OMS")
	public void user_creates_completed_shipment() throws InterruptedException, AWTException {
		omspage.createCompletedShipment();
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
	
	@Given("user navigates to invoiced shipment detailsPage")
	public void user_navigates_to_invoicedshipment_details_page() throws InterruptedException {
		omspage.navigateToinvoicedshipmentDetailsPage();
	}
	
	
	@Given("uploads multi invoices")
	public void uploads_multi_invoices() throws InterruptedException, AWTException {
		omspage.uploadsMultiinvoices();
	}
	@Given("can delete all invoices uploaded")
	public void can_delete_all_invoices_uploaded() throws InterruptedException {
		omspage.deleteAllInvoicesUploaded();
	}
	
	@Given("clickon PartialHold Details and Update")
	public void clickon_partial_hold_details_and_update() {
	   
	}
	
	@Given("navigate to Payouts Tab")
	public void navigate_to_payouts_tab() {
	   
	}







}
