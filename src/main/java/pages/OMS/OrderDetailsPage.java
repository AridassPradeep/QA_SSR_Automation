package pages.OMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderDetailsPage {

	private WebDriver driver;
	private By PaymentStatus = By.xpath("//p[text()='Payment status']//parent::div[1]//following::div[3]//p");
	private By PaymentType = By.xpath("//p[text()='Payment type']//parent::div[1]//p[2]");

	public OrderDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String verifyPaymentStatus()
	{
		String payementStatus=driver.findElement(PaymentStatus ).getText();
		return payementStatus;
	}
	
	public String verifyPaymentType()
	{
		String payementType=driver.findElement(PaymentType ).getText();
		return payementType;
	}
	
	public void verifyCashBack()
	{
		driver.findElement(By.xpath("//p[text()='₹200.00 (per MT)']")).isDisplayed();
	}
	
	public void verifyPIPO() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Verify PI/PO']//preceding::input[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Update'])[2]")).click();
		Thread.sleep(2500);
		driver.navigate().refresh();
	}
	
	public String verifyOrderStatus() {
		String OrderStatusValue=driver.findElement(By.xpath("//p[text()='Order status']//following::div[1]//input")).getAttribute("value");
		return OrderStatusValue;
		
	}


	
	
	




}
