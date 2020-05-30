package questao6.excecoes;

import java.util.Scanner;

public class VendaMain {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor total da venda: ");
		double totalVenda = teclado.nextDouble();
		
		Venda venda = new Venda(totalVenda);

		
		boolean qtdParcelasOk = false;

		while (qtdParcelasOk == false) {
			System.out.println("Digite a quantidade de parcelas: ");
			try {
				int qtdParcelas = teclado.nextInt();
				venda.setQtdParcelas(qtdParcelas);
				qtdParcelasOk = true;
				System.out.println("Valor da parcela: " + venda.getValorParcela());

			} catch (ValorMinimoParcelaException exce) {
				System.out.println(exce.getMessage());
			}
		}
		
		teclado.close();
	}

}
