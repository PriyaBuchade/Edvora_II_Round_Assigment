package II_ROUND;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC0018 {
@Test
	public static void TC0018() {
		// TC0018 User should not able edit username on setting page
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		WebElement Username =	driver.findElement(By.xpath("//input[@autocomplete='username']"));
		WebElement Password = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		 Username.sendKeys("qwert");
		 Password.sendKeys("12345");
		WebElement Login= driver.findElement(By.xpath("//button[text()='Login']"));
		Login.click();       
		driver.navigate().to("https://testing-assessment-foh15kew9-edvora.vercel.app/s");
	    WebElement Edit = driver.findElement(By.xpath("//button[text()='Edit']"));
	    Edit.click();
	    WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	    System.out.println("TC0018: Is User name is editable :"+ " " + username.isEnabled());
		driver.close();
	}

}
