package pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LedgerPage {

	private WebDriver driver;
	private By RecentBlogs = By.xpath("//UL[@class='v-pagination theme--light']");

	public LedgerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void validaterecentBlogs() {
		driver.findElement(RecentBlogs).isDisplayed();

	}
	
	public void navigateToLedgerPage() throws InterruptedException
	{
		String currentUrl= driver.getCurrentUrl();
		String ledgerUrl= currentUrl + "ledger";
		System.out.print(ledgerUrl);
		driver.navigate().to(ledgerUrl);
		Thread.sleep(5000);
	}

}
