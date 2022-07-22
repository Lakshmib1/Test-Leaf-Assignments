package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAutomation {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	//driver.findElement(By.id("open-registration-form-button")).click();
	driver.findElement(By.xpath("//form[contains(@data-testid,'royal_login_form')]/div[5]/a")).click();
	driver.findElement(By.name("firstname")).sendKeys("Laks");
	driver.findElement(By.name("lastname")).sendKeys("kamesh");
	driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("9791098866");
	driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("Welcome123");
	WebElement day = driver.findElement(By.name("birthday_day"));
	Select select1 = new Select(day);
	select1.selectByVisibleText("5");
	
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select select2 = new Select(month);		
	select2.selectByVisibleText("Oct");
	
	WebElement year = driver.findElement(By.name("birthday_year"));
	Select select3= new Select(year);
	select3.selectByVisibleText("1990");
	
	driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();

	}

}
