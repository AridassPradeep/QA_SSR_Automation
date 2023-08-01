package stepdefination;

import java.awt.AWTException;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import pages.SFPage;

public class SFPageStep {
	SFPage sfpage = new SFPage(DriverFactory.getDriver());

	@Given("user login to SF")
	public void user_login_to_sf() throws InterruptedException {

		sfpage.goToSF();

	}

	@Given("user navigates to AccountPage")
	public void user_navigates_to_account_page() {
		sfpage.goToAccounts();
	}

	@Given("click on Quick Opportunity")
	public void click_on_quick_opportunity() {
		sfpage.clickNewOpportunity();
	}

	@Given("fill SKURequirement Details and process Opportunity")
	public void fill_sku_requirement_details() throws InterruptedException, AWTException {
		sfpage.fillSKURequirementDetails();
	}
	
	@Given("create order and extract orderno from SF")
	public void create_order_and_extract_orderno_from_sf() throws InterruptedException {
		sfpage.orderDetails();
	}




}
