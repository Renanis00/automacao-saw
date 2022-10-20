package com.teste.QaTestGss;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

//import static org.junit.Assert.*; 
//import org.apache.pdfbox.*;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
/*
		File file = new File("C://Users//robson.cardoso//Downloads//confirmacao-faturamento.pdf");
		FileInputStream fis = new FileInputStream(file);

		PDFParser parser = new PDFParser(fis);

		parser.parse();

		COSDocument cosDoc = parser.getDocument();
		PDDocument pdDoc = new PDDocument(cosDoc);
		PDFTextStripper strip = new PDFTextStripper();
		String data = strip.getText(pdDoc);

		// Assert.assertTrue(data.contains("Leitura"));

		System.out.println(data);

		// System.out.println(data.contains("Senha"));
*/
		//==================================================================================
		
		
		 // instância um objeto da classe Random usando o construtor padrão Random
		  Random gerador = new Random();
		 
		 // imprime sequência de números inteiros aleatórios 
		  for (int i = 0; i < 1; i++)		  
		  { 
			  System.out.println(gerador.nextInt(1000));
		  
		  }
		  
		 

	}
}
