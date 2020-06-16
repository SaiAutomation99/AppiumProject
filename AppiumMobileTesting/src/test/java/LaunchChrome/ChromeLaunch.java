package LaunchChrome;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ChromeLaunch {

	public static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cab=new DesiredCapabilities();
		cab.setCapability("deviceName", "first");
		cab.setCapability("udid", "QDT4C18117013130");
		cab.setCapability("platformName", "Android");
		cab.setCapability("platformVersion", "9");
		cab.setCapability("appPackage", "com.android.chrome");

		cab.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");

		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		 driver=new AppiumDriver<MobileElement>(url,cab);
		System.out.println("started");
		System.out.println("server is running");
		driver.findElement(By.id("com.android.chrome:id/terms_accept")).click();
		driver.findElement(By.id("com.android.chrome:id/next_button")).click();
		driver.findElement(By.id("com.android.chrome:id/positive_button")).click();
		driver.get("https://www.facebook.com/");

	}

}
