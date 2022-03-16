package stepdefination;

import org.junit.Assert;

import factory.DriverFactory;
import pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		//loginPage.clickLoginButton();
	}

	@When("user click  on login by email")
	public void user_click_on_login_by_email() {
		loginPage.clickloginByEmail();
	}

	@When("user enters logins with username with {string} and  {string}")
	public void user_enters_logins_with_username_with_and(String uname, String pwd) {

		loginPage.Login(uname, pwd);
	}

	@When("user clicks on signin")
	public void user_clicks_on_signin() throws InterruptedException {
		loginPage.signIn();
		Thread.sleep(3000);
	}

	@Then("user homepage is displayed")
	public void user_homepage_is_displayed() throws InterruptedException {
		// Assert.assertTrue(loginPage.validateLoginuserMenu());
	}

	@When("user clicks on forgotpassword")
	public void user_clicks_on_forgotpassword() {

		loginPage.clickForgotPassword();

	}

	@Then("forgotpassword popup to be displayed")
	public void forgotpassword_popup_to_be_displayed() {
		Assert.assertTrue(loginPage.validateotptextbox());
	}

	@When("user clicks on register button from login screen")
	public void user_clicks_on_register_button_from_login_screen() {
		loginPage.clicksignInRegister();
	}

	@When("proper alert message is displayed for login screen")
	public void proper_alert_message_is_displayed_for_login_screen() {
		System.out.println(loginPage.validateErrorMessage());
	}

	@When("the Registration button is not displayed after user Login")
	public void the_Registration_button_is_not_displayed_after_user_Login() {
		Assert.assertTrue(loginPage.validateLoginuserMenu());
	}

	@When("user closes the signin popup")
	public void user_closes_the_signin_popup() throws InterruptedException {
		loginPage.closeLoginBox();
	}

	@When("login popup is displayed")
	public void login_poppup_is_displayed() {
		Assert.assertTrue(loginPage.validateLoginPopUp());
	}

	@Then("login button is disabled")
	public void login_button_is_disabled() {
		Assert.assertFalse(loginPage.validateSignInEnabled());
	}

}
