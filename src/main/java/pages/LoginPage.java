package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

	private WebDriver driver;

	private By loginButton = By.xpath("//div[2]/div[1]/button[1]");
	private By email = By.xpath("//input[@type='email']");
	private By password = By.xpath("//input[@type='password']");
	private By signIn = By.xpath("//div[1]/div[1]/div[2]/div[2]/button[1]");
	private By loginuserMenu = By.xpath("//button[@id='__BVID__54__BV_toggle_']");
	private By forgotPassword = By.xpath("//div[1]/div[2]/div[2]/div[3]");
	private By otptextbox = By.xpath("//*[text()='OTP on registered mobile number']");
	private By signInregister = By.xpath("//*[@id='signin-register']");
	private By errorMessage = By.xpath("//div[@class='error_message error-messages row']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateLoginButton() {
		return driver.findElement(loginButton).isDisplayed();

	}

	public boolean validateLoginuserMenu() {
		return driver.findElement(loginuserMenu).isDisplayed();

	}

	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}

	public void Login(String uname, String pwd) {
		driver.findElement(email).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);

	}

	public void signIn() {

		driver.findElement(signIn).click();
	}

	public void clickForgotPassword() {

		driver.findElement(forgotPassword).click();
	}

	public boolean validateotptextbox() {
		return driver.findElement(otptextbox).isDisplayed();

	}

	public void clicksignInRegister() {

		driver.findElement(signInregister).click();
	}
	
	public String validateErrorMessage() {

		return driver.findElement(errorMessage).getText();
	}
	
	public boolean validateloginBox() {
		return driver.findElement(email).isDisplayed();

	}
	
	public boolean validateSignInEnabled() {
		return driver.findElement(signIn).isEnabled();

	}
	
	
	public void closeLoginBox() throws InterruptedException {
		driver.findElement(email).sendKeys(Keys.ESCAPE);

	}
	
	public boolean validateLoginPopUp() {
		return driver.findElement(email).isDisplayed();

	}


}
