package pages;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import util.OtpUtil;

public class LoginPage {

	private WebDriver driver;

	private By loginButton = By.xpath("//div[2]/div[1]/button[1]");
	private By email = By.xpath("//input[@type='email']");
	private By password = By.xpath("//input[@type='password']");
	private By signIn = By.xpath("//button[contains(text(),'Login to continue')]");
	private By loginuserMenu = By.xpath("//*[@id='drop-down-head']");
	private By forgotPassword = By.xpath("//div[@class='forgot-pwd-link']");
	private By otptextbox = By.xpath("//*[text()='OTP on registered mobile number']");
	private By signInregister = By.xpath("//*[@id='signin-register']");
	private By errorMessage = By.xpath("//div[@class='error_message error-messages row']");
	private By loginByEmail = By.xpath("//button[contains(text(),'Login via email')]");
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateLoginButton() {
		return driver.findElement(loginButton).isDisplayed();

	}

	public boolean validateLoginuserMenu() throws InterruptedException {
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		return driver.findElement(loginuserMenu).isDisplayed();

	}
	
public boolean validateuserMenu() throws InterruptedException {
		Thread.sleep(3000);
		return driver.findElement(loginuserMenu).isDisplayed();

	}

	public void clickLoginButton() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(loginButton).click();
	}
	
	public void clickloginByEmail() {
		driver.findElement(loginByEmail).click();
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
		return driver.findElement(loginByEmail).isDisplayed();

	}
	
	public void clickLoginByOtp()
	{
		driver.findElement(By.xpath("//button[contains(text(),'Login via OTP')]")).click();
	}
	
	public void enterPhoneNo()
	{
		driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("8095424663");
	}
	
	
	public void clickGetOTP()
	{
		driver.findElement(By.xpath("//button[contains(text(),'Get OTP')]")).click();
		
	}
	
	
	public void enterOTP() throws InterruptedException, MalformedURLException
	{
		
		Thread.sleep(60000);
		/*
		String otp=OtpUtil.getOTP();
		System.out.println("The OTP is " + otp);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(otp);
		*/
	}
	
	public void enterInvalidOTP() throws InterruptedException, MalformedURLException
	{
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("0000");
	}
	


}
