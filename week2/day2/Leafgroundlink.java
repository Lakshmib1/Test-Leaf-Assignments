package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgroundlink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[contains(@src,'images/link.png')]")).click();
		
		driver.findElement(By.partialLinkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//img[contains(@src,'images/link.png')]")).click();
		
		driver.findElement(By.partialLinkText("Find where am supposed to go without clicking me?")).click();
		
		String currentUrl2 = driver.getCurrentUrl();
		if(currentUrl2.contains("Button"))
		{
			System.out.println("the link will take to button page");
			
		}		
		
		driver.findElement(By.xpath("//button[contains(text(),'Go to Home Page')]")).click();
		
		driver.findElement(By.xpath("//img[contains(@src,'images/link.png')]")).click();
	
		driver.findElement(By.partialLinkText("Verify am I broken?")).click();
		String currentUrl = driver.getCurrentUrl();
		
		if(currentUrl.contains("error"))
		{
			System.out.println("the site is broken");
		}
		
		driver.get("http://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[contains(@src,'images/link.png')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Go to Home Page')])[2]")).click();
		
		driver.findElement(By.xpath("//img[contains(@src,'images/link.png')]")).click();
		
		driver.findElement(By.partialLinkText("How many links are available in this page?")).click();
		int size1 = driver.findElements(By.tagName("a")).size();
		System.out.println(size1);
	}

}
