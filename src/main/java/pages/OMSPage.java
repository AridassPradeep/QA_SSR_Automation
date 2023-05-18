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
	private By Business = By.linkText("Business");

	public OMSPage(WebDriver driver) {
		this.driver = driver;
	}

	public void goToOMS() throws InterruptedException {
		driver.get("https://qa-oms.msme.jswone.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='Login with Google']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("qatestuser@jsw.in");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@123$");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(5000);
		
	}

}
