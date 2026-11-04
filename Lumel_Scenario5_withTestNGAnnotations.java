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

public class Lumel_Scenario5_withTestNGAnnotations {

	
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
		void testScenario5()
		{

  		driver.findElement(By.className("new-todo")).sendKeys("Workout for 1 hour");
  		
  		driver.findElement(By.className("new-todo")).sendKeys(Keys.ENTER);
  		
  		driver.findElement(By.className("new-todo")).sendKeys("Read atleast 10 pages a day");
  		
  		driver.findElement(By.className("new-todo")).sendKeys(Keys.ENTER);
  		
driver.findElement(By.className("new-todo")).sendKeys("Drink waterfrequently");
  		
  		driver.findElement(By.className("new-todo")).sendKeys(Keys.ENTER);
  		
		//Total items in the to-do list : 3 items
  		
  		
		 WebElement countActive = driver.findElement(By.className("todo-count"));
		 String countActiveCheck = countActive.getText();
		 
		 
  		
  		
  		driver.findElement(By.linkText("Active")).click();
  		List<WebElement> listActive = driver.findElements(By.xpath("//input[@type= \"checkbox\" and @class = \"toggle\"]"));
  		Assert.assertEquals(listActive.size(),3);
  		
  		Assert.assertEquals(countActiveCheck,"3 items left");
  		
  		
  		
  		WebElement toDoitem = driver.findElement(By.className("toggle"));
  		toDoitem.click();
  		
  		//Active count : After marking 1 item as complete		
  		WebElement countAfter = driver.findElement(By.className("todo-count"));
  		String countCheckAfter = countAfter.getText();
  		
  		Assert.assertEquals(countCheckAfter,"2 items left");
  		List<WebElement> listActive2 = driver.findElements(By.xpath("//input[@type= \"checkbox\" and @class = \"toggle\"]"));
  		Assert.assertEquals(listActive2.size(),2);//List of active items after marking 1 as completed
  		
  		 		
  		
  		//completed count :
  		driver.findElement(By.linkText("Completed")).click();
  		WebElement countCompleted = driver.findElement(By.className("todo-count"));
		 String countCompletedCheck = countCompleted.getText();
		 
		Assert.assertEquals(countCompletedCheck,"1 item left");
		List<WebElement> listCompleted = driver.findElements(By.xpath("//input[@type= \"checkbox\" and @class = \"toggle\"]"));
	  	Assert.assertEquals(listCompleted.size(),1);//List of completed items after marking 1 as completed
		}
		
		@AfterMethod
		void tearDown()
		{
  		driver.quit();
		}
  		
  		//Defect : The item count is updated as the same for all the filters irrespective of the actual number of items in the Active/Completed/All 		
	

}
