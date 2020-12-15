package Native;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo1 extends capability {
	
	AndroidDriver<AndroidElement> driver; 
	@BeforeTest
	public void pr() throws MalformedURLException
	{
		driver = Capability();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testCase1() throws MalformedURLException
	{
		System.out.println("The app opened without installing the apk in emulator");
		driver.findElement(MobileBy.AccessibilityId("Preference")).click();
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(MobileBy.id("android:id/checkbox")).click();
		
		
	}
	
}
