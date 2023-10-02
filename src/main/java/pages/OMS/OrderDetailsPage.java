package pages.OMS;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pages.OMSPage;
import util.ElementUtil;

public class OrderDetailsPage {

	private WebDriver driver;
	private By PaymentStatus = By.xpath("//p[text()='Payment status']//parent::div[1]//following::div[3]//p");
	private By PaymentType = By.xpath("//p[text()='Payment type']//parent::div[1]//p[2]");
	public static String APIdisplayAmount;
	public static Response response;
	

	public OrderDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String verifyPaymentStatus() {
		String payementStatus = driver.findElement(PaymentStatus).getText();
		return payementStatus;
	}

	public String verifyPaymentType() {
		String payementType = driver.findElement(PaymentType).getText();
		return payementType;
	}

	public void verifyCashBack() {
		driver.findElement(By.xpath("//p[text()='₹200.00 (per MT)']")).isDisplayed();
	}

	public void verifyPIPO() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Verify PI/PO']//preceding::input[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Update'])[2]")).click();
		Thread.sleep(2500);
		driver.navigate().refresh();
	}

	public String verifyOrderStatus() {
		String OrderStatusValue = driver.findElement(By.xpath("//p[text()='Order status']//following::div[1]//input"))
				.getAttribute("value");
		return OrderStatusValue;

	}

	public void verifyOrderedValue() {
		String TotalOrderAmount = driver.findElement(By.xpath("//p[text()='Total order amount']//following::p[1]"))
				.getText();
		String orderedValue = driver.findElement(By.xpath("//span[text()='Ordered value']//following::td[8]"))
				.getText();
	
		Assert.assertEquals(TotalOrderAmount, orderedValue);
		Assert.assertEquals(TotalOrderAmount, "₹"+APIdisplayAmount);
	}

	public void validateOrderValueFromV2API() throws IOException {

	
		String bearerToken = ElementUtil.getGlobalValue("ERPbearerToken");

		String url = ElementUtil.getGlobalValue("omsUrl")+"oms/order/v2/number/" + OMSPage.ERPorderno;
		System.out.println("api ur" +url);
		response = RestAssured.given().header("Authorization", "Bearer " + bearerToken).when().get(url).then()
				.statusCode(200).extract().response();
		APIdisplayAmount = ElementUtil.getJsonPath(response, "orderAmount.displayAmount");
		System.out.println("The DisplayAmount is - " + APIdisplayAmount);

	}
	public void validateV2OrderDetailsAPIContract() throws FileNotFoundException
	{
		System.out.println(response.asPrettyString());
		assertThat(response.asPrettyString(), containsString("displayAmount"));

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\schemas\\V2OrderDetails.json");

		response.then().assertThat().body(matchesJsonSchema(fis));
	}

}
