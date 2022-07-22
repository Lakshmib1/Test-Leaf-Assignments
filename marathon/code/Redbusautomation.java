package marathon.code;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbusautomation {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("src")).sendKeys("chennai");
		//driver.findElement(By.id("//li[@class='sub-city']/following::li")).click();
		driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[1]/div/ul/li[3]")).click();
		driver.findElement(By.id("dest")).sendKeys("Banglaore");
		driver.findElement(By.xpath("//li[contains(text(),'Bangalore (All Locations)')]")).click();
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[6]/td[5]")).click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Ok, got it')]")).click();
		
		String noofbusses = driver.findElement(By.xpath("//span[contains(@class,'bold busFound')]")).getText();
		System.out.println("No of Buses found " +noofbusses);
		driver.findElement(By.xpath("//label[contains(text(),'SLEEPER')]")).click();
		String busname = driver.findElement(By.xpath("//div[contains(text(),'V2K Travels')]")).getText();
		System.out.println("Second bus name "+busname);
		driver.findElement(By.xpath("(//div[contains(text(),'View Seats')])[2]")).click();
		
		
		
		
		
		
		 
	     File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	     File designation = new File("./Output/redbus.png");
	     FileUtils.copyFile(screenshotAs, designation);
	     
		
		
		
		
				
		
		
		
		
		
		
	}

}
