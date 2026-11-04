package Lumel_TestNG;
import java.time.Duration;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Lumel_Scenario1_withTestNGAnnotations {
	WebDriver driver ;

		// TODO Auto-generated method stub
		//Scenario 1 : ( Initial state : Empty to-do )
		@BeforeMethod
		void setUp()
		{
		 driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
  		driver.get("https://todomvc.com/examples/angular/dist/browser/#/all");
		}
  		
  		
  		@Test
  		void testScenario1() {
  		List<WebElement> list = driver.findElements(By.className("toggle"));
  		
  		Assert.assertEquals(list.size(),0,"Initial to-do list must be empty");
  		System.out.println("Scenario 1 is validated that Initial state is an Empty to-do"+ "And the list size is:"+ list.size());
  		
  		}
  		
  		@AfterMethod
  		void tearDown()
  		{
  			driver.quit();	
  		}
  		
  		
  		
  		
  		

	

}
