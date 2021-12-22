package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;

public class CartDetailPage {

	private WebDriver driver;

	private By myCart = By.xpath("//h4[@class='cart_title']");
	private By Cart = By.xpath("//div[@class='count']");
    private By TandC = By.xpath("//span[@class='text-primary']/a");
    private By TandCimgtext= By.xpath("//div[@class='img_p']");
    private By checkbox= By.xpath("(//div[@class=\"form-check\"])[2]/input");
    private By techspec= By.xpath("(//div[@class=\"form-check\"])[3]/label[2]");
    private By deliverydate= By.xpath("//span[@class='font-weight-bold']");
    
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
		
		driver.findElement(TandCimgtext).isDisplayed();
		driver.findElement(By.xpath("(//b[contains(text(),\"TERMS OF USE\")])[1]")).isDisplayed();
	}
	
	public void validateTechSpec()
	{
		driver.findElement(techspec).isDisplayed();
	}
	
	public void clickCheckbox()
	{
		
		driver.findElement(checkbox).click();
	}

	public void validateDeliveryDate()
	{
		String str=driver.findElement(deliverydate).getText();
	    System.out.println(str); 
		Assert.assertEquals(str, "2 - 5 days");
	}
	
}
