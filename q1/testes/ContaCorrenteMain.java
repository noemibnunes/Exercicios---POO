package q1.testes;

public class ContaCorrenteMain {
	
	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente(500, 12384, "Eduardo");
		ContaCorrente c2 = new ContaCorrente(50, 23844, "Joao");
		ContaCorrente c3 = new ContaCorrente(5000, 123456, "Ana");
		
		c1.depositar(30);
		System.out.println(c1.getSaldo());
		
		c2.debitar(40);
		System.out.println(c2.getSaldo());
		
		c1.transferir(50, c3);
		System.out.println(c1.getSaldo());
		System.out.println(c3.getSaldo());
	}
}
