package com.example.advanced;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.selenium.basictests.WebDriverConfig;

public class TestScreenShot {
	WebDriverConfig driver = new WebDriverConfig();
	WebDriver firefox = driver.getFirefox();
	//Test
	@Test
	public void screenShotTest() {
		firefox.navigate().to("http://www.google.com");
		firefox.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		File scrFile = ((TakesScreenshot)firefox).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(scrFile, new File("screenshot.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
