package LocadoraCarro;

public class CarroAlugadoException extends Exception {
	
	public CarroAlugadoException() {
		super("O carro n�o pode ser alugado, pois o mesmo j� est� lugado");
	}

}
