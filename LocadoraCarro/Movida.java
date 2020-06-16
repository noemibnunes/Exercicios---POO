package LocadoraCarro;

public class Movida extends Locadora{

	@Override
	public double alugarCarro(Carro carro, Data dataInicio, Data dataFim) throws CarroAlugadoException {
		double aluguel = 0;
		
		if(carro.isAlugado() == true) {
			throw new CarroAlugadoException();
		} else {
			int diaria = dataInicio.getDia() - dataFim.getDia();			
			aluguel = (carro.getDiaria() * diaria) * 0.10;	
			
		} 
		return aluguel;
	}

}
