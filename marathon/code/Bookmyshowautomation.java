package marathon.code;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bookmyshowautomation {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup(); 
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option); 
		
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.xpath("//img[@alt='CHEN']")).click();
		//driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		if(currentUrl.contains("chennai"))
		{
			System.out.println("the url has city selected");
		}
		else
		{
			System.out.println("the url has no city selected");
		}
		driver.findElement(By.xpath("//span[contains(text(),'Search for Movies, Events, Plays, Sports and Activities')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")).sendKeys("Gargi",Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='sc-hdPSEv kzaUOq']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Book tickets')]")).click();
		
		String theatername = driver.findElement(By.xpath("//a[@class='__venue-name']")).getText();
		System.out.println(theatername);
		//driver.findElement(By.xpath("(//img[@class='venue-info-icon lazy'])[1]")).click();
		//driver.findElement(By.xpath("//a[@class='__venue-name']/following::div/img")).click();
		driver.findElement(By.xpath("//div[text()='INFO']")).click();
		String parking = driver.findElement(By.xpath("//div[contains(text(),'Parking Facility')]")).getText();
		if(parking.contains("Parking"))
		{
			System.out.println("the theatre has parking");
		}
		else
		{
			System.out.println("the theatre has no parking");
		}
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		driver.findElement(By.xpath("(//div[@class='__details'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='Accept']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Select Seats')]")).click();
		driver.findElement(By.xpath("//div[@id='C_3_0310']")).click();
		driver.findElement(By.xpath("//div[@id='C_3_0311']")).click();
		driver.findElement(By.xpath("//a[@id='btmcntbook']")).click();
		Thread.sleep(3000);
		

		 File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	     File designation = new File("./Output/bookmyshow.png");
	     FileUtils.copyFile(screenshotAs, designation);
	     
	}

}
