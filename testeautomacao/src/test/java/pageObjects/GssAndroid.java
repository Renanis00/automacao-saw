package pageObjects;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import javax.security.auth.kerberos.KeyTab;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserFactory.DroidDriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GssAndroid {
/*
	private static AndroidDriver<MobileElement> driver;
	WebDriverWait wait = new WebDriverWait(DroidDriverFactory.getDriver(), 10);

	@Before
	public void inicializarAppim() {
		driver = DroidDriverFactory.getDriver();
	}

	@AfterClass
	public static void finalizaClasse() {
		// DroidDriverFactory.killDriver();
	}

	@After
	public void tearDawn() {
		// DroidDriverFactory.getDriver().resetApp();

	}

	@Test
	public void testeGss() throws MalformedURLException, InterruptedException {
		// driver = inicializarApium();

		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// informe unidade click
		// wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("android:id/text1")));
		driver.findElementById("android:id/text1").click();

		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// clica na aguas de matao

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
				.click();

//clicka no avançar 		
		driver.findElementById("br.com.aegea.leitura:id/unidade_botao_avancar").click();
		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//informe usuario 		
		driver.findElementById("br.com.aegea.leitura:id/login_usuario").sendKeys("ROBSON");

//informe senha 		
		driver.findElementById("br.com.aegea.leitura:id/login_senha").sendKeys("1");

//clickar em avançar 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Thread.sleep(5000);
		driver.findElementById("br.com.aegea.leitura:id/login_botao_avancar").click();
//impressora nao selecionada configurar ?	clicka em cancelar 	
		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("android:id/button2").click();
//clicka baixar tarefa    		
		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("br.com.aegea.leitura:id/lista_tarefa_sincronizar").click();
//clickar em allow - permitir que o android execute o app 		
		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
//click em cancelar impressora 		
		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("android:id/button2").click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Thread.sleep(5000);

		// esperaDesaparecer <<==============================
		WebDriverWait wait = new WebDriverWait(driver, 400);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout")));

		// =======================================================

	
		                                                                       
		// if(!checkBox1.isSelected()){
		// checkBox1.click();
		// }else {
		// checkBox1.sendKeys(Keys.TAB);
		// }

		// =======================================================

		// clica na tarefa primeira 
					// Thread.sleep(5000);
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					MobileElement el11 = (MobileElement) driver
							.findElementById("br.com.aegea.leitura:id/lista_tarefa_item_nome_tarefa");
					el11.click();
		
		
		

		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// dia de chuva ? Sim
		driver.findElementById("android:id/button1").click();

		
		// =======================================================
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
	// ======================================================= // ========================================================================= //
	
		
		
		
		
		
		
		
		
		
		// clica no cartão de informações basicas da ligação
		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout")
				.click();

		
		
		
		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// click nos numeros para informar leitura
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();

		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("br.com.aegea.leitura:id/coleta_menu_confirma").click();
		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("android:id/button1").click();
		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();
		driver.findElementById("br.com.aegea.leitura:id/anti_theft_t9_key_9").click();

		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("br.com.aegea.leitura:id/coleta_menu_confirma").click();

		// Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("android:id/button1").click();

	}

*/

}
