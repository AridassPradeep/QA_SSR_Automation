package com.jswone.msme.oms.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	private WebDriver driver;
	private By googleLogin = By.xpath("//*[text()='Login with Google']");
	private By emailTextBox = By.xpath("//input[@type='email']");
	private By nextBtn = By.xpath("//span[normalize-space()='Next']");
	private By passwordBox = By.xpath("//input[@type='password']");

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public void goToOMS() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://qa-oms.msme.jswone.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(googleLogin).click();
		driver.findElement(emailTextBox).sendKeys("qatestuser@jsw.in");
		Thread.sleep(1000);
		driver.findElement(nextBtn).click();
		Thread.sleep(4000);
		driver.findElement(passwordBox).sendKeys("Admin@123$");
		Thread.sleep(2000);
		driver.findElement(nextBtn).click();
		Thread.sleep(5000);


}}
