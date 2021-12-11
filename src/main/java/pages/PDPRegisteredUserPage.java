package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PDPRegisteredUserPage {

	private WebDriver driver;

	public PDPRegisteredUserPage(WebDriver driver) {
		this.driver = driver;
	}

	private By user = By.xpath("//div[@class='loginusermenu profile']");
	private By steelbycategory = By.xpath("//ul[@class='main-categories-first-child-menu']/parent::div/child::a");
	private By menu = By.xpath("//ul[@class='main-categories-first-child-menu']/child::li");
	private By secondmenu = By.xpath("//ul[@class='main-categories-second-child-menu']/child::li/child::a");
	private By productselect = By.xpath("//div[@class='product-plp1 col-sm-12 col-xxl-4']");
	private By alldimensions = By.xpath("//li[contains(@class,'product-list')]");
	private By addtocartbutton = By.xpath("//button[@class='btn cart-btn-secondary']");
	private By diameter = By.xpath("//div[contains(@class,'size_1')]/child::div[@class='dimension-size']");
	private By productselectwirerod = By.xpath("//div[@class='product-plp1 col-sm-12 col-xxl-4']");
	private By quantitybutton = By.xpath("//button[@class='btn btn-quant']");
	private By cartcount = By.xpath("//div[@class='count']");
	private By totalprice = By.xpath("//span[@class='fl-right tot-cost']");

	public boolean validateLogin() {

		return driver.findElement(user).isDisplayed();
	}

	public void validatesearchwithcategoryreguser() {
		driver.findElement(steelbycategory).click();
		List<WebElement> reguserfirstmenu = driver.findElements(menu);

		reguserfirstmenu.get(4).click();

		List<WebElement> regusersecondmenu = driver.findElements(secondmenu);

		regusersecondmenu.get(14).click();

	}

	public void selectProductreguser() throws InterruptedException {
		Thread.sleep(2000);

		List<WebElement> productselected = driver.findElements(productselect);

		productselected.get(1).click();

	}

	public void selectDimensionreguser() throws InterruptedException {

		List<WebElement> alldimensions2 = driver.findElements(alldimensions);
		int i = driver.findElements(alldimensions).size();
		System.out.println(i);

		driver.findElement(By.xpath("//input[@class='input-quant']")).sendKeys("123");
		Thread.sleep(3000);

		alldimensions2.get(9).click();
		alldimensions2.get(11).click();
		alldimensions2.get(4).click();

		// alldimensions2.get(1).click();

	}

	public void clickAddtoCart()

	{
		driver.findElement(addtocartbutton).isDisplayed();
		driver.findElement(addtocartbutton).click();

	}

	public void selectWireRod() {
		driver.findElement(steelbycategory).click();
		// List<WebElement> reguserfirstmenu1 = driver.findElements(menu);
		// reguserfirstmenu1.get(2).click();
		driver.findElements(menu).get(2).click();
		driver.findElements(secondmenu).get(6).click();

	}

	public void selectProductreguserwirerod() {

		List<WebElement> productselected = driver.findElements(productselectwirerod);

		productselected.get(0).click();

	}

	public void clickQuantity() {
		driver.findElement(quantitybutton).click();

	}

	public void validateAddedtoCart() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(cartcount).isDisplayed();

	}

	public void validateDiameter() {
		driver.findElement(diameter).isDisplayed();

	}

	public void validateTotalPrice() {

		driver.findElement(totalprice).isDisplayed();

	}

	public void selectDimensionHRPO() throws InterruptedException {

		List<WebElement> alldimensions2 = driver.findElements(alldimensions);
		int i = driver.findElements(alldimensions).size();
		System.out.println(i);
		alldimensions2.get(6).click();
		alldimensions2.get(15).click();
		alldimensions2.get(16).click();
		driver.findElement(By.xpath("//input[@class='input-quant']")).sendKeys("123");
		Thread.sleep(3000);

	}

}