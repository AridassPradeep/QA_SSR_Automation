package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommercePage {
	private WebDriver driver;
	
	public CommercePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addProduct()
	{
		WebElement element = driver.findElement(By.xpath("//button[@label='Close dialog']"));
		element.click();
        //element.sendKeys(Keys.ESCAPE);
		driver.findElement(By.xpath("//div[contains(text(),'Products')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Add product']")).click();
	}
	
	public void searchProduct() throws InterruptedException
	{
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='throttled-field-search-text']")).sendKeys("TMT");
		
	}
	
	public void clickProduct() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'Select')])[2]")).click();
		
	}
	public void clickNext() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//button[@aria-label='Next']")).click();
	}
	
	public void clickSave() throws InterruptedException
	{
		Thread.sleep(1200);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		Thread.sleep(3200);
	}
	
	public void clickacceptCookies() throws InterruptedException
	{
		WebElement cookieBanner = driver.findElement(By.xpath("//button[@label='Accept all cookies']")); // Replace 'cookie-banner' with the ID of your cookie banner element
        cookieBanner.click();
        
	}
	
	public void entersProductName(String productName)
	{
		driver.findElement(By.xpath("//input[@id='localized-text-field-3.en-US']")).sendKeys(productName);
		driver.findElement(By.xpath("//textarea[@id='localized-multiline-text-field-3.en-US']")).sendKeys(productName);
		driver.findElement(By.xpath("//input[@name='key']")).sendKeys(productName);
		driver.findElement(By.xpath("//input[@id='masterVariant.attributes.GRADE']")).sendKeys("1");
		
	}
	
	public void clickAddVariant(String productName) throws InterruptedException
	{
		driver.findElement(By.xpath("(//span[contains(text(),'Add variant')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='variant-sku']")).sendKeys(productName+"Sku");
		driver.findElement(By.xpath("//input[@id='variant-key']")).sendKeys(productName+"Variant");
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
	}
	
	
	
	
	
	
	
	
	

}
