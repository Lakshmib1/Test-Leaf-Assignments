package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erailportalautomation {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("txtStationFrom")).clear();
	driver.findElement(By.id("txtStationFrom")).sendKeys("Mgr C",Keys.TAB);
	driver.findElement(By.id("txtStationTo")).clear();
	
	driver.findElement(By.id("txtStationTo")).sendKeys("Ksr B",Keys.TAB);
	driver.findElement(By.id("chkSelectDateOnly")).click();
	driver.findElement(By.id("buttonFromTo")).click();
	
	int row = driver.findElements(By.xpath("//tbody//tr")).size();
	int col = driver.findElements(By.xpath("//tbody//th")).size();
	System.out.println("row "+row +" "+"col "+col );


	}

}
