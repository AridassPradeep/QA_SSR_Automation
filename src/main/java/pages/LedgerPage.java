package pages;

import factory.DriverFactory;
import org.fest.assertions.api.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import util.ElementUtil;

import java.io.IOException;
import java.sql.Driver;
import java.text.NumberFormat;
import java.text.ParseException;

public class LedgerPage {
	String erpCreditLimit;
	String ccpLimit;
	String ledgerBalanceInERP;
	String ledgerNetBalanceInCCP;
	String ledgerBalanceInCCP;
	double parsedERPBalance;

	private WebDriver driver;
	Paymentpage paymentpage = new Paymentpage();
	private By RecentBlogs = By.xpath("//UL[@class='v-pagination theme--light']");
	private By FromRequestStatement = By.xpath("(//input[@id='request-ledger-statement-from-mobile'])[2]");
	private By ToRequestStatement = By.xpath("(//input[@id='request-ledger-statement-to-mobile'])[2]");
	private By Request = By.xpath("//button[@id='request-ledger-statement-submit-btn']");
	private By Download = By.xpath("//div[normalize-space()='Download']");
	//ERP
	private By googleLogin = By.xpath("//*[text()='Login with Google']");
	private By emailTextBox = By.xpath("//input[@type='email']");
	private By nextBtn = By.xpath("//span[normalize-space()='Next']");
	private By passwordBox = By.xpath("//input[@type='password']");

	public LedgerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void validaterecentBlogs() {
		driver.findElement(RecentBlogs).isDisplayed();

	}

	public void navigateToLedgerPage() throws InterruptedException {
		String currentUrl = driver.getCurrentUrl();
		String ledgerUrl = currentUrl + "ledger";
		System.out.print(ledgerUrl);
		driver.navigate().to(ledgerUrl);
		Thread.sleep(5000);
	}

	public void checkEntrySTONetbanking(){
		String latestNetBankingEntry = driver.findElement(By.xpath("")).getText();
		double parsedLatestNetBankingEntry = parseCurrencyValue(latestNetBankingEntry);
		String orderAmountNetBanking = Paymentpage.orderAmountOnNetBanking;
		System.out.println(orderAmountNetBanking);
		System.out.println(latestNetBankingEntry);
		double parsedOrderAmountNetBanking = parseCurrencyValue(orderAmountNetBanking);
		Assert.assertEquals(parsedOrderAmountNetBanking, parsedLatestNetBankingEntry, 0.01);
	}

	public String validateLedgerPage() {
		return driver.findElement(By.xpath("(//*[text()='Ledger'])[2]")).getText();
	}

	public void clickFromStatement(){
		driver.findElement(By.xpath("(//input[@id='request-ledger-statement-from-mobile'])[1]")).click();
		String targetFromDateLabel = "November 1, 2023";
		driver.findElement(By.xpath("//span[@aria-label='" + targetFromDateLabel + "']")).click();
		driver.findElement(By.xpath("(//input[@id='request-ledger-statement-to-mobile'])[1]")).click();
		String targetToDateLabel = "November 2, 2023";
		driver.findElement(By.xpath("(//span[@aria-label='November 2, 2023'])[2]")).click();
		driver.findElement(Request).click();
	}

	public void requestStatement() {
		driver.findElement(FromRequestStatement).click();
		String targetFromDateLabel = "November 1, 2023";
		driver.findElement(By.xpath("//span[@aria-label='" + targetFromDateLabel + "']")).click();
		driver.findElement(ToRequestStatement).click();
		String targetToDateLabel = "November 2, 2023";
		driver.findElement(By.xpath("(//span[@aria-label='November 2, 2023'])[2]")).click();
		driver.findElement(Request).click();
	}

	public void validateMsg() {
		String msg = driver.findElement(By.xpath("//*[text()='Ledger request sent']")).getText();
		System.out.println("Message" + msg);
	}

	public void selectPaymentTypeFilter() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Payment type']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(., 'Cash advance')]/input[@type='checkbox']")).click();
		Thread.sleep(2000);
	}

	public void displayStatementTable(){
		driver.findElement(By.xpath("(//table[@class='table table-borderless mb-0']/tbody/tr[@class='desktop-row'])[1]")).isDisplayed();
	}

	public void validatePreviousStatement() {
		ElementUtil obj = new ElementUtil(driver);
		obj.scrollUp();
		driver.findElement(By.xpath("//th[normalize-space()='Transaction details']")).isDisplayed();
		driver.findElement(By.xpath("//th[normalize-space()='Order ID']")).isDisplayed();
		driver.findElement(By.xpath("//th[normalize-space()='Amount']")).isDisplayed();
		driver.findElement(By.xpath("//th[normalize-space()='Balance']")).isDisplayed();
		driver.findElement(By.xpath("//th[normalize-space()='Date & time']")).isDisplayed();

	}

	public void validateDownload() {
		driver.findElement(Download).isEnabled();
		driver.findElement(Download).click();
	}

	public String validateCompanyNameAndGSTNo() {
		driver.findElement(By.xpath("//*[text()='ALFALOGIC SOLUTIONS INDIA PRIVATE LIMITED']")).isDisplayed();
		String GstNo = driver
				.findElement(By.xpath("//*[text()='ALFALOGIC SOLUTIONS INDIA PRIVATE LIMITED']//following::div[1]"))
				.getText();
		return GstNo;

	}

	public void erpLogin() throws InterruptedException, IOException {
		driver.get("https://qa-oms.msme.jswone.in/oauth2/redirect?token=eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhYWthc2gucHJhc2FkQGpzdy5pbiIsImF1dGgiOiJST0xFX1VTRVIiLCJpYXQiOjE2OTg3MzA0NDUsImV4cCI6MTcwMTMyMjQ0NX0.-8oXQpG38pi0FUxdW_jLs35Epu_k8BQyYXajD41YJ19N5Y7WAsQgFZBhbyvhdhZ5HivpmiD9YnReNfpeuFwQKA");
		Thread.sleep(3000);
	}

	public void checkLimitERP(){
		driver.get("https://qa-oms.msme.jswone.in/credit-limit/AAFCD0915M");
		erpCreditLimit = driver.findElement(By.xpath("(//p[starts-with(., '₹')])[5]")).getText();
	}

	public void compareCreditLimit(){
		double parsedERPCreditLimit = parseCurrencyValue(erpCreditLimit);
		double parsedCcpLimit = parseCurrencyValue(ccpLimit);
		Assert.assertEquals(parsedCcpLimit, parsedERPCreditLimit, 0.01);
	}

	public void checkNetBalanceInCCP(){
		ledgerNetBalanceInCCP = driver.findElement(By.xpath("//div[contains(text(), \"Net balance:\")]/following-sibling::div[starts-with(., '₹')]")).getText();
	}

	public void checklimitInCCP(){
		ccpLimit = driver.findElement(By.xpath("(//div[starts-with(., '₹')])[3]")).getText();
	}

	public void checkBalanceInCCP(){
		ledgerBalanceInCCP = driver.findElement(By.xpath("//div[contains(text(), \"Balance:\")]/following-sibling::div[starts-with(., '₹')]")).getText();
	}

	public void navigateLedgerERP() throws InterruptedException {
		Thread.sleep(5999);
		//driver.findElement(By.xpath("//*[@data='/assets/ledger.svg']")).click();
		WebElement element = driver.findElement(By.xpath("//*[@data='/assets/ledger.svg']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);


	}

	public void navigateToBuyerMIS(){
		driver.findElement(By.xpath("//button[contains(text(), 'Buyer ledger')]")).click();
	}

	public void enterSearchDataERPLedger() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"search-bar\"]")).sendKeys("27AAFCD0915M1ZL");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(), 'DUNZO DIGITAL PRIVATE LIMITED')]")).click();
		Thread.sleep(2000);
	}

	public void clickShowResultERP() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(), 'Show results')]")).click();
		Thread.sleep(3000);
		ledgerBalanceInERP = driver.findElement(By.xpath("(//p[starts-with(., '₹')])[2]")).getText();
		System.out.println("ERP ledger Balance "+ledgerBalanceInERP);
		parsedERPBalance = parseCurrencyValue(ledgerBalanceInERP);
	}

	public void matchNetLedgerBalanceFromERPToCCP(){
		double parsedCCPNetBalance = parseCurrencyValue(ledgerNetBalanceInCCP);
		System.out.println("CCP Balance"+ parsedCCPNetBalance);
		System.out.println("ERP Balance"+ parsedERPBalance);
		Assert.assertEquals(parsedERPBalance,parsedCCPNetBalance,0.01);
	}

	public void matchLedgerBalanceFromERPToCCP(){
		double parsedCCPBalance = parseCurrencyValue(ledgerBalanceInCCP);
		System.out.println(parsedERPBalance);
		//double parsedERPMISBalance = parseCurrencyValue(ledgerMISBalanceERP);
		Assert.assertEquals(parsedERPBalance,parsedCCPBalance,0.01);
	}

	// currency converter
	public static double parseCurrencyValue(String currencyValue) {
		// Remove currency symbol "₹" and commas, then parse into a double
		String cleanedValue = currencyValue.replaceAll("[₹,]", "");
		try {
			return NumberFormat.getInstance().parse(cleanedValue).doubleValue();
		} catch (ParseException e) {
			e.printStackTrace();
			return 0.0; // Handle parsing error as needed
		}
	}

	public void clickonLedger() {

		driver.findElement(By.xpath("//button[normalize-space()='View ledger']")).click();
		ElementUtil obj = new ElementUtil(driver);
		obj.SwitchWindow(1);
	}

	public void clickViewDetails() {

		driver.findElement(By.xpath("//span[@role='button']")).click();
	}

	public void verifyBlockedInfo() {

		driver.findElement(By.xpath("//*[text()='Blocked amount info']")).isDisplayed();
	}
	
	public void EmailDetails() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("v_laxminarayan.jena@jsw.in");
		driver.findElement(By.xpath("(//button[@id='share-ledger'])[2]")).click();
	}
	
	public void verifyEmail()
	{
		String sucessmsg=driver.findElement(By.xpath("//div[@class='email-send-success-container']//span")).getText();
		System.out.println(sucessmsg);
	}
	
	public void switchToLedgerWindow() {
		ElementUtil obj = new ElementUtil(driver);
		obj.SwitchWindow(1);
	}

}
