package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementUtil {
	
	private static WebDriver driver;
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean isElementPresent(String id)
	{
		try {
			driver.findElement(By.xpath(id));
			return true;
		} catch (Exception e) {
			return false;	
		}
		
	}
	
	
}
