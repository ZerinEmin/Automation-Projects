package deneme;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class dialanumber {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); 

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");

        dc.setCapability("appPackage", "com.android.phone");
        dc.setCapability("appActivity", "com.android.phone.EmergencyDialer");
        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        
        AndroidDriver driver = new AndroidDriver(url, dc);
         Thread.sleep(5000);
         
         WebElement two = driver.findElement(By.id("com.android.phone:id/two"));
         two.click();
         WebElement dialbutton = driver.findElement(By.id("com.android.phone:id/dialButton"));
         dialbutton.click();
         
         driver.close();       
}
}