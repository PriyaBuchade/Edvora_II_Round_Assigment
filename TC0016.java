package II_ROUND;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC0016 {
	@Test

	public  void TC0016() {
//		TC0015 User should not able to login with empty password 
			System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
			
			WebElement Username = driver.findElement(By.xpath("//input[@autocomplete='username']"));
			
			Username.sendKeys("qwept");
			
			WebElement Login= driver.findElement(By.xpath("//button[text()='Login']"));
			Login.click();  
			String URL = driver.getCurrentUrl();
			if(URL.equalsIgnoreCase("https://testing-assessment-foh15kew9-edvora.vercel.app/"))
			{
				System.out.println("TC0016: User not able to login with empty password ");
			}
			else
			{
				System.out.println("TC0016: User able to login with empty password ");
			}
			driver.close();}

	}


