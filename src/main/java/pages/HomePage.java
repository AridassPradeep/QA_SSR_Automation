package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	private WebDriver driver;
	private By JSWLogo = By.xpath("//img[@alt='JSW One MSME']");
	private By search = By.id("SearchText");
	private By languageIndicator = By.xpath("//div[@data-value='ENG']");
	private By cartIcon = By.xpath("(//a[@href='/cart-detail'])[2]");
	private By noofCartItems = By.xpath("//div[@class='count']");
	private By address = By.xpath("//div[@class='header-current-add']");
	private By connectWithUs = By.xpath("//div[@class='chat connect-with-us mr-3 py-3']");
	private By helpLineNumber = By.xpath("//div[@class='ph-num']");
	private By SociaMediaLogos = By.xpath("//span[@class='img0-facebook']");
	private By footerpartContainer = By.xpath("//div[@class='footerpart-container']");
	private By sliderContainerImages = By
			.xpath("//div[@class='single-slider bg-img align-items-center custom-d-flex']//img");
	private By mapIcon = By.xpath("//i[@class='fas fa-map-marker-alt']");
	private By thanksLanding = By.xpath("//div[@class='thanks-landing']");
	private By arrowdropdown = By.xpath("//ul[@role='menu']");
	private By steelMenu = By.xpath("//div[@class='navigation-item'][1]");
	private By HomePageHotRolledSheet = By.xpath("//div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");
	private By HomePageHotRolledSheetSeries200 = By.xpath("//div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]");
	private By HomePageHotRolled = By.xpath("//div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");
	private By HomePageHotRolledCoils = By.xpath("//*[text()='Coils ']");
	
	
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean validateJSWLogo() {
		return driver.findElement(JSWLogo).isDisplayed();

	}
	public void selectHotRolledProduct() throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(steelMenu);
		action.moveToElement(we).build().perform();
		driver.findElement(By.partialLinkText("Hot rolled")).click();
		Thread.sleep(2000);
	}

	public boolean validateSearch() {
		return driver.findElement(search).isDisplayed();

	}

	public boolean validateLanguageIndicator() {
		return driver.findElement(JSWLogo).isDisplayed();

	}

	public boolean validateCartIcon() {
		return driver.findElement(cartIcon).isDisplayed();

	}

	public void clickonHomePageLogo() {
		driver.findElement(JSWLogo).click();
	}

	public String countCartItems() {
		return driver.findElement(noofCartItems).getText();
	}

	public CartDetailPage clickonCart() {
		driver.findElement(cartIcon).click();
		return new CartDetailPage(driver);
	}

	public String getAddress() {
		return driver.findElement(address).getAttribute("textContent");
	}

	public boolean validatemapIcon() {
		return driver.findElement(mapIcon).isDisplayed();

	}

	public boolean validateConnectWithUs() {
		return driver.findElement(connectWithUs).isDisplayed();

	}

	public boolean validateSociaMediaLogos() {
		return driver.findElement(SociaMediaLogos).isDisplayed();

	}

	public boolean validatehelpLineNumber() {
		return driver.findElement(helpLineNumber).isDisplayed();

	}

	public void myProfile() throws InterruptedException {
		driver.findElement(arrowdropdown).click();
		driver.findElement(By.linkText("Profile")).click();
		Thread.sleep(2000);
	}

	public void distributor() throws InterruptedException {
		driver.findElement(arrowdropdown).click();
		driver.findElement(By.linkText("Distributors")).click();
		Thread.sleep(2000);
	}

	public void enterEnquiryFormDetails() throws InterruptedException {
		driver.findElement(By.name("nameChange")).clear();
		driver.findElement(By.name("nameChange")).sendKeys("ramaaa");
		driver.findElement(By.name("mobile")).clear();
		driver.findElement(By.name("mobile")).sendKeys("7876767656");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("ravikishan1@gmail.com");
		driver.findElement(By.name("message")).sendKeys("sending one test enquiry");
		
		driver.findElement(By.xpath("//div[1]/div[4]/label[1]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;       		
        js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//button[@id='reachoutus-submit-1']")).click();
		Thread.sleep(19000);

	}

	public void extractEnquiryFormDetails() throws InterruptedException {
		String typedNameText = driver.findElement(By.name("nameChange")).getAttribute("value");
		String typedMobileText = driver.findElement(By.name("mobile")).getAttribute("value");
		String typedEmailText = driver.findElement(By.name("email")).getAttribute("value");
		System.out.println("Named inside name textfiled   " + typedNameText);
		System.out.println("Named inside mobile textfiled   " + typedMobileText);
		System.out.println("Named inside email textfiled   " + typedEmailText);
	}

	public boolean validatequeryId() {
		return driver.findElement(thanksLanding).isDisplayed();

	}

	public int validatefooterContainer() {
		WebElement block = driver.findElement(footerpartContainer);

		List<WebElement> blocklinks = block.findElements(By.tagName("a"));

		System.out.println("no of links inside block only  are: " + blocklinks.size());

		for (WebElement blocklink : blocklinks) {
			System.out.println(blocklink.getText());
			System.out.println(blocklink.getAttribute("href"));
		}
		return blocklinks.size();
	}

	public int validateSliderContainerImages() {

		List<WebElement> sliderImages = driver.findElements(sliderContainerImages);
		return sliderImages.size();
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}

	public boolean validateHotRolledSheetsInHomePage() {
		return driver.findElement(HomePageHotRolledSheet).isDisplayed();

	}
	
	
	
	
	public boolean validateSeries200InHomePage() {
		return driver.findElement(HomePageHotRolledSheetSeries200).isDisplayed();

	}
	
	public boolean validateHotrolledInHomePage() {
		return driver.findElement(HomePageHotRolled).isDisplayed();

	}
	
	public boolean validateCoilsInHomePage() {
		return driver.findElement(HomePageHotRolledCoils).isDisplayed();

	}
	
	public void clickonStainlessSteelMenu() throws InterruptedException
	{
		Thread.sleep(3200);
		driver.findElement(By.xpath("//div[@class='navigation-item'][2]")).click();
	}
	
	public void clickonSteelMenu() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='navigation-item'][1]")).click();
	}
}
