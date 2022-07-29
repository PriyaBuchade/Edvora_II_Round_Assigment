package II_ROUND;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC0017 {
@Test
	public  void TC0017() {
		// TC0017 User get some went wrong message with empty username and password
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform(); 
		act.sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		String URL = driver.getCurrentUrl();
		if(URL.equalsIgnoreCase("https://testing-assessment-foh15kew9-edvora.vercel.app/"))
		{System.out.println("TC0017: User not able to login with empty password and username ");
		}
		else
		{System.out.println("TC0017: User able to login with empty password and username");}
		driver.close();}}
