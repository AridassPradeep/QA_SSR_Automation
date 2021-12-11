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

	@Given("user is on product detail page of colored item")
	public void user_is_on_product_detail_page_of_colored_item() throws InterruptedException {
		pdpreguser.validatesearchwithcategoryreguser();
		pdpreguser.selectProductreguser();

	}

	@When("user clicks on Add To Cart button available in the right side of the webpage")
	public void user_clicks_on_add_to_cart_button_available_in_the_right_side_of_the_webpage()
			throws InterruptedException {

		pdpreguser.selectDimensionreguser();
		pdpreguser.clickQuantity();
		pdpreguser.clickAddtoCart();

	}

	@Then("verify that the product should be added in the cart")
	public void verify_that_the_product_should_be_added_in_the_cart() throws InterruptedException {

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
	public void user_enters_invalid_custom_length_and_submits_custom_length(String string) {
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
		pdppage.CustomLength(string);
		Thread.sleep(2000);
	}

	@Then("invalid custom length error message to be displayed")
	public void invalid_custom_length_error_message_to_be_displayed() {
		pdppage.validateCustomLengthErrorMessage();
		Assert.assertEquals("Invalid length. Please enter standard length", pdppage.validateCustomLengthErrorMessage());

	}

	@Then("invalid custom length error message should not be displayed")
	public void invalid_custom_length_error_message_should_not_be_displayed() {
		// Assert.assertFalse(pdppage.validateCustomLtErrorMessage());

	}

}
