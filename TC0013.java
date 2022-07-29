package II_ROUND;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC0013 {
	@Test
	public  void TC0013() throws InterruptedException {
		//TC0013:Text written in username and password text boxes  should be of visible  color during login
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
	WebElement Username = driver.findElement(By.xpath("//input[@autocomplete='username']"));
	WebElement Password = driver.findElement(By.xpath
			("//input[@autocomplete='current-password']"));
	Username.sendKeys("qwert");
	Password.sendKeys("12345");	
	 Assert.assertFalse(Username.getText().isBlank());
	
	//System.out.println("TC0013: Text written in username and password text boxes  should be of visible  color" +text);
	
	driver.close();
}

}
