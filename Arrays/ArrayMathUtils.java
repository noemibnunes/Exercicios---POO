package Arrays;

public class ArrayMathUtils {
	
	private static int getNumDivisor(int num) {
		int numDivisores = 0;
		
		for (int i = 1; i <= num; i++) {
			if(num%i == 0) {
				numDivisores++;
			}
		}
		return numDivisores;
	}
	
	public static int[] calculaDivisores(int num) {
		int tamanho = ArrayMathUtils.getNumDivisor(num);
		int [] divisores = new int[tamanho];
		int divisor = 0;
		
		for (int i = 1; i <= num; i++) {
			if(num%i == 0) {
				divisores[divisor] = i;
				divisor++;
			}	
		} return divisores;
	}
	
	public static double computaMaior(double[] numeros) {
		double maior = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];	
			}
		} return maior;
			
	}
	
	public static double computaMenor(double[] numeros) {
		double menor = numeros.length;
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] < menor) {
				menor = numeros[i];	
			}
		} return menor;
			
	}
	
	public static double computaMedia(double[] numeros) {
		double media = 0;
		double soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		} media = soma / numeros.length;
		return media;
	}
	
	public static boolean temNumRepetido(double[] numeros) {
		for (int i = 0; i < numeros.length -1; i++) {
			double numeroBase = numeros[i];
			for (int j = i + 1; j < numeros.length; j++) {
				double comparacao = numeros[j];
				if(numeroBase == comparacao) {
					return true;
				}
				
			}
		} return false;
	}
	
	public static int[][] somaMatrizes(int[][] m1, int[][] m2){
		int [][] soma = new int[m1.length][];
		
		// quantas colunas a linha 0 de m1 possui
		for (int linha = 0; linha < m1.length; linha++) {
			
			int colunas = m1[linha].length;
			// instancia da linha (no indice "linha") 
			soma[linha] = new int [colunas];
			
			for (int coluna = 0; coluna < colunas; coluna++) {
				soma[linha][coluna] = m1[linha][coluna] + m2[linha][coluna];
				
			}
		} return soma;
	}
		
	// metodo para formatar a saida da soma das matrizes
	public static String ArrayBidimesional(int [][] array) {
		String saida = "";
		
		for (int linha = 0; linha < array.length; linha++) {
			for (int coluna = 0; coluna < array[linha].length; coluna++) {
				saida +=  array[linha][coluna] + " " ;				
			}
			saida += "\n";
		} return saida;
	}
	
	/**
	 OBSERVAÇÃO - Não consegui fazer (questão 4 da lista de exercicios de Arrays) 
	 **/
	

}
