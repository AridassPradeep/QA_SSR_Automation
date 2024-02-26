package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyRequirementsPage {

	private WebDriver driver;
	private By myRequirements = By.xpath("//a[normalize-space()='My requirements']");
	private By requirementId = By.xpath("(//*[contains(text(),'Requirements ID')])[1]");
	private By ProductDetails = By.xpath("(//*[contains(text(),'Item details')])[1]");
	private By TotalQuantity = By.xpath("(//*[contains(text(),'Total quantity')])[1]");

	public MyRequirementsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickMyrequirementTab() {
		driver.findElement(myRequirements).click();
	}

	public void verifyRequirementsID() {

		driver.findElement(requirementId).isDisplayed();
		String id = driver.findElement(By.xpath("(//*[@class='typography-h5 typography-md-h4 typography-font-bold typography-text-black'])[1]")).getText();
		System.out.println("Requirement ID: "+id);
	}

	public void validateProductDetails() {
		driver.findElement(ProductDetails).isDisplayed();
	}

	public void validateTotalQuantity() {
		driver.findElement(TotalQuantity).isDisplayed();
		String totalQuantity = driver.findElement(TotalQuantity).getText();
		System.out.println(totalQuantity);

	}

	public void clickToViewProductDetails() {
		driver.findElement(By.xpath("(//div[@class='d-none d-md-inline collapse-icon'])[1]")).click();
	}

}
