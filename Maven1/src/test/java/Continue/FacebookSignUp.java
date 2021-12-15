package Continue;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class FacebookSignUp {
	
	
	
@Test
public void initBrow() throws InterruptedException {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805964%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=550525805964&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D9061667%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwlOmLBhCHARIsAGiJg7k6s_0s07DyjBfaAh-ITztb-qXRp551eigRTbjUMcRssDPhMks5FwcaAtHbEALw_wcB");
	driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Hemant");
	driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Sharma");
	driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("9891390688");
	driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("hemant.hs828@gmail.com");
	WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
	WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
	WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
	
	Thread.sleep(3000);
	
	
	Select sr = new Select(day);
	sr.selectByValue("1");
	Select srr = new Select(month);
	srr.selectByValue("1");
	Select srrr = new Select(year);
	srrr.selectByValue("1994");
	driver.findElement(By.xpath("(//*[@class='_58mt'])[2]")).click();
	driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
	
	
	
	
	
}
}
