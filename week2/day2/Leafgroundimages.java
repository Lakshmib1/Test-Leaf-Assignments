package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgroundimages {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		driver.findElement(By.xpath("//label[(contains(text(),'Click on this image to go home page'))]/following::img")).click();
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		
		WebElement bro = driver.findElement(By.xpath("//label[(contains(text(),'Am I Broken Image?'))]/following::img"));
		if (bro.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("image is broken");
		}
		WebElement key = driver.findElement(By.xpath("//label[(contains(text(),'Click me using Keyboard or Mouse'))]/following::img"));
		key.sendKeys(Keys.ENTER);
	}

}
