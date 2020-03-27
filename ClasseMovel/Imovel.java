package ClasseMovel;

public class Imovel {
	String tipoImobiliaria, imobiliaria;
	int numeroPavimento,pavimento, quartos, suites, banheiros, metrosQuadrados;
	boolean elevador, piscina, quadra;
	
	public Imovel(String tipoImobiliaria, String imobiliaria, int quartos, int suites,
			int banheiros, int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra) {
		this.imobiliaria = imobiliaria;
		this.tipoImobiliaria = tipoImobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
		
	}
	
	public Imovel(String tipoImobiliaria, String imobiliaria, int numeroPavimento, int pavimento, int quartos, int suites,
			int banheiros, int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra) {
		this.imobiliaria = imobiliaria;
		this.tipoImobiliaria = tipoImobiliaria;
		this.numeroPavimento = numeroPavimento;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
	
	}
	
	public double calculaPreco() {
		double preco = 0;
		if(pavimento > 5)		
			preco += (pavimento - 5) * 2000; 
		if(elevador == true)
			preco += 2500;
		if(piscina == true)
			preco += 2500;
		if(quadra == true)
			preco += 2500;
		if(metrosQuadrados > 0)
			preco += metrosQuadrados * 5000;
			
		return preco;
	}

	@Override
	public String toString() {
		String saida = "";
		saida += "Imovél = " + this.tipoImobiliaria + "\n";
		saida += "Imobiliária = " + this.imobiliaria + "\n";
		saida += "Numero de Pavimentos = "+ this.numeroPavimento + "\n";
		saida += "Pavimento = " + this.pavimento + "\n";
		saida += "Quantidade de quartos = " + this.quartos + "\n";
		saida += "Quantidade de suítes = " + this.suites + "\n";
		saida += "Quantidade de banheiros = " + this.banheiros + "\n";
		saida += "Metros Quadrados = " +this.metrosQuadrados + "m²" + "\n";
		saida += "Elevador = " + this.elevador + "\n";
		saida += "Piscina = " + this.piscina + "\n";
		saida += "Quadra = " + this.quadra + "\n";
		saida += "Preço Total do Imovél = " + this.calculaPreco() + "\n";
		return saida;
	} 
	
	
	
}

