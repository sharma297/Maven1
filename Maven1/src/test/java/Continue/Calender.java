package Continue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	static WebDriver driver =null;
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		//ChromeOptions ac = new ChromeOptions();
		//ac.setHeadless(true);
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.cssSelector("#departureCalendar")).click();
		String monthyearval =driver.findElement(By.xpath("//*[@class='DayPicker-Caption']")).getText();
		System.out.println(monthyearval);
		String month =monthyearval.split(" ")[0].trim();
		String year =monthyearval.split(" ")[1].trim();
		System.out.println(month+ " "+ year);
		
		while(!(month.equals("December") && year.equals("2022"))) {
			driver.findElement(By.xpath("//*[@aria-label='Next Month']")).click();
			monthyearval =driver.findElement(By.xpath("//*[@class='DayPicker-Caption']")).getText();
			System.out.println(monthyearval);
			month =monthyearval.split(" ")[0].trim();
			year =monthyearval.split(" ")[1].trim();
		}
		driver.findElement(By.xpath("//*[text()='18']")).click();
		//driver.close();
		
		
		
		
		
	}

}
