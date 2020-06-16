package WhatsAppLuanch;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Netflix extends Base{
	
	public Netflix() throws IOException {
		
		
		super();
	}

	public static void main(String[] args) throws IOException {
		Netflix j=new Netflix();
		
		cab.setCapability("appPackage", "com.netflix.mediaclient");
		//cab.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");
		cab.setCapability("appActivity", "com.netflix.mediaclient.ui.launch.UIWebViewActivity");

		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url,cab);
		
		
		System.out.println("invoke");
		System.out.println("started");
		
		
		

	}

}
