package questao1.excecoes;

import java.util.Scanner;

public class MesMain {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean mesValido = false;
		
		while (mesValido == false) {
			try {
				System.out.print("Digite o número do mês: ");
				Mes mes = new Mes(teclado.nextInt());
				mesValido = true;
				System.out.println("Nome do mês: " + mes.getNome());
			} catch (MesInvalidoException exc) {
				System.out.println(exc.getMessage());
			}
		}
		
		teclado.close();
	}
}
