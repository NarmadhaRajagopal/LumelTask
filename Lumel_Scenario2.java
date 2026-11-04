package Lumel_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Lumel_Scenario2 {
	WebDriver driver;

	
		// TODO Auto-generated method stub
		//Scenario 2 : Add a to-Do
				@BeforeMethod
				void setUp()
				{
				 driver = new ChromeDriver(); 
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		  		driver.get("https://todomvc.com/examples/angular/dist/browser/#/all");
				}
		  		
		  		 		
		  		
		  		
		  		
		  		// Before : To read the empty list
		  		@Test
		  		void testScenario2()
		  		{
		  		List<WebElement> list = driver.findElements(By.className("toggle"));
		  		
		  		Assert.assertEquals(list.size(),0);
		  		System.out.println("Empty To -Do list is read");
		  		
		  		
		  				  		
		  		
		  		
		  		// After : To Read the list of items added in the to-do list
		  		driver.findElement(By.className("new-todo")).sendKeys("Read a book");
		  		
		  		driver.findElement(By.className("new-todo")).sendKeys(Keys.ENTER);
		  		List<WebElement> listnew = driver.findElements(By.className("toggle"));
		  		
		  		Assert.assertEquals(listnew.size(),1,"To-do list must have 1 item after adding an item");
		  		
		  		System.out.println("Scenario 2 is validated and confirmed that to-do list is updated with an item");
		  		
				}
		  		
		  		@AfterMethod
		  		void tearDown()
		  		{
		  		driver.quit();
		  		}

	
}
