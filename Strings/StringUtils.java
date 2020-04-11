package Strings;

import java.util.Arrays;

public class StringUtils {
	
	public static String formataAtributo(String atributo) {
		String [] palavra = atributo.split(" ");
		
		StringBuilder frase = new StringBuilder();
		
		for (int i = 0; i < palavra.length; i++) {
			if(i == 0) {
				frase.append(palavra[0]);
			}else {
				frase.append(palavra[i].substring(0, 1).toUpperCase() + palavra[i].substring(1));	
			}
		}	
		return frase.toString();
		
	}
	
	public static String formataMetodo(String metodo) {
		String [] palavra = metodo.split(" ");
		
		StringBuilder frase = new StringBuilder();
		
		for (int i = 0; i < palavra.length; i++) {
			if(i == 0) {
				frase.append(palavra[0]);
			}else {
				frase.append(palavra[i].substring(0, 1).toUpperCase() + palavra[i].substring(1));	
			}
		}	
		return frase.toString();
		
	}
	
	public static String formataClasse(String classe) {
		String [] palavra = classe.split(" ");
		
		StringBuilder frase = new StringBuilder();
		
		for (int i = 0; i < palavra.length; i++) {
			frase.append(palavra[i].substring(0, 1).toUpperCase() + palavra[i].substring(1));
						
		}
		return frase.toString();
	}
		
	public static String ordenaStrings(String palavra1, String palavra2) {
		
		int posicao = palavra1.compareTo(palavra2);
		
		if(posicao < 0) {
			return palavra1 + " " + palavra2;
		}else {
			return palavra2 +  " " + palavra1;
		}
	
	}
	
	public static boolean ehPalindromo(String palavra) {
		
		String saida = "";
		
		for(int i = palavra.length() -1; i >= 0; i --) {
			saida += palavra.charAt(i);
		}
		if (saida.equals(palavra)) {
			return true;
		}else {
			return false;
		}
		
	}
	
 	
	public static String transformaParaCaixaAlta(String palavra) {
		return palavra.toUpperCase();
	
	}
		
	public static int contaVogais(String frase) {
		int contaVogais = 0;
		
		frase.toLowerCase();
		
		for (int i = 0; i < frase.length(); i++){
            char vogal = frase.charAt(i);
            if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u')
                contaVogais++;
		}
		
		return contaVogais;
		
	} 
	
	public static String removeEspacosSuperfluos(String frase) {
		return frase.trim();	
	}
	
	public static String ocorrencias(String frase, String subPalavra) {
		
		int[] posicao = new int[subPalavra.length()];
		int contador = 0;
		int comeco = 0;
		while(frase.indexOf(subPalavra,comeco) > 0 ){
				posicao[contador] = frase.indexOf(subPalavra,comeco) ;	
				contador++;
				comeco = frase.indexOf(subPalavra,comeco) + subPalavra.length();
		}
		
		return Arrays.toString(posicao);
	}
		
	
	
	public static int binarioPraDecimal(String binario) {
		int potencia = 0;
		int soma = 0;
		
		for (int i = binario.length() - 1; i >= 0; i--) {
			soma += Math.pow(2, potencia) * 
					Character.getNumericValue(binario.charAt(i));
			potencia++;
			
		}
		return soma;
	}
	
	
	public static int getQtdadePalavras(String frase) {
		String [] palavras = frase.split(" ");
		return palavras.length;
	}
	
	public static String histogramaLetras(String texto) {
		int tamAlfabeto = 'z' - 'a' + 1;
		int [] histograma = new int [tamAlfabeto];
		texto.toLowerCase();
		
		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			if('a' <= letra && letra <= 'z') {
				histograma[letra - 'a']++;
			}
		}
		return Arrays.toString(histograma);
	}
	
	
	/** QUESTÃO 2 
	 *  Quando usamos o new a JVM cria uma variavél de referência, um objeto do tipo String e uma String no Pool.
	 *  Quando não usamos o new além de ser uma maneira mais prática de criar String, a JVM apenas uma String no Pool e refereciando o valor dela a variavél de referência
	 **/
	
	/** QUESTÃO 3
	 * StringPool é um lugar para armazenamento de Strings. 
	 * Para diminuir a sobrecarga da memória. Ao criamos uma String a JVM verifica se já existe uma String igual a que estamos criando no Pool, 
	 caso exista, uma referência é retornada, caso a String não exitir no Pool, um nova String será inicializada e adicionada no Pool.
	 **/
	
	/** QUESTÃO 4
	 * Strings são imutáveis, então toda vez que uma String é alterada, na verdade um novo objeto String é criado, e
	 o anterior fica ocupando espaço na memória até que seja removido.
	 * Inicialmente a String armazena "Eduardo", depois ela fica existindo na memória sem ser utilizada e
	 agora uma nova String armazena "Eduardo de Lucena", depois ela fica existindo na memória sem ser utilizada e
	 agora uma nova Sstring armazena "Eduardo de Lucena Falcao".
	 **/
	
	/** QUESTÃO 5
	 * No StringBuilder os objetos são mutáveis, sendo assim, os espaços na memória são economizados, pois é possivél
	 alterar um StringBuilder sem um novo objeto ser criado. 
	 **/
	
}
		
	
