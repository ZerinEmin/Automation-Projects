package deneme;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class sendsms {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); 

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");

        dc.setCapability("appPackage", "com.samsung.android.messaging");
        dc.setCapability("appActivity", "com.android.mms.ui.ComposeMessageMms");
        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        
        AndroidDriver driver = new AndroidDriver(url, dc);
         Thread.sleep(5000);
         
         WebElement floatingactionbutton = driver.findElement(By.id("com.samsung.android.messaging:id/floating_action_button"));
         floatingactionbutton.click();
         WebElement compose = driver.findElement(By.id("com.samsung.android.messaging:id/btn_menu_compose"));
         compose.click();
         WebElement entermessage = driver.findElement(By.id("com.samsung.android.messaging:id/editor_view_stub"));
         entermessage.click();
         entermessage.sendKeys("abdcdde");
         WebElement sendbutton = driver.findElement(By.id("com.samsung.android.messaging:id/send_button"));
         sendbutton.click();
         
         Thread.sleep(7000);
         driver.close();
         
}
}