package ts.alex.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Enkh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("eVar1186@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("whsOnd")).sendKeys("Tingword11127");
		driver.findElement(By.className("CwaK9")).click();
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test successfull");
		}else {
			System.out.print("Test faild");
		}
		
	}
}
