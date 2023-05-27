package stepdefination;

import static org.fest.assertions.api.Assertions.assertThat;

import factory.DriverFactory;
import pages.LedgerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LedgerPageSteps {

	private LedgerPage ledgerPage = new LedgerPage(DriverFactory.getDriver());

	@When("^user navigates to ledger page$")
	public void user_navigates_to_ledger_page() throws Throwable {
		ledgerPage.navigateToLedgerPage();
	}

	@Then("^verify user navigates to ledger page$")
	public void Verifyuser_navigates_to_ledger_page() throws Throwable {
		assertThat(ledgerPage.validateLedgerPage()).contains("Ledger");
	}

	@Then("^user request date for specific period$")
	public void user_request_date_for_specific_period() throws Throwable {
		ledgerPage.requestStatement();
	}

	@Then("^validate Ledger request sent message is displayed$")
	public void validate_ledger_request_sent_message_is_displayed() throws Throwable {
		ledgerPage.validateMsg();
	}

	@And("^validate previous statement is displayed$")
	public void validate_previous_statement_is_displayed() throws Throwable {
		ledgerPage.validatePreviousStatement();
	}

	@And("^validate user is able to download ledger statement$")
	public void validate_user_is_able_to_download_ledger_statement() throws Throwable {
		ledgerPage.validateDownload();
	}

	@And("^validate companyname and GSTNo")
	public void validate_companyname_andGSTNo() throws Throwable {
		ledgerPage.validateCompanyNameAndGSTNo();
		assertThat(ledgerPage.validateCompanyNameAndGSTNo()).contains("(33AAGCA4932L2ZM)");
	}

	@When("user clicks on view ledger")
	public void user_clicks_on_view_ledger() {
		ledgerPage.clickonLedger();
	}

}
