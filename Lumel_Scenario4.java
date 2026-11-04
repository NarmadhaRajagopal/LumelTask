package selenium_Lumel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Lumel_Scenario4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
  		driver.get("https://todomvc.com/examples/angular/dist/browser/#/all");

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
  		driver.quit();
  		
	}

}
