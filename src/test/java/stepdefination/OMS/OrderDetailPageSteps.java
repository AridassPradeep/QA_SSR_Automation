package stepdefination.OMS;

import org.testng.Assert;

import factory.DriverFactory;
import pages.BlogsPage;
import pages.HomePage;
import pages.ProductPage;
import pages.RegistrationPage;
import pages.OMS.OrderDetailsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderDetailPageSteps {


	OrderDetailsPage orderDetailsPage = new OrderDetailsPage(DriverFactory.getDriver());

	@Then("verify payment status is {string}")
	public void verify_payment_status_is(String string) {
	  
	}
	
	@Then("verify Payment type is {string}")
	public void verify_payment_type_is(String string) {
	   
	}







	

}
