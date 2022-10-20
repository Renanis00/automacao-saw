package cucumber;

import java.util.HashMap;
import java.util.Map;

import enums.Context;

/**
 * Classe para incluir, verificar ou retornar o valor de um dado parametrizado
 * do contexto de teste.
 */

public class ScenarioContext {

	private Map<String, Object> scenarioContext;

	public ScenarioContext() {
		scenarioContext = new HashMap<String, Object>();
	}

	/**
	 * Metodo para informar o valor de um contexto.
	 * 
	 * @param Context key - Contexto a ter valor informado.
	 * @param Object  value - Valor do contexto.
	 * 
	 */

	public void setContext(Context key, Object value) {
		scenarioContext.put(key.toString(), value);
	}

	/**
	 * Metodo para retornar o valor de um contexto
	 * 
	 * @param Context key - Contexto a ter valor retornado.
	 * 
	 * @return Object - valor do contexto.
	 */

	public Object getContext(Context key) {
		return scenarioContext.get(key.toString());
	}

	/**
	 * Metodo para retornar se existe o contexto informado.
	 * 
	 * @param Context key - Contexto a ser verificado.
	 * 
	 * @return Boolean - Retorno se o contexto existe.
	 */

	public Boolean isContains(Context key) {
		return scenarioContext.containsKey(key.toString());
	}
}
