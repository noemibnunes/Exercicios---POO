package Polimorfismo.questao2;

public class NightWolf extends Lutador{

	public NightWolf() {
		super("NightWolf");
	}
	
	@Override
	public void atirar(Lutador outroLutador) {
		super.socar(outroLutador);
		outroLutador.vida -= 5;
		System.out.println(nome+ " socou: " +outroLutador.nome);
	}

	@Override
	public void lancarMagia(Lutador outroLutador) {
		super.lancarMagia(outroLutador);
		outroLutador.vida -= 6;
		System.out.println(nome+ " lançou magia em: " +outroLutador.nome);
	}
	
	

}
