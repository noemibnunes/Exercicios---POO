package Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
		
		private List <Animal> jaulas;
		
		
		public Zoologico() {
			jaulas = new ArrayList <Animal>();
			
			Cachorro cachorro = new Cachorro("Thor", 5);		
			
			Cachorro cachorro1 = new Cachorro("Samon", 5);
				
			Cavalo cavalo = new Cavalo("Honey", 12);
			
			Cavalo cavalo1 = new Cavalo("Pirata", 14);
	
			Preguica preguica = new Preguica("Desânimo", 7);
			
			jaulas.add(cachorro);
			jaulas.add(cachorro1);
			jaulas.add(cavalo);
			jaulas.add(cavalo1);
			jaulas.add(preguica);
		}
				
		public void cutucar() {
			for(Animal animal : jaulas) {
				System.out.println(animal.toString());
				animal.emitirSom();
				if(animal instanceof Cachorro) {
					Cachorro c = (Cachorro) animal;
					c.correr();
			} else if(animal instanceof Cavalo) {
				Cavalo c = (Cavalo) animal;
				c.correr();
			} else if(animal instanceof Preguica) {
				Preguica p  = (Preguica) animal;
				p.escalarArvore();
			}
			System.out.println();
			}
		}
		
		public static void main(String[] args) {
			Zoologico z = new Zoologico();
			z.cutucar();
		}
}
