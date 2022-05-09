package stepdefination;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import pages.PDPRegisteredUserPage;
import pages.PDPpage;

public class PDPRegisteredUserSteps {
	PDPRegisteredUserPage pdpreguser = new PDPRegisteredUserPage(DriverFactory.getDriver());
	PDPpage pdppage = new PDPpage(DriverFactory.getDriver());

	@Given("user is logged in as registered user")
	public void user_is_logged_in_as_registered_user() {
		pdpreguser.validateLogin();

	}
	
	@Given("user is on product detail page of hotrolled item")
	public void user_is_on_product_detail_page_of_hotrolled_item() throws InterruptedException {
		//pdpreguser.validatesearchwithcategoryreguser();
		pdpreguser.selectProductreguser();

	}

	@Given("user is on product detail page of colored item")
	public void user_is_on_product_detail_page_of_colored_item() throws InterruptedException {
		//pdpreguser.validatesearchwithcategoryreguser();
		pdpreguser.selectProductreguser();

	}

	@When("user clicks on Add To Cart button available in the right side of the webpage")
	public void user_clicks_on_add_to_cart_button_available_in_the_right_side_of_the_webpage()
			throws InterruptedException {

		//pdpreguser.selectThicknessWidthLength();
		//pdpreguser.clickQuantity();
		pdpreguser.clickAddtoCart();

	}
	
	@When("user clicks on Add To Cart button available")
	public void user_clicks_on_add_to_cart_button_available()
			throws InterruptedException {

		pdpreguser.clickQuantity();
		pdpreguser.clickAddtoCart();

	}
	
	

	@Then("verify that the product should be added in the cart")
	public void verify_that_the_product_should_be_added_in_the_cart() throws InterruptedException {
               Thread.sleep(2000);
		pdpreguser.validateAddedtoCart();

	}

	@Given("user select wire rod")
	public void user_select_wire_rod() {
		pdpreguser.selectWireRod();
		pdpreguser.selectProductreguserwirerod();

	}

	@Then("verify the product dimension should be diameter")
	public void verify_the_product_dimension_should_be_diameter() {
		pdpreguser.validateDiameter();
	}

	@When("user selects the product attributes")
	public void user_selects_the_product_attributes() throws InterruptedException {
		pdpreguser.selectDimensionreguser();
	}

	@When("user click on quantity button")
	public void user_click_on_quantity_button() {
		pdpreguser.clickQuantity();
	}

	@Then("verify user can see the Price details inclusive of Taxes")
	public void verify_user_can_see_the_price_details_inclusive_of_taxes() {

		pdpreguser.validateTotalPrice();

	}

	@When("user enters invalid Custom Length {string} and  submits custom length")
	public void user_enters_invalid_custom_length_and_submits_custom_length(String string) throws InterruptedException {
		
		pdppage.CustomLength("80000");
	}

	@Then("Please select thickness and width before submitting error message to be displayed")
	public void please_select_thickness_and_width_before_submitting_error_message_to_be_displayed() {

		pdppage.validateCustomLengthErrorMessage();
		Assert.assertEquals("Please select thickness and width before submitting",
				pdppage.validateCustomLengthErrorMessage());
	}

	@When("user enters less than minimum  Custom Length {string} and  submits custom length")
	public void user_enters_less_than_minimum_custom_length_and_submits_custom_length(String string)
			throws InterruptedException {
		pdpreguser.selectDimensionHRPO();
		Thread.sleep(1000);
		pdppage.CustomLengthwithlength(string);
		Thread.sleep(2000);
	}
	@When("user enters less than minimum  Custom Length {string} and  submits custom length for HR")
	public void user_enters_less_than_minimum_custom_length_and_submits_custom_length_for_HR(String string)
			throws InterruptedException {
		pdpreguser.selectDimensionHR();
		Thread.sleep(1000);
		pdppage.CustomLengthwithlength(string);
		Thread.sleep(2000);
	}


	@Then("invalid custom length error message to be displayed")
	public void invalid_custom_length_error_message_to_be_displayed() {
		pdppage.validateCustomLengthErrorMessage();
		Assert.assertEquals("Invalid length. Please enter standard length", pdppage.validateCustomLengthErrorMessage());

	}

	
	@Then("invalid custom length error message to be displayed with length")
	public void invalid_custom_length_error_message_to_be_displayed_with_length() {
		pdppage.validateCustomLengthErrorMessage2();
		Assert.assertEquals("Invalid length. Please enter standard length", pdppage.validateCustomLengthErrorMessage2());

	}

	
	@Then("invalid custom length error message should not be displayed")
	public void invalid_custom_length_error_message_should_not_be_displayed() {
		// Assert.assertFalse(pdppage.validateCustomLtErrorMessage());

	}
	
	
	@Given("user is on product detail page of cold rolled sheets")
	public void user_is_on_product_detail_page_of_cold_rolled_sheets() throws InterruptedException {
		pdpreguser.selectProductcoldrolled();
	}

	@Given("deal is visible")
	public void deal_is_visible() throws InterruptedException {
		Thread.sleep(2000);
	   pdpreguser.validateDealPill();
	}

	@When("user click on deal")
	public void user_click_on_deal() {
	   pdpreguser.clickDealPill();
	}

	@Then("verify lowest price seller is displayed")
	public void verify_lowest_price_seller_is_displayed() throws InterruptedException {
	   Thread.sleep(2000);
		pdpreguser.validateLowestPriceSeller();
		
	}

	@Then("verify best price is displayed on right side")
	public void verify_best_price_is_displayed_on_right_side() {
	    pdpreguser.validateBestPrice();
	}

	@Then("verify dimensions are selected")
	public void verify_dimensions_are_selected() {
		Assert.assertEquals(true, pdpreguser.checkDimensionSelected());
		
		
	}
	
	@When("user select dimensions same as deal")
	public void user_select_dimensions_same_as_deal() throws InterruptedException {
	    pdpreguser.selectDimensionDeal();
	}

	@Then("deal pill gets clicked")
	public void deal_pill_gets_clicked() {
	    pdpreguser.validatedealPillclicked();
	}
	
	@Given("user is on product detail page of Stainless Steel item")
	public void user_is_on_product_detail_page_of_stainless_steel_item() throws InterruptedException {
		pdpreguser.stainlessSteelDetails();
	    
	}
	
	@Given("user is on product detail page of Steel item")
	public void user_is_on_product_detail_page_of_steel_item() throws InterruptedException {
		pdpreguser.SteelDetails();
	    
	}


@Given("user is on product detail page of HRPO item")
public void user_is_on_product_detail_page_of_hrpo_item() throws InterruptedException {
	pdpreguser.HRPODetails();
    
}

@Given("user is on product detail page of HR Sheet item")
public void user_is_on_product_detail_page_of_HRSheet_item() throws InterruptedException {
	pdpreguser.HRSteelDetails();
    
}



	

}
