package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// call the webdriver manager
		
		WebDriverManager.chromedriver().setup();//verifies the version,downloads and then setup the browser
		String property = System.getProperty("webdriver.chrome.driver");
		System.out.println(property);
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
				
		//load the url
		driver.get("http://leaftaps.com/opentaps");
		
		//maximize the browser
		driver.manage().window().maximize();
		//find the user name and enter the username (demosalesmanager)
		//password(crmsfa)
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(5000);
		
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		String attribute = logout.getAttribute("value");
		System.out.println(attribute);

		if(attribute.equals("Logout"))
		{
			System.out.println("successfully logged in");
		}
				//driver.close();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		//driver.findElement(By.id("username")).sendKeys("demosalesmanager",Keys.TAB);
				
		
		//different locators are
		
		//1.ID - do not use id when it has numbers
		//2.Name - always check for duplicates
		//3.classname - always check for duplicates , if you have whitespaces then do not use (inside class)- compound
		//4. linktext -> check for duplicates. if it has a tag, then use linktext
		//5. tagname -> check for tagname 
		//6 partial link text
		//7 xpath
		//8 css
		//7.
		
		
	}

}
