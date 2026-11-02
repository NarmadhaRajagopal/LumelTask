package selenium_Lumel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Lumel_Scenario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scenario 1 : ( Initial state : Empty to-do )
				WebDriver driver = new ChromeDriver(); 
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		  		driver.get("https://todomvc.com/examples/angular/dist/browser/#/all");
		  		
		  		
		  		 		
		  		
		  		
		  		
		  		// Before : To read the empty list
		  		
		  		List<WebElement> list = driver.findElements(By.className("toggle"));
		  		
		  		Assert.assertEquals(list.size(),0);
		  		System.out.println("Empty To -Do list is read");
		  		
		  		
		  				  		
		  		
		  		
		  		// After : To Read the list of items added in the to-do list
		  		driver.findElement(By.className("new-todo")).sendKeys("Read a book");
		  		
		  		driver.findElement(By.className("new-todo")).sendKeys(Keys.ENTER);
		  		List<WebElement> listnew = driver.findElements(By.className("toggle"));
		  		
		  		Assert.assertEquals(listnew.size(),1);
		  		
		  		System.out.println("Scenario 2 is validated and confirmed that to-do list is updated with an item");
		  		
		  		driver.quit();

	}

}
