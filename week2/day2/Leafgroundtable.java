package week2.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgroundtable {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/home.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//img[@alt='Table']")).click();
	
	int rowcount = driver.findElements(By.xpath("//section[@class='innerblock']//tr")).size();
	int colcount = driver.findElements(By.xpath("//section[@class='innerblock']//th")).size();
	System.out.println("rowcount of the table "+rowcount);
	System.out.println("colcount of the table "+colcount);
	
	WebElement findElement = driver.findElement(By.xpath("//font[contains(text(),'Learn to interact with')]/following::td/font"));
	String text = findElement.getText();
	System.out.println("the progress value of 'Learn to interact with Elements " +text);
	for(int i=1;i<rowcount;i++)
	{
		for(int j=1;j<=colcount;j++)
		{
			String text2 = driver.findElement(By.xpath("//tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
			System.out.println(text2);
			if(text2.equals("20%"))
				driver.findElement(By.xpath("//tbody/tr[6]//td[3]")).click();
		}
	}
	}

}

//print all the values
//arrays.sort
//print the first element .click

//string into integers
//parseint - convert string into integer
