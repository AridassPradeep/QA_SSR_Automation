package pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProfilePage {
	private WebDriver driver;

	
	private By MyProfileButton = By.xpath("//header[@id='drop-down-head']");
	private By SubMenu = By.linkText("Profile");
	private By Designation = By.id("usr");
	private By Udyam = By.name("udyam");
	private By Options = By.xpath("//option[contains(text(),'Select an option')]");
	private By Msg = By.xpath("//div[contains(text(),'Your changes have been saved.')]");
	private By Title = By.xpath("//div[contains(text(),'My Profile')]");
	private By Addresses = By.xpath("//*[text()='Addresses']");
	private By DeleteAddress = By.xpath("(//div[@class='delete-button'])[3]");
	private By addAddress = By.xpath("//*[text()='+ Add a new address']");

	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickMyProfileButton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(MyProfileButton).click();
	}

	public void clickSubProfile() throws InterruptedException {

		driver.findElement(SubMenu).click();
		Thread.sleep(5000);
	}

	public void clickDesignation() throws InterruptedException {
		driver.findElement(Designation).clear();

		driver.findElement(Designation).sendKeys("Manager");
		Thread.sleep(1000);
	}

	public boolean compareTitle() {
		return driver.findElement(Title).isDisplayed();
	}

	public void clickUdyam() throws InterruptedException {
		driver.findElement(Udyam).sendKeys("U1233243543543543");
		Thread.sleep(1000);
	}

	public void clickOption() throws InterruptedException {
		driver.findElement(Options).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'General Engineering & Fabrication')]")).click();
		Thread.sleep(1000);
	}

	public void clickArea() throws InterruptedException {
		driver.findElement(
				By.xpath("//div[4]/div[1]/label[1]/input[1]"))
				.click();
		Thread.sleep(1000);
	}

	public void clickSave() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Save details')]")).click();
		Thread.sleep(1000);
	}
	
	public void clickCancel() {
		driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
	}

	public boolean compareMsg() {
		return driver.findElement(Msg).isDisplayed();

		// driver.findElement(By.className("ok-button")).click();
	}
	
	public void clickAddresses()
	{
		driver.findElement(Addresses).click();
	}
	
	public void DeleteAddresses()
	{
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,800)", "");
		driver.findElement(DeleteAddress).click();
	}
	
	public void addAddress() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,400)", "");
		driver.findElement(addAddress).click();
		driver.findElement(By.id("company")).sendKeys("Spark Avertising");
		driver.findElement(By.id("pincode")).sendKeys("600032");
		driver.findElement(By.id("address")).sendKeys("A-4, 3rd Phase, Labour Colony, SIDCO Industrial Estate");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		driver.findElement(By.id("state")).sendKeys("Tamil Nadu");
		driver.findElement(By.xpath("//button[text()='Save address']")).click();
	}
	
	public void cancelNewAddress() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,400)", "");
		driver.findElement(addAddress).click();
		driver.findElement(By.id("company")).sendKeys("Spark Avertising");
		driver.findElement(By.id("pincode")).sendKeys("600032");
		driver.findElement(By.id("address")).sendKeys("A-4, 3rd Phase, Labour Colony, SIDCO Industrial Estate");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		driver.findElement(By.id("state")).sendKeys("Tamil Nadu");
		driver.findElement(By.xpath("//div[text()='Cancel']")).click();
	}
	

}
