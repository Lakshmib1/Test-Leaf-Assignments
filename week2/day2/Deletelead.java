package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deletelead {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();//verifies the version,downloads and then setup the browser
			
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
					
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Reya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(source);
		select.selectByVisibleText("Conference");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Lathu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("MCA");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("laks@gmail.com");
		WebElement stateselect = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select1 = new Select(stateselect);
		select1.selectByVisibleText("Alabama");
		
		driver.findElement(By.name("submitButton")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		if (pagetitle.contains("opentaps"))
		{
			System.out.println("lead created");
		}
		
		driver.findElement(By.partialLinkText("Delete")).click();
		
		
	}

}
