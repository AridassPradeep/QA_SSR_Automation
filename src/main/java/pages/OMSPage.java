package pages;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class OMSPage {

	private WebDriver driver;
	private By googleLogin= By.xpath("//*[text()='Login with Google']");
	private By emailTextBox=By.xpath("//input[@type='email']");
	private By nextBtn=By.xpath("//span[normalize-space()='Next']");
	private By passwordBox=By.xpath("//input[@type='password']");
	

	public OMSPage(WebDriver driver) {
		this.driver = driver;
	}

	public void goToOMS() throws InterruptedException {
		driver.get("https://qa-oms.msme.jswone.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(googleLogin).click();
		driver.findElement(emailTextBox).sendKeys("qatestuser@jsw.in");
		Thread.sleep(1000);
		driver.findElement(nextBtn).click();
		Thread.sleep(2000);
		driver.findElement(passwordBox).sendKeys("Admin@123$");
		Thread.sleep(2000);
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);
		
	}
	
	public void goToOMSShipmentPage() throws InterruptedException
	{
		String url1="https://qa-oms.msme.jswone.in/order-list/";
		String orderno=Paymentpage.orderno;
		String url2="?tab=shipments";
		String url=url1+orderno+url2;
		String url3="https://qa-oms.msme.jswone.in/order-list/JOO-N9PD3CQO";
		driver.get(url3);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Shipments']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Create shipment']")).click();
		Thread.sleep(200000);
	}
	

}
