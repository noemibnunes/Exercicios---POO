package questao1.excecoes;

import java.util.Scanner;

public class MesMain {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean mesValido = false;
		
		while (mesValido == false) {
			try {
				System.out.print("Digite o n�mero do m�s: ");
				Mes mes = new Mes(teclado.nextInt());
				mesValido = true;
				System.out.println("Nome do m�s: " + mes.getNome());
			} catch (MesInvalidoException exc) {
				System.out.println(exc.getMessage());
			}
		}
		
		teclado.close();
	}
}
