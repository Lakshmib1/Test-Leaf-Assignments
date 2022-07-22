package marathon.code;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonautomation {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'for travelling')]")).click();
		String result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(result);
		
		driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/li/span/a/div/label/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@aria-labelledby='p_89-title']/li[3]/span/a/div/label/i")).click();
		String result1 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(result1);
		
		String numonly = result.replaceAll("[^0-9]", "");
			
		String value = numonly.substring(3);				
		String numonly1 = result1.replaceAll("[^0-9]", "");				
		String value1 = numonly1.substring(3);		
		int i=Integer.parseInt(value);
		int j=Integer.parseInt(value1);  
		
		if(i > j)
		{
			System.out.println("value as reduced");
		}
		
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Newest Arrivals')]")).click();
		String bagname = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
		System.out.println(bagname);
		String bagcost = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println(bagcost);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys",Keys.ENTER);
		String cssValue = driver.findElement(By.xpath("//span[contains(text(),'Deal of the Day')]")).getCssValue("color");
		System.out.println(cssValue);
		String bagvalue1 = driver.findElement(By.xpath("//span[@class='a-price']/span/span[2]")).getText();
		System.out.println(bagvalue1);
		driver.findElement(By.xpath("//span[@class='a-price']/span/span[2]")).click();
		
		 File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	     File designation = new File("./Output/amazon.png");
	     FileUtils.copyFile(screenshotAs, designation);
	}

}
