package automation;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSBasics extends IOSBaseTest{
	
	@Test
	
	public void IOSBasicTest() 
	{
		//xpath classname ios iosclasschain iospredicatestring can be used as locators
		driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
		//xpath ios device da yavas oldugu icin ona benzer olan iosclasschain var
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Text Entry'`]")).click();
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeCell")).sendKeys("test1");
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
		
		driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value == 'Confirm / Cancel' ")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value BEGINSWITH[c] == 'Confirm' ")).click();
		driver.findElement(AppiumBy.iOSNsPredicateString("label == 'Confirm'")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value ENDSWITH[c] == 'Cancel' "));
		
		//longpress, scroll,swipe, slides, dropdown
	}
	
}
