package com.example.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.selenium.basictests.WebDriverConfig;

public class TestRegister {
	WebDriverConfig d = new WebDriverConfig();
	WebDriver chrome = d.getChrome();
	@Test
	public void getDropDownTest() throws InterruptedException
	{
		chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		chrome.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		chrome.manage().window().maximize();
		chrome.findElement(By.name("firstName")).sendKeys("Enkhbaatar");
		chrome.findElement(By.name("lastName")).sendKeys("Battulga");
		chrome.findElement(By.name("phone")).sendKeys("3169998888");
		chrome.findElement(By.name("userName")).sendKeys("ebar1126@gmail.com");
		chrome.findElement(By.name("address1")).sendKeys("5588 Main St");
		chrome.findElement(By.name("city")).sendKeys("Falls Church");
		chrome.findElement(By.name("state")).sendKeys("VIRGINIA");
		chrome.findElement(By.name("postalCode")).sendKeys("22051");
		WebElement dropdown = chrome.findElement(By.name("country"));
		// selecting a value from dropdown
		Select selectDropDown = new Select(dropdown);
		// selecting a value by given value
		selectDropDown.selectByValue("VIRGIN ISLANDS");
		chrome.findElement(By.id("email")).sendKeys("ebar1126@gmail.com");
		chrome.findElement(By.name("password")).sendKeys("19901126");
		chrome.findElement(By.name("confirmPassword")).sendKeys("19901126");
		chrome.findElement(By.name("submit")).click();
	}
	@AfterTest
	public void closeTest()
	{
		chrome.close();
	}
}