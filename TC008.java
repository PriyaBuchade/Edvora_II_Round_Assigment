package II_ROUND;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class TC008 {
	public  void TC008() throws InterruptedException {
	//TC008 User gets a native popup saying “Some went wrong” when user tries to login with invalid creds.

		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");	
			
			
		//Verify Username Text box accept keyword or not
		WebElement AUsername =	driver.findElement(By.xpath("//input[@autocomplete='username']"));
		AUsername.click(); 
			AUsername.sendKeys("qwe2r");
		WebElement APassword = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
			APassword.click();
			APassword.sendKeys("1s2365");
            WebElement Login= driver.findElement(By.xpath("//button[text()='Login']"));
            Login.click();
				
			Alert alt = driver.switchTo().alert();
			String text = alt.getText();
			Assert.assertEquals(text,("Some went wrong"));
			System.out.println("TC008 User get native popup" +text);
			
			driver.close();
			
	}

}
