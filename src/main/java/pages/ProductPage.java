package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

	private WebDriver driver;

	private By steelByCategories = By.xpath("//li[1]/div[1]/a[1]");
	private By hotRolled = By.xpath("//div[1]/ul[1]/li[1]/a[1]");
	private By hotRolledSheets = By.xpath("//*[text()=' Hot rolled sheets ']");
	private By productsList = By.xpath("//div[@class='prod-plpimg1']");

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnHotRolledSheets() throws InterruptedException {
		driver.findElement(steelByCategories).click();
		Thread.sleep(2000);
		driver.findElement(hotRolled).click();

	}

	public void clickOnproductfromListingPage() throws InterruptedException {

		driver.findElements(productsList).get(1).click();
		Thread.sleep(3000);

		List<WebElement> Thickness = driver.findElements(
				By.xpath("//div[(@class='dimension-size') and contains (text(),'Thickness (mm)')]//following::li"));
		Thickness.get(0).click();

		List<WebElement> width = driver.findElements(
				By.xpath("//div[(@class='dimension-size') and contains (text(),'Width (mm)')]//following::li[1]"));
		width.get(1).click();

		List<WebElement> length = driver.findElements(
				By.xpath("//div[(@class='dimension-size') and contains (text(),'Length (mm)')]//following::li[1]"));
		length.get(1).click();

		driver.findElement(By.xpath("//input[@class='input-quant']")).sendKeys("50");
		driver.findElement(By.xpath("//input[@class='input-quant']//following::img[1]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[1]/span[1]/i[1]")).click();

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='ok-button']")).click();

	}

}
