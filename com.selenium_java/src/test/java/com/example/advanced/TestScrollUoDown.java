package com.example.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.selenium.basictests.WebDriverConfig;

public class TestScrollUoDown {
	WebDriverConfig  driver = new WebDriverConfig();
	WebDriver firefox = driver.getFirefox();
	
	@Test
	public void closePopUp()
	{
		firefox.navigate().to("http://www.flipkart.com");
		firefox.manage().window().maximize();
		WebElement searchBox = firefox.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		searchBox.click();
	}
	@Test
	public void scrollTest() throws InterruptedException
	{
		firefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		firefox.manage().window().maximize();
		((JavascriptExecutor)firefox).executeScript("arguments[0].scrollIntoView(true)", firefox.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div[2]/div/div/div[15]/div[1]/div/h2")));
		Thread.sleep(4000);
	}
	@AfterTest
	public void closeTest()
	{
		firefox.quit();
	}
}
