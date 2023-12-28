package automation;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class GesturesIOS extends IOSBaseTest{
	
	@Test
	
	public void IOSLongPress() 
	{
		driver.findElement(AppiumBy.accessibilityId("Steppers")).click();
		
		WebElement ele = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'Increment'`]"));
		Map <String, Object>params = new HashMap<>();
		params.put("element", ((RemoteWebElement) ele).getId());
		params.put("duration, 5", params);
		driver.executeScript("mobile: touchAndHold", "params");
		
		//longpress, scroll,swipe, slides, dropdown
	}
	
	
	public void IOSScrollTest ()
	{
		WebElement ele = driver.findElement(AppiumBy.accessibilityId("Web View"));
		Map<String,Object> params = new HashMap<>();
		params.put("direction", "down");
		params.put("element",((RemoteWebElement)ele).getId() );
		
		
		driver.executeScript("mobile:scroll", params);		
		driver.findElement(AppiumBy.accessibilityId("Web View")).click();
		
		
	}

	public void IOSPicker ()
	{
		
		WebElement ele = driver.findElement(AppiumBy.accessibilityId("Web View"));
		Map<String,Object> params = new HashMap<>();
		params.put("direction", "down");
		params.put("element",((RemoteWebElement)ele).getId() );
		
		driver.executeScript("mobile:scroll", params);	
		driver.findElement(AppiumBy.accessibilityId("Web View")).click();
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='UIKitCatalog']")).click();
		driver.findElement(AppiumBy.accessibilityId("Picker View")).click();
		driver.findElement(AppiumBy.accessibilityId("Red color component value")).sendKeys("80");
		driver.findElement(AppiumBy.accessibilityId("Green color component value")).sendKeys("220");
		driver.findElement(AppiumBy.iOSNsPredicateString("label =='Blue color component value")).sendKeys("95");
		String number = driver.findElement(AppiumBy.iOSNsPredicateString("label =='Blue color component value")).getText();
		Assert.assertEquals(number, "95");
	}
	
	public void IOSSlider ()
	{
		
	}
}
