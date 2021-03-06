package com.example.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.selenium.basictests.WebDriverConfig;

public class TestDropDown {
	WebDriverConfig d = new WebDriverConfig();
	WebDriver chrome = d.getChrome();
	@Test
	public void getDropDownTest() throws InterruptedException
	{
		chrome.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		WebElement dropdown = chrome.findElement(By.name("country"));
		// selecting a value from dropdown
		Select selectDropDown = new Select(dropdown);
		// selecting second value from dropdown
		Thread.sleep(4000);
		selectDropDown.selectByIndex(2);
		// selecting a value by given value
		Thread.sleep(4000);
		selectDropDown.selectByValue("AUSTRALIA");
		Thread.sleep(4000);
		selectDropDown.selectByVisibleText("INDIA");
		Thread.sleep(4000);
	}
	@AfterTest
	public void closeTest()
	{
		chrome.close();
	}
}
