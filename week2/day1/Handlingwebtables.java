package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingwebtables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.partialLinkText("Admin")).click();
		
		int tablerow = driver.findElements(By.xpath("//table/thead/tr/th/following::tbody/tr")).size();
		System.out.println("total no of rows in the table " +tablerow);
		
		int count = 0;
		for (int i=1;i<=tablerow;i++)
		{
			String status = driver.findElement(By.xpath("//table/thead/tr/th/following::tbody/tr["+i+"]/td[5]")).getText();
			if(status.equals("Enabled"))
			{
				count++;
			}
		}
	System.out.println("No of enabled users " +count);
	
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	
	int empcol = driver.findElements(By.xpath("//table[@class='table hover']/thead/tr/th")).size();
	
	int emprow = driver.findElements(By.xpath("//table[@class='table hover']/thead/tr/th/following::tbody/tr")).size();
	
	System.out.println("colum count "+empcol+" " +"row count "+emprow);
	}
	

}
