package android;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestAndroid {
	/*
	
	@Test
	public void testeGss() throws MalformedURLException, InterruptedException {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "br.com.aegea.leitura");
		desiredCapabilities.setCapability("appActivity", "br.com.aegea.leitura.UnidadeActivity");

		AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),
				desiredCapabilities);
		Thread.sleep(5000);
//informe unidade click
		MobileElement el1 = (MobileElement) driver.findElementById("android:id/text1");
		el1.click();
		Thread.sleep(5000);
//clica na unidade guaritest
		MobileElement el2 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		el2.click();
		// Thread.sleep(5000);
//clicka no avançar 		
		MobileElement el3 = (MobileElement) driver.findElementById("br.com.aegea.leitura:id/unidade_botao_avancar");
		el3.click();
		Thread.sleep(5000);
//informe usuario 		
		MobileElement el4 = (MobileElement) driver.findElementById("br.com.aegea.leitura:id/login_usuario");
		el4.sendKeys("walef");
//informe senha 		
		MobileElement el5 = (MobileElement) driver.findElementById("br.com.aegea.leitura:id/login_senha");
		el5.sendKeys("234");
//clickar em avançar 		
		Thread.sleep(5000);
		MobileElement el6 = (MobileElement) driver.findElementById("br.com.aegea.leitura:id/login_botao_avancar");
		el6.click();
//impressora nao selecionada configurar ?	clicka em cancelar 	
		Thread.sleep(5000);
		MobileElement el7 = (MobileElement) driver.findElementById("android:id/button2");
		el7.click();
//clicka baixar tarefa    		
		Thread.sleep(5000);
		MobileElement el8 = (MobileElement) driver.findElementById("br.com.aegea.leitura:id/lista_tarefa_sincronizar");
		el8.click();
//clickar em allow - permitir que o android execute o app 		
		Thread.sleep(5000);
		MobileElement el9 = (MobileElement) driver
				.findElementById("com.android.packageinstaller:id/permission_allow_button");
		el9.click();
//click em cancelar impressora 		
		Thread.sleep(5000);
		MobileElement el10 = (MobileElement) driver.findElementById("android:id/button2");
		el10.click();

		
		Thread.sleep(5000);
		
		// esperaDesaparecer <<==============================
		WebDriverWait wait = new WebDriverWait(driver, 400);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElementById(
				"android:id/alertTitle")));

		// clica na tarefa
		// Thread.sleep(5000);
		MobileElement el11 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout");
		el11.click();

		Thread.sleep(5000);
		// dia de chuva ? Sim
		MobileElement el12 = (MobileElement) driver.findElementById("android:id/button1");
		el12.click();

		// clica no cartão de informações basicas da ligação
		Thread.sleep(9000);
		MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
		el13.click();
		
		

		Thread.sleep(5000);
		// click nos numeros para informar leitura
		MobileElement el14 = (MobileElement) driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_7");
		el14.click();
		MobileElement el15 = (MobileElement) driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_7");
		el15.click();
		MobileElement el16 = (MobileElement) driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_7");
		el16.click();
		
		Thread.sleep(5000);
		MobileElement el19 = (MobileElement) driver.findElementById("br.com.aegea.leitura:id/coleta_menu_confirma");
		el19.click();
		Thread.sleep(5000);
		MobileElement el20 = (MobileElement) driver.findElementById("android:id/button1");
		el20.click();
		Thread.sleep(5000);
		MobileElement el21 = (MobileElement) driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_7");
		el21.click();
		MobileElement el22 = (MobileElement) driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_7");
		el22.click();
		MobileElement el23 = (MobileElement) driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_7");
		el23.click();
		
		Thread.sleep(5000);
		MobileElement el26 = (MobileElement) driver.findElementById("br.com.aegea.leitura:id/coleta_menu_confirma");
		el26.click();
		
		//MobileElement el27 = (MobileElement) driver.findElementById("android:id/button1");
		//el27.click();

		Thread.sleep(5000);
		// click confirmar
		MobileElement el28 = (MobileElement) driver.findElementById("android:id/button1");
		el28.click();

	}
	
	*/
	
}
