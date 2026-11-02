package selenium_Lumel;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Lumel_Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scenario 1 : ( Initial state : Empty to-do )
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
  		driver.get("https://todomvc.com/examples/angular/dist/browser/#/all");
  		
  		//WebElement toDoInit = driver.findElement(By.className("new-todo"));
  		
  		//String pH = toDoInit.getAttribute("What needs to be done?");
  		
  		List<WebElement> list = driver.findElements(By.className("toggle"));
  		
  		Assert.assertEquals(list.size(),0);
  		System.out.println("Scenario 1 is validated that Initial state is an Empty to-do"+ "And the list size is:"+ list.size());
  		driver.quit();
  		
  		
  		

	}

}
