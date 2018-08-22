package com.udemy.selenium.tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Enkh\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test.haagendazsdc.com");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
//		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")).click();
		driver.findElement(By.linkText("CAKE ORDERING")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[2]/form[1]/div[2]/input[1]")).sendKeys("Enkhbaatar");
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[2]/form[1]/div[16]/input[1]")).click();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
		}
	}

}
