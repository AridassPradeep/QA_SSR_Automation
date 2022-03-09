package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Set;

import org.junit.Assert;

public class CartDetailPage {

	private WebDriver driver;

	private By myCart = By.xpath("//h4[@class='cart_title']");
	private By Cart = By.xpath("//div[@class='count']");
    private By TandC = By.xpath("//span[@class='text-primary']/a");
    private By TandCimgtext= By.xpath("//div[@class='img_p']");
    private By checkbox= By.xpath("//input[@id='termsCondition']");
    private By techspec= By.xpath("//input[@id='termsCondition']//following::label[1]");
    private By deliverydate= By.xpath("//strong[contains(text(),'2-5 days')]");
    
	public CartDetailPage(WebDriver driver) {
		this.driver = driver;
	}

	public String validateMyCart() throws InterruptedException {
		return driver.findElement(myCart).getText();
	
	}
    public void clickCart()
    {
    	driver.findElement(Cart).click();
    }
	
	public void validateTandC()
	{
		driver.findElement(TandC).isDisplayed();
	}
	
	public void clickTandC()
	{
		driver.findElement(TandC).click();
	}
	
	public void validateTandCpage()
	{
		Set<String> handles=driver.getWindowHandles();
		ArrayList<String> ar= new ArrayList<String>(handles);
		System.out.print(ar);
		driver.switchTo().window(ar.get(1));
		driver.findElement(TandCimgtext).isDisplayed();
		driver.findElement(By.xpath("//*[text()='TERMS OF USE ']")).isDisplayed();
	}
	
	public void validateTechSpec()
	{
		driver.findElement(techspec).isDisplayed();
	}
	
	public void clickCheckbox() throws InterruptedException
	{
		Thread.sleep(8000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		
		WebElement checkboxTerms = driver.findElement(By.xpath("//input[@id='termsCondition']"));
		//jse.executeScript("arguments[0].click();", checkboxTerms);
		
	}

	public void validateDeliveryDate()
	{
		String str=driver.findElement(deliverydate).getText();
	    System.out.println(str); 
		Assert.assertEquals(str, "2-5 days");
	}
	
}
