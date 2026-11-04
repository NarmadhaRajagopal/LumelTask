package Lumel_TestNG_new;

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

public class Lumel_Scenario3_withTestNGAnnotations {

	
		// TODO Auto-generated method stub
		WebDriver driver;
		@BeforeMethod
		void setUp()
		{
		
		driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
  		driver.get("https://todomvc.com/examples/angular/dist/browser/#/all");
		}
		@Test
		void testScenario3()
		{
  		//Started with an empty to-do List
  		List<WebElement> list = driver.findElements(By.className("toggle"));
  		
  		Assert.assertEquals(list.size(),0);
  		
  		//Added an item to the to-do List
  		
  		driver.findElement(By.className("new-todo")).sendKeys("Read a book");
  		
  		driver.findElement(By.className("new-todo")).sendKeys(Keys.ENTER);
  		
  		WebElement countBefore = driver.findElement(By.className("todo-count"));
  		String countCheckBefore = countBefore.getText();
  		
  		Assert.assertEquals(countCheckBefore,"1 item left");
  		
  		WebElement toDoitem = driver.findElement(By.className("toggle"));
  		toDoitem.click();
  		
  		WebElement countAfter = driver.findElement(By.className("todo-count"));
  		String countCheckAfter = countAfter.getText();
  		
  		Assert.assertEquals(countCheckAfter,"0 items left");
  		
  		System.out.println("Scenario 3 is validated and confirmed that to-do list item is marked as complete ");
		}
		
		@AfterMethod
		void tearDown()
		{
			driver.quit();
		}
		
		
  		
  		
  		
  		

	}

