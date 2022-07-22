package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testingworldautomation {

	ChromeDriver driver;

	@Test(priority = 1)
	public void Startbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Test(priority = 2)
	public void CreateLead()
	{
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		String attribute = logout.getAttribute("value");
		System.out.println(attribute);

		if(attribute.equals("Logout"))
		{
			System.out.println("successfully logged in");
		}

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kamesh");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(source);
		select.selectByVisibleText("Conference");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Lathu");
		
		//driver.findElement(By.id("createLeadForm_birthDate-button")).click();
		
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

	}
	@Test(priority = 3)
	public void EditLead()
	{
		driver.findElement(By.partialLinkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_generalProfTitle")).sendKeys("Manager");
		driver.findElement(By.name("lastNameLocal")).sendKeys("Jeeva");
		driver.findElement(By.name("personalTitle")).sendKeys("Mr.");
		Select select1 = new Select(driver.findElement(By.name("industryEnumId")));
		select1.selectByVisibleText("Computer Software");
		Select select2 = new Select(driver.findElement(By.name("ownershipEnumId")));
		select2.selectByVisibleText("Sole Proprietorship");
		
		driver.findElement(By.name("submitButton")).click();
	}
}