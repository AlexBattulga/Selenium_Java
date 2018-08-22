package com.selenium.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
	public WebDriver getChrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Enkh/Documents/Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public WebDriver getFirefox()
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/Enkh/Documents/Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
