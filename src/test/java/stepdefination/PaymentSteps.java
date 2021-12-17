package stepdefination;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PDPRegisteredUserPage;
import pages.PDPpage;
import pages.Paymentpage;

public class PaymentSteps {
	Paymentpage pmtpage = new Paymentpage(DriverFactory.getDriver());
	PDPRegisteredUserPage pdpreguser = new PDPRegisteredUserPage(DriverFactory.getDriver());

	@When("cart is empty or not")
	public void cart_is_empty_or_not() throws Exception {
		if (pmtpage.isElementPresent())

		{

			pmtpage.deleteProductfromCart();
		}
	}

	@When("user click on Buy Now")
	public void user_click_on_buy_now() throws InterruptedException {

		Thread.sleep(3000);
		pmtpage.clickBuyNow();
	}

	@When("user click on proceed to pay on cart detail page")
	public void user_click_on_proceed_to_pay_on_cart_detail_page() {
		pmtpage.validatecartdetailpage();
		pmtpage.clickproceedtopay();
	}

	@When("user enter quantity as 30MT")
	public void user_enter_quantity_as_30mt() throws InterruptedException {

		pmtpage.selectDimension();

		pmtpage.enterQuantity30();
		pdpreguser.clickQuantity();
	}

	@When("user is on product detail page of hot rolled product")
	public void user_is_on_product_detail_page_of_hot_rolled_product() throws InterruptedException {
		pmtpage.selectProduct();
	}

	@When("user select bank name to transfer from the drop down on payment page")
	public void user_select_bank_name_to_transfer_from_the_drop_down_on_payment_page() {
		pmtpage.validateBankList();
		pmtpage.clickBankList();
	}

	@Then("verify bank is selected")
	public void verify_bank_is_selected() throws InterruptedException {
		pmtpage.validateBankSelected();
		pmtpage.selectBank();
	}

	@When("user click on {string} on cart detail page")
	public void user_click_on_on_cart_detail_page(String string) {

	}
	
	@Then("User click on PayNow")
	public void user_click_on_pay_now() throws InterruptedException {
		
		pmtpage.clickPayNow();
		Thread.sleep(9000);
	}


	@Then("User navigates to RazorPay Page")
	public void user_navigates_to_razor_pay_page() {
	    pmtpage.validateRazorpayPage();
	}
	@Then("User click on success button")
	public void user_click_on_success_button() throws InterruptedException {
		
		pmtpage.clickPaymentSucess();
		Thread.sleep(16000);
	   
	}
	@Then("User click on failure button")
	public void user_click_on_failure_button() throws InterruptedException {
		pmtpage.clickPaymentFailure();
		Thread.sleep(16000);
	}

	@Then("order sucessfully placed message should be displayed")
	public void order_sucessfully_placed_message_should_be_displayed() {
		 pmtpage.validateOrderSuccessfulmsg();
	}


	@Then("Verify user navigates to payment gateway page")
	public void verify_user_navigates_to_payment_gateway_page() {
                 
	}

	@Then("verify error message should be displayed on unsuccessful payment")
	public void verify_error_message_should_be_displayed_on_unsuccessful_payment() throws InterruptedException {
     Thread.sleep(2000);
		pmtpage.validateunsuccessfulmsg();
	}

	@Then("verify after successful payment page navigates to ORDER summary page")
	public void verify_after_successful_payment_page_navigates_to_order_summary_page() {
		 pmtpage.validateOrderSuccessfulmsg();
	}

	@When("user enter quantity and dimensions")
	public void user_enter_quantity_and_dimensions() throws InterruptedException {
		pmtpage.selectDimensionreguser2();
		pmtpage.enterQuantity30();
		pdpreguser.clickQuantity();
	}

}
