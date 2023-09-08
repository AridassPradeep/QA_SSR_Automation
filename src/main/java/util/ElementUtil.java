package util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void MigrationUtil(By loctr) {
		WebDriverWait wait = new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(loctr));

	}
	
	public void WaitUtilClickable(By loctr) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(loctr));

	}
	
	public void WaitUtilElementInvisible(By loctr) {
		WebDriverWait wait = new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loctr));
		

	}

	public boolean isElementPresent(String id) {
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

	public static void UploadFile(String filePath) throws AWTException {
		StringSelection fileSelection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileSelection, null);

		Robot robot = new Robot();
		robot.delay(2000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(8000);

	}
	
	public static void zoomout() throws AWTException {		
		Robot robot = new Robot();
		robot.delay(3200);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000);

	}
	
	public static void enter() throws AWTException {		
		Robot robot = new Robot();
		robot.delay(3200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000);

	}
	
	public static void Esc() throws AWTException {		
		Robot robot = new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.delay(2000);

	}
	
	public static void DoubleKeyDownEnter() throws AWTException {		
		Robot robot = new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);

	}
	
	public static void selectAllDelete() throws AWTException {		
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Simulate pressing Delete
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_DELETE);

	}


	public static String date() {
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = currentDate.format(formatter);
		return formattedDate;
	}

	public static String date(int days) {
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate newDate = currentDate.plusDays(days);
		String formattedNewDate = newDate.format(formatter);
		return formattedNewDate;
	}

	public void scrollUp() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}
	
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public void scrollDownToElement(By trackShipments) {
		WebElement elementToScrollTo = driver.findElement(trackShipments);
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	}
	
	public static String generateRandomString(int length) {
        final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }
	
	public static String generateRandomIntegerString(int length) {
        final String characters = "0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }
	
	public static String getGlobalValue(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}

	public static String getJsonPath(Response response, String key) {
		String resp = response.asString();
		JsonPath js = new JsonPath(resp);
		return js.get(key).toString();

	}
}


