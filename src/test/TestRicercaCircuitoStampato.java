/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import business.prodotti.GestoreProdotti;

/**
 * @author utente
 *
 */
public class TestRicercaCircuitoStampato {
	
	   GestoreProdotti gestoreProdotti;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	  gestoreProdotti=GestoreProdotti.getIstance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	  gestoreProdotti=null;
	}

	/**
	 * Test method for {@link UI.UIUtenteRegistrato#ricercaCircuitoByCodice()}.
	 */
	@Test
	public void T1() {
		HashMap<String, Integer>results=new HashMap<>();
		results=gestoreProdotti.ricercaCircuitoStampato("C001");
		assertNotNull(results);
		
	}
	
	/**
	 * Test method for {@link UI.UIUtenteRegistrato#ricercaCircuitoByCodice()}.
	 */
	@Test
	public void T2() {
		HashMap<String, Integer>results=new HashMap<>();
		results=gestoreProdotti.ricercaCircuitoStampato("C008");
		assertNull(results);
	}
	
	/**
	 * Test method for {@link UI.UIUtenteRegistrato#ricercaCircuitoByCodice()}.
	 */
	@Test
	public void T3() {
		HashMap<String, Integer>results=new HashMap<>();
		results=gestoreProdotti.ricercaCircuitoStampato("45-34;");
		assertNull(results);
	}
	
	/**
	 * Test method for {@link UI.UIUtenteRegistrato#ricercaCircuitoByCodice()}.
	 */
	@Test
	public void T4() {

		HashMap<String, Integer>results=new HashMap<>();
		results=gestoreProdotti.ricercaCircuitoStampato("");
		assertNull(results);
	}
	
	/**
	 * Test method for {@link UI.UIUtenteRegistrato#ricercaCircuitoByCodice()}.
	 */
	@Test
	public void T5() {
		
		HashMap<String, Integer>results=new HashMap<>();
		results=gestoreProdotti.ricercaCircuitoStampato("C002cvrzzzzzznububininb54ymt955b0g4g543c3dc3dcudu3cd85798unv4un99enu9ned98fynt9uc3mue3ue98n3vur9muc8nyurn98v3rcn8m9u839nyvr93");
		assertNull(results);
		
	}
	
	/**
	 * Test method for {@link UI.UIUtenteRegistrato#ricercaCircuitoByCodice()}.
	 */
	@Test
	public void T6() {
		
		HashMap<String, Integer>results=new HashMap<>();
		results=gestoreProdotti.ricercaCircuitoStampato("C0 4v");
		assertNull(results);
		
	}

}
