package questao3.excecoes;

import java.util.Scanner;

public class DataMain {
	public static void main(String[] args) throws DataInvalidaException {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o dia: ");
		int dia = teclado.nextInt();
		System.out.print("Digite o mês: ");
		int mes = teclado.nextInt();
		System.out.print("Digite o ano: ");
		int ano = teclado.nextInt();
		

		try {
			Data data = new Data(dia, mes, ano);
			System.out.println("Faltam " + data.getQuantidadeDeDias() + " dia(s) para a data " + dia + "/" + mes + "/" + ano);
			
		} catch(DataInvalidaException exc) {
			System.out.println(exc.getMessage());
		}
		teclado.close();
	}
}
