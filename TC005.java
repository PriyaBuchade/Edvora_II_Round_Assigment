package II_ROUND;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC005 {
	@Test
	public  void TC005() throws InterruptedException {
		// TC005: User able to login after 10 minutes of staying in the login screen.
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		
		
		WebElement Username =	driver.findElement(By.xpath("//input[@autocomplete='username']"));

		

		WebElement Password = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		
	    Thread.sleep(10000);

	
		 Username.sendKeys("qwert");
		 Password.sendKeys("12345");
		 
			
		WebElement Login= driver.findElement(By.xpath("//button[text()='Login']"));
		System.out.println(" Is Login page is Displayed " + Login.isDisplayed());
		
		System.out.println(" Is Login page is Enabled " + Login.isEnabled());
		
		Thread.sleep(120000);
	
		Login.click();   
	    String URL = driver.getCurrentUrl();
	    if(URL.equalsIgnoreCase("https://testing-assessment-foh15kew9-edvora.vercel.app/s"))
	    {
	    	System.out.println("TC005: Login page redirect to setting page");
	    }
	    else
	    {
	    	System.out.println("TC005: Server fail error");
	    }
		driver.close();
	}

}
