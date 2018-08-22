package com.selenium.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumBasicsPartOne {
	WebDriverConfig driver = new WebDriverConfig();
	WebDriver chrome = driver.getChrome();
	WebDriver firefox = driver.getFirefox();
	//@Test
	public void locatorsInWeb()
	{
		chrome.get("http://google.com");
		WebElement searchBox = chrome.findElement(By.name("q"));
		searchBox.sendKeys("ArtOfTesting");
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void basicCommands()
	{
		firefox.navigate().to("http://amazon.com");
		firefox.navigate().refresh();
		try {
			Thread.sleep(5000);
			// if i want to execute catch, all i need to do is add throw new exception
			//Throw new InterruptedException();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void closeTest()
	{
		chrome.quit();
		firefox.quit();
	}
}
