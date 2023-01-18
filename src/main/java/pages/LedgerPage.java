package pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LedgerPage {

	private WebDriver driver;
	private By RecentBlogs = By.xpath("//UL[@class='v-pagination theme--light']");
	private By FromRequestStatement = By.xpath("//input[@id='request-ledger-statement-from-mobile']");
	private By ToRequestStatement = By.xpath("//input[@id='request-ledger-statement-to-mobile']");
	private By Request = By.xpath("//button[@id='request-ledger-statement-submit-btn']");
	private By Download = By.xpath("(//button[@class='text-btn'])[1]");

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
		driver.findElement(FromRequestStatement).sendKeys("12112021");
		driver.findElement(ToRequestStatement).sendKeys("12122022");
		driver.findElement(Request).click();
	}

	public void validateMsg() {
		String msg = driver.findElement(By.xpath("//*[text()='Ledger request sent']")).getText();
		System.out.println("Message" + msg);
	}

	public void validatePreviousStatement() {
		driver.findElement(By.xpath(
				"//div[@class='typography-h5 typography-md-h3 typography-font-semibold typography-font-md-bold']"))
				.isDisplayed();

	}

	public void validateDownload() {
		driver.findElement(Download).isEnabled();
	}
	
	public String validateCompanyNameAndGSTNo() {
		driver.findElement(By.xpath("//*[text()='ICICI BANK LIMITED']")).isDisplayed();
		String GstNo=driver.findElement(By.xpath("//*[text()='ICICI BANK LIMITED']//following::div[1]")).getText();
		return GstNo;
		
	}
	
	
	public void clickonLedger() {
		
		driver.findElement(By.xpath("//button[normalize-space()='View Ledger']")).click();
	}
	
	
	


}
