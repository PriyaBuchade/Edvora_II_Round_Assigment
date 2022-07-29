package II_ROUND;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC0015 {
	@Test

	public  void TC0015(){
	//	TC0015 User should not able to login with empty username 
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		
		WebElement Password = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		
		Password.sendKeys("12305");	
		WebElement Login= driver.findElement(By.xpath("//button[text()='Login']"));
		Login.click();  
		String URL = driver.getCurrentUrl();
		if(URL.equalsIgnoreCase("https://testing-assessment-foh15kew9-edvora.vercel.app/"))
		{
			System.out.println("TC0015: User not able to login with empty username ");
		}
		else
		{
			System.out.println("TC0015: User able to login with empty username ");
		}
		driver.close();}}
