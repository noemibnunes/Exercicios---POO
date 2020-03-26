package ClasseCarro;

public class CarroMain {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Pálio", "Fiat", "branca", 4, false, false, false, false, 35000);
		Carro carro2 = new Carro("Pálio", "Fiat", "prata", 4, false, false, false, false, 35000);
		Carro carro3 = new Carro("Civic", "Honda", "branca", 4, true, true, true, true, 110000);
		Carro carro4 = new Carro("Corolla", "Toyota", "preto", 4, true, true, false, true, 110000);
		Carro carro5 = new Carro();
		
		// construtor vazio
		carro5.nome = "Gol";
		carro5.marca = "Volkswagen";
		carro5.cor = "azul";
		carro5.portas = 4;
		carro5.arCondicionado = true;
		carro5.cambioAutomatico = true;
		carro5.direcaoEletrica = true;
		carro5.vidroEletrico = true;
		carro5.precoBase = 55000;
		
			
		System.out.println(carro1);
		System.out.println("/n");
		System.out.println(carro2);
		System.out.println("/n");
		System.out.println(carro3);
		System.out.println("/n");
		System.out.println(carro4);
		System.out.println("/n");
		
		System.out.println("Nome: " +carro5.nome);
		System.out.println("Marca: " +carro5.marca);
		System.out.println("Cor: " +carro5.cor);
		System.out.println("Portas: " +carro5.portas);
		System.out.println("Ar Condicionado: " +carro5.arCondicionado);
		System.out.println("Cambio Automatico: " +carro5.cambioAutomatico);
		System.out.println("Direção Eletrica: " +carro5.direcaoEletrica);
		System.out.println("Vidro Eletrico: " +carro5.vidroEletrico);
		System.out.println("Preço Base: " +carro5.precoBase);
		System.out.println("Preço Total: " +carro5.calculaPreco());	
		
	}

}
