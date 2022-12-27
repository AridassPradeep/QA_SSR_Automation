package stepdefination;

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

    @Then("^validating ledger statement$")
    public void validating_ledger_statement() throws Throwable {
       
    }

    @Then("^validating ledger balance$")
    public void validating_ledger_balance() throws Throwable {
        
    }

    @Then("^validate time format$")
    public void validate_time_format() throws Throwable {
        
    }

    @Then("^validate ledger statement balance and last statement balance to be same$")
    public void validate_ledger_statement_balance_and_last_statement_balance_to_be_same() throws Throwable {
        
    }

    @Then("^validate user is able to download ledger statement$")
    public void validate_user_is_able_to_download_ledger_statement() throws Throwable {
        
    }

    @Then("^validate view more button$")
    public void validate_view_more_button() throws Throwable {
        
    }

    @Then("^validate datetime, transaction details,ortderid ,transaction id ,amount and balance$")
    public void validate_datetime_transaction_detailsortderid_transaction_id_amount_and_balance() throws Throwable {
        
    }

    @And("^validate refresh button is working and time is updated$")
    public void validate_refresh_button_is_working_and_time_is_updated() throws Throwable {
        
    }


	
}
