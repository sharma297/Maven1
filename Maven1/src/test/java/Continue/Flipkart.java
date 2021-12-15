package Continue;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("._3OO5Xc>input")).sendKeys("shoes");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".L0Z3Pu")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Court Legacy Tennis Shoes For Men')]")).click();
		Thread.sleep(2000);
		Set<String> windows =driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String> it=    windows.iterator();
		String paraent =it.next();
		String child = it.next();
		
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//*[@class='_3kidJX']"))).perform();
	}

}
