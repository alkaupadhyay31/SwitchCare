package SwitchTest;

import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import SwitchCare.SwitchCapabilities;

public class SwitchTests1 extends SwitchCapabilities {
	
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void bt() throws MalformedURLException {
		
		driver = capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void Test1() throws InterruptedException {
		
driver.findElement(MobileBy.AccessibilityId("Enable Location Services")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.AccessibilityId("SIGN UP")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.xpath("//[@text='First Name']")).sendKeys("Alka");
		
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.xpath("//[@text='Last Name']")).sendKeys("upadhyay");
		
		Thread.sleep(2000);
		
		
		driver.findElement(MobileBy.xpath("//*[@text='(155) 764-1983']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.xpath("//*[@text='alka@gmail.com']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.AccessibilityId("By continuing I confirm that I have read the, , , and,")).click();
		
		driver.findElement(MobileBy.AccessibilityId("Next")).click();
		
        driver.findElement(MobileBy.xpath("//*[@text='New Password']")).sendKeys("Alka@12$$");
		
		driver.findElement(MobileBy.xpath("//*[@text='Confirm New Password']")).sendKeys("Alka@12$$");
		
		Thread.sleep(2000);
		
		driver.findElement(MobileBy.AccessibilityId("Submit")).click();
	}

}
