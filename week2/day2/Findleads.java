package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findleads {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//verifies the version,downloads and then setup the browser
		
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("http://leaftaps.com/opentaps");
				
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
				
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		String attribute = logout.getAttribute("value");
		System.out.println(attribute);

		if(attribute.equals("Logout"))
		{
			System.out.println("successfully logged in");
		}
				//driver.close();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Lead ID')]/following::input[2]")).sendKeys("Lakshmi");
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		

		

		
	}

}
