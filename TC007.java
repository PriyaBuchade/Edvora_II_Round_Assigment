package II_ROUND;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC007 {
	@Test
	public static void TC007() throws InterruptedException {
		// TC007 User stays on the same page after registering .
	System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");	
			//Verify functionality of SignUp Button
			WebElement Signin = driver.findElement(By.xpath("//button[text()='SignIn']"));
			Signin.click();
		try {
			driver.navigate().to("https://testing-assessment-foh15kew9-edvora.vercel.app/r");	
		//Verify Username Text box accept keyword or not
		WebElement AUsername =	driver.findElement(By.xpath("//input[@autocomplete='username']"));
			AUsername.click(); 
			AUsername.sendKeys("qwert");
WebElement APassword = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
			APassword.click();
			APassword.sendKeys("12345");
WebElement CreateAccount = driver.findElement(By.xpath("//button[text()='Create Account']"));
			CreateAccount.click();
			driver.navigate().to("\"https://testing-assessment-foh15kew9-edvora.vercel.app/s");	
		}
		catch(Exception e)
		{
System.out.println("TC007: User stays on the same page after registering need to handle alert");
		}
		driver.close();
		}
}

