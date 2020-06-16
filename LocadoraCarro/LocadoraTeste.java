package LocadoraCarro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LocadoraTeste {
	
	Locadora locadora;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() {
		locadora.adicionarCarro("fiat uno", "fiat", 2011, 100);
	}
	
	@Test
	public void ListarCarros() {
		assertEquals(1, locadora.listarCarrosDaMarca("fiat"));
	}
	

	@Test
	public void AdicionarCarro() {
		assertEquals(1, locadora.getCarros());
	}

}
