package deneme;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class calculator {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); 

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");

        dc.setCapability("appPackage", "com.bak.mnr.calculatrice");
        dc.setCapability("appActivity", "com.bak.mnr.calculatrice.MainActivity");
        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, dc);

        Thread.sleep(5000);

        WebElement seven = driver.findElement(By.id("com.bak.mnr.calculatrice:id/btn7"));
        seven.click();
        WebElement plus = driver.findElement(By.id("com.bak.mnr.calculatrice:id/btnP"));
        plus.click();
        WebElement three = driver.findElement(By.id("com.bak.mnr.calculatrice:id/btn3"));
        three.click();
        WebElement equalTo = driver.findElement(By.id("com.bak.mnr.calculatrice:id/btnE"));
        equalTo.click();


        WebElement results = driver.findElement(By.id("com.bak.mnr.calculatrice:id/Cadre"));

        if(results.getText().equals("10.0"))
        {
            System.out.println("Test Passed...");
        }
        else
        {
            System.out.println("Test Failed...");
        }
    }
}