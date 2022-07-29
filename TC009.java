package II_ROUND;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC009 {
	@Test
	public  void TC009() throws InterruptedException {
		// TC009: Users should not be able to open the settings page after logging out by using the url.
		
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
	   //VERIFY FUNCTIONALITY OF lOGOUT bUTTON
		Actions act = new Actions(driver);
	    driver.navigate().to("https://testing-assessment-foh15kew9-edvora.vercel.app/s");
	    WebElement Logout = driver.findElement(By.xpath("//button[text()='Logout']"));
	    act.moveToElement(Logout);
		System.out.println("Is Logout button is displayed: "+Logout.isDisplayed());
		System.out.println("Is Logout button is Enable: "+Logout.isEnabled());
		Logout.click();
		Thread.sleep(5000);
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/s");
		Assert.assertFalse(Logout.isDisplayed()); 
		driver.close();
		
	}

}
