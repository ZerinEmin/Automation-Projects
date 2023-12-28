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
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class IOSBaseTest {
	 

	
	public IOSDriver driver;
	public AppiumDriverLocalService service;
	
	@Test
	public void ConfigureAppium() throws MalformedURLException
	{
		
		
								
		XCUITestOptions options = new XCUITestOptions();
		options.setDeviceName("iPhone 12 Pro");
		options.setApp("//Users//zerinemin/Desktop//UIKitCatalog.app");
		options.setPlatformVersion("17.0");
		options.setWdaLaunchTimeout(Duration.ofSeconds(10));
		
		
		
			 driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	

	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		}
	


}
