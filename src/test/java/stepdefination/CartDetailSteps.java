package stepdefination;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartDetailPage;
import pages.PDPDiscountPage;
import pages.Paymentpage;

public class CartDetailSteps {
	PDPDiscountPage pdpdispage = new PDPDiscountPage(DriverFactory.getDriver());
	Paymentpage pmtpage = new Paymentpage(DriverFactory.getDriver());
CartDetailPage cartdpage=new CartDetailPage(DriverFactory.getDriver());


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
   Thread.sleep(2000);
	cartdpage.clickCheckbox();
}


@Then("verify delivery is by {int}-{int} days")
public void verify_delivery_is_by_days(Integer int1, Integer int2) {
	cartdpage.validateDeliveryDate();
}
}
