package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zoomcars {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//verifies the version,downloads and then setup the browser
				
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://www.zoomcar.com/in/bangalore");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("https://www.zoomcar.com/"))
		{
		driver.findElement(By.xpath("(//span[contains(@class,'dropdown__label')])[1]")).click();
		
		driver.findElement(By.xpath("(//span[@class='dropdown-item__title'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='multiselect__tags'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Bangalore')]")).click();
		driver.findElement(By.xpath(" //button[contains(text(),Confirm)]")).click();
		}
		
		driver.findElement(By.xpath("//div[contains(text(),'Pick Up City')]")).click();
		//driver.findElement(By.xpath("(//h3[contains(text(),'Suggested Pick Up Locations')]/following::div[1]/div")).click();
		driver.findElement(By.className("ellipsis")).click();
		driver.findElement(By.className("field-date")).click();
		
		//driver.findElement(By.xpath("//span[@class='field-date start-time']")).click();
		driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Find cars')]")).click();
		
		
		
		
		
		

 
		
	}

}
