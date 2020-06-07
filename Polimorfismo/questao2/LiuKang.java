package Polimorfismo.questao2;

public class LiuKang extends Lutador {

	public LiuKang() {
		super("Liu Kang");
	}
	
	@Override
	public void chutar(Lutador outroLutador) {
		super.chutar(outroLutador);
		outroLutador.vida -= 9;
		System.out.println(nome+ "chutou: " +outroLutador.nome);
	}

	@Override
	public void lancarMagia(Lutador outroLutador) {
		super.lancarMagia(outroLutador);
		outroLutador.vida -= 8;
		System.out.println(nome+ "socou: " +outroLutador.nome);
	}
	
 
}
