package LocadoraCarro;

public class CarroInexistenteException extends Exception {
	
	public CarroInexistenteException() {
		super("O carro não pode ser removida, pois ele não existe na lista de carros");
	}

}
