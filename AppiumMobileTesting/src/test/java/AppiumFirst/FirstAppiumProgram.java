package AppiumFirst;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FirstAppiumProgram {
	
	public static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception{
		
		InputStream input=new FileInputStream("C:\\Users\\Sai\\eclipse-workspace\\AppiumMobileTesting\\src\\main\\resources\\Properties\\android.properties");
		Properties pro=new Properties();
		pro.load(input);
		//QDT4C18117013130
		
		DesiredCapabilities cab=new DesiredCapabilities();
		cab.setCapability("deviceName", "first");
		cab.setCapability("udid", "QDT4C18117013130");
		cab.setCapability("platformName", "Android");
		cab.setCapability("platformVersion", "9");
		cab.setCapability("appPackage", "com.android.calculator2");
		//cab.setCapability("appPackage",pro.getProperty("calender"));

		cab.setCapability("appActivity", "com.android.calculator2.Calculator");
		//cab.setCapability("appActivity",pro.getProperty("activities"));

		//System.out.println(pro.getProperty("activities"));
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		 driver=new AppiumDriver<MobileElement>(url,cab);
		System.out.println("started");
		System.out.println("server is running");
		
		
		elementclick("com.android.calculator2:id/digit_8");
		elementclick("com.android.calculator2:id/op_add");

		
		elementclick("com.android.calculator2:id/digit_2");
		
		//com.android.calculator2:id/eq
		
		elementclick("com.android.calculator2:id/eq");

		
		//com.android.calculator2:id/op_add
		
		//com.android.calculator2:id/formula
		
		
		String total=driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
		System.out.println(total);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"minus\"]")).click();

        driver.quit();


	}

	private static void elementclick(String elementname) {
		

		MobileElement element=driver.findElement(By.id(elementname));
		element.click();		
	}
	

}
