package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyOrderPages {
	private WebDriver driver;
	
	String expectedStatus = "Your order has been successfully placed";
	String cartEmptyMessage = "Your cart is empty.";
	String orderCancelMessage = "Your Order has been cancelled. Any amount charged will be refunded in\r\n"
			+ "        5-7 working days";
	
	@FindBy(xpath = "//div[@class='cancel-order-message']")
	private WebElement cancelMge;
	
//------------------- View details & Need help ------------------------	
	@FindBy(xpath = "//*[@id=\'__layout\']/div/header/div[1]/div[3]/div[4]/a")
	private WebElement myOrder;
	@FindBy(xpath = "(//div[text()='Order Status'])[1]")
	private WebElement scrollViewDetails;
	@FindBy(xpath = "(//div[@class='view-details mt-0'])[4]")
	private WebElement viewDetails; 
	@FindBy(xpath = "//button[@id='dropdownMenuButton']")
	private WebElement viewPriceBreakup;
	@FindBy(xpath = "(//a[text()='Need help '])[1]")
	private WebElement needHelp;
	
//------------------- Buy again & Cancel order -----------------------	
	@FindBy(className = "view-details mt-0")
	private WebElement viewOrderDetails;
	@FindBy(className = "btn btn-light-blue")
	private WebElement cancelOrder;
	@FindBy(className = "ok-button")
	private WebElement okCancel;
	@FindBy(xpath = "//button[@class='need-help-order mt-custom']")
	private WebElement buyAgain;
	@FindBy(xpath = "//div[text()='Select dimensions']")
	private WebElement dimensionScroll;
	@FindBy(xpath = "//*[@id=\'Product-Overview\']/div[2]/div[2]/div/div[2]/div[9]/div[2]/input")
	private WebElement input;
	@FindBy(id = "5-10")
	private WebElement coilWeight0;
	@FindBy(id = "10-22")
	private WebElement coilWeight1;
	@FindBy(id = "22-27")
	private WebElement coilWeight2;
	@FindBy(xpath = "//button[@class='btn btn-quant']")
	private WebElement arrow;
	@FindBy(xpath = "//button[@class='btn cart-btn-secondary']")
	private WebElement addToCart;
	@FindBy(xpath =  "//button[@class='ok-button']")
	private WebElement okCart;
	@FindBy(xpath =  "//button[@class='btn cart-btn-primary']")
	private WebElement buyNow;
	@FindBy(xpath = "(//img[@alt='cart'])[1]")
	private WebElement myCart;
	@FindBy(xpath = "//span[text()='Proceed to pay']")
	private WebElement proceedToPay;
	@FindBy(id = "BanksList")
	private WebElement bankList;
	@FindBy(xpath = "//button[@class='btn btn-red']")
	private WebElement payNow;
	@FindBy(xpath = "//span[text()='CANCEL ORDER']")
	private WebElement cancelOrderButton;
	@FindBy(xpath = "//textarea[@placeholder='Enter remarks']")
	private WebElement remarks;
	@FindBy(xpath = "//*[@id=\'cancel-order___BV_modal_body_\']/div[4]/button")
	private WebElement OkButton;
	@FindBy(xpath = "//button[@class='success']")
	private WebElement successPayment;
	@FindBy(xpath = "//div[@class='success-order-title']")
	private WebElement successMge;
		
	public MyOrderPages(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public void validateCancelmge() {
		driver.findElement((By) cancelMge).isDisplayed();
		return;
	}

	public void clickSucessPayment() {
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> ar = new ArrayList<String>(handles);
		driver.switchTo().window(ar.get(1));
		driver.findElement(By.xpath("//button[text()='Success']")).click();
		return;
	}
	// /html/body/form/button[1]
	
	public void validateRazorpayPage()

	{
		Set<String> windows = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		windows.remove(parent);
		Iterator<String> it = windows.iterator();
		String child = null; // This is for referencing specific child window
		while (it.hasNext()) {
			child = (String) it.next();
			driver.switchTo().window(child);
			driver.findElement(By.xpath("//button[@class='success']")).isDisplayed();
		}
		return;
	}

	public void validateOrderSuccessfulmsg() {
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> ar = new ArrayList<String>(handles);
		driver.switchTo().window(ar.get(0));
		driver.findElement(By.xpath("//div[@class='success-order-title']")).isDisplayed();
		return;
	}
	
	public void scrollingDown(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView()", element);
			return;
		}
	
	public void dropDownValue(WebElement element, String colour) {
		Select s = new Select(element);
		s.selectByValue(colour);
		return;
	}
	
	public void implicitWaitSec(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		return;
	}
	
	public void implicitWaitMin(long min) {
		driver.manage().timeouts().implicitlyWait(min, TimeUnit.MINUTES);
		return;
	}
	
	public void validateNeedHelp() {
		driver.findElement(By.xpath("//div[@class='help-container']")).isDisplayed();
		return;
	}
	
	

	public WebElement getSuccessPayment() {
		return successPayment;
	}

	public WebElement getSuccessMge() {
		return successMge;
	}

	public WebElement getDimensionScroll() {
		return dimensionScroll;
	}

	public String getExpectedStatus() {
		return expectedStatus;
	}

	public String getCartEmptyMessage() {
		return cartEmptyMessage;
	}

	public String getOrderCancelMessage() {
		return orderCancelMessage;
	}

	public WebElement getCancelMge() {
		return cancelMge;
	}

	public WebElement getMyOrder() {
		return myOrder;
	}

	public WebElement getScrollViewDetails() {
		return scrollViewDetails;
	}

	public WebElement getViewDetails() {
		return viewDetails;
	}

	public WebElement getViewPriceBreakup() {
		return viewPriceBreakup;
	}

	public WebElement getNeedHelp() {
		return needHelp;
	}

	public WebElement getViewOrderDetails() {
		return viewOrderDetails;
	}

	public WebElement getCancelOrder() {
		return cancelOrder;
	}

	public WebElement getOkCancel() {
		return okCancel;
	}

	public WebElement getBuyAgain() {
		return buyAgain;
	}

	public WebElement getCoilWeight0() {
		return coilWeight0;
	}

	public WebElement getCoilWeight1() {
		return coilWeight1;
	}

	public WebElement getCoilWeight2() {
		return coilWeight2;
	}

	public WebElement getInput() {
		return input;
	}

	public WebElement getArrow() {
		return arrow;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getOkCart() {
		return okCart;
	}

	public WebElement getBuyNow() {
		return buyNow;
	}

	public WebElement getMyCart() {
		return myCart;
	}

	public WebElement getProceedToPay() {
		return proceedToPay;
	}

	public WebElement getBankList() {
		return bankList;
	}

	public WebElement getPayNow() {
		return payNow;
	}

		public WebElement getCancelOrderButton() {
		return cancelOrderButton;
	}

	public WebElement getRemarks() {
		return remarks;
	}

	public WebElement getOkButton() {
		return OkButton;
	}

	
	
}
