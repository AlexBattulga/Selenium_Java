package com.udemy.selenium.tutorial;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigateToGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Enkh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("***********");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(decodedPass());
		driver.findElement(By.className("CwaK9")).click();
	}
	public static String decodedPass()
	{
		String encodedPassword = "VGluZ3lpMTEyNQ==";
		return new String(Base64.getDecoder().decode(encodedPassword.getBytes()));
	}

}
