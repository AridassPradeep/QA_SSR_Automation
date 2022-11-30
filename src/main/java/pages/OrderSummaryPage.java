package pages;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Assert;
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
	private By NotificationText = By.xpath("//div[@class='notification-text']");
	private By BeneficiaryName = By.xpath(
			"//div[@id='pay-via-section-desktop']//p[@class='label'][normalize-space()='Beneficiary name']//following::p[1]");
	private By NEFTRTGS = By
			.xpath("//div[@id='pay-via-section-desktop']//div[@class='neft-section']//p[@class='title']");
	private By AccountNumber = By.xpath(
			"//div[@id='pay-via-section-desktop']//p[@class='label'][normalize-space()='Account Number']//following::p[1]");
	private By IFSCCode = By.xpath(
			"//div[@id='pay-via-section-desktop']//p[@class='label'][normalize-space()='IFSC Code']//following::p[1]");

	private By NetBanking = By.xpath(
			"//div[@id='pay-via-section-desktop']//button[@class='pay-via-netbanking-button'][normalize-space()='Pay via netbanking']");

	public OrderSummaryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void validaterecentBlogs() {
		driver.findElement(RecentBlogs).isDisplayed();

	}

	public String validateOrderDetails() {
		driver.findElement(OrderNumber).isDisplayed();
		driver.findElement(Ordertotal).isDisplayed();
		driver.findElement(PaymentReceived).isDisplayed();
		driver.findElement(PendingPayment).isDisplayed();
		String deliveryType = driver.findElement(DeliveryType).getText();
		return deliveryType;

	}

	public String validateOrderAwaitingMessage() {

		String OrderAwaitingMessage = driver.findElement(NotificationText).getText();
		return OrderAwaitingMessage;

	}

	public void validateNetBankingAndNeft() {

		driver.findElement(BeneficiaryName).isDisplayed();
		driver.findElement(NEFTRTGS).isDisplayed();
		driver.findElement(AccountNumber).isDisplayed();
		driver.findElement(IFSCCode).isDisplayed();

		String Beneficiaryname = driver.findElement(BeneficiaryName).getText();
		assertThat(Beneficiaryname.contentEquals("JSW One Platforms Limited"));

		String AcountNumber = driver.findElement(AccountNumber).getText();
		assertThat(AcountNumber.contentEquals("1112220052340710"));

		String IFSCode = driver.findElement(IFSCCode).getText();
		assertThat(IFSCode.contentEquals("RAZR0000001"));

	}

	public void validateMinimiseOfItemDetails() {
		driver.findElement(By.xpath("//i[@class='fa fa-angle-down']")).isDisplayed();
		driver.findElement(By.xpath("//i[@class='fa fa-angle-down']")).click();
		driver.findElement(By.xpath("//div[@class='itemsList']//div//i[@class='fa fa-angle-up']")).isDisplayed();

	}

	public void validateNetBankingDisabled() {
		if (driver.findElement(NetBanking).isEnabled()) {
			Assert.fail("netbanking is enabled");
		} else {
			System.out.println("netbanking is disabled");
		}

	}

}
