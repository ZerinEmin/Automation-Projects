package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class MobileBrowserTest extends MobileBrowserBaseTest {
	
	//burda app acip test etmiyorsun, sadece mobilde browser test ediyorsun
	
	@Test
	public void browserTest  ()
	{
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("youtube");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
