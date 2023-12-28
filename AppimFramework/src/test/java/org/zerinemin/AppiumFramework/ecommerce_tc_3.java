package org.zerinemin.AppiumFramework;


import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.zerinemin.pageobjects.android.Cartpage;
import org.zerinemin.pageobjects.android.Formpage;
import org.zerinemin.pageobjects.android.ProductCatalogue;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

	public class ecommerce_tc_3 extends BaseTest{

		
		@Test(dataProvider="getData")
		public void FillForm() throws InterruptedException
		{
			Formpage formPage = new Formpage(driver);
			formPage.setNameField("zerin");
			formPage.setGender("female");
			formPage.setCountrySelection("Turkey");
			ProductCatalogue productCatalogue = formPage.submitForm();
			productCatalogue.addItemToCartByIndex(0);
			Cartpage cartpage = productCatalogue.goToCartPage();
		
			
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text" , "Cart"));
	
	
	
	       double totalSum = cartpage.getProductsSum();
	       double displayFormattedSum = cartpage.getTotalAmountDisplayed();
	       Assert.assertEquals(totalSum,displayFormattedSum);
	       cartpage.acceptTermsConditions();
	       cartpage.submitOrder();
		}
	       
	     
	       
	       
	       
	       
	    // web ve native iki farkli context ve developer buna isim veriyor yazarken, burda her birinin adini yazdiriyorsun, daha sonra kullaniyorsun
	       
	       
	       Set<String> contexts = driver.getContextHandles();{
	       for (String contextName:contexts)
	       {
	    	   System.out.println(contextName); }
	       }
	       
	       
	     
	       
	   
		
			
			
			

			
			
		}
	

