package stepdefination.OMS;

import org.testng.Assert;

import factory.DriverFactory;
import pages.OMS.OrderDetailsPage;
import io.cucumber.java.en.Then;

public class OrderDetailPageSteps {

	OrderDetailsPage orderDetailsPage = new OrderDetailsPage(DriverFactory.getDriver());

	@Then("verify payment status is {string}")
	public void verify_payment_status_is(String PaymntStatus) {
		String actualPaymentStatus = orderDetailsPage.verifyPaymentStatus();
		System.out.println(actualPaymentStatus);
		Assert.assertTrue(actualPaymentStatus.contains(PaymntStatus));

	}

	@Then("verify Payment type is {string}")
	public void verify_payment_type_is(String PaymntType) {
		String actualPaymentType = orderDetailsPage.verifyPaymentType();
		System.out.println(actualPaymentType);
		Assert.assertTrue(actualPaymentType.contains(PaymntType));

	}

	@Then("verify buyer cashback")
	public void verify_buyer_cashback() {
		orderDetailsPage.verifyCashBack();
	}

	@Then("verify Ordered value matches with ordersummary value")
	public void verify_ordered_value_matches_with_ordersummary_value() {
		orderDetailsPage.verifyOrderedValue();
	}

}