package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartDetailPage {

	private WebDriver driver;

	private By myCart = By.xpath("//h4[@class='cart_title']");
	

	public CartDetailPage(WebDriver driver) {
		this.driver = driver;
	}

	public String validateMyCart() throws InterruptedException {
		return driver.findElement(myCart).getText();
	
	}

	
}
