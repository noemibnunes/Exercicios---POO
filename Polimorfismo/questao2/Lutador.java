package Polimorfismo.questao2;

public class Lutador {
	
	protected String nome;
	protected int vida;
	
	public Lutador(String nome){
		this.nome = nome;
		this.vida = 100;		
	}
	
	public void socar(Lutador outroLutador) {
		outroLutador.vida -= 7;
		System.out.println(nome+ " socou: " +outroLutador.nome);
	}

	public void chutar(Lutador outroLutador) {
		outroLutador.vida -= 5;
		System.out.println(nome+ " chutou: " +outroLutador.nome);
	}

	public void atirar(Lutador outroLutador) {
		outroLutador.vida -= 10;
		System.out.println(nome+ " atirou em: " +outroLutador.nome);
	}

	public void lancarMagia(Lutador outroLutador) {
		outroLutador.vida -= 12;
		System.out.println(nome+ " lançou magia em: " +outroLutador.nome);
	}
	
	@Override
	public String toString() {
		return "Lutador: " +nome+ "/n" + "Vida: " +vida;
	}

	public String getNome() {
		return nome;
	}
	
	public int getVida() {
		return vida;
	}

}
