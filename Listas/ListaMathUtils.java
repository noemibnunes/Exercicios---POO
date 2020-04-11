package Listas;

import java.util.ArrayList;
import java.util.List;

import Arrays.ArrayMathUtils;

public class ListaMathUtils {
	
	public static List calculaDivisores(int num) {
		List <Integer> divisores = new ArrayList();
		int divisor = 0;
		
		for (int i = 1; i <= num; i++) {
			if(num%i == 0) {
				divisores.add(i);
				divisor++;
			}
			
		} return divisores;
	}
	
	public static double computaMaior(List <Double> numeros) {
		double maior = 0;
		
		for(Double valor: numeros) {
			if(valor > maior) {
				maior = valor;
			}
		} 
		return maior;
	}
	
	public static double computaMenor(List <Double> numeros) {
		double menor = numeros.size();
		
		for(Double valor: numeros) {
			if(valor < menor) {
				menor = valor;
			}
		}
		return menor;
	}
	
	public static double computaMedia(List <Double> numeros) {
		double media = 0;
		double soma = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			soma += numeros.get(i);
		} media = soma/numeros.size();
		return media;
	} 
	
	public static boolean temNumRepetido(List <Double> numeros) {
		boolean repetido = false;

		for (int i = 0; i < numeros.size(); i++) {
			double numeroRepet = numeros.get(i);
			for (int j = 0; j < numeros.size() - 1; j++) {
				double repete = numeros.get(j);
				if(numeroRepet == repete) {
					repetido = true;
				}else {
					repetido = false;
				}
			}
		}
	return repetido;
	}
	
	/**
	 OBSERVAÇÃO - Não consegui fazer (questão 3 da lista de exercicios de Listas) 
	 **/
}
