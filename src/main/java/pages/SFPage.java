package pages;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ElementUtil;

public class SFPage {

	private WebDriver driver;

	private By username = By.xpath("//input[@id='username']");
	private By passwordTextBox = By.xpath("//input[@id='password']");
	private By LoginBtn = By.xpath("//input[@id='Login']");
	private By sourceSellerQuote = By.xpath("//label[text()='Source Seller Quote']/following::input");
	private By sucessMsg = By.xpath("//*[text()='Success']");

	public SFPage(WebDriver driver) {
		this.driver = driver;
	}

	public void goToSF() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jswoneplatforms--prdreplica.sandbox.lightning.force.com/lightning/page/home");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(username).sendKeys("v_laxminarayan.jena@jsw.in");
		driver.findElement(passwordTextBox).sendKeys("Ramya@123");
		driver.findElement(LoginBtn).click();
		Thread.sleep(4000);

	}

	public void goToAccounts() {
		//driver.get("https://jswoneplatforms--prdreplica.sandbox.lightning.force.com/lightning/r/Account/0019D00000TfVQ0QAN/view");

		driver.get("https://jswoneplatforms--prdreplica.sandbox.lightning.force.com/lightning/r/Account/0019D00000RMEvhQAH/view");

	}

	public void clickNewOpportunity() {
		driver.findElement(By.xpath("//button[normalize-space()='Quick Opportunity']")).click();
	}

	public void fillSKURequirementDetails() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//button[@title='Add']//lightning-primitive-icon")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search Products...']"))
				.sendKeys("MS HR Sheet 2062:2011 E250A");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search Products...']")).click();
		Thread.sleep(5000);
		ElementUtil.DoubleKeyDownEnter();
		driver.findElement(By.xpath("(//label[text()='Primary Revised Quantity']/following::input)[1]")).sendKeys("5");
		driver.findElement(By.xpath("(//label[text()='Thickness (mm)']/following::input)[1]")).sendKeys("2");
		driver.findElement(By.xpath("//label[text()='Length (mm)']/following::input")).sendKeys("1500");
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[text()='Process Opportunity']")).click();
		driver.findElement(By.xpath("(//button[@title='Show More'])[1]")).click();
		driver.findElement(By.xpath("//button[@aria-label='Delivery Instructions, Select Delivery Instructions']"))
				.click();
		driver.findElement(By.xpath("//*[text()='Self pickup']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Sales Requested Timeline, --None--']")).click();
		driver.findElement(By.xpath("//*[text()='2 days']")).click();
		driver.findElement(By.xpath("(//label[text()='Advance Value']/following::input)[1]")).sendKeys("20000");
		driver.findElement(By.xpath("(//label[text()='Special delivery instructions']/following::input)[1]"))
				.sendKeys("advance");
		driver.findElement(By.xpath("(//label[text()='Width (mm)']/following::input)[1]")).sendKeys("1500");

		driver.findElement(By.xpath("(//label[text()='Final Distributor Quote']/following::input)[1]"))
				.sendKeys("40000");

		driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']")).sendKeys("JSW Steel Vijayanagar");
		ElementUtil.DoubleKeyDownEnter();
		ElementUtil wt = new ElementUtil(driver);
		wt.MigrationUtil(sourceSellerQuote);
		driver.findElement(By.xpath("//label[text()='Source Seller Quote']/following::input")).sendKeys("40000");
		driver.findElement(By.xpath("//label[text()='Source Seller Quote']/following::input")).click();

		WebElement elemnt = driver.findElement(By.xpath("(//button[text()='Save'])[2]"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", elemnt);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		wt.MigrationUtil(sucessMsg);
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Move to awaiting documents']")).click();
		wt.MigrationUtil(sucessMsg);
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//lightning-formatted-text[text()='Awaiting documents']//following::span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Awaiting documents']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Awaiting Payment']")).click();
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		WebElement tdcElement1 = driver
				.findElement(By.xpath("(//span[text()='TDC required?'])[1]//following::input[1]"));
		WebElement tdcElement = driver.findElement(By.xpath("//label[text()='Payment Type']"));
		je.executeScript("arguments[0].scrollIntoView(true);", tdcElement);
		tdcElement1.click();
		Thread.sleep(2000);
		WebElement AdvancePayment = driver.findElement(By.xpath("//span[text()='Direct Opportunity']"));
		je.executeScript("arguments[0].scrollIntoView(true);", AdvancePayment);
		driver.findElement(By.xpath("(//label[text()='Advance Value']/following::input)[1]")).clear();
		driver.findElement(By.xpath("(//label[text()='Advance Value']/following::input)[1]")).sendKeys("15000");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='Process Opportunity']")).click();
		driver.findElement(By.xpath("(//label[text()='Delivery Timeline']/following::input)[1]")).sendKeys("2");
		WebElement saveBtn = driver.findElement(By.xpath("(//button[text()='Save'])[2]"));
		je.executeScript("arguments[0].scrollIntoView(true);",  saveBtn);
		saveBtn.click();
		Thread.sleep(14000);
		saveBtn.click();
		driver.findElement(By.xpath("//button[text()='Create Order']")).click();
		Thread.sleep(14000);
		driver.findElement(By.xpath("(//button[text()='Create Order'])[2]")).click();
		Thread.sleep(140000);
		driver.findElement(By.xpath("//a[contains(text(),'Order')]")).click();
		

	}

}
