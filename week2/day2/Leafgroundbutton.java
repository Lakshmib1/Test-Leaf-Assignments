package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgroundbutton {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Go to Home Page')]")).click();
	driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
	
	WebElement pos = driver.findElement(By.xpath("//button[contains(text(),'Get Position')]"));
	Point location = pos.getLocation();
	System.out.println(location);
	
	WebElement color = driver.findElement(By.xpath("//button[contains(text(),'What color am I?')]"));
	String cssValue = color.getCssValue("background-color");
	System.out.println(cssValue);
	
	WebElement size = driver.findElement(By.xpath("//button[contains(text(),'What is my size?')]"));
	Dimension size2 = size.getSize();
	System.out.println(size2);
	}

}
