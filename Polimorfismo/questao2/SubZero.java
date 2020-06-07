package Polimorfismo.questao2;

public class SubZero extends Lutador {
	
	public SubZero() {
		super("SubZero");
	}

	@Override
	public void lancarMagia(Lutador outroLutador) {
		super.lancarMagia(outroLutador);
		outroLutador.vida -= 8;
		System.out.println(nome+ " lançou magia em: " +outroLutador.nome);
	}

}
