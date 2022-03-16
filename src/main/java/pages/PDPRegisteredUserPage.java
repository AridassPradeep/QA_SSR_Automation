package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	private By productselect = By.xpath("//div[@class='plp-product-item']");
	private By alldimensions = By.xpath("//li[contains(@class,'product-list')]");
	private By addquantity = By.xpath("//div[2]/div[1]/div[1]/div[1]/button[1]/img[1]");
	private By addtocartbutton = By.xpath("//div[3]/div[1]/button[1]/div[1]");
	private By diameter = By.xpath("//div[contains(@class,'size_1')]/child::div[@class='dimension-size']");
	private By productselectwirerod = By.xpath("//div[@class='product-plp1 col-sm-12 col-xxl-4']");
	private By quantitybutton = By.xpath("//button[@class='btn btn-quant']");
	private By cartcount = By.xpath("//div[@class='count']");
	private By totalprice = By.xpath("//span[@class='fl-right tot-cost']");
	private By dealpill = By.xpath("//div[@class='deals-pill']");
	private By lowestprice = By.xpath("//span[contains(text(),'Lowest Price Seller')]");
	private By bestprice = By.xpath("//span[@class='offer-txt']");
	private By selecteddimensions = By.xpath("//li[@class='product-list activeListItem']");

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

		productselected.get(0).click();

	}
	
	public void selectSteelProductreguser() throws InterruptedException {
		Thread.sleep(2000);

		List<WebElement> productselected = driver.findElements(productselect);

		productselected.get(2).click();

	}


	public void selectProductcoldrolled() throws InterruptedException {
		Thread.sleep(2000);

		List<WebElement> productselected = driver.findElements(productselect);

		productselected.get(2).click();

	}
	public void selectThicknessWidthLength() throws InterruptedException
	{
		
		List<WebElement> allThickness = driver.findElements(By.xpath("//div[@class='list-group flex-row flex-wrap']//button"));
		allThickness.get(0).click();
		allThickness.get(11).click();
		allThickness.get(13).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/div[1]/div[1]/input[1]")).sendKeys("30");
		Thread.sleep(2000);
		driver.findElement(addquantity).click();
		Thread.sleep(2000);

		
	}

	public void selectDimensionreguser() throws InterruptedException {

		List<WebElement> alldimensions2 = driver.findElements(alldimensions);
		int i = driver.findElements(alldimensions).size();
		System.out.println(i);

		driver.findElement(By.xpath("//input[@class='input-quant']")).sendKeys("12");
		Thread.sleep(3000);

		alldimensions2.get(9).click();
		alldimensions2.get(12).click();
		alldimensions2.get(15).click();

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
		driver.findElement(By.xpath("//input[@class='input-quant']")).sendKeys("1234");
		Thread.sleep(3000);

	}

	public void selectDimensionHR() throws InterruptedException {

		List<WebElement> alldimensions2 = driver.findElements(alldimensions);
		int i = driver.findElements(alldimensions).size();
		System.out.println(i);
		alldimensions2.get(5).click();
		Thread.sleep(1000);
		alldimensions2.get(16).click();
		alldimensions2.get(19).click();
		driver.findElement(By.xpath("//input[@class='input-quant']")).sendKeys("1234");
		Thread.sleep(3000);

	}
	
	public void selectDimensionDeal() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='deals-pill selected']")).click();
		
		Thread.sleep(2000);
		List<WebElement> alldimensions2 = driver.findElements(alldimensions);
		int i = driver.findElements(alldimensions).size();
		System.out.println(i);
		driver.findElement(By.xpath("//li[contains(text(), '0.45')]")).click();
		alldimensions2.get(18).click();//value 1250
		alldimensions2.get(19).click(); //value 2500
		Thread.sleep(4000);
	}

	public void validatedealPillclicked() {
		driver.findElement(By.xpath("//div[@class='deals-pill selected']")).isDisplayed();
		
	}
	
	public void validateDealPill() {
		driver.findElement(dealpill).isDisplayed();

	}

	public void clickDealPill() {
		driver.findElement(dealpill).click();
	}

	public void validateLowestPriceSeller() {
		driver.findElement(lowestprice).isDisplayed();
	}

	public void validateBestPrice() {
		driver.findElement(bestprice).isDisplayed();
	}

	int size;

	public boolean checkDimensionSelected() {
		int count = 0;
		double arr[] = { 0.45, 1250.0, 2500.0 };
		// int size = driver.findElements(selecteddimensions).size();
		for (int i = 0; i < 3; i++) {
			WebElement mylist = driver.findElements(selecteddimensions).get(i);
			String str = mylist.getAttribute("innerText");
			double d = Double.parseDouble(str);
			System.out.println("The value of d is" + d);
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == d) {
					count = count + 1;
					System.out.println("Element found" + count);
                             break;
				} else

				{
					if (i > 2) {
						System.out.println("Element not found");
						return false;
					} else
					{
						System.out.println("Keep searching");
						continue;
				
					}
				
				}

			}
			if (count == 3)
				return true;
			
		}
		return false;
	}

	public void stainlessSteelDetails() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Width (mm)')]//following::div[1]//div//button[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Thickness (mm)')]//following::div[1]//div//button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(addquantity).click();
		Thread.sleep(2000);
	}
	
	public void SteelDetails() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Width (mm)')]//following::div[1]//div//button[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Thickness (mm)')]//following::div[1]//div//button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Coating grade - AZ (GSM)')]//following::div[1]//button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(addquantity).click();
		Thread.sleep(2000);
	}
}
