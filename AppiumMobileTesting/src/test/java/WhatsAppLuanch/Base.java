package WhatsAppLuanch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {

	public static Properties pro;
	public static DesiredCapabilities cab;
	public Base() throws IOException {
		InputStream input=new FileInputStream("C:\\Users\\Sai\\git\\AppiumProject\\AppiumMobileTesting\\src\\main\\resources\\Properties\\android.properties");
		pro=new Properties();
		pro.load(input);



		cab=new DesiredCapabilities();
		cab.setCapability("deviceName", pro.getProperty("deviceName"));
		cab.setCapability("udid", pro.getProperty("udid"));
		cab.setCapability("platformName", pro.getProperty("platformName"));
		cab.setCapability("platformVersion", pro.getProperty("platformVersion"));

	}

}
