package LocadoraCarro;

public class CarroInexistenteException extends Exception {
	
	public CarroInexistenteException() {
		super("O carro n�o pode ser removida, pois ele n�o existe na lista de carros");
	}

}
