package com.selenium.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCSSSelector {
	WebDriverConfig driver = new WebDriverConfig();
	WebDriver firefox = driver.getFirefox();
	@Test
	public void searchWithCssSelectorTest()
	{
		WebDriverWait wait = new WebDriverWait(firefox, 15);
		firefox.navigate().to("http://google.com");
		WebElement element = firefox.findElement(By.cssSelector("#lst-ib"));
		element.sendKeys("CSS Name");
	}
	@AfterTest
	public void closeTest()
	{
		firefox.close();
	}
}
