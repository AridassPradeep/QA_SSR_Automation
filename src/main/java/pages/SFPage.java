package pages;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.ElementUtil;

public class SFPage {

	private WebDriver driver;

	private By username = By.xpath("//input[@id='username']");
	private By passwordTextBox = By.xpath("//input[@id='password']");
	private By LoginBtn = By.xpath("//input[@id='Login']");

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
		driver.get(
				"https://jswoneplatforms--prdreplica.sandbox.lightning.force.com/lightning/r/Account/0019D00000RMEvhQAH/view");

	}

	public void clickNewOpportunity() {
		driver.findElement(By.xpath("//button[normalize-space()='Quick Opportunity']")).click();
	}

	public void fillSKURequirementDetails() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//button[@title='Add']//lightning-primitive-icon")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search Products...']")).sendKeys("MS HR Sheet 2062:2011 E250A");
		ElementUtil.enter();
		Thread.sleep(5000);		
		driver.findElement(By.xpath("(//lightning-layout-item[contains(@class,'slds-p-around_small slds-col')])[1]")).click();
		driver.findElement(By.xpath("//*[text()='MS HR Sheet 2062:2011 E250A']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()='Primary Revised Quantity']/following::input)[1]")).sendKeys("5");
		driver.findElement(By.xpath("(//label[text()='Thickness (mm)']/following::input)[1]")).sendKeys("2");
		driver.findElement(By.xpath("//label[text()='Length (mm)']/following::input")).sendKeys("1500");
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[text()='Process Opportunity']")).click();
		driver.findElement(By.xpath("(//button[@title='Show More'])[1]")).click();
		driver.findElement(By.xpath("//button[@aria-label='Delivery Instructions, Select Delivery Instructions']")).click();
	    driver.findElement(By.xpath("//*[text()='Self pickup']")).click();
	    driver.findElement(By.xpath("//button[@aria-label='Sales Requested Timeline, --None--']")).click();
	    driver.findElement(By.xpath("//*[text()='2 days']")).click();
	    driver.findElement(By.xpath("(//label[text()='Advance Value']/following::input)[1]")).sendKeys("20000");
	    driver.findElement(By.xpath("(//label[text()='Special delivery instructions']/following::input)[1]")).sendKeys("advance");
	    driver.findElement(By.xpath("(//label[text()='Width (mm)']/following::input)[1]")).sendKeys("1500");
	    
	    
	    driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']")).sendKeys("JSW Steel Vijayanagar");
		ElementUtil.enter();
		Thread.sleep(5000);		
		driver.findElement(By.xpath("(//lightning-grouped-combobox[@class='slds-form-element slds-has-error']//label)[2]")).click();
		driver.findElement(By.xpath("//*[text()='JSW Steel Vijayanagar']")).click();
		Thread.sleep(2000);
	    
		
		
		
		
		
		
		
		Thread.sleep(5000);
		
	}

}
