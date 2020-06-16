package GoogleChrome;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Camera {
	
	// static AppiumDriver<MobileElement> driver;
	
	static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException {
	
		
		DesiredCapabilities cab=new DesiredCapabilities();
		cab.setCapability("deviceName", "first");
		cab.setCapability("udid", "QDT4C18117013130");
		cab.setCapability("platformName", "Android");
		cab.setCapability("platformVersion", "9");
		cab.setCapability("appPackage", "com.huawei.camera");

		cab.setCapability("appActivity", "com.huawei.camera.controller.CameraActivity");

		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		 driver=new AppiumDriver<MobileElement>(url,cab);
		System.out.println("started");
		System.out.println("server is running");
		
	}

}
