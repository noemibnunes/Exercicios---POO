package Polimorfismo.questao2;

public class Jax extends Lutador{

	public Jax() {
		super("Jax");
	}
	
	@Override
	public void socar(Lutador outroLutador) {
		super.socar(outroLutador);
		outroLutador.vida -= 10;
		System.out.println(nome+ " socou: " +outroLutador.nome);
	}
	

}
