package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectPLPPage {
	
	private WebDriver driver;

	@FindBy(xpath = "//a[@class='anchor-tag py-3 nuxt-link-exact-active nuxt-link-active']")
	private WebElement steelOfCategories;
	@FindBy(xpath = "//*[@id=\'left\']/div[2]/div/div/div[1]/a")
	private WebElement hotRolled;
	@FindBy(xpath = "//h2[text()='All Categories']")
	private WebElement allCategories;
	@FindBy(xpath = "//input[@value='View all']")
	private WebElement viewAll;
	@FindBy(xpath = "//div[@class='product-content-filter']")
	private WebElement plpPage;
	@FindBy(xpath = "//span[text()='Buy from verified sellers']")
	private WebElement verifiedSeller;
	@FindBy(xpath = "//*[@id=\'__layout\']/div/div[2]/div[1]/div[3]")
	private WebElement sellerPLPPage;
	@FindBy(xpath = "//span[text()='Buy directly from']")
	private WebElement doPLPpage;
	@FindBy(xpath = "//div[@class='filter-img-name']")
	private WebElement fliter;
	@FindBy(xpath = "(//span[text()='Configure and request price'])[1]")
	private WebElement configureAndRequestPrice;
	@FindBy(xpath = "(//span[@class='deliveryschedule'])[1]")
	private WebElement deliveryDay;
	
	
	public DirectPLPPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public void scroll(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView()", element);
		return;
	}
	
	public void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
		return;
	}


	public WebElement getSteelOfCategories() {
		return steelOfCategories;
	}


	public WebElement getHotRolled() {
		return hotRolled;
	}


	public WebElement getAllCategories() {
		return allCategories;
	}


	public WebElement getViewAll() {
		return viewAll;
	}


	public WebElement getPlpPage() {
		return plpPage;
	}


	public WebElement getVerifiedSeller() {
		return verifiedSeller;
	}


	public WebElement getSellerPLPPage() {
		return sellerPLPPage;
	}


	public WebElement getDoPLPpage() {
		return doPLPpage;
	}


	public WebElement getFliter() {
		return fliter;
	}

	public WebElement getConfigureAndRequestPrice() {
		return configureAndRequestPrice;
	}


	public WebElement getDeliveryDay() {
		return deliveryDay;
	}
	
	
}
