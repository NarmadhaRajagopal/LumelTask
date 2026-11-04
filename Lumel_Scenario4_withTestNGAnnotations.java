package Lumel_TestNG_new;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Lumel_Scenario4_withTestNGAnnotations {

	
		// TODO Auto-generated method stub
		
WebDriver driver;
		@BeforeMethod
		void setUp()
		{
		driver= new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
  		driver.get("https://todomvc.com/examples/angular/dist/browser/#/all");
		}

		@Test
		void testScenario4()
		{
  		driver.findElement(By.className("new-todo")).sendKeys("Workout for 1 hour");
  		
  		driver.findElement(By.className("new-todo")).sendKeys(Keys.ENTER);
  		
  		WebElement countBefore = driver.findElement(By.className("todo-count"));
  		String countCheckBefore = countBefore.getText();
  		
  		Assert.assertEquals(countCheckBefore,"1 item left");
  		
  		WebElement delete = driver.findElement(By.className("destroy"));
  		
  		delete.click();
  		
  		
  		
  		WebElement countAfter = driver.findElement(By.className("todo-count"));
  		String countCheckAfter = countAfter.getText();
  		
  		Assert.assertEquals(countCheckAfter,"");
	}
  		@AfterMethod
		void tearDown()
		{
			driver.quit();
		}
  		
	
}
