package II_ROUND;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC0011 {
	@Test

	public static void TC0011() throws InterruptedException {
		//TC0011: User should not able to change mobile number without entering Full Name
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		WebElement Username =	driver.findElement(By.xpath("//input[@autocomplete='username']"));
		WebElement Password = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		 Username.sendKeys("qwert");
		 Password.sendKeys("12345");	
		WebElement Login= driver.findElement(By.xpath("//button[text()='Login']"));
		System.out.println(" Is Login page is Displayed " + Login.isDisplayed());
		System.out.println(" Is Login page is Enabled " + Login.isEnabled());
		Login.click();        ////Successfully login message is displaying
		driver.navigate().to("https://testing-assessment-foh15kew9-edvora.vercel.app/s");
	    // Verify Functionality of Edit button
	    WebElement Edit = driver.findElement(By.xpath("//button[text()='Edit']"));
	    System.out.println("Is Edit button is displayed: "+Edit.isDisplayed());
		System.out.println("Is Edit button is Enable: "+Edit.isEnabled());
	    Edit.click();
		Actions act = new Actions(driver);
	   
	   WebElement Mobilenumber = driver.findElement(By.xpath("//input[@name='mobileNumber']"));
	   WebElement Save = driver.findElement(By.xpath("//button[text()='Save']"));
	   Mobilenumber.sendKeys("1234567891"); 
	   act.moveToElement(Save);
	   Save.click();
	   WebElement Error= driver.findElement(By.xpath("//p[text()='Enter full name']"));
	   String text = Error.getText();
	   if(text.equalsIgnoreCase("Enter full name"))
	   {
System.out.println("TC0011: User able to change mobile number only if full name text box is filled");
		   
	   }
	   else
	   {
		   System.out.println("TC0011: User able to change mobile number");
	   }
	   
		driver.close();
	   
	
	   
	   
		
		
		
	}

}
