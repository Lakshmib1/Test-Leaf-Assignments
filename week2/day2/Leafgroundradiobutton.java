package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgroundradiobutton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//img[@alt='Radio Button']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Are you enjoying the classes?')]/following::input[1]")).click();
		
		WebElement selected = driver.findElement(By.xpath("//label[contains(text(),'Find default selected radio button')]/following::input[2]"));
		String getvalue = selected.getAttribute("Value");
		System.out.println(getvalue);
    	if(getvalue.contains("1"))
		{
			System.out.println("the default selection is :checked");
		}
		
    	WebElement age = driver.findElement(By.xpath("//label[contains(text(),'Select your age group')]/following::input[2]"));
    	String checkedvalue = age.getAttribute("value");
    	System.out.println(checkedvalue);
    	if(checkedvalue.equals("1"))
    	{
    		System.out.println("do not select any value");
    	}
    		
	}

}
