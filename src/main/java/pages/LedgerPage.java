package pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import util.ElementUtil;

public class LedgerPage {

	private WebDriver driver;
	private By RecentBlogs = By.xpath("//UL[@class='v-pagination theme--light']");
	private By FromRequestStatement = By.xpath("//input[@id='request-ledger-statement-from-mobile']");
	private By ToRequestStatement = By.xpath("//input[@id='request-ledger-statement-to-mobile']");
	private By Request = By.xpath("//button[@id='request-ledger-statement-submit-btn']");
	private By Download = By.xpath("//div[normalize-space()='Download']");

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
	
	public String validateLedgerPage()
	{
		return driver.findElement(By.xpath("(//*[text()='Ledger'])[2]")).getText();
	}

	public void requestStatement() {
		driver.findElement(FromRequestStatement).sendKeys("10052023");
		driver.findElement(ToRequestStatement).sendKeys("25052023");
		driver.findElement(Request).click();
	}

	public void validateMsg() {
		String msg = driver.findElement(By.xpath("//*[text()='Ledger request sent']")).getText();
		System.out.println("Message" + msg);
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
		String GstNo=driver.findElement(By.xpath("//*[text()='ALFALOGIC SOLUTIONS INDIA PRIVATE LIMITED']//following::div[1]")).getText();
		return GstNo;
		
	}
	
	
	public void clickonLedger() {
		
		driver.findElement(By.xpath("//button[normalize-space()='View Ledger']")).click();
	}
	
	
	


}
