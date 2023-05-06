package util;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private static WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void MigrationUtil(By loctr) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(loctr));

	}

	public void MigrationUtilFrame(By loctr) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(loctr));

	}

	public static boolean isElementPresent(String id) {
		try {
			driver.findElement(By.xpath(id));
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	
	public void SwitchWindow(int index) {
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> ar = new ArrayList<String>(handles);
		System.out.print(ar);
		driver.switchTo().window(ar.get(index));

	}

}
