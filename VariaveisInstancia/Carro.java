package VariaveisInstancia;

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
	static boolean promocao;
	
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
		this.precoBase = precoBase;
		
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
	
	/** QUEST�O 3 
	 
	 * Praticidade, tendo em vista que quando promocao era uma vari�vel de classe, ao referenciar 
	 essa variav�l todos os carros j� receberam a promo��o. Quando promocao era uma vari�vel de inst�ncia
	 cada carro precisou ser instanciado para receber a promo��o.
	 
	**/
	
}
