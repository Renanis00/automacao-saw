package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import browserFactory.WebDriverFactory;
import enums.Ambiente;
import enums.DriverType;
import managers.WebDriverManager;

/**
 * Classe principal aonde sao instanciados os principais gerenciadores e a
 * classe de contexto do cenario.</n>
 * 
 * Os gerenciadores instanciados sao:
 * 
 * <ul>
 * <li>WebDriverManager</li>
 * <li>PageObjectManager</li>
 * </ul>
 * 
 * 
 * 
 */

public class ConfigFileReader {

	private Properties properties;
	private final String caminhoArquivoProperty = "configs//Configuration.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(caminhoArquivoProperty));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties nao encontrado em " + caminhoArquivoProperty);
		}
	}

	/**
	 * Metodo que retorna o tempo de espera parametrizado no arquivo Configuration.
	 * 
	 * 
	 * 
	 * @return long - Valor do tempo de espera parametrizado.
	 */

	public long getWait() {
		String wait = properties.getProperty("wait");
		if (wait != null)
			return Long.parseLong(wait);
		else
			throw new RuntimeException("wait nao especificado no arquivo Configuration.properties.");
	}

	/**
	 * Metodo que retorna a URL do ambiente de DEV parametrizada no arquivo
	 * Configuration.
	 * 
	 * 
	 * 
	 * @return String - Url do ambiente de DEV.
	 */

	public String getUrlDev() {
		String url = properties.getProperty("urlDev");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url nao especificado no arquivo Configuration.properties.");
	}

	/**
	 * Metodo que retorna a URL do ambiente de DEV2 parametrizada no arquivo
	 * Configuration
	 * 
	 * @author Robson Cardoso
	 * 
	 * @return String - Url do ambiente de DEV2.
	 */

	public String getUrlDev2() {
		String url = properties.getProperty("urlDev2");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url nao especificado no arquivo Configuration.properties.");
	}

	/**
	 * Metodo que retorna a URL do ambiente de QA parametrizada no arquivo
	 * Configuration.
	 * 
	 * 
	 * 
	 * @return String - Url do ambiente de QA.
	 */

	public String getUrlQa() {
		String url = properties.getProperty("urlQa");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url nao especificado no arquivo Configuration.properties.");
	}

	/**
	 * Metodo que retorna a URL do ambiente de HM parametrizada no arquivo
	 * Configuration.
	 * 
	 * 
	 * 
	 * @return String - Url do ambiente de HM.
	 */

	public String getUrlHm() {
		String url = properties.getProperty("urlHm");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url nao especificado no arquivo Configuration.properties.");
	}

	/**
	 * Metodo que retorna o caminho do driver do Chrome, parametrizado no arquivo
	 * Configuration.
	 * 
	 * 
	 * 
	 * @return String - Caminho do Driver do Chrome.
	 */

	public String getUrlMigr() {
		String url = properties.getProperty("urlMigr");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url nao especificado no arquivo Configuration.properties.");
	}

	public String getUrlQa04() {
		String url = properties.getProperty("urlQa04");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url nao especificado no arquivo Configuration.properties.");
	}

	public String getUrlQa05() {
		String url = properties.getProperty("urlQa05");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url nao especificado no arquivo Configuration.properties.");
	}

	public String getUrlClone() {
		String url = properties.getProperty("urlClone");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url nao especificado no arquivo Configuration.properties.");
	}

	public String getUrlProd() {
		String url = properties.getProperty("urlProd");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url nao especificado no arquivo Configuration.properties.");
	}

	public String getUrlSawb() {
		String url = properties.getProperty("urlSawb");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url nao especificado no arquivo Configuration.properties.");
	}
	/**
	 * Metodo que retorna o caminho do driver do Chrome, parametrizado no arquivo
	 * Configuration.
	 *
	 *
	 *
	 * @return String - Caminho do Driver do Chrome.
	 */
//	@Deprecated
	public String getCaminhoDriverChrome() {
		String caminhoDriver = properties.getProperty("driverChrome");
		//String caminhoDriver = "driver";
		
		if (caminhoDriver != null)
			return caminhoDriver;
				
	
		else
			throw new RuntimeException("Caminho do Driver nao especificado no arquivo Configuration.properties.");
		
		
	}
	
	
//	public WebDriver getDriver() {
		
//	return new WebDriverFactory().build(System.getProperty("driver"));
	
//}
	

	/**
	 * Metodo que retorna o caminho do driver do Firefox, parametrizado no arquivo
	 * Configuration.
	 * 
	 * 
	 * 
	 * @return String - Caminho do Driver do Firefox.
	 */

	public String getCaminhoDriverFF() {
		String caminhoDriver = properties.getProperty("driverFF");
		if (caminhoDriver != null)
			return caminhoDriver;
		else
			throw new RuntimeException("Caminho do Driver nao especificado no arquivo Configuration.properties.");
	}

	/**
	 * Metodo que retorna o caminho do driver do PhantomJS, parametrizado no arquivo
	 * Configuration./7~]
	 * 
	 * 
	 * 
	 * @return String - Caminho do Driver do PhantomJS.
	 */

	public String getCaminhoDriverPhantom() {
		String caminhoDriver = properties.getProperty("driverPhantom");
		if (caminhoDriver != null)
			return caminhoDriver;
		else
			throw new RuntimeException("Caminho do Driver nao especificado no arquivo Configuration.properties.");
	}

	/**
	 * Metodo que retorna o caminho da pasta Data Resource, parametrizado no arquivo
	 * Configuration.
	 * 
	 * 
	 * 
	 * @return String - Caminho da pasta Data Resourse.
	 */

	public String getCaminhoTestDataResource() {
		String testDataResourcePath = properties.getProperty("testDataResource");
		if (testDataResourcePath != null)
			return testDataResourcePath;
		else
			throw new RuntimeException(
					"Caminho do Test Data Resource nao especificado no arquivo Configuration.properties.");
	}

	/**
	 * Metodo que retorna o caminho da pasta de Report, parametrizado no arquivo
	 * Configuration.
	 * 
	 * 
	 * 
	 * @return String - Caminho da pasta Report.
	 */

	public String getCaminhoReport() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Caminho do Report Config nao especificado no arquivo Configuration.properties.");
	}

	/**
	 * Metodo que retorna o browser parametrizado na varieval de ambiente.
	 * 
	 * 
	 * 
	 * 
	 */

	/**
	 * Metodo que retorna o browser parametrizado no arquivo Configuration.
	 * 
	 * 
	 * 
	 * @return DriverType - Driver parametrizado no arquivo Configuration.
	 */
	@Deprecated
	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if (browserName == null || browserName.equals("chrome"))
			return DriverType.CHROME;

		else if (browserName == null || browserName.equals("chromeHL"))
			return DriverType.CHROMEHL;

		
		
		else if (browserName.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equals("iexplorer"))
			return DriverType.INTERNETEXPLORER;
		else if (browserName.equals("phantom"))
			return DriverType.PHANTOM;
		else
			throw new RuntimeException(
					"Nome do Browser no arquivo Configuration.properties não foi localizador : " + browserName);
	}

	/**
	 * Metodo que retorna o ambiente parametrizado no arquivo Configuration.
	 * 
	 * 
	 * 
	 * @return Ambiente - Ambiente parametrizado no arquivo Configuration.
	 */

	public Ambiente getAmbiente() {
		String ambienteNome = properties.getProperty("ambiente");
		if (ambienteNome.equalsIgnoreCase("qa"))
			return Ambiente.QA;
		else if (ambienteNome.equalsIgnoreCase("dev"))
			return Ambiente.DEV;
		else if (ambienteNome.equalsIgnoreCase("hm"))
			return Ambiente.HM;
		else if (ambienteNome.equals("dev2"))
			return Ambiente.DEV2;
		else if (ambienteNome.equals("migr"))
			return Ambiente.MIGR;
		else if (ambienteNome.equals("clone"))
			return Ambiente.CLONE;
		else if (ambienteNome.equals("qa04"))
			return Ambiente.QA04;
		else if (ambienteNome.equals("qa05"))
			return Ambiente.QA05;
		else if (ambienteNome.equals("prod"))
			return Ambiente.PROD;
		else if (ambienteNome.equals("sawb"))
			return Ambiente.SAWB;
		else
			throw new RuntimeException(
					"Nome do Ambiente no arquivo Configuration.properties não foi localizador : " + ambienteNome);
	}

	/**
	 * Metodo que retorna a URL do ambiente de DEV do Front, parametrizada no
	 * arquivo Configuration.
	 * 
	 * 
	 * 
	 * @return String - Url do ambiente de DEV do Front.
	 */

	public String getUrlFrontDev() {
		String url = properties.getProperty("urlFrontDev");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url nao especificado no arquivo Configuration.properties.");
	}

	/**
	 * Metodo que retorna a URL do ambiente de HM do Front, parametrizada no arquivo
	 * Configuration.
	 * 
	 * 
	 * 
	 * @return String - Url do ambiente de HM do Front.
	 */

	public String getUrlFrontHm() {
		String url = properties.getProperty("urlFrontHm");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url nao especificado no arquivo Configuration.properties.");
	}

}
