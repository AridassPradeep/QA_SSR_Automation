package pages.OMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderDetailsPage {

	private WebDriver driver;
	private By PaymentStatus = By.xpath("//p[text()='Payment status']//parent::div[1]//following::div[3]//p");

	public OrderDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String verifyPaymentStatus()
	{
		String payementStatus=driver.findElement(PaymentStatus ).getText();
		return payementStatus;
	}
	
	public void verifyPaymentType()
	{
		
	}


	
	
	




}
