package stepdefination;

import org.junit.Assert;

import pages.LoginPage;
import pages.ProductPage;
import factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPageSteps {

	ProductPage productpage = new ProductPage(DriverFactory.getDriver());


	@Then("user click on hot rolled sheet")
	public void user_click_on_hot_rolled_sheet() throws InterruptedException {

		Thread.sleep(6000);
		productpage.clickOnHotRolledSheets();
	}

	@Then("user click on product from listing page")
	public void user_click_on_product_from_listing_page() throws InterruptedException {

		Thread.sleep(5000);
		productpage.clickOnproductfromListingPage();

	}

}
