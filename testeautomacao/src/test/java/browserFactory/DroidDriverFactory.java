package browserFactory;




import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DroidDriverFactory {
	
	/*
	
	private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() {
		if (driver == null) {

			createDriver();
		}
		return driver;
	}

	public static void createDriver() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "br.com.aegea.leitura");
		desiredCapabilities.setCapability("appActivity", "br.com.aegea.leitura.UnidadeActivity");

		try {
			driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;

		}
	}



*/

}
