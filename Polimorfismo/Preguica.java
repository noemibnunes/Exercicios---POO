package Polimorfismo;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("ZZzzzzZZZZzzzz");
	}
	
	public void escalarArvore() {
		System.out.println("Não");
	}

}
