package stepdefination;

import java.awt.AWTException;

import factory.DriverFactory;
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

}
