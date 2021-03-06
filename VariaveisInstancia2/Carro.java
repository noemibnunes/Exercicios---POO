package VariaveisInstancia2;

public class Carro {
	String nome;
	String marca;
	String cor;
	int portas;
	boolean vidroEletrico;
	boolean arCondicionado;
	boolean cambioAutomatico;
	boolean direcaoEletrica;
	double precoBase;
	boolean promocao;
	
	public Carro() { }
	
	public Carro(String nome, String marca, String cor, int portas, boolean vidroEletrico, boolean arCondicionado,
			boolean cambioAutomatico, boolean direcaoEletrica, double precoBase, boolean promocao){
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
		this.promocao = true;
		
	}
	
	public Carro(String nome, String marca, double precoBase, boolean promocao){
		this.nome = nome;
		this.marca = marca;
		this.cor = "branca";
		this.portas = 2;
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
		this.precoBase = precoBase;
		this.promocao = true;
		
	}
	
	public double calculaPreco() {
		double precoTotal = precoBase;
		switch(cor) {
		case "branca":
		case "azul":
		case "vermelho":
		case "preto":
			break;
		default:
			precoTotal += 1000;
			break;
		}
			
		if(vidroEletrico == true)
			precoTotal += 1250;
		if(arCondicionado == true)
			precoTotal += 1250;
		if(cambioAutomatico == true)
			precoTotal += 1250;
		if(direcaoEletrica == true)
			precoTotal += 1250;
		if(promocao == true)
			precoTotal = precoTotal - (precoTotal * 0.10); 
		return precoTotal;
		 
	}

	@Override
	public String toString() {
		String saida = "";
		saida += "Nome = " + this.nome + "\n";
		saida += "Marca = " + this.marca + "\n";
		saida += "Cor = " + this.cor + "\n" ;
		saida += "Quantidade de portas = " + this.portas + "\n";
		saida += "Vidro eletrico = " + this.vidroEletrico + "\n";
		saida += "Ar condicionado = " + this.arCondicionado + "\n";
		saida += "Cambio automatico = " + this.cambioAutomatico + "\n";
		saida += "Dire��o eletrica = " + this.direcaoEletrica + "\n";
		saida += "Pre�o base = " + this.precoBase + "\n";
		saida += "Pre�o total = " + this.calculaPreco() + "\n";
		
		return saida;
	}
	
	
}

