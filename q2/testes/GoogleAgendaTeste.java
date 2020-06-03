package q2.testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GoogleAgendaTeste {
	
	private GoogleAgenda googleAgenda = new GoogleAgenda();
	
	private Reuniao reunioes;
		
	private Data data;
	
	private List<String> participantes = new ArrayList<String>();
	
	private int tamanho;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() {
								
		participantes.add("Felipe");
		participantes.add("Roberta");
		participantes.add("Paulo");
			
		data = new Data((short)29, (short)04, (short)2020, (short)9, (short)12);


		reunioes = new Reuniao(data, participantes);
	}

	@Test
	public void testGoogleAgenda() {
		assertNotNull(googleAgenda.reunioes);
		assertEquals(0, googleAgenda.getQuantidadeReunioes());
	}
	
	@Test
	public void testAddReuniao() {
		googleAgenda.adicionarReuniao(reunioes);
		assertEquals(1, googleAgenda.getQuantidadeReunioes());
	}
	
	@Test
	public void testAdiconarReuniao() {
		Data dt2 = new Data((short)12, (short)01,(short)2020, (short)13, (short)17);
		googleAgenda.adicionarReuniao(dt2, participantes);
		assertEquals(1, googleAgenda.getQuantidadeReunioes());	
	}
	
	@Test
	public void testDuplicaReuniao() {
		assertEquals(0, googleAgenda.getQuantidadeReunioes());

		for (int i = 1; i <= 20; i++) {
			data = new Data ((short)5, (short)4, (short)2020, (short)14, (short)16);
			
			googleAgenda.adicionarReuniao(data, participantes);
			assertEquals(i, googleAgenda.getQuantidadeReunioes());
			}
		
		googleAgenda.duplicaReunioes();
		assertEquals(20, googleAgenda.getQuantidadeReunioes());

	}
	
	@Test 
	public void testReuniaoMaisLonga() {	

		googleAgenda.getDuracao(reunioes);
		
		Assert.assertEquals(reunioes, googleAgenda.getReuniaoMaisLonga());
	}
	
}

