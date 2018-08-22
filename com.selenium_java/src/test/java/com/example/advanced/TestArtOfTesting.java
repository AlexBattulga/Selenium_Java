package com.example.advanced;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.selenium.basictests.WebDriverConfig;

public class TestArtOfTesting {
	WebDriverConfig d = new WebDriverConfig();
	WebDriver chrome = d.getFirefox();
	@Test
	public void artOfTest()
	{
		chrome.navigate().to("http://artoftesting.com/sampleSiteForSelenium.html");
		chrome.manage().window().maximize();
		chrome.findElement(By.linkText("This is a link")).click();
		chrome.findElement(By.name("firstName")).sendKeys("Art Of Testing");
		chrome.findElement(By.id("idOfButton")).click();
	}
	@Test
	public void doubleClickTest()
	{
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action = new Actions(chrome);
		WebElement doubleBtn = chrome.findElement(By.xpath("//*[@id=\"dblClkBtn\"]"));
		action.doubleClick(doubleBtn).perform();
		chrome.switchTo().alert().accept();
	}
	@Test
	public void chooseGenderTest()
	{
		chrome.findElement(By.xpath("//input[@id='male']")).click();
	}
	@Test
	public void chooseCheckBoxTest()
	{
		WebElement webTest = chrome.findElement(By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[1]"));
		webTest.click();
	}
	@Test
	public void dropDownTest()
	{
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement web = chrome.findElement(By.id("testingDropdown"));
		Select selectDropDown = new Select(web);
		selectDropDown.selectByValue("Performance");
	}
	@Test
	public void clickAlertTest()
	{
		chrome.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		chrome.findElement(By.xpath("//button[@onclick='generateAlertBox()']")).click();
		chrome.switchTo().alert().accept();
	}
	@Test
	public void clickConfirmTest()
	{
		// clicking on the cancel button
		chrome.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		chrome.findElement(By.xpath("//button[@onclick='generateConfirmBox()']")).click();
		chrome.switchTo().alert().dismiss();
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void dragDropTest()
	{
		WebElement source = chrome.findElement(By.xpath("//img[@id='sourceImage']"));
		WebElement target = chrome.findElement(By.xpath("//div[@id='targetDiv']"));
		Actions ac = new Actions(chrome);
		ac.dragAndDrop(source, target).build().perform();
	}
	@AfterTest
	public void closeTest()
	{
		chrome.close();
	}

}
