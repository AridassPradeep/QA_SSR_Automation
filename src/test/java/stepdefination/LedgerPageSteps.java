package stepdefination;

import static org.fest.assertions.api.Assertions.assertThat;

import factory.DriverFactory;
import pages.DirectHomePage;
import pages.LedgerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class LedgerPageSteps {

	private LedgerPage ledgerPage = new LedgerPage(DriverFactory.getDriver());

	@When("^user navigates to ledger page$")
	public void user_navigates_to_ledger_page() throws Throwable {
		ledgerPage.clickPurchaseNow();
		Thread.sleep(2000);
		ledgerPage.navigateToLedgerPage();
		Thread.sleep(4000);
	}

	@When("user navigates to ledger page after payment")
	public void user_navigates_ledger_after_payment() throws Throwable {
		ledgerPage.navigateToLedgerPagAfterPayment();
		Thread.sleep(4000);
	}

	@When("user checks the entry for STO netbanking")
	public void user_checks_entry_sto_netbanking() throws Throwable {
		ledgerPage.checkEntrySTONetbanking();
		Thread.sleep(4000);
	}

	@When("user select the date from in statement")
	public void user_clicks_from_statement() throws Throwable {
		ledgerPage.clickFromStatement();
		Thread.sleep(4000);
	}

	@When("user select payment type in filter")
	public void select_payment_type_filter() throws Throwable {
		ledgerPage.selectPaymentTypeFilter();
		Thread.sleep(4000);
	}

	@When("statement is displayed")
	public void statement_is_displayed() throws Throwable {
		ledgerPage.displayStatementTable();
		Thread.sleep(4000);
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

	@And("user checks the Net balance in CCP")
	public void user_checks_netbalance_ccp() throws Throwable {
		ledgerPage.checkNetBalanceInCCP();
	}

	@And("user checks the limit in CCP")
	public void user_checks_limit_ccp() throws Throwable {
		ledgerPage.checklimitInCCP();
	}

	@And("user checks the balance in CCP")
	public void user_checks_balance_ccp() throws Throwable {
		ledgerPage.checkBalanceInCCP();
	}

	@And("user login to ERP")
	public void userLoginToERP() throws IOException, InterruptedException {
		ledgerPage.erpLogin();
	}

	@And("user checks limit in ERP")
	public void user_check_limit_erp() throws IOException, InterruptedException {
		ledgerPage.checkLimitERP();
	}

	@And("user matches both limits")
	public void user_matches_both_limits() throws IOException, InterruptedException {
		ledgerPage.compareCreditLimit();
	}

	@And("user navigate to ledger page of ERP")
	public void navigateTotLedgerInERP() throws InterruptedException {
		ledgerPage.navigateLedgerERP();
	}

	@And("user clicks on search button in ERP ledger")
	public void enter_search_data_in_erp_ledger() throws InterruptedException {
		ledgerPage.enterSearchDataERPLedger();
	}

	@And("user navigate to BuyerMIS in ERP")
	public void user_navigate_buyerMIS_erp() throws InterruptedException {
		ledgerPage.navigateToBuyerMIS();
	}

	@And("user click search and stores the ledger balance")
	public void click_show_result_erp() throws InterruptedException {
		ledgerPage.clickShowResultERP();
	}

	@And("user matches the net balance")
	public void match_netbalance_from_erp_to_ccp() throws InterruptedException {
		ledgerPage.matchNetLedgerBalanceFromERPToCCP();
	}

	@And("user matches the balance")
	public void match_balance_from_erp_to_ccp() throws InterruptedException {
		ledgerPage.matchLedgerBalanceFromERPToCCP();
	}

	@When("user clicks on view ledger")
	public void user_clicks_on_view_ledger() {
		ledgerPage.clickonLedger();
	}

	@When("user click on View details in ledgerPage")
	public void user_click_on_view_details_in_ledger_page() {
		ledgerPage.clickViewDetails();
	}

	@Then("user can see blocked amount info")
	public void user_can_see_blocked_amount_info() {
		ledgerPage.verifyBlockedInfo();
	}

	@When("user click on email in ledgerPage and sent email")
	public void user_click_on_email_in_ledger_page_and_sent_email() throws InterruptedException {
		ledgerPage.EmailDetails();
	}

	@Then("user can see email sent sucessfully message")
	public void user_can_see_email_sent_sucessfully_message() {
		ledgerPage.verifyEmail();
	}

	@When("switch to ledger window")
	public void switch_to_ledger_window() {
		ledgerPage.switchToLedgerWindow();
	}

}
