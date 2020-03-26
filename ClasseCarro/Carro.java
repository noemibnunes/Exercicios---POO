package ClasseCarro;

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
	
	public Carro() { }
	
	public Carro(String nome, String marca, String cor, int portas, boolean vidroEletrico, boolean arCondicionado,
			boolean cambioAutomatico, boolean direcaoEletrica, double precoBase){
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
		
	}
	
	public Carro(String nome, String marca, double precoBase){
		this.nome = nome;
		this.marca = marca;
		this.cor = "branca";
		this.portas = 2;
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
		this.precoBase = 0;
		
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
			
		if(vidroEletrico)
			precoTotal += 1250;
		if(arCondicionado)
			precoTotal += 1250;
		if(cambioAutomatico)
			precoTotal += 1250;
		if(direcaoEletrica)
			precoTotal += 1250;
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
		saida += "Direção eletrica = " + this.direcaoEletrica + "\n";
		saida += "Preço base = " + this.precoBase + "\n";
		saida += "Preço total = " + this.calculaPreco() + "\n";
		
		return saida;
	}
	
	
}