package II_ROUND;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC0010 {
	@Test
	public  void TC0010() throws InterruptedException {
		// TC010: User able to go back after logging out using native browser back button.
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		WebElement Username =driver.findElement(By.xpath("//input[@autocomplete='username']"));
		WebElement Password = driver.findElement
				(By.xpath("//input[@autocomplete='current-password']"));
		 Username.sendKeys("qwert");
		 Password.sendKeys("12345");	
		WebElement Login= driver.findElement(By.xpath("//button[text()='Login']"));
		System.out.println(" Is Login page is Displayed " + Login.isDisplayed());
		
		System.out.println(" Is Login page is Enabled " + Login.isEnabled());
		Login.click();        ////Successfully login message is displaying
		driver.navigate().to("https://testing-assessment-foh15kew9-edvora.vercel.app/s");
	    driver.navigate().back();
	    Assert.assertFalse(Login.isDisplayed());
	    
	    String URL =driver.getCurrentUrl();
		if(URL.equalsIgnoreCase("https://testing-assessment-foh15kew9-edvora.vercel.app/"))
		 {
System.out.println("TC010:  User able to go back after logging out using native browser "
		+ "back button."
		+ "");
		 }
		 else
		 {
System.out.println("TC010:  User not able to go back after logging out using native browser back"
		+ " button.");
		 }
	
	    
	    
		driver.close();
	}

	
		
	}


