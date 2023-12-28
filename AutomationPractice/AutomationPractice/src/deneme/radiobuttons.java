package deneme;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class radiobuttons {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); 

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        
        dc.setCapability(MobileCapabilityType.APP,"C:\\apkfiles\\General-Store.apk");
        		
        
        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        @SuppressWarnings("unused")
		AndroidDriver driver = new AndroidDriver(url, dc);
        Thread.sleep(5000);
        
 driver.findElement(By.xpath("//*[contains(@text,'Afghanistan')]")).click();
        
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Aruba" + "\").instance(0))"));
        
        driver.findElement(By.xpath("//*[contains(@text,'Aruba')]")).click();
        
        driver.navigate().back();	
        
driver.findElement(By.xpath("//*[contains(@text,'Aruba')]")).click();
        
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Belarus" + "\").instance(0))"));
        
        driver.findElement(By.xpath("//*[contains(@text,'Belarus')]")).click();
        
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Zerin Emin");
        driver.hideKeyboard();
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        

}}
