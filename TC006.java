package II_ROUND;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC006 {
	@Test
	public  void TC006() throws InterruptedException {
		//TC006: AFter registering an account , there should be native browser popup 
	    System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");	
			//Verify functionality of SignUp Button
			WebElement Signin = driver.findElement(By.xpath("//button[text()='SignIn']"));
			Signin.click();
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
			Thread.sleep(5000);
			Alert alt = driver.switchTo().alert();
			String text = alt.getText();
			
			if(alt.getText().equalsIgnoreCase("Account sucessfully created."))
			{
				System.out.println("TC006: AFter registering an account , there is native browser popup ");
			}
			else
			{
			System.out.println("TC006: AFter registering an account , there is not native browser popup ");
			}
			driver.close();
}
}
