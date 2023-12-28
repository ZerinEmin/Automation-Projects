package deneme;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class draganddrop {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); 

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        
        dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\ApiDemos-debug.apk");
        		
        
        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        @SuppressWarnings("unused")
		AndroidDriver driver = new AndroidDriver(url, dc);
        Thread.sleep(5000);
        
driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));"));
        
        driver.findElement(By.xpath("//*[contains(@text,'Views')]")).click();
        
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Drag and Drop\"));"));
        
        driver.findElement(By.xpath("//*[contains(@text,'Drag and Drop')]")).click();
        
        WebElement dotone = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
        
        WebElement source = driver.findElements(By.className("android.view.View")).get(2);
        WebElement target = driver.findElements(By.className("android.view.View")).get(1);
        
        AndroidTouchAction action = new AndroidTouchAction((AndroidDriver)driver);
        action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
      
	}}
        
        
        
        
        
        
        