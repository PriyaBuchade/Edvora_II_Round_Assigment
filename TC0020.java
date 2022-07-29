package II_ROUND;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC0020 {
	
@Test
	public  void TC0020() throws InterruptedException {
		// TC0020: User should not create acount with empty username and password
		  System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");	
			//Verify functionality of SignUp Button
			WebElement Signin = driver.findElement(By.xpath("//button[text()='SignIn']"));
			Signin.click();
			driver.navigate().to("https://testing-assessment-foh15kew9-edvora.vercel.app/r");	
			//Verify Username Text box accept keyword or not
			WebElement AUsername =	driver.findElement(By.xpath("//input[@autocomplete='username']"));
			AUsername.click(); 
			
			WebElement APassword = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
			APassword.click();
			
			WebElement CreateAccount = driver.findElement(By.xpath("//button[text()='Create Account']"));
			CreateAccount.click();
			Thread.sleep(5000);
			Alert alt = driver.switchTo().alert(); 
			 Assert.assertEquals(alt.getText(),"smome went wrong");
			if(alt.getText().equalsIgnoreCase("Account scussfully created"))
					{
				System.out.println(" TC0020: User able create acount with empty username and password");
					}
			else {
				System.out.println("TC0020: User not able to  create acount with empty username and password");
			}
			driver.close();
			
			 
			

	}

}
