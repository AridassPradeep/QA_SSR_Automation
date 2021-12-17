package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Paymentpage {

	private WebDriver driver;
	private By quantity = By.xpath("//input[@class='input-quant']");
	private By alldimensions = By.xpath("//li[contains(@class,'product-list')]");
	private By buynow = By.xpath("//button[@class='btn cart-btn-primary']");
	private By proceedtopay = By.xpath("//button[@class='proceed-to-pay primary']");
	// private By proceedtopay = By.xpath("//button[@class='btn m-3
	// purchase-button']");
	private By banklist = By.xpath("//select[@id='BanksList']");
	private By remove = By.xpath("//a[@role='button']");
	private By confirmremove = By.xpath("//input[@class='remove_item_btn']");
	private By messagecartempty = By.xpath("//div[@class='empty-content text-center']");
	// private By count1 = By.xpath("//div[@class='count' and text()=1]");
	private By cartcount = By.xpath("//div[@class='count']");
	private By productselect = By.xpath("//div[@class='product-plp1 col-sm-12 col-xxl-4']");
	private By payNow = By.xpath("//button[@class='btn btn-red']");
	private By Success = By.xpath("//button[@class='success']");
	private By successmessage = By.xpath("//div[@class='success-order-title']");
	private By unsuccessmessage = By.xpath("//div[@class='alert alert-danger error-alert']");
	// private By onlycart =
	// By.xpath("//*[@id=\"__layout\"]/div/header/div[1]/div[3]/a/img");

	public Paymentpage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickBuyNow() {

		driver.findElement(buynow).click();

	}

	public void validatecartdetailpage() {

		driver.findElement(proceedtopay).isDisplayed();
	}

	public void clickproceedtopay() {
		driver.findElement(proceedtopay).click();
	}

	public void validateBankList() {
		driver.findElement(banklist).isDisplayed();
	}

	public void clickBankList() {

		WebElement dropdown = driver.findElement(banklist);
		Select select = new Select(dropdown);
		select.selectByVisibleText("Bank of India");

	}

	public void validateBankSelected() {
		// driver.findElement(banklist).isSelected();
	}

	public void deleteProductfromCart() throws Exception

	{

		driver.findElement(cartcount).click();

		while (!isElementPresentemptycart()) {

			driver.findElement(remove).click();
			Thread.sleep(2000);
			driver.findElement(confirmremove).click();
			Thread.sleep(2000);
		}

	}

	public boolean isElementPresent() throws Exception {
		try {
			driver.findElement(cartcount);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean isElementPresentemptycart() throws Exception {
		try {
			driver.findElement(messagecartempty);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public void selectDimension() throws InterruptedException {
		List<WebElement> alldimensions2 = driver.findElements(alldimensions);
		int i = driver.findElements(alldimensions).size();
		System.out.println(i);
		// Thread.sleep(3000);
		alldimensions2.get(5).click();
		alldimensions2.get(10).click();
		alldimensions2.get(7).click();
		// alldimensions2.get(8).click();

	}

	public void selectDimensionreguser2() throws InterruptedException {
		List<WebElement> alldimensions2 = driver.findElements(alldimensions);
		int i = driver.findElements(alldimensions).size();
		System.out.println(i);
		Thread.sleep(3000);
		alldimensions2.get(9).click();
		// alldimensions2.get(1).click();
		alldimensions2.get(13).click();
		alldimensions2.get(15).click();

	}

	public void enterQuantity30() throws InterruptedException {

		driver.findElement(quantity).sendKeys("30");
		Thread.sleep(3000);

	}

	public void selectProduct() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> productselected = driver.findElements(productselect);

		productselected.get(0).click();
	}

	public void selectBank() throws InterruptedException {
		Thread.sleep(3000);
		Select bank = new Select(driver.findElement(By.id("BanksList")));
		bank.selectByVisibleText("Catholic Syrian Bank");

	}

	public void clickPayNow() {
		driver.findElement(payNow).click();

	}

	public void clickPaymentSucess() {
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> ar = new ArrayList<String>(handles);
		driver.switchTo().window(ar.get(1));
		driver.findElement(By.xpath("//button[@class='success']")).click();

	}

	public void clickPaymentFailure() {
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> ar = new ArrayList<String>(handles);
		driver.switchTo().window(ar.get(1));
		driver.findElement(By.xpath("//button[@class='danger']")).click();

	}

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
			driver.findElement(Success).isDisplayed();
		}

	}

	public void validateOrderSuccessfulmsg() {
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> ar = new ArrayList<String>(handles);
		driver.switchTo().window(ar.get(0));
		driver.findElement(successmessage).isDisplayed();
	}

	public void validateunsuccessfulmsg() {

		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> ar = new ArrayList<String>(handles);
		driver.switchTo().window(ar.get(0));
		driver.findElement(unsuccessmessage).isDisplayed();

	}

}
