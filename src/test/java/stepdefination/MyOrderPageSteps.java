package stepdefination;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.MyOrderPages;

public class MyOrderPageSteps {

	MyOrderPages order = new MyOrderPages(DriverFactory.getDriver());

	@When("user is able to click my order button")
	public void user_is_able_to_click_my_order_button() {
		order.getMyOrder().click();
	}

	@When("user is able to click view details button")
	public void user_is_able_to_click_view_details_button() throws InterruptedException {
		order.scrollingDown(order.getScrollViewDetails());
		Thread.sleep(2000);
		order.getViewDetails().click();
	}

	@When("user is able to click view price breakup button to view detailed cost list of the ordered product")
	public void user_is_able_to_click_view_price_breakup_button_to_view_detailed_cost_list_of_the_ordered_product() throws InterruptedException {
		order.scrollingDown(order.getViewPriceBreakup());
		order.getViewPriceBreakup().click();
		Thread.sleep(2000);
	}

	@Then("user is again click the  view price breakup button to close")
	public void user_is_again_click_the_view_price_breakup_button_to_close() throws InterruptedException {
		order.getViewPriceBreakup().click();
		Thread.sleep(2000);
	}

	@When("user is able to click my order")
	public void user_is_able_to_click_my_order() throws InterruptedException {
		order.getMyOrder().click();
		Thread.sleep(2000);
	}

	@When("user is able click need help button")
	public void user_is_able_click_need_help_button() throws InterruptedException {
		order.scrollingDown(order.getNeedHelp());
		Thread.sleep(2000);
		order.getNeedHelp().click();
	}

	@Then("user is able to navigate to need help page")
	public void user_is_able_to_navigate_to_need_help_page() {
		order.validateNeedHelp();

	}

	@When("user is able to click cart icon in home page")
	public void user_is_able_to_click_cart_icon_in_home_page() throws InterruptedException {
	    order.getMyCart().click();
	    Thread.sleep(2000);
	}
	
	@When("user is able to scroll down to view proceed to pay button")
	public void user_is_able_to_scroll_down_to_view_proceed_to_pay_button() throws InterruptedException {
		order.scrollingDown(order.getProceedToPay());
		Thread.sleep(2000);

	}

	@When("user is able to click proceed to pay button")
	public void user_is_able_to_click_proceed_to_pay_button() throws InterruptedException {
		order.getProceedToPay().click();
		Thread.sleep(2000);

	}

	@When("user is able to choose bank list for payment option")
	public void user_is_able_to_choose_bank_list_for_payment_option() throws InterruptedException {
		order.dropDownValue(order.getBankList(), "SBHY");
		Thread.sleep(2000);

	}

	@When("user is able to click paynow button")
	public void user_is_able_to_click_paynow_button() throws InterruptedException {
		order.getPayNow().click();
		Thread.sleep(2000);
	}

	@Then("user is able to navigate to payment page")
	public void user_is_able_to_navigate_to_payment_page() throws InterruptedException {
		order.implicitWaitSec(10);
		order.validateRazorpayPage();
	}

	@When("user is able to click success button on page")
	public void user_is_able_to_click_success_button_on_page() throws InterruptedException {
		order.implicitWaitSec(10);
		order.clickSucessPayment();
		order.implicitWaitSec(5);
	}

	@Then("user is able to view payment successful message on page")
	public void user_is_able_to_view_payment_successful_message_on_page() throws InterruptedException {
		order.implicitWaitSec(15);
		order.validateOrderSuccessfulmsg();
	}

	@Then("user is able to view orde suucess message on page")
	public void user_is_able_to_view_orde_suucess_message_on_page() {
		order.implicitWaitSec(10);
	}

	@When("user is able to click again my order button")
	public void user_is_able_to_click_again_my_order_button() throws InterruptedException {
		order.getMyOrder().click();
		Thread.sleep(2000);
	}

	@When("user is able to click cancel order option for the ordered product")
	public void user_is_able_to_click_cancel_order_option_for_the_ordered_product() throws InterruptedException {
		order.getCancelOrderButton().click();
		Thread.sleep(2000);
	}

	@When("user is able to send remarks and click cancel order button")
	public void user_is_able_to_send_remarks_and_click_cancel_order_button() throws InterruptedException {
		order.getRemarks().sendKeys("Cancel the order");
		Thread.sleep(2000);
		order.getOkButton().click();
		order.implicitWaitSec(10);
	}

	@Then("user is able to view cancelled message")
	public void user_is_able_to_view_cancelled_message() {
	   order.implicitWaitSec(15);
	   
	}
	
	@When("user is able to click my order in home page")
	public void user_is_able_to_click_my_order_in_home_page() {
		order.getMyOrder().click();
	}

	@When("user is able to scroll down and click buy again which was shown in the ordered product")
	public void user_is_able_to_scroll_down_and_click_buy_again_which_was_shown_in_the_ordered_product() throws InterruptedException {
		order.scrollingDown(order.getBuyAgain());
		order.getBuyAgain().click();
		Thread.sleep(2000);

	}

	@When("user is able to choose requirement details and select")
	public void user_is_able_to_choose_requirement_details_and_select() throws InterruptedException {
		order.scrollingDown(order.getDimensionScroll());
		Thread.sleep(2000);
		order.getInput().sendKeys("2");
		Thread.sleep(2000);
		order.getArrow().click();
	}

	@When("user is able to click add to cart")
	public void user_is_able_to_click_add_to_cart() throws InterruptedException {
		order.getAddToCart().click();
		Thread.sleep(2000);;
	}

	@When("user is able to click ok button in the pop of the add to cart button")
	public void user_is_able_to_click_ok_button_in_the_pop_of_the_add_to_cart_button() throws InterruptedException {
		order.getOkCart().click();
		Thread.sleep(2000);

	}

	@When("user is able to click cart icon")
	public void user_is_able_to_click_cart_icon() throws InterruptedException {
		order.getMyCart().click();
		Thread.sleep(2000);

	}

	@When("user is able to scroll down and click proceed to pay button")
	public void user_is_able_to_scroll_down_and_click_proceed_to_pay_button() throws InterruptedException {
		order.scrollingDown(order.getProceedToPay());
		Thread.sleep(2000);
		order.getProceedToPay().click();
	}

	@When("user is able to choose bank in the list")
	public void user_is_able_to_choose_bank_in_the_list() {
		order.dropDownValue(order.getBankList(), "SBHY");

	}

	@When("user is able to click pay now button")
	public void user_is_able_to_click_pay_now_button() throws InterruptedException {
		order.getPayNow().click();
		Thread.sleep(2000);
	}

	@Then("user navigate to RayzorPay page")
	public void user_navigate_to_rayzor_pay_page() throws InterruptedException {
		order.implicitWaitSec(10);
		order.validateRazorpayPage();
	}

	@Then("User is able to click on success button")
	public void user_is_able_to_click_on_success_button() throws InterruptedException {
		order.implicitWaitSec(10);
		order.clickSucessPayment();
		order.implicitWaitSec(2);
	}

	@Then("verify after successful payment navigates to ORDER summary page")
	public void verify_after_successful_payment_navigates_to_order_summary_page() {
		order.implicitWaitSec(15);
		order.validateOrderSuccessfulmsg();
	}

	@Then("user verify your order is confirmed message")
	public void user_verify_your_order_is_confirmed_message() {
		order.implicitWaitMin(5);

	}

	@When("user is able to click again my order option")
	public void user_is_able_to_click_again_my_order_option() {
		order.getMyOrder().click();

	}


}
