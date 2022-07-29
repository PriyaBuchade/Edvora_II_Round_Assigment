package II_ROUND;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC012 {
	@Test
	public  void TC012() throws InterruptedException {
		//TC0012: User able to go back to setting page after logout by
		//clicking on backword navigation arrow
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
		WebElement Logout = driver.findElement(By.xpath("//button[text()='Logout']"));
		Logout.click();
		String URL = driver.getCurrentUrl();
		driver.navigate().to(URL);
		driver.navigate().back();
		String URL2 = driver.getCurrentUrl();
		if(URL2.equalsIgnoreCase("https://testing-assessment-foh15kew9-edvora.vercel.app/s"))
		{
			System.out.println("TC0012: User able to go back to setting page after "
					+ "logout by clicking on backword navigation arrow");
		}else {System.out.println("TC0012: User not able to go back to setting "
					+ "page after logout by clicking on backword navigation arrow");
		}
		
		
		
		driver.close();
	   
	   
	   
}


}
