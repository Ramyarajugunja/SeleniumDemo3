package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
        WebDriver driver;
        
      @Test  
      public void LaunchApp  () throws InterruptedException {
    	  driver = new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	  Thread.sleep(3000);
      }  
     @Test
      public void Login() {
    	 driver.findElement(By.name("username")).sendKeys("Admin");
    	  driver.findElement(By.name("password")).sendKeys("admin123");
    	  driver.findElement(By.tagName("button")).click();
	  }
     @Test
      public void Navigation() {
    	  driver.findElement(By.cssSelector("div.oxd-layout div.oxd-layout-navigation aside.oxd-sidepanel nav.oxd-navbar-nav div.oxd-sidepanel-body ul.oxd-main-menu:nth-child(2) li.oxd-main-menu-item-wrapper:nth-child(6) a.oxd-main-menu-item")).click();
      }
      @Test
      public void MyInfo() {
      
      System.out.println(driver.findElement(By.cssSelector("div.orangehrm-edit-employee-content")).isDisplayed());
      
      driver.quit();
      }
      @Test
      public void VerifyLogin() {
    	   System.out.println(driver.findElement(By.cssSelector("p.oxd-userdropdown-name")).getText());
    	   driver.quit();
      }
      
      
      
      
      
}