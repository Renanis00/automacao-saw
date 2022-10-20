package util;

import java.util.ArrayList;

public class GeradorCPF {
	
	private ArrayList<Integer> listaAleatoria = new ArrayList<Integer>();
	private ArrayList<Integer> listaNumMultiplicados = null;

	// Metodo para geracao de um numero aleatorio entre 0 e 9
	public int geraNumAleatorio() {
		int numero = (int) (Math.random() * 10);
		return numero;
	}

	public ArrayList<Integer> geraCPFParcial() {
		for (int i = 0; i < 9; i++) {
			listaAleatoria.add(geraNumAleatorio());
		}
		return listaAleatoria;
	}

	public ArrayList<Integer> geraPrimeiroDigito() {
		listaNumMultiplicados = new ArrayList<Integer>();
		int primeiroDigito;
		int totalSomatoria = 0;
		int restoDivisao;
		int peso = 10;
		peso = calculaPeso(peso);
		totalSomatoria = calculaValorTotal(totalSomatoria);
		restoDivisao = (totalSomatoria % 11);
		// Se o resto da divisao for menor que 2 o primeiro digito sera 0, senao
		// subtraimos o numero 11 pelo resto da divisao
		if (restoDivisao < 2) {
			primeiroDigito = 0;
		} else {
			primeiroDigito = 11 - restoDivisao;
		}
		// Apos gerar o primeiro digito o adicionamos a lista
		listaAleatoria.add(primeiroDigito);
		return listaAleatoria;
	}

	// Para cada item na lista multiplicamos seu valor pelo seu peso
	private int calculaPeso(int peso) {
		for (int item : listaAleatoria) {
			listaNumMultiplicados.add(item * peso);
			peso--;
		}
		return peso;
	}

	public ArrayList<Integer> geraSegundoDigito() {
		listaNumMultiplicados = new ArrayList<Integer>();
		int segundoDigito;
		int totalSomatoria = 0;
		int restoDivisao;
		int peso = 11;
		peso = calculaPeso(peso);
		totalSomatoria = calculaValorTotal(totalSomatoria);
		restoDivisao = (totalSomatoria % 11);
		// Se o resto da divisao for menor que 2 o segundo digito sera 0, senao
		// subtraimos o numero 11 pelo resto da divisao
		if (restoDivisao < 2) {
			segundoDigito = 0;
		} else {
			segundoDigito = 11 - restoDivisao;
		}
		listaAleatoria.add(segundoDigito);
		return listaAleatoria;
	}

	private int calculaValorTotal(int totalSomatoria) {
		for (int item : listaNumMultiplicados) {
			totalSomatoria += item;
		}
		return totalSomatoria;
	}

	public String geraCPFFinal() {
		geraCPFParcial();
		geraPrimeiroDigito();
		geraSegundoDigito();
		String cpf = "";
		/*
		 * Aqui vamos concatenar todos os valores da lista em uma string
		 */
		for (int item : listaAleatoria) {
			cpf += item;
		}
		return cpf;
	}

}