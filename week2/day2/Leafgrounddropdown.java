package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgrounddropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
		
		WebElement drop1 = driver.findElement(By.xpath("//div[@class='example']/select"));
		Select select1 = new Select(drop1);
		select1.selectByIndex(2);
		
		WebElement drop2 = driver.findElement(By.xpath("(//div[@class='example']/select)[2]"));
		Select select2 = new Select(drop2);
		select2.selectByVisibleText("Selenium");
		
		WebElement drop3 = driver.findElement(By.xpath("(//div[@class='example']/select)[3]"));
		Select select3 = new Select(drop3);
		select3.selectByValue("1");
		
		WebElement drop4 = driver.findElement(By.xpath("(//div[@class='example']/select)[4]"));
		Select select4 = new Select(drop4);
		List<WebElement> options = select4.getOptions();
		System.out.println("Number of elements " +options.size());
		
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Selenium");
		
		Select select5 = new Select(driver.findElement(By.xpath("(//div[@class='example']/select)[6]")));
		select5.selectByVisibleText("Loadrunner");
		
			
	}

}
