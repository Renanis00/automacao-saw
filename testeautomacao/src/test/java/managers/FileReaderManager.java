package managers;

import dataProvider.ConfigFileReader;
//import dataProvider.JsonDataReader;


/**
 * Classe que gerencia os arquivos de leitura a serem utilizados nos testes</n>
 * 
 * 
 * 
 * 
 */

public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	//private static JsonDataReader jsonDataReader;

	
	/**
	 * Metodo que retorna a instancia do objeto FileReaderManager.
	 *  
	 * 
	 *       
	 * @return FileReaderManager - Instancia da classe FileReaderManager.
     */		
	
	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	
	/**
	 * Metodo que retorna a instancia de um objeto do tipo ConfigFileReader, caso o objeto nao exista e criada uma instancia do mesmo.
	 *  
	 * 
	 *       
	 * @return ConfigFileReader - Instancia da classe ConfigFileReader.
     */		
	
	public ConfigFileReader getConfigReader() {
		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}

	
	/**
	 * Metodo que retorna a instancia de um objeto do tipo JsonDataReader, caso o objeto nao exista ele e instanciado.
	 *  
	 * 
	 *       
	 * @return ConfigFileReader - Instancia da classe JsonDataReader.
     */		
		
	//public JsonDataReader getJsonReader() {
	//	return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
	//}
}
