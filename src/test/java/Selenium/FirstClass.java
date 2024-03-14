package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass {
	@Test
public void TestGoogle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
		
}
	@Test
	public void TestFaceBook() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();

}
}	