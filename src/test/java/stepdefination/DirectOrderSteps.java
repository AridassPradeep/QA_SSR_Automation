package stepdefination;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DirectOrderPage;
import pages.PDPDiscountPage;
import pages.Paymentpage;


public class DirectOrderSteps {
	DirectOrderPage doppage = new DirectOrderPage(DriverFactory.getDriver());
	PDPDiscountPage pdpdispage = new PDPDiscountPage(DriverFactory.getDriver());
	Paymentpage pmtpage = new Paymentpage(DriverFactory.getDriver());
	

@Then("Buy from verified sellers is displayed")
public void buy_from_verified_sellers_is_displayed() {
   doppage.validateBuyFromVerified();
}

@When("user click on Buy from verified sellers")
public void user_click_on_buy_from_verified_sellers() {
    doppage.clickBuyFromVerified();
}

@Then("verify Buy directly from JSWsteel is displayed")
public void verify_buy_directly_from_js_wsteel_is_displayed() {
    doppage.validateDirectlyfromJSW();
}

@When("user click on Buy directly from JSWsteel")
public void user_click_on_buy_directly_from_js_wsteel() {
    doppage.clickDirectlyfromJSW();
}

@Then("verify My requirements are displayed on top")
public void verify_my_requirements_are_displayed_on_top() throws InterruptedException {
   Thread.sleep(3000);
	doppage.validateMyRequirements();
}

@Then("verify Request Price is displayed on rightside")
public void verify_request_price_is_displayed_on_rightside() {
    doppage.validateRequestPrice();
}
@When("user enter dimension for product")
public void user_enter_dimension_for_product() throws InterruptedException {
	pdpdispage.selectDimensionreguser();
	doppage.enterQuantity50();
	 doppage.clickQuantity();

}
@When("user enter quantity and dimensions for the product")
public void user_enter_quantity_and_dimensions_for_the_product() throws InterruptedException {
	pmtpage.selectDimensionreguser2();
	doppage.enterQuantity50();
	doppage.clickQuantity();
}


@When("user click Request Price")
public void user_click_request_price() throws InterruptedException {
  Thread.sleep(6000);
	doppage.clickRequestPrice();
}

@Then("verify View requirements list is displayed")
public void verify_view_requirements_list_is_displayed() throws InterruptedException {
	Thread.sleep(4000);
	doppage.validateViewRequirementList();
}

@When("user click View requirements list")
public void user_click_view_requirements_list() {
    doppage.clickViewRequirementsList();
}

@Then("verify Request for price is displayed")
public void verify_request_for_price_is_displayed() throws InterruptedException {
   Thread.sleep(3000);
	doppage.validateRequestforPrice();
}

@Then("verify Requirement list is displayed")
public void verify_requirement_list_is_displayed() {
   doppage.validateRequirementTab();
}

@When("user click on Request for price")
public void user_click_on_request_for_price() {
    doppage.clickRequestforPrice();
}

@Then("verify Message {string} is displayed.")
public void verify_message_is_displayed(String string) throws InterruptedException {
    Thread.sleep(3000);
	doppage.validateMessage();
}
@When("Requirement is present then remove it")
public void requirement_is_present_then_remove_it() throws Exception {
	if(doppage.isElementPresent())
		 
	{
		doppage.clickRemoveButton();
	}

}
	
	
@When("user click on My requirements on top")
public void user_click_on_my_requirements_on_top() {
    doppage.clickMyRequirements();
}
	
@Then("verify no product in requirement list")
public void verify_no_product_in_requirement_list() {
   doppage.validateEmptyRequirement();
}
@When("user click on remove button on the product")
public void user_click_on_remove_button_on_the_product() throws Exception {
    doppage.clickRemoveButton();
}


@Then("verify delivery date is displayed from {int}-{int} days")
public void verify_delivery_date_is_displayed_from_days(Integer int1, Integer int2) throws InterruptedException {
   Thread.sleep(2000);
	doppage.validateDeliveryDate();
	Thread.sleep(3000);
	
}	
}
