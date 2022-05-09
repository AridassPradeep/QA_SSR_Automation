package stepdefination;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProfilePage;

public class ProfileSteps {

	private ProfilePage profilepage = new ProfilePage(DriverFactory.getDriver());

	@When("user click on the profile menu")
	public void user_clicks_on_profile_menu() throws InterruptedException {
		profilepage.clickMyProfileButton();
	}

	@Then("Dropdown should be lsited")
	public void dropdown_should_be_lsited() {

	}

	@When("user click on the profile submmenu")
	public void user_click_on_the_profile_submmenu() throws InterruptedException {
		profilepage.clickSubProfile();

	}

	@Then("Profile page  should be lsited")
	public void profile_page_should_be_lsited() {

	}

	@When("user clicks on text box  clear the data and add the new designation")
	public void user_clicks_on_text_box_clear_the_data_and_add_the_new_designation() throws InterruptedException {
		profilepage.clickDesignation();
	}

	@Then("Profile should be added with new designation")
	public void profile_should_be_added_with_new_designation() {
		Assert.assertTrue(profilepage.compareTitle());

	}

	@When("user clicks on text box  clear the data and add the new Udyam Number")
	public void user_clicks_on_text_box_clear_the_data_and_add_the_new_udyam_number() throws InterruptedException {
		profilepage.clickUdyam();
	}

	@Then("Profile should be added with new Udyam Number")
	public void profile_should_be_added_with_new_udyam_number() {
		Assert.assertTrue(profilepage.compareTitle());

	}

	@When("user select the industrial sector")
	public void user_select_the_industrial_sector() throws InterruptedException {
		profilepage.clickOption();

	}

	@Then("Profile should be display the interest absed on industrial sector")
	public void profile_should_be_display_the_interest_absed_on_industrial_sector() {
		Assert.assertTrue(profilepage.compareTitle());

	}

	@Then("interest area should be selected")
	public void interest_area_should_be_selected() throws InterruptedException {
		profilepage.clickArea();
	}

	@When("user click the Save button")
	public void user_click_the_save_button() throws InterruptedException {
		profilepage.clickSave();

	}
	
	@When("user click the Cancel button")
	public void user_click_the_cancel_button() throws InterruptedException {
	   profilepage.clickCancel();

	}

	@Then("Profile details should be saved")
	public void profile_details_should_be_saved() {
		Assert.assertTrue(profilepage.compareMsg());

	}

	@Then("user clicks on addresses")
	public void user_clicks_on_addresses() {
		profilepage.clickAddresses();
	}

	@Then("user can delete existing shipping addresses")
	public void user_can_delete_existing_shipping_addresses() {
		profilepage.DeleteAddresses();
	}

	@When("user adds a new adresses and fill all details and save it")
	public void user_adds_a_new_adresses_and_fill_all_details_and_save_it() throws InterruptedException {
		profilepage.cancelNewAddress();
		Thread.sleep(3000);
		profilepage.addAddress();
		Thread.sleep(3000);
		
	}

	@Then("addrees is displayed in shipping address column")
	public void addrees_is_displayed_in_shipping_address_column() {

	}

	@Then("address is mentioned in manage address column")
	public void address_is_mentioned_in_manage_address_column() {

	}

	@Then("user clicks on edit billing address")
	public void user_clicks_on_edit_billing_address() {

	}

	@Then("edit company adress")
	public void edit_company_adress() {

	}

}
