package deneme;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class handleswitches {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); 

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        
        dc.setCapability(MobileCapabilityType.APP, "C:\\apkfiles\\TOGGLE BUTTON_1.0_apkcombo.com.apk");

        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        
        AndroidDriver driver = new AndroidDriver(url, dc);
         Thread.sleep(5000);
         
         WebElement button = driver.findElement(By.id("com.somemuch.arslan.togglebutton:id/toggleButton1"));
         button.click();
         
         WebElement submit = driver.findElement(By.id("com.somemuch.arslan.togglebutton:id/button1"));
         submit.click();
         
         String toast = driver.findElement(By.xpath("(/hierarchy/android.widget.Toast)[1]")).getAttribute("name");
         
         

         if(toast.equals("ToggleButton1 : On ToggleButton2 : Off"))
        	 
         {
             System.out.println("Test Passed...");
         }
         else
         {
             System.out.println("Test Failed...");
         }
         
         
	}
}
         
  
