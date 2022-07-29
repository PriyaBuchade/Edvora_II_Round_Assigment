package II_ROUND;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003 {
	@Test
	public  void TC003() throws InterruptedException {
		//TC003: User able to change mobile number
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		WebElement Username = driver.findElement(By.xpath("//input[@autocomplete='username']"));
		WebElement Password = driver.findElement(By.xpath
				("//input[@autocomplete='current-password']"));
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
	   WebElement Mobilenumber = driver.findElement(By.xpath("//input[@name='mobileNumber']"));
	   WebElement Fullname = driver.findElement(By.xpath("//input[@name='fullname']"));
	   WebElement Save = driver.findElement(By.xpath("//button[text()='Save']"));
	   Fullname.sendKeys("Priya");
	   Mobilenumber.sendKeys("1234567891"); 
	   Actions act = new Actions(driver);
	   act.moveToElement(Save);
	   Save.click();
	   WebElement Edit2 = driver.findElement(By.xpath("//button[text()='Edit']"));
	   act.moveToElement(Edit2);
	  Edit2.click();
	  Mobilenumber.clear();
	  Mobilenumber.sendKeys("9876543210"); 
	  WebElement Save2 = driver.findElement(By.xpath("//button[text()='Save']"));
	  Save2.click();
	 
	  WebElement Edit3 = driver.findElement(By.xpath("//button[text()='Edit']"));
	  Assert.assertTrue(Edit3.isDisplayed()); 
	   act.moveToElement(Edit3);
	  Edit3.click();
	  Mobilenumber.clear();
	  Mobilenumber.sendKeys("9876543210"); 
	  WebElement Save3 = driver.findElement(By.xpath("//button[text()='Save']"));
	  Save3.click();
	 
		driver.close();
	
	   }
}


