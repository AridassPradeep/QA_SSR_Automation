package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage {

	private WebDriver driver;

	private By RecentBlogs = By.xpath("//UL[@class='v-pagination theme--light']");
	private By OrderNumber = By.xpath("//div[normalize-space()='Order number']//following::div[1]");
	private By Ordertotal = By.xpath("//*[normalize-space()='Order total']//following::div[1]");
	private By PaymentReceived = By.xpath("//*[normalize-space()='Payment received']//following::div[1]");
	private By DeliveryType = By.xpath("//*[normalize-space()='Delivery type']//following::div[1]");
	private By PendingPayment = By.xpath("//*[normalize-space()='Pending payment']//following::div[1]");

	public OrderSummaryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void validaterecentBlogs() {
		driver.findElement(RecentBlogs).isDisplayed();

	}
	
	public String validateOrderDetails()
	{
		driver.findElement(OrderNumber).isDisplayed();
		driver.findElement(Ordertotal).isDisplayed();
		driver.findElement(PaymentReceived).isDisplayed();
		driver.findElement(PendingPayment).isDisplayed();
		String deliveryType =driver.findElement(DeliveryType).getText();
		return deliveryType;
		
	}

}
