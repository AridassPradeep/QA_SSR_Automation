package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class LoginPage {

	private WebDriver driver;
    
	private By loginButton= By.xpath("//div[2]/div[1]/button[1]");
	private By email= By.xpath("//input[@type='email']");
	private By password= By.xpath("//input[@type='password']");
	private By signIn= By.xpath("//div[2]/div[2]/button[1]");
	

	private By register= By.xpath("//*[text()='REGISTER']");
	private By fullname = By.id("fullname");
	private By mobile= By.xpath("//div[@class='country-code']//following::input[1]");
	private By gstin = By.id("gstin");
	private By companyemail= By.xpath("//div[@class='email-icon']//following::input[1]");
	private By agreeTerms= By.xpath("//*[text()='I agree to the']//preceding::label[1]");
	private By next= By.xpath("//button[@class='register-button selected']");
	private By userpassword= By.xpath("//input[@name='password']");
	private By confirmpassword= By.xpath("//input[@name='confirmPassword']");
	private By createAccount= By.xpath("//button[@value='Register']");
	
	
	


	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateLoginButton()
	{
		return driver.findElement(loginButton).isDisplayed();
		
	}
	public boolean validateRegisterButton()
	{
		return driver.findElement(register).isDisplayed();
		
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
	public void Login(String uname,String pwd)
	{
		driver.findElement(email).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signIn).click();
	}
	
	
	public void clickRegisterButton()
	{
		driver.findElement(register).click();
	}
	
	public void enterUserName(String name)
	{
		driver.findElement(fullname).sendKeys(name);
	}
	
	public void enterMobileNo(String mobileno)
	{
		driver.findElement(mobile).sendKeys(mobileno);
	}
	
	public void enterGSTNo(String gstno)
	{
		driver.findElement(gstin).sendKeys(gstno);
	}
	
	public void entercompanyMailId(String companymailid)
	{
		driver.findElement(companyemail).sendKeys(companymailid);
	}
	
	public void clickAgreeTerms()
	{
		driver.findElement(agreeTerms).click();
	}
	
	public void clickNextButton()
	{
		driver.findElement(next).click();
	}
	
	public void enteruserpassword(String userpwd)
	{
		driver.findElement(userpassword).sendKeys(userpwd);
	}
	
	public void enterConfirmPassword(String cnfpwd)
	{
		driver.findElement(confirmpassword).sendKeys(cnfpwd);
	}

	public void clickcreateAccount()
	{
		driver.findElement(createAccount).click();
	}



}
