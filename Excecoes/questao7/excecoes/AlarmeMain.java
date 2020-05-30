package questao7.excecoes;

import java.util.Scanner;

public class AlarmeMain {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		boolean isValida = false;
		
		while (isValida == false) {
			try {
				System.out.print("Digite a hora do alarme: ");
				int hora = teclado.nextInt();
				System.out.print("Digite o minuto do alarme: ");
				int minuto = teclado.nextInt();
				Alarme alarme = new Alarme (hora, minuto);
				
				while (!alarme.isAgora()) {
					System.out.print(".");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} 
				
				System.out.println();
				System.out.println("Alarme disparado");
				
				isValida = true;
			} catch (HoraInvalidaException exc) {
				System.out.println(exc.getMessage());
			} catch (MinutoInvalidoException e) {
				System.out.println(e.getMessage());
			}
		}
		teclado.close();

	}
}

