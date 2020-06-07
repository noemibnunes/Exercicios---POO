package Polimorfismo;

public class Animal {
	protected String nome;
	protected int idade;
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void emitirSom() {
		System.out.println("Animal emitindo som");
	}
	
	@Override
	public String toString() {
		return "Nome: " +nome+ "\n" + "Idade: " +idade+ "\n"; 
	}
}