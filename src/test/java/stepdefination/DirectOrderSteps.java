package stepdefination;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DirectOrderPage;
import pages.PDPDiscountPage;


public class DirectOrderSteps {
	DirectOrderPage doppage = new DirectOrderPage(DriverFactory.getDriver());
	PDPDiscountPage pdpdispage = new PDPDiscountPage(DriverFactory.getDriver());
	

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

	
	
	
	
	
	
	
	
}
