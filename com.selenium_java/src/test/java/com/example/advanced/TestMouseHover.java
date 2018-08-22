package com.example.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.selenium.basictests.WebDriverConfig;

public class TestMouseHover {
	WebDriverConfig d = new WebDriverConfig();
	WebDriver chrome = d.getChrome();
	@Test
	public void mouseOverTest() throws InterruptedException
	{
		chrome.navigate().to("http://artoftesting.com/sampleSiteForSelenium.html");
		Actions action = new Actions(chrome);
		WebElement btn = chrome.findElement(By.id("idOfButton"));
		action.moveToElement(btn).perform();
		Thread.sleep(6000);
	}
	@AfterTest
	public void closeTest()
	{
		chrome.close();
	}
}
