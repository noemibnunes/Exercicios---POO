package LocadoraCarro;

public class CarroAlugadoException extends Exception {
	
	public CarroAlugadoException() {
		super("O carro não pode ser alugado, pois o mesmo já está lugado");
	}

}
