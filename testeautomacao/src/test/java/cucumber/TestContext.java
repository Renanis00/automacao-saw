package cucumber;

import browserFactory.WebDriverFactory;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	public ScenarioContext scenarioContext;

	public TestContext() {
		webDriverManager = new WebDriverManager();
		scenarioContext = new ScenarioContext();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		
		//WebDriver driver = new WebDriverFactory().build(System.getenv("driver"));
		
		
	}

	/**
	 * Metodo para retornar uma "instancia" do Objeto WebDriverManager.
	 * 
	 * 
	 * 
	 * @return WebDriverManager - Retorno da instancia do Objeto WebDriverManager.
	 */

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	/**
	 * Metodo para retornar uma instancia do Objeto PageObjectManager.
	 * 
	 * 
	 * 
	 * @return PageObjectManager - Retorno da instancia do Objeto PageObjectManager.
	 */

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

	/**
	 * Metodo para retornar uma instancia do Objeto ScenarioContext.
	 * 
	 * 
	 * 
	 * @return ScenarioContext - Retorno da instancia do Objeto ScenarioContext.
	 */

	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}
}
