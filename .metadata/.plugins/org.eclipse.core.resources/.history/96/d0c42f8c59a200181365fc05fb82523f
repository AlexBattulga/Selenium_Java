package com.example.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.selenium.basictests.WebDriverConfig;

public class TestRightClick {
	WebDriverConfig d = new WebDriverConfig();
	WebDriver chrome = d.getChrome();
	@Test
	public void rightClickTest() throws InterruptedException
	{
		chrome.navigate().to("http://artoftesting.com/sampleSiteForSelenium.html");
		Actions action = new Actions(chrome);
		WebElement search = chrome.findElement(By.id("fname"));
		action.contextClick(search).perform();
		Thread.sleep(6000);
	}
	@AfterTest
	public void closeTest()
	{
		chrome.close();
	}
}
