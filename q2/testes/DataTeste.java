package q2.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class DataTeste {
	
	private Data data;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		data = new Data ((short)5, (short)4, (short)2020, (short)14, (short)16);
	
	}

	@Test
	public void testData() {
		assertNotNull(data);
	}

}
