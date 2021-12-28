package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DirectOrderPage {
	private WebDriver driver;
	
	private By quantity = By.xpath("//input[@class='input-quant']");
	private By buyfromverified = By.xpath("//button[@id=\"direct-distributor-switch\"]");
	private By directlyfromJSW = By.xpath("//button[@id=\"direct-distributor-switch\"]//span//span");
	private By myrequirements = By.xpath("(//a[@class='links'])[2]");
	private By requestprice = By.xpath("(//button[@id='direct-order-request-price'])[1]");
	private By viewrequirementlist = By.xpath("//span[text()='View requirements list']");
	private By requestforprice = By.xpath("//button[@class='btn purchase-button primary']");
	private By requirementTab = By.xpath("(//a[@role='tab'])[1]");
	private By quantitybutton = By.xpath("//button[@class='btn btn-quant']");
	private By message = By.xpath("(//*[@class='mt-14'])");
	private By deliverydate = By.xpath("//span[contains(text(),'30 - 45 days')]");
	public DirectOrderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void validateBuyFromVerified()
	{
		driver.findElement(buyfromverified).isDisplayed();
		
		
	}
	
	public void clickBuyFromVerified()
	{
		driver.findElement(buyfromverified).click();
		
	}
	
	public void validateDirectlyfromJSW()
	{
		driver.findElement(directlyfromJSW).isDisplayed();
	}
	 public void clickDirectlyfromJSW()
	 {
		 
		 driver.findElement(directlyfromJSW).click();
	 }
	
	public void validateMyRequirements()
	{
		driver.findElement(myrequirements).isDisplayed();
	}
	
	public void enterQuantity50() throws InterruptedException {

		driver.findElement(quantity).sendKeys("50");
		Thread.sleep(3000);

	}
	
	
	public void validateRequestPrice()
	{
		
		driver.findElement(requestprice).isDisplayed();
	}
	
	
	public void clickRequestPrice()
	{
		
		driver.findElement(requestprice).click();
	}
	

	public void validateViewRequirementList()
	{
		
		driver.findElement(viewrequirementlist).isDisplayed();
		
	}
	
	public void clickViewRequirementsList()
	{
		
		driver.findElement(viewrequirementlist).click();
	}
	
	public void clickQuantity() {
		driver.findElement(quantitybutton).click();

	}

	
	
public void validateRequestforPrice()
{
	driver.findElement(requestforprice).isDisplayed();
}
	
	
public void clickRequestforPrice()
{
	driver.findElement(requestforprice).click();
}


public void validateRequirementTab()
{
	
	driver.findElement(requirementTab).isDisplayed();
}

public void validateMessage()
{
driver.findElement(message).isDisplayed();	
}
public void clickMyRequirements()
{
	driver.findElement(By.xpath("//a[text()='My requirements']")).click();
}
 public void validateEmptyRequirement()
 {
	 
	 driver.findElement(By.xpath("//div[@class='empty-content text-center']")).isDisplayed();
 }

public void clickRemoveButton() throws Exception
{
	
	while (!isElementPresentemptycart()) {
	
	driver.findElement(By.xpath("(//a[@role='button'])")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='remove_item_btn primary']")).click();
	Thread.sleep(2000);
	}
	
}


	//driver.findElement(By.xpath("(//a[@role='button'])")).isDisplayed();
	public  boolean isElementPresent() throws Exception 
	{
		try {
			driver.findElement(By.xpath("(//a[@role='button'])"));
			return true;
		} catch (Exception e) {
			return false;	
		}
		
	}


	public boolean isElementPresentemptycart() throws Exception {
		try {
			driver.findElement((By.xpath("//div[@class='empty-content text-center']")));
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public void validateDeliveryDate()
	{
		driver.findElement(deliverydate).isDisplayed();
		
	}


}




