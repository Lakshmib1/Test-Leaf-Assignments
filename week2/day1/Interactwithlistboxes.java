package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interactwithlistboxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();//verifies the version,downloads and then setup the browser
		String property = System.getProperty("webdriver.chrome.driver");
		System.out.println(property);
		
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("http://www.leafground.com/pages/Dropdown.html");
				
		driver.manage().window().maximize();
		WebElement findElement1 = driver.findElement(By.id("dropdown1"));
		
		Select select = new Select(findElement1);
		//select.selectByIndex(2);
		//select.selectByValue("3");
		
		select.selectByVisibleText("Loadrunner");
		
		
		
	
}
}
