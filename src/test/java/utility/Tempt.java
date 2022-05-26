package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt
{
public static void main (String[]args) throws InterruptedException
{							// Launch Browser
	System.setProperty("webdriver.chrome.driver","E:\\Automation_Support\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
							// Implicit wait
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
							// Open Application
	driver.navigate().to("https://www.flipkart.com/");
							// cancal login window
	driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
	
							// Cursor moves on login button   (Move to element)
	Actions act=new Actions(driver);
	WebElement abc=driver.findElement(By.xpath("//*[text()='Login']"));
	act.moveToElement(abc).build().perform();
							//click on My Profile
	driver.findElement(By.xpath("//*[text()='My Profile']")).click();
							// Enter Email address
	driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9730579880");
							//Enter password
	driver.findElementByXPath("//*[@type='password']").sendKeys("Pallavi@1234");
							// Click on login button
	driver.findElementByXPath("(//*[@type='submit'])[2]").click();
							// Click on Manage Address & Throw exception
	Thread.sleep(8000);
	driver.findElementByXPath("//*[text()='Manage Addresses']").click();
							// Click on new address
	driver.findElementByXPath("//*[@class='_1QhEVk']").click();
	driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("Pallavi");
	driver.findElementByXPath("(//*[@type='text'])[3]").sendKeys("9730579880");
	driver.findElementByXPath("(//*[@type='text'])[4]").sendKeys("412105");
	driver.findElementByXPath("(//*[@type='text'])[5]").sendKeys("PCMC");
	driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("Pune");
	driver.findElementByXPath("//*[@for='HOME']").click();
	driver.findElementByXPath("//*[text()='Save']").click();
	
	
	
		
}
}

