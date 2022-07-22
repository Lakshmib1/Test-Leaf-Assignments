package week2.day2;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgroundcheckbox {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/home.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//img[@alt='Checkbox']")).click();
	//Select select1 = new Select(driver.findElement(By.xpath("//label[contains(text(),'Select the languages that you know?')]")));
	//select1.selectByVisibleText("Java");
	driver.findElement(By.xpath("//label[contains(text(),'Select the languages that you know?')]/following::input[1]")).click();
	WebElement selected = driver.findElement(By.xpath("//label[contains(text(),'Confirm Selenium is checked')]/following::input[1]"));
	boolean selected2 = selected.isSelected();
	if(selected2 == true)
	{
		System.out.println("the value selenium is selected");
	}
	driver.findElement(By.xpath("//label[contains(text(),'DeSelect only checked')]//following::input[2]")).click();	
	java.util.List<WebElement> list = driver.findElements(By.xpath("//label[contains(text(),'Select all below checkboxes')]//following::input"));
	System.out.println(Integer.toString(list.size()));
	for(WebElement e1:list)
	{
		e1.click();
	}


	
	
	
	}

}
