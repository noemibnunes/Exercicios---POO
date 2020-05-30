package q1.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ContaCorrenteTeste {
	
	private ContaCorrente conta;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		conta = new ContaCorrente(1000, 1, "Noemi");
	}

	@Test
	public void depositarTeste() {
		conta.depositar(300);
		assertEquals(600, conta.getSaldo(), 0.0001);
	}

	@Test
	public void debitarTeste() {
		conta.debitar(100);
		assertEquals(200, conta.getSaldo(), 0.0001);
	}
	
	@Test
	public void tranferirTeste() {
		ContaCorrente conta2 = new ContaCorrente(500, 2, "Ester");
		conta.transferir(100, conta2);
		assertEquals(200, conta.getSaldo(), 0.0001);
		assertEquals(400, conta2.getSaldo(), 0.0001);
	}
	
}
