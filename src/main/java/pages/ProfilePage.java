package pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
	private WebDriver driver;

	
	private By MyProfileButton = By.xpath("//header[@id='drop-down-head']");
	private By SubMenu = By.linkText("Profile");
	private By Designation = By.id("usr");
	private By Udyam = By.name("udyam");
	private By Options = By.xpath("//option[contains(text(),'Select an option')]");
	private By Msg = By.xpath("//div[contains(text(),'Your changes have been saved.')]");
	private By Title = By.xpath("//div[contains(text(),'My Profile')]");
	

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

	public boolean compareMsg() {
		return driver.findElement(Msg).isDisplayed();

		// driver.findElement(By.className("ok-button")).click();
	}

}
