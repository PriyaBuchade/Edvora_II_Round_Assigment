package II_ROUND;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC004 {
	@Test
	
	public  void TC004() throws InterruptedException {
		//TC004: User able to give spaces in full name field inside settings page.
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
		Login.click();        // Successfully login message is displaying
		driver.navigate().to("https://testing-assessment-foh15kew9-edvora.vercel.app/s");
	    
		// Verify Functionality of Edit button
	     
	    WebElement Edit = driver.findElement(By.xpath("//button[text()='Edit']"));
	    
	    System.out.println("Is Edit button is displayed: "+Edit.isDisplayed());
		System.out.println("Is Edit button is Enable: "+Edit.isEnabled());
	    Edit.click();
	    
	    WebElement Fullname = driver.findElement(By.xpath("//input[@name='fullname']"));
	    Fullname.sendKeys("Priya"+ "  "+" Buchade");
	    
	    String Text = Fullname.getText();
	    System.out.println(Text);
	    Assert.assertTrue(Text.contains(" ")); 
	  
	   if(Text.contains(" "))
	   {
	 System.out.println("TC004:User able to give spaces in full name field inside settings page.");
	 }
	  else
	  {
System.out.println("TC004: User not able to give spaces in full name field inside settings page.");
	  }
		driver.close();}

	

}
