package LocadoraCarro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Locadora implements LocadoraCarros {
	
	private List<Carro> carros;
	
	public Locadora() {
		List<Carro> carros = new ArrayList<Carro>();
	}
	
	public List<Carro> getCarros() {
		return carros;
	}
	
	@Override
	public void adicionarCarro(String modelo, String marca, int ano, double diaria) {
		Carro carro = new Carro(modelo, marca, ano, diaria);
		carros.add(carro);
	}
	
	@Override 
	public List<Carro> listarCarrosDaMarca(String marca){
		
		List<Carro> carrosMarca = new ArrayList<Carro>();
		for(Carro carros : carros) {
			if(carros.getMarca().equals(marca)) {
				carrosMarca.add(carros);
			}
		} return carrosMarca;
	}
	
	@Override
	public void removerCarro(String modelo, String marca, int ano) throws CarroInexistenteException {
		Iterator<Carro> carrosRemover = carros.iterator();
		while(carrosRemover.hasNext()) {
			Carro carro = carrosRemover.next();
			if(carro.getModelo().equals(modelo) && carro.getMarca().equals(marca) && carro.getAno() == ano) {
				carrosRemover.remove();
			}
		}
	}
	
}
	
	
	
