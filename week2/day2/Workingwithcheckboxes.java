package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Workingwithcheckboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//selecting one single checkbox
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//selecting all the checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		int size = checkboxes.size();
		System.out.println("total no of checkboxes " +size);

	for(WebElement e1:checkboxes)
		{
			e1.click();
		} 
		
	for(int i=0;i<size;i++)
		{
			checkboxes.get(i).click();
		}
//		selecting 2 checkboes
		
		for(int i = size-3;i<size;i++)
		{
			checkboxes.get(i).click();
		}
	
	}
	

}
