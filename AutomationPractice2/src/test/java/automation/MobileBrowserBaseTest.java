package automation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MobileBrowserBaseTest {
	

	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException
	{
		
		
								
			UiAutomator2Options options = new UiAutomator2Options();
			
			options.setDeviceName("Pixel Zerin Emulator");
			options.setChromedriverExecutable("//Users//zerinemin//Documents//chromedriver_mac64");
			options.setCapability("browserName", "Chrome");
			
			driver =  new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	
	
	
	
	public Double getFormattedAmount(String amount)
	{
		Double price = Double.parseDouble(amount.substring(1));
		return price;
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		}
	


}
