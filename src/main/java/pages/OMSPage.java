package pages;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import util.ElementUtil;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class OMSPage {

	private WebDriver driver;

	private By googleLogin = By.xpath("//*[text()='Login with Google']");
	private By emailTextBox = By.xpath("//input[@type='email']");
	private By nextBtn = By.xpath("//span[normalize-space()='Next']");
	private By passwordBox = By.xpath("//input[@type='password']");
	private By TrackShipments = By.xpath("//button[normalize-space()='Track shipments']");
	String orderno = Paymentpage.orderno;
	String SForderno = SFPage.SFOrderNo;
	// String orderno = "JOO-8CR5PH91";

	public OMSPage(WebDriver driver) {
		this.driver = driver;
	}

	public void goToOMS() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://qa-oms.msme.jswone.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(googleLogin).click();
		driver.findElement(emailTextBox).sendKeys("qatestuser@jsw.in");
		Thread.sleep(1000);
		driver.findElement(nextBtn).click();
		Thread.sleep(4000);
		driver.findElement(passwordBox).sendKeys("Admin@123$");
		Thread.sleep(2000);
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);

	}

	public void goToOMSShipmentPage() throws InterruptedException, AWTException {

		driver.get("https://qa-oms.msme.jswone.in/order-list/?filterValue=today");
		Thread.sleep(3000);
		String xpath1 = "//a[normalize-space()='";
		String xpath2 = "']";
		driver.findElement(By.xpath(xpath1 + orderno + xpath2)).click();
		Thread.sleep(3000);
		ElementUtil obj = new ElementUtil(driver);
		obj.SwitchWindow(1);

		driver.findElement(By.xpath("//*[text()='Shipments']")).click();
		Thread.sleep(3000);

	}
	
	public void goToOMSOrderDetailsPageCreatedFromSF() throws InterruptedException, AWTException {

		driver.get("https://qa-oms.msme.jswone.in/order-list/?filterValue=today");
		Thread.sleep(3000);
		String xpath1 = "//a[normalize-space()='";
		String xpath2 = "']";
		driver.findElement(By.xpath(xpath1 + SForderno  + xpath2)).click();
		Thread.sleep(3000);
		ElementUtil obj = new ElementUtil(driver);
		obj.SwitchWindow(1);
		Thread.sleep(3000);

	}

	public void createCompletedShipment() throws InterruptedException, AWTException

	{
		driver.findElement(By.xpath("//button[normalize-space()='Create shipment']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='Seller name'])[1]//parent::div[1]")).click();
		driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();

		String totalOrderqty = driver.findElement(By.xpath("//*[text()='Total order qty']//following::td[2]"))
				.getText();

		String totalOrderqtynumber = totalOrderqty.substring(0, totalOrderqty.indexOf(" "));
		System.out.println("totalOrderqty" + totalOrderqtynumber);
		Thread.sleep(2500);
		driver.findElement(By.xpath("//*[text()='Quantity']//following::td[4]//input")).sendKeys(totalOrderqtynumber);

		driver.findElement(By.xpath("(//*[text()='Scheduled dispatch date'])[1]//following::div[1]//input"))
				.sendKeys(ElementUtil.date(2));

		driver.findElement(By.xpath("//span[normalize-space()='Delivery type']//following::div[1]")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Delivery']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space()='Shipment no.']")).click();
		driver.findElement(By.xpath("((//*[text()='Planned'])[2]//parent::div[1])[1]")).click();
		driver.findElement(By.xpath("//*[text()='Ready for dispatch']")).click();
		driver.findElement(By.xpath("(//*[text()='Dispatch date'])[2]//following::div[1]//input"))
				.sendKeys(ElementUtil.date(2));
		driver.findElement(By.xpath("//*[text()='Delivery date']//following::div[1]//input"))
				.sendKeys(ElementUtil.date(4));
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();

		driver.findElement(By.xpath("//*[text()='Shipment status']//following::div[1]")).click();
		driver.findElement(By.xpath("//*[text()='Dispatched']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();

		driver.findElement(By.xpath("//*[text()='Shipment status']//following::div[1]")).click();
		driver.findElement(By.xpath("//*[text()='Delivered']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();

		driver.findElement(By.xpath("//*[text()='Shipment status']//following::div[1]")).click();
		driver.findElement(By.xpath("//*[text()='Invoiced']")).click();

		driver.findElement(By.xpath("//*[text()='Invoice No.']//following::div[1]//input")).sendKeys("123");
		driver.findElement(By.xpath("//*[text()='Invoice No.']//following::div[3]//input")).sendKeys("123");

		driver.findElement(By.xpath("(//*[text()='Quantity invoiced']//following::div[3]//div[1]//input)[1]"))
				.sendKeys(totalOrderqtynumber);
		driver.findElement(By.xpath("(//*[text()='Quantity invoiced']//following::div[3]//div[1]//input)[2]"))
				.sendKeys(totalOrderqtynumber);

		driver.findElement(By.xpath("//*[text()='Invoice date']//following::div[1]//input"))
				.sendKeys(ElementUtil.date(4));
		driver.findElement(By.xpath("//*[text()='Invoice date']//following::div[6]//input"))
				.sendKeys(ElementUtil.date(4));

		Thread.sleep(5000);
		WebElement fileUploadButton = driver.findElement(By.xpath("//*[text()='Invoices']//following::div[1]//p"));
		fileUploadButton.click();

		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\invoice.pdf";
		ElementUtil.UploadFile(filePath);
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		Thread.sleep(10000);
		ElementUtil scrl = new ElementUtil(driver);
		scrl.scrollUp();

		driver.findElement(By.xpath("//*[text()='Shipment status']//following::div[1]")).click();
		driver.findElement(By.xpath("//*[text()='Completed']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Order details']")).click();

		Thread.sleep(5000);
		WebElement selectedOption = driver
				.findElement(By.xpath("//*[text()='Order status']//following::div[1]//input"));
		String selectedValue = selectedOption.getAttribute("value");
		;
		System.out.println("Order status" + selectedValue);
		String expectedValue = "Delivered";
		if (selectedValue.equals(expectedValue)) {
			System.out.println("Order status is correct ie Delivered");
		} else {
			System.out.println("Order status is incorrect is not delivered.");
		}

	}

	public void createMultiShipment() throws InterruptedException, AWTException

	{

		for (int i = 0; i < 2; i++) {
			driver.findElement(By.xpath("//button[normalize-space()='Create shipment']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()='Seller name'])[1]//parent::div[1]")).click();
			driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();

			String totalOrderqty = driver.findElement(By.xpath("//*[text()='Total order qty']//following::td[2]"))
					.getText();

			String totalOrderqtynumber = totalOrderqty.substring(0, totalOrderqty.indexOf(" "));
			System.out.println("totalOrderqty" + totalOrderqtynumber);

			Thread.sleep(2500);
			if (i == 0) {
				driver.findElement(By.xpath("//*[text()='Quantity']//following::td[4]//input")).sendKeys("1");
				driver.findElement(By.xpath("(//*[text()='Scheduled dispatch date'])[1]//following::div[1]//input"))
						.sendKeys(ElementUtil.date(2));

			} else {
				driver.findElement(By.xpath("//*[text()='Quantity']//following::td[4]//input")).sendKeys("1");
				driver.findElement(By.xpath("(//*[text()='Scheduled dispatch date'])[2]//following::div[1]//input"))
						.sendKeys(ElementUtil.date(2));

			}
			Thread.sleep(2500);

			driver.findElement(By.xpath("//span[normalize-space()='Delivery type']//following::div[1]")).click();
			driver.findElement(By.xpath("//li[normalize-space()='Delivery']")).click();

			driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
			Thread.sleep(2000);
		}

	}

	public void navigateToshipMentsPageCCP() throws InterruptedException {
		driver.get("https://qa-ssr.msme.jswone.in/order-summary?order_num=" + orderno);
		Thread.sleep(5000);
		ElementUtil obj = new ElementUtil(driver);
//		obj.MigrationUtil(TrackShipments);
//		driver.findElement(By.xpath("//button[normalize-space()='Track shipments']")).click();
//		driver.findElement(By.xpath("//th[normalize-space()='Shipment ID']")).isDisplayed();
//		driver.findElement(By.xpath("//a[@class='typography-font-bold typography-text-primary-main']")).click();
//		Thread.sleep(5000);
		// driver.findElement(By.xpath("//p[normalize-space()='Delivered']")).isDisplayed();

	}

	public void navigateToViewDocuments() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='View documents']")).click();
		driver.findElement(By.xpath(
				"//*[@class='typography-sub-heading typography-md-h5 typography-font-semibold d-inline-block ml-2']"))
				.click();
		Thread.sleep(5000);
	}

	public void navigateToshipmentDetailsPage() throws InterruptedException {
		driver.get("https://qa-oms.msme.jswone.in/order-list/JOO-7P23W9AS?tab=shipments");
		driver.findElement(By.xpath("//*[normalize-space()='Shipment no.']")).click();
	}
	
	public void navigateToDeliveredshipmentDetailsPage() throws InterruptedException {
		driver.get("https://qa-oms.msme.jswone.in/order-list/JOO-7P23W9AS?tab=shipments");
		driver.findElement(By.xpath("//*[normalize-space()='Shipment no.']")).click();
	}
	
	public void navigateToinvoicedshipmentDetailsPage() throws InterruptedException {
		driver.get("https://qa-oms.msme.jswone.in/order-list/JOO-FVWWQJUI?tab=shipments");
		driver.findElement(By.xpath("//*[normalize-space()='Shipment no.']")).click();
	}

	public void uploadsMultiinvoices() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		WebElement fileUploadButton = driver.findElement(By.xpath("//*[text()='Invoices']//following::div[1]//p"));
		fileUploadButton.click();
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\invoice.pdf";
		ElementUtil.UploadFile(filePath);
		fileUploadButton.click();
		String filePath1 = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\invoice2.pdf";
		ElementUtil.UploadFile(filePath1);
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();

	}

	public void deleteAllInvoicesUploaded() throws InterruptedException {
		ElementUtil obj = new ElementUtil(driver);
		obj.scrollDown();
		driver.findElement(By.xpath("(//p[normalize-space()='Invoices']//following::div[1]//p)[2]")).click();
		List<WebElement> deleteBtn = driver.findElements(By.xpath("//img[@alt='Trash icon']"));
		System.out.println(deleteBtn.size());
		for (int i = 0; i < deleteBtn.size(); i++) {
			driver.findElement(By.xpath("//img[@alt='Trash icon']")).click();
			Thread.sleep(5000);
		}

	}
	
	public void clickAttachments() throws InterruptedException {
		ElementUtil obj = new ElementUtil(driver);
		obj.scrollDown();
		driver.findElement(By.xpath("(//p[normalize-space()='Invoices']//following::div[1]//p)[2]")).click();
		List<WebElement> deleteBtn = driver.findElements(By.xpath("//img[@alt='Trash icon']"));
		System.out.println(deleteBtn.size());
		for (int i = 0; i < deleteBtn.size(); i++) {
			driver.findElement(By.xpath("//img[@alt='Trash icon']")).click();
			Thread.sleep(5000);
		}

	}
	
	public void deleteInvoicesinInvoicedShipment() throws InterruptedException {
		ElementUtil obj = new ElementUtil(driver);
		obj.scrollDown();
		driver.findElement(By.xpath("(//p[normalize-space()='Invoices']//following::div[1]//p)[2]")).click();
		List<WebElement> deleteBtn = driver.findElements(By.xpath("//img[@alt='Trash icon']"));
		System.out.println(deleteBtn.size());
		for (int i = 0; i < deleteBtn.size(); i++) {
			driver.findElement(By.xpath("//img[@alt='Trash icon']")).click();
		}

	}
	
	public String validateDeleteMSG(String ErrorMSG)
	{
		String xpath1="//*[contains(text(),'";
		String xpath2="')]";
		String xpath3=xpath1+ErrorMSG+xpath2;		
		String actualMsg= driver.findElement(By.xpath(xpath3)).getText();
		System.out.println(actualMsg);
		return actualMsg;
		
	}
	
	
	
	public void updatePartialHold()
	{
		ElementUtil obj = new ElementUtil(driver);
		obj.scrollDown();
		driver.findElement(By.xpath("//*[text()='Partial hold']//preceding::span[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter the hold amount']")).sendKeys("10000");
		driver.findElement(By.xpath("//*[text()='Invoice comment']/following::textarea[1]")).sendKeys("partial hold");
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
	}
	
	public String verifyPaymentStatus()
	{
		String paymentStatus=driver.findElement(By.xpath("//p[text()='Payment status']//following::p[1]")).getText();
		System.out.println("paymentStatus " + paymentStatus);
		return paymentStatus;
	}
	
	public String verifyAdvanceAmount()
	{
		String advanceAmount=driver.findElement(By.xpath("//p[text()='Advance amount']/following-sibling::p")).getText();
		System.out.println("advanceAmount" + advanceAmount) ;
		return advanceAmount;
	}
	
	public String verifyFullPaymentRequestMsg()
	{
		String FullPaymentRequestMsg=driver.findElement(By.xpath("//div[text()[normalize-space()='Please pay the required amount as per the payment request']]")).getText();
		System.out.println("paymentStatus " + FullPaymentRequestMsg);
		return FullPaymentRequestMsg;
	}
	
	public void navigatePaymentTab()
	{
		driver.findElement(By.xpath("//button[text()='Payments']")).click();
	}
	
	public void selectPaymentType(String paymentRequestType) throws InterruptedException
	{
		String pendingAmt=driver.findElement(By.xpath("//p[text()='Pending amount']/following-sibling::p")).getText();
		driver.findElement(By.xpath("//button[text()='Request payment']")).click();
		driver.findElement(By.xpath("(//span[text()='Payment type'])[2]//following::div[1]")).click();
		String xpath1="//li[@data-value='";
		String xpath2="']";
		driver.findElement(By.xpath(xpath1+paymentRequestType+xpath2)).click();
		if(paymentRequestType.equals("PART"))
		{
			driver.findElement(By.xpath("//input[@type='number']")).sendKeys("2000");
		}
		else
		{
			driver.findElement(By.xpath("//input[@type='number']")).sendKeys(pendingAmt);
		}
		
		driver.findElement(By.xpath("//button[text()='Send request']")).click();
		
	}
	
	
	

}
