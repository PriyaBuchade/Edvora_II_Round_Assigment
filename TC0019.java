package II_ROUND;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC0019 {
@Test
	public  void TC0019() {
		// TC0019 User should able to click on login button by using tab and enter button
		 System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
			
			Actions act = new Actions(driver);
			WebElement AUsername =	driver.findElement(By.xpath("//input[@autocomplete='username']"));
			act.click(AUsername);
			AUsername.sendKeys("qwert");
			WebElement APassword = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
			APassword.sendKeys("12345");
			act.sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
			driver.navigate().to("https://testing-assessment-foh15kew9-edvora.vercel.app/s");
		    WebElement Edit = driver.findElement(By.xpath("//button[text()='Edit']"));    
		 if(Edit.isDisplayed())
		 {System.out.println("TC0019: User able to click on login button by using tab and enter button");
		}
		 else
		 {System.out.println("TC0019: User not able to click on login button by using tab and enter button");
		 }
			driver.close();
	}

}
