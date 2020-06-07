package Polimorfismo.questao2;

public class Sonia extends Lutador {

	public Sonia() {
		super("Sônia");
	}
	
	@Override
	public void socar(Lutador outroLutador) {
		super.socar(outroLutador);
		outroLutador.vida -= 8;
		System.out.println(nome+ " socou: " +outroLutador.nome);
	}

	@Override
	public void chutar(Lutador outroLutador) {
		super.chutar(outroLutador);
		outroLutador.vida -= 8;
		System.out.println(nome+ " chutou: " +outroLutador.nome);
	}


}
