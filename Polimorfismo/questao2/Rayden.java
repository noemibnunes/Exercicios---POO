package Polimorfismo.questao2;

public class Rayden extends Lutador {

	public Rayden() {
		super("Rayden");
	}
	
	public void lancarMagia(Lutador outroLutador) {
		super.lancarMagia(outroLutador);
		outroLutador.vida -= 9;
		System.out.println(nome+ " lançou magia em: " +outroLutador.nome);
	}

}
