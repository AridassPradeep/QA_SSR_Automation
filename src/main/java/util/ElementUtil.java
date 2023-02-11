package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void MigrationUtil(By loctr) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(loctr));

	}
	
	public boolean isElementPresent(String id)
	{
		try {
			driver.findElement(By.xpath(id));
			return true;
		} catch (Exception e) {
			return false;	
		}
		
	}

}
