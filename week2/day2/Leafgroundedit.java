package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgroundedit {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//img[contains(@alt,'Edit / Text Fields')]")).click();
	driver.findElement(By.id("email")).sendKeys("laks@gmail.com");
	driver.findElement(By.xpath("//input[contains(@value,'Append')]")).sendKeys("added",Keys.TAB);
	
	WebElement getvalue = driver.findElement(By.xpath("//input[contains(@value,'TestLeaf')]"));
	String attr = getvalue.getAttribute("value");
	System.out.println(attr);
	
	driver.findElement(By.xpath("//input[contains(@value,'Clear me!!')]")).clear();
	WebElement check = driver.findElement(By.xpath("//label[contains(text(),'Confirm that edit field is disabled')]/following::input"));
	boolean enabled = check.isEnabled();
	if(enabled==false)
	{
		System.out.println("the textbox is not enabled");
	}

	}

}
