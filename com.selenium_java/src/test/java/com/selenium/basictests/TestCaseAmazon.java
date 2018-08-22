package com.selenium.basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCaseAmazon {
	WebDriverConfig driver = new WebDriverConfig();
	WebDriver chrome = driver.getChrome();
	WebDriver firefox = driver.getFirefox();
	
	@Test
	public void amazonChromeTest()
	{
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.navigate().to("http://amazon.com");
		chrome.findElement(By.id("twotabsearchtextbox"));
		chrome.navigate().refresh();
		chrome.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		chrome.findElement(By.xpath("//input[@value='Go']")).click();
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void amazonFirefoxTest()
	{
		firefox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		firefox.navigate().to("http://amazon.com");
		firefox.findElement(By.id("twotabsearchtextbox"));
		firefox.navigate().refresh();
		firefox.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e) {
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
