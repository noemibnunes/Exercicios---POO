package LocadoraCarro;

public class Localiza extends Locadora {
	
	@Override
	public double alugarCarro(Carro carro, Data dataInicio, Data dataFim) throws CarroAlugadoException {
		double aluguel = 0;
		
		if(carro.isAlugado() == true) {
			throw new CarroAlugadoException();
		} else {
			int diaria = dataInicio.getDia() - dataFim.getDia();			
			aluguel = (carro.getDiaria() * diaria) * 0.20;	
			
		} 
		return aluguel; 
	} 

}
