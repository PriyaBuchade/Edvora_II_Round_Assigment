package II_ROUND;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class TC002 {
	@Test
	public static void TC002() throws InterruptedException {
		//TC002: User able to login after login after logging out consecutively
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		
		WebElement Username =driver.findElement(By.xpath("//input[@autocomplete='username']"));
		WebElement Password = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		//Verify functionality with valid user name and password
		 Username.sendKeys("qwert");
		 Password.sendKeys("12345");	
		 
		WebElement Login= driver.findElement(By.xpath("//button[text()='Login']"));
		System.out.println(" Is Login page is Displayed " + Login.isDisplayed());
		System.out.println(" Is Login page is Enabled " + Login.isEnabled());
		Login.click();        ////Successfully login message is displaying
		
		//VERIFY FUNCTIONALITY OF lOGOUT bUTTON
	    driver.navigate().to("https://testing-assessment-foh15kew9-edvora.vercel.app/s");
	    Actions act = new Actions(driver);
	    WebElement Logout = driver.findElement(By.xpath("//button[text()='Logout']"));
	    act.moveToElement(Logout);
		System.out.println("Is Logout button is displayed: "+Logout.isDisplayed());
		System.out.println("Is Logout button is Enable: "+Logout.isEnabled());
		Logout.click();
		driver.navigate().to("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		Thread.sleep(50000);
		WebElement Username1 =	driver.findElement(By.xpath("//input[@autocomplete='username']"));
		WebElement Password2 = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
		WebElement Login2= driver.findElement(By.xpath("//button[text()='Login']"));
		Username1.sendKeys("qwert");
		Password2.sendKeys("12345");
		Login2.click();
		driver.navigate().to("https://testing-assessment-foh15kew9-edvora.vercel.app/s");
		WebElement Title = driver.findElement(By.xpath("//p[text()='Personal Info']"));
		String Ti = Title.getText();
		if(Ti.equalsIgnoreCase("Personal Info"))
		{
			System.out.println("TC002: User able to login after login after logging out consecutively");
			}
		else{System.out.println("TC002: User not able to login after login after logging out consecutively");}
		
		driver.close();
	}



}
