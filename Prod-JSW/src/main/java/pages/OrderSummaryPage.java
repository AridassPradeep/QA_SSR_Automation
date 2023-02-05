package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage {

	private WebDriver driver;

	private By RecentBlogs = By.xpath("//UL[@class='v-pagination theme--light']");

	public OrderSummaryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void validaterecentBlogs() {
		driver.findElement(RecentBlogs).isDisplayed();

	}

}
