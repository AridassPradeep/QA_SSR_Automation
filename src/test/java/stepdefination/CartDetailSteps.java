package stepdefination;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartDetailPage;
import pages.MyOrderPages;
import pages.PDPDiscountPage;
import pages.PDPRegisteredUserPage;
import pages.Paymentpage;

public class CartDetailSteps {
	PDPDiscountPage pdpdispage = new PDPDiscountPage(DriverFactory.getDriver());
	Paymentpage pmtpage = new Paymentpage(DriverFactory.getDriver());
	CartDetailPage cartdpage = new CartDetailPage(DriverFactory.getDriver());
	MyOrderPages myOrder = new MyOrderPages(DriverFactory.getDriver());
	PDPRegisteredUserPage pdp = new PDPRegisteredUserPage(DriverFactory.getDriver());

	@When("user click on Cart icon on homepage")
	public void user_click_on_cart_icon_on_homepage() {
		cartdpage.clickCart();
	}

	@When("user click on Terms&condition on cart detail page")
	public void user_click_on_terms_condition_on_cart_detail_page() {
		cartdpage.validateTandC();
		cartdpage.clickTandC();

	}

	@Then("Verify Terms&condition page is displayed with some text")
	public void Verify_terms_condition_page_is_displayed_with_some_text() {
		cartdpage.validateTandCpage();

	}

	@When("user clicks on OK cart")
	public void user_clicks_on_ok_cart() throws InterruptedException {
		pdpdispage.validateitemAddedinCart();
	}

	@Then("Verify {string} is displayed below Proceed to pay button")
	public void verify_is_displayed_below_proceed_to_pay_button(String string) {
		cartdpage.validateTechSpec();

	}

	@When("user click on pickup checkbox")
	public void user_click_on_pickup_checkbox() throws InterruptedException {
		cartdpage.clickCheckbox();
	}

	@Then("verify delivery is by {int}-{int} days")
	public void verify_delivery_is_by_days(Integer int1, Integer int2) {
		cartdpage.validateDeliveryDate();
	}
	// Discount

	@When("user is on cart page")
	public void user_is_on_cart_page() throws InterruptedException {
		Thread.sleep(5000);
		cartdpage.clickCart();
		cartdpage.validateCartPage();
		Thread.sleep(2000);
	}

	@Then("user is able to apply STEEL250 coupon code")
	public void user_is_able_to_apply_steel250_coupon_code() throws InterruptedException {
		cartdpage.applySteel250();
		Thread.sleep(2000);
	}

	@When("user is removed products from cart line")
	public void user_is_removed_products_from_cart_line() throws InterruptedException {
		myOrder.couponsCount();
		Thread.sleep(2000);
		cartdpage.removeProduct();
	}

	@Then("User shall see modified pricing of the cart")
	public void user_shall_see_modified_pricing_of_the_cart() {
		cartdpage.priceverification();
	}

	@Then("Applied coupons remain active if applicable to the modified cart context")
	public void applied_coupons_remain_active_if_applicable_to_the_modified_cart_context() throws InterruptedException {
		cartdpage.validateAppliedCoupons();
	}

	@Then("Applied coupons remain in active if applicable to the modified cart context")
	public void applied_coupons_remain_in_active_if_applicable_to_the_modified_cart_context()
			throws InterruptedException {
		cartdpage.validateApplyCoupons();
	}

	@Then("Count of applied coupons remains the same")
	public void count_of_applied_coupons_remains_the_same() {
		myOrder.couponsCount();
	}

	@When("user is on second product detail page of Steel item")
	public void user_is_on_second_product_detail_page_of_Steel_item() throws InterruptedException {
		pdp.HRSteelDetails01();
	}

}
